package project10_1.cookandroid.com.projectzzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item posts1 = new Item("제목1","내용1");
        Item posts2 = new Item("제목2","내용2");
        Item posts3 = new Item("제목3","내용3");

        ArrayList<Item> board = new ArrayList<>();
        board.add(posts1);
        board.add(posts2);
        board.add(posts3);

        listadapter adapter = new listadapter(board,this);
        ListView listView = findViewById(R.id.lista);
        listView.setAdapter(adapter);


    }
}
