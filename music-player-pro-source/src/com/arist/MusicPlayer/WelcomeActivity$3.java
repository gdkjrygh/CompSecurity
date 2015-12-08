// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.widget.ProgressBar;
import com.arist.biz.MusicBiz;
import java.util.TimerTask;

// Referenced classes of package com.arist.MusicPlayer:
//            WelcomeActivity

class cess._cls2 extends TimerTask
{

    int progress;
    final WelcomeActivity this$0;
    int totalMusic;

    public void run()
    {
        if (totalMusic > 0)
        {
            progress = (int)(((double)WelcomeActivity.access$2(WelcomeActivity.this).getCount() * 1000D) / (double)totalMusic);
        } else
        {
            progress = 0;
        }
        WelcomeActivity.access$3(WelcomeActivity.this).setProgress(progress);
        if (WelcomeActivity.access$4(WelcomeActivity.this))
        {
            WelcomeActivity.access$3(WelcomeActivity.this).setProgress(1000);
        }
    }

    ()
    {
        this$0 = WelcomeActivity.this;
        super();
        progress = 0;
        totalMusic = WelcomeActivity.access$2(WelcomeActivity.this).getTotalMusic();
    }
}
