// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import android.app.AlarmManager;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            a, AlarmManagerExecutorService, b

private final class a extends ThreadPoolExecutor
    implements a
{

    final AlarmManagerExecutorService a;

    static ScheduledFuture a(a a1, a a2, long l)
    {
        return a1.a(a2, l);
    }

    private ScheduledFuture a(a a1, long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        AlarmManagerExecutorService.a(a).put(a1.b(), a1);
        AlarmManagerExecutorService.b(a).set(2, l1 + l, a1.c());
        return a1;
    }

    public final ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
    {
        runnable = new <init>(a, new b(runnable), l, timeunit);
        AlarmManagerExecutorService.a(a).put(b(runnable), runnable);
        l = SystemClock.elapsedRealtime();
        long l1 = c(runnable);
        AlarmManagerExecutorService.b(a).set(2, l + l1, d(runnable));
        return runnable;
    }

    public final ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
    {
        (new StringBuilder("Scheduling with delay ")).append(l).append(" ").append(timeunit);
        callable = new <init>(a, callable, l, timeunit);
        l = SystemClock.elapsedRealtime();
        long l1 = c(callable);
        AlarmManagerExecutorService.a(a).put(b(callable), callable);
        AlarmManagerExecutorService.b(a).set(2, l + l1, d(callable));
        return callable;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        runnable = new <init>(a, new b(runnable), l, l1, timeunit, (byte)0);
        l = SystemClock.elapsedRealtime();
        l1 = c(runnable);
        AlarmManagerExecutorService.a(a).put(b(runnable), runnable);
        AlarmManagerExecutorService.b(a).setRepeating(2, l1 + l, e(runnable), d(runnable));
        return runnable;
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        runnable = new <init>(a, new b(runnable), l, l1, timeunit);
        return a(runnable, runnable.d());
    }

    public (AlarmManagerExecutorService alarmmanagerexecutorservice)
    {
        a = alarmmanagerexecutorservice;
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }
}
