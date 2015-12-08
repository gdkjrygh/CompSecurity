// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.arist.Adapter.MusicAdapter;
import com.arist.dao.MusicDao;
import com.arist.entity.Music;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class val.etArtist
    implements android.view.ener
{

    final MainActivity this$0;
    private final EditText val$etAlbum;
    private final EditText val$etArtist;
    private final EditText val$etName;

    public void onClick(View view)
    {
        selMusic.setTitle(val$etName.getText().toString());
        selMusic.setAlbum(val$etAlbum.getText().toString());
        selMusic.setArtist(val$etArtist.getText().toString());
        MainActivity.access$5(MainActivity.this).updateMusic(selMusic);
        MainActivity.access$15(MainActivity.this).notifyDataSetChanged();
        dismissDialog(3);
        removeDialog(3);
    }

    ()
    {
        this$0 = final_mainactivity;
        val$etName = edittext;
        val$etAlbum = edittext1;
        val$etArtist = EditText.this;
        super();
    }
}
