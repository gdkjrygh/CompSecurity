// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal.utils;

import android.os.Handler;
import android.os.Looper;
import com.millennialmedia.c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadUtils
{

    private static final String a = com/millennialmedia/internal/utils/ThreadUtils.getSimpleName();
    private static Handler b;
    private static ExecutorService c;
    private static Handler d;

    public ThreadUtils()
    {
    }

    static Handler a(Handler handler)
    {
        d = handler;
        return handler;
    }

    public static ScheduledRunnable a(Runnable runnable, long l)
    {
        runnable = new _cls2(runnable);
        b.postDelayed(runnable, l);
        return runnable;
    }

    public static void a()
    {
        if (b != null)
        {
            com.millennialmedia.c.c(a, "ThreadUtils already initialized");
        } else
        {
            b = new Handler(Looper.getMainLooper());
            CountDownLatch countdownlatch = new CountDownLatch(1);
            (new _cls1(countdownlatch)).start();
            c = Executors.newCachedThreadPool();
            boolean flag;
            try
            {
                flag = countdownlatch.await(5000L, TimeUnit.MILLISECONDS);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
                flag = false;
            }
            if (!flag)
            {
                throw new IllegalStateException("Failed to initialize ThreadUtils");
            }
        }
    }

    public static void a(Runnable runnable)
    {
        if (b())
        {
            runnable.run();
            return;
        } else
        {
            b.post(runnable);
            return;
        }
    }

    public static ScheduledRunnable b(Runnable runnable, long l)
    {
        runnable = new _cls3(runnable);
        d.postDelayed(runnable, l);
        return runnable;
    }

    public static void b(Runnable runnable)
    {
        if (b())
        {
            c.execute(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public static boolean b()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    static Handler c()
    {
        return b;
    }

    public static void c(Runnable runnable)
    {
        c.execute(runnable);
    }

    static ExecutorService d()
    {
        return c;
    }

    static Handler e()
    {
        return d;
    }


    // Unreferenced inner class com/millennialmedia/internal/utils/ThreadUtils$ScheduledRunnable
    /* block-local class not found */
    class ScheduledRunnable {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
