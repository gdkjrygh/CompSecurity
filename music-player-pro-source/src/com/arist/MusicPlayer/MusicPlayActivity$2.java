// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.media.MediaPlayer;
import android.widget.SeekBar;

// Referenced classes of package com.arist.MusicPlayer:
//            MusicPlayActivity, MyApplication

class this._cls0
    implements android.widget.ngeListener
{

    final MusicPlayActivity this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (!flag || MyApplication.mediaPlayer == null)
        {
            return;
        } else
        {
            MyApplication.mediaPlayer.seekTo(i);
            return;
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        if (MyApplication.mediaPlayer == null)
        {
            return;
        } else
        {
            MyApplication.mediaPlayer.pause();
            return;
        }
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (MyApplication.mediaPlayer == null)
        {
            return;
        } else
        {
            MyApplication.mediaPlayer.seekTo(seekbar.getProgress());
            MyApplication.mediaPlayer.start();
            return;
        }
    }

    ener()
    {
        this$0 = MusicPlayActivity.this;
        super();
    }
}
