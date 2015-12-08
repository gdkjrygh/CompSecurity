// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.activity;

import roboguice.RoboGuice;

// Referenced classes of package roboguice.activity:
//            RoboSplashActivity

class val.start
    implements Runnable
{

    final RoboSplashActivity this$0;
    final long val$start;

    public void run()
    {
        android.app.Application application = getApplication();
        RoboGuice.getBaseApplicationInjector(getApplication());
        doStuffInBackground(application);
        long l = System.currentTimeMillis() - val$start;
        if (l < (long)minDisplayMs)
        {
            try
            {
                Thread.sleep((long)minDisplayMs - l);
            }
            catch (InterruptedException interruptedexception)
            {
                Thread.interrupted();
            }
        }
        startNextActivity();
        andFinishThisOne();
    }

    ()
    {
        this$0 = final_robosplashactivity;
        val$start = J.this;
        super();
    }
}
