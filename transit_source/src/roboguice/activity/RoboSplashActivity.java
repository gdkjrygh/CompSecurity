// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import roboguice.RoboGuice;

public abstract class RoboSplashActivity extends Activity
{

    protected int minDisplayMs;

    public RoboSplashActivity()
    {
        minDisplayMs = 2500;
    }

    protected void andFinishThisOne()
    {
        finish();
    }

    protected void doStuffInBackground(Application application)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new Thread(new Runnable() {

            final RoboSplashActivity this$0;
            final long val$start;

            public void run()
            {
                Application application = getApplication();
                RoboGuice.getBaseApplicationInjector(getApplication());
                doStuffInBackground(application);
                long l = System.currentTimeMillis() - start;
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

            
            {
                this$0 = RoboSplashActivity.this;
                start = l;
                super();
            }
        })).start();
    }

    protected abstract void startNextActivity();
}
