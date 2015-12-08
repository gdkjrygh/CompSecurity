// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import android.app.ProgressDialog;
import android.os.Handler;
import com.aviary.android.feather.library.MonitoredActivity;

public class ThreadUtils
{
    private static class BackgroundJob extends com.aviary.android.feather.library.MonitoredActivity.a
        implements Runnable
    {

        private final MonitoredActivity a;
        private final ProgressDialog b;
        private final Runnable c;
        private final Handler d;
        private final Runnable e;

        static MonitoredActivity a(BackgroundJob backgroundjob)
        {
            return backgroundjob.a;
        }

        static ProgressDialog b(BackgroundJob backgroundjob)
        {
            return backgroundjob.b;
        }

        public void b(MonitoredActivity monitoredactivity)
        {
            e.run();
            d.removeCallbacks(e);
        }

        public void c(MonitoredActivity monitoredactivity)
        {
            b.show();
        }

        public void d(MonitoredActivity monitoredactivity)
        {
            b.hide();
        }

        public void run()
        {
            c.run();
            d.post(e);
            return;
            Exception exception;
            exception;
            d.post(e);
            throw exception;
        }
    }


    public ThreadUtils()
    {
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/utils/ThreadUtils$BackgroundJob$1

/* anonymous class */
    class BackgroundJob._cls1
        implements Runnable
    {

        final BackgroundJob a;

        public void run()
        {
            BackgroundJob.a(a).a(a);
            if (BackgroundJob.b(a).getWindow() != null)
            {
                BackgroundJob.b(a).dismiss();
            }
        }
    }

}
