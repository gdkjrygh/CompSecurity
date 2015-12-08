// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.AdapterView;
import com.arist.Adapter.MusicAdapter;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication, MusicPlayActivity

class this._cls0
    implements android.widget.rMusic
{

    final MainActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        MyApplication.getInstance().setMusicList(MainActivity.access$14(MainActivity.this));
        MyApplication.setCurrentPosition(i);
        sendBroadcast(new Intent("com.MediaPlayer.action.PLAY"));
        if (MyApplication.getDefaultSharedPreferences().getBoolean("switch_playing_interface", false))
        {
            adapterview = new Intent(MainActivity.this, com/arist/MusicPlayer/MusicPlayActivity);
            startActivity(adapterview);
            overridePendingTransition(0x7f040006, 0x7f040003);
        }
        MainActivity.access$15(MainActivity.this).notifyDataSetChanged();
    }

    A()
    {
        this$0 = MainActivity.this;
        super();
    }
}
