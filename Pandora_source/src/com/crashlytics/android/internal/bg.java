// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.crashlytics.android.internal:
//            bm, bk

public class bg
{

    public bg()
    {
    }

    public static ExecutorService a(String s)
    {
        ExecutorService executorservice = Executors.newSingleThreadExecutor(c(s));
        a(s, executorservice);
        return executorservice;
    }

    private static void a(String s, ExecutorService executorservice)
    {
        TimeUnit timeunit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new bm(s, executorservice, 2L, timeunit), (new StringBuilder("Crashlytics Shutdown Hook for ")).append(s).toString()));
    }

    public static ScheduledExecutorService b(String s)
    {
        ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor(c(s));
        a(s, scheduledexecutorservice);
        return scheduledexecutorservice;
    }

    public static ThreadFactory c(String s)
    {
        return new bk(s, new AtomicLong(1L));
    }

    public long a()
    {
        return System.currentTimeMillis();
    }
}
