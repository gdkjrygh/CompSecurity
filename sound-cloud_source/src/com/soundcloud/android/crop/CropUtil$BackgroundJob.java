// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.app.ProgressDialog;
import android.os.Handler;

// Referenced classes of package com.soundcloud.android.crop:
//            CropUtil, MonitoredActivity

private static class handler extends ycleAdapter
    implements Runnable
{

    private final MonitoredActivity activity;
    private final Runnable cleanupRunner = new _cls1();
    private final ProgressDialog dialog;
    private final Handler handler;
    private final Runnable job;

    public void onActivityDestroyed(MonitoredActivity monitoredactivity)
    {
        cleanupRunner.run();
        handler.removeCallbacks(cleanupRunner);
    }

    public void onActivityStarted(MonitoredActivity monitoredactivity)
    {
        dialog.show();
    }

    public void onActivityStopped(MonitoredActivity monitoredactivity)
    {
        dialog.hide();
    }

    public void run()
    {
        job.run();
        handler.post(cleanupRunner);
        return;
        Exception exception;
        exception;
        handler.post(cleanupRunner);
        throw exception;
    }



    public ycleListener(MonitoredActivity monitoredactivity, Runnable runnable, ProgressDialog progressdialog, Handler handler1)
    {
        class _cls1
            implements Runnable
        {

            final CropUtil.BackgroundJob this$0;

            public void run()
            {
                activity.removeLifeCycleListener(CropUtil.BackgroundJob.this);
                if (dialog.getWindow() != null)
                {
                    dialog.dismiss();
                }
            }

            _cls1()
            {
                this$0 = CropUtil.BackgroundJob.this;
                super();
            }
        }

        activity = monitoredactivity;
        dialog = progressdialog;
        job = runnable;
        activity.addLifeCycleListener(this);
        handler = handler1;
    }
}
