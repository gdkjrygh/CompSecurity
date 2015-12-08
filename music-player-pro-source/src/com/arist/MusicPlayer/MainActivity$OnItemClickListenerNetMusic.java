// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;
import com.arist.Adapter.NetMusicAdapter;
import com.arist.dao.MusicDao;
import com.arist.util.Constant;
import com.yong.jamendo.api.JamendoMusic;
import java.io.File;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class this._cls0
    implements android.widget.tMusic
{

    final MainActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        currentNetMusic = (JamendoMusic)MainActivity.access$16(MainActivity.this).getItem(i);
        adapterview = (new StringBuilder(String.valueOf(Constant.BASE_DOWNLOAD_PATH))).append(currentNetMusic.getMusic_name()).append(".mp3").toString();
        if ((new File(adapterview)).exists())
        {
            try
            {
                MyApplication.mediaPlayer.reset();
                MyApplication.mediaPlayer.setDataSource(adapterview);
                MyApplication.mediaPlayer.prepare();
                MyApplication.mediaPlayer.start();
                MyApplication.setCurrentMusic(MainActivity.access$5(MainActivity.this).getMusicByPath(adapterview));
                MyApplication.setPlayNetMusic(true);
                sendBroadcast(new Intent("com.MediaPlayer.action.STATUS_CHANGED"));
                sendBroadcast(new Intent("com.MediaPlayer.action.MUSIC_CHANGED"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                return;
            }
        } else
        {
            showDialog(4);
            return;
        }
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
