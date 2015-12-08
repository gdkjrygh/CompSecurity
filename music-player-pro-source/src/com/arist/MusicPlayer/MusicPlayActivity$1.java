// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.TextView;
import com.arist.util.TimeFormat;

// Referenced classes of package com.arist.MusicPlayer:
//            MusicPlayActivity, MyApplication

class this._cls0
    implements Runnable
{

    final MusicPlayActivity this$0;

    public void run()
    {
        if (MyApplication.mediaPlayer != null)
        {
            MusicPlayActivity.access$0(MusicPlayActivity.this).setProgress(MyApplication.getMusicProgress());
            MusicPlayActivity.access$1(MusicPlayActivity.this).setText(TimeFormat.timeFormat(MyApplication.getMusicDuration()));
            MusicPlayActivity.access$2(MusicPlayActivity.this).setText(TimeFormat.timeFormat(MyApplication.getMusicProgress()));
            handlerUpdateSeekBar.postDelayed(updateSeekBarThread, 100L);
        }
    }

    ()
    {
        this$0 = MusicPlayActivity.this;
        super();
    }
}
