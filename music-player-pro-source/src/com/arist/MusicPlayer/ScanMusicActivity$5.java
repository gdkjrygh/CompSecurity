// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import android.widget.ProgressBar;
import com.arist.biz.MusicBiz;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.arist.MusicPlayer:
//            ScanMusicActivity

class cess._cls3 extends TimerTask
{

    int progress;
    final ScanMusicActivity this$0;
    int totalMusic;

    public void run()
    {
        int i = ScanMusicActivity.access$3(ScanMusicActivity.this).getCount();
        if (totalMusic > 0)
        {
            progress = (int)(((double)i * 1000D) / (double)totalMusic);
        } else
        {
            progress = 0;
        }
        ScanMusicActivity.access$7(ScanMusicActivity.this).setProgress(progress);
        ScanMusicActivity.access$5(ScanMusicActivity.this).sendEmptyMessage(1);
        if (ScanMusicActivity.access$3(ScanMusicActivity.this).getCount() == totalMusic)
        {
            ScanMusicActivity.access$6(ScanMusicActivity.this).cancel();
        }
    }

    ()
    {
        this$0 = ScanMusicActivity.this;
        super();
        progress = 0;
        totalMusic = ScanMusicActivity.access$3(ScanMusicActivity.this).getTotalMusic();
    }
}
