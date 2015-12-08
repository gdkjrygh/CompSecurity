// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.PowerManager;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            AlarmManagerExecutorService

private class <init> extends FutureTask
    implements ScheduledFuture
{

    android.os.gerExecutorService.b.h a;
    final AlarmManagerExecutorService b;
    private long c;
    private long d;
    private final long e;
    private final long f;
    private final String g;
    private final PendingIntent h;

    static void a(<init> <init>1)
    {
        <init>1.g();
    }

    static String b(g g1)
    {
        return g1.g;
    }

    static long c(g g1)
    {
        return g1.e;
    }

    static PendingIntent d(e e1)
    {
        return e1.h;
    }

    static long e(h h1)
    {
        return h1.f;
    }

    private static long f()
    {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        h();
        (new StringBuilder("Acquiring wake lock for task: ")).append(g);
        a = AlarmManagerExecutorService.c(b).newWakeLock(1, "KikExecutor");
        a.a();
        AlarmManagerExecutorService.d(b);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null && a.a())
        {
            (new StringBuilder("Releasing wake lock for task: ")).append(g);
            a.a();
            a = null;
            AlarmManagerExecutorService.e(b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a()
    {
        return f > 0L;
    }

    public final String b()
    {
        return g;
    }

    public final PendingIntent c()
    {
        return h;
    }

    public boolean cancel(boolean flag)
    {
        (new StringBuilder("Cancelling execution for tag ")).append(g);
        flag = super.cancel(flag);
        h h1 = AlarmManagerExecutorService.f(b);
        AlarmManagerExecutorService.a(h1.a).remove(g);
        h1.remove(this);
        AlarmManagerExecutorService.b(h1.a).cancel(h);
        h();
        return flag;
    }

    public int compareTo(Object obj)
    {
        obj = (Delayed)obj;
        return Long.valueOf(getDelay(TimeUnit.NANOSECONDS)).compareTo(Long.valueOf(((Delayed) (obj)).getDelay(TimeUnit.NANOSECONDS)));
    }

    public final long d()
    {
        return e;
    }

    public final long e()
    {
        return f;
    }

    public long getDelay(TimeUnit timeunit)
    {
        long l = f();
        if (d <= 0L)
        {
            return (c + e) - l;
        }
        if (a())
        {
            return (d + f) - l;
        } else
        {
            return d - l;
        }
    }

    public void run()
    {
        if (a())
        {
            runAndReset();
            return;
        } else
        {
            d = f();
            super.run();
            h();
            return;
        }
    }

    protected boolean runAndReset()
    {
        d = f();
        boolean flag = super.runAndReset();
        h();
        return flag;
    }

    private (AlarmManagerExecutorService alarmmanagerexecutorservice, Callable callable, long l, long l1, TimeUnit timeunit)
    {
        long l2 = -1L;
        b = alarmmanagerexecutorservice;
        super(callable);
        d = 0L;
        c = f();
        e = TimeUnit.MILLISECONDS.convert(l, timeunit);
        if (l1 == -1L)
        {
            l = l2;
        } else
        {
            l = TimeUnit.MILLISECONDS.convert(l1, timeunit);
        }
        f = l;
        g = (new StringBuilder("com.kik-")).append(UUID.randomUUID()).toString();
        h = AlarmManagerExecutorService.a(alarmmanagerexecutorservice, g);
    }

    g(AlarmManagerExecutorService alarmmanagerexecutorservice, Callable callable, long l, long l1, TimeUnit timeunit, 
            byte byte0)
    {
        this(alarmmanagerexecutorservice, callable, l, l1, timeunit);
    }

    public <init>(AlarmManagerExecutorService alarmmanagerexecutorservice, Callable callable, long l, TimeUnit timeunit)
    {
        this(alarmmanagerexecutorservice, callable, l, -1L, timeunit);
    }
}
