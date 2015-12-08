// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import java.util.TimerTask;

// Referenced classes of package com.arist.MusicPlayer:
//            MyApplication

class this._cls0 extends TimerTask
{

    final MyApplication this$0;

    public void run()
    {
        if (MyApplication.mediaPlayer.isPlaying())
        {
            Intent intent = new Intent();
            intent.setAction("com.MediaPlayer.action.MEDIAPLAYER_INFO");
            MyApplication.musicProgress = MyApplication.mediaPlayer.getCurrentPosition();
            intent.putExtra("musicProgress", MyApplication.musicProgress);
            getApplicationContext().sendBroadcast(intent);
        }
    }

    ()
    {
        this$0 = MyApplication.this;
        super();
    }
}
