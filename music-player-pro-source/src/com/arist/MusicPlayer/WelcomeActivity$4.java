// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import com.arist.util.Constant;
import com.arist.util.LrcFileUtil;
import java.io.File;
import java.util.Timer;

// Referenced classes of package com.arist.MusicPlayer:
//            WelcomeActivity

class val.timer extends Thread
{

    final WelcomeActivity this$0;
    private final Timer val$timer;

    public void run()
    {
        WelcomeActivity.access$5(WelcomeActivity.this);
        WelcomeActivity.access$6(WelcomeActivity.this).sendMessage(WelcomeActivity.access$6(WelcomeActivity.this).obtainMessage());
        LrcFileUtil.moveLrcFile(new File(Constant.rootDir));
        WelcomeActivity.access$7(WelcomeActivity.this, true);
        val$timer.cancel();
        WelcomeActivity.access$1(WelcomeActivity.this);
    }

    ()
    {
        this$0 = final_welcomeactivity;
        val$timer = Timer.this;
        super();
    }
}
