// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import android.app.ProgressDialog;
import android.os.Handler;
import com.aviary.android.feather.library.MonitoredActivity;

// Referenced classes of package com.aviary.android.feather.sdk.utils:
//            ThreadUtils

private static class _cls1 extends com.aviary.android.feather.library.b
    implements Runnable
{

    private final MonitoredActivity a;
    private final ProgressDialog b;
    private final Runnable c;
    private final Handler d;
    private final Runnable e;

    static MonitoredActivity a(_cls1 _pcls1)
    {
        return _pcls1.a;
    }

    static ProgressDialog b(a a1)
    {
        return a1.b;
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

    // Unreferenced inner class com/aviary/android/feather/sdk/utils/ThreadUtils$BackgroundJob$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final ThreadUtils.BackgroundJob a;

        public void run()
        {
            ThreadUtils.BackgroundJob.a(a).a(a);
            if (ThreadUtils.BackgroundJob.b(a).getWindow() != null)
            {
                ThreadUtils.BackgroundJob.b(a).dismiss();
            }
        }
    }

}
