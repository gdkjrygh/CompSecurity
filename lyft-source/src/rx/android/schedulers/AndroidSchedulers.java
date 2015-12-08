// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import rx.Scheduler;
import rx.android.plugins.RxAndroidPlugins;
import rx.android.plugins.RxAndroidSchedulersHook;

// Referenced classes of package rx.android.schedulers:
//            HandlerScheduler

public final class AndroidSchedulers
{

    private static final Scheduler MAIN_THREAD_SCHEDULER = new HandlerScheduler(new Handler(Looper.getMainLooper()));

    private AndroidSchedulers()
    {
        throw new AssertionError("No instances");
    }

    public static Scheduler mainThread()
    {
        Scheduler scheduler = RxAndroidPlugins.getInstance().getSchedulersHook().getMainThreadScheduler();
        if (scheduler != null)
        {
            return scheduler;
        } else
        {
            return MAIN_THREAD_SCHEDULER;
        }
    }

}
