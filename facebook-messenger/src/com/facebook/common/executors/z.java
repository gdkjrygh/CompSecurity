// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.d.a.s;
import com.google.common.d.a.v;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.common.executors:
//            aa, ae, a, ac, 
//            ad

public class z extends AbstractExecutorService
    implements v
{

    static final String a = (new StringBuilder()).append(com/facebook/common/executors/z.getCanonicalName()).append(".ACTION_ALARM").toString();
    private static final Class b = com/facebook/common/executors/z;
    private final Context c;
    private final a d;
    private final AlarmManager e;
    private final com.facebook.common.executors.a f;
    private final PriorityQueue g = new PriorityQueue();

    public z(Context context, a a1, AlarmManager alarmmanager, com.facebook.common.executors.a a2)
    {
        c = context;
        d = a1;
        e = alarmmanager;
        f = a2;
        c.registerReceiver(new aa(this), new IntentFilter(a));
    }

    private void a()
    {
        com.facebook.debug.log.b.a(b, "Alarm fired");
        this;
        JVM INSTR monitorenter ;
        es es1;
        es1 = c();
        b();
        this;
        JVM INSTR monitorexit ;
        a(es1);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(ac ac1, long l)
    {
        com.facebook.debug.log.b.a(b, "Scheduling task for %d seconds from now", new Object[] {
            Long.valueOf((l - d.a()) / 1000L)
        });
        this;
        JVM INSTR monitorenter ;
        g.add(new ae(ac1, l));
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        ac1;
        this;
        JVM INSTR monitorexit ;
        throw ac1;
    }

    static void a(z z1)
    {
        z1.a();
    }

    private void a(es es1)
    {
        com.facebook.debug.log.b.a(b, "Executing %d tasks", new Object[] {
            Integer.valueOf(es1.size())
        });
        f.a();
        for (es1 = es1.iterator(); es1.hasNext(); ((ac)es1.next()).run()) { }
    }

    private ac b(Runnable runnable, Object obj)
    {
        return new ac(runnable, obj);
    }

    private ac b(Callable callable)
    {
        return new ac(callable);
    }

    private void b()
    {
        if (g.isEmpty())
        {
            com.facebook.debug.log.b.a(b, "No pending tasks, so not setting alarm");
            return;
        } else
        {
            long l = ((ae)g.peek()).b;
            com.facebook.debug.log.b.a(b, "Next alarm in %d seconds", new Object[] {
                Long.valueOf((l - d.a()) / 1000L)
            });
            Object obj = new Intent(a);
            obj = PendingIntent.getBroadcast(c, 0, ((Intent) (obj)), 0);
            e.set(0, l, ((PendingIntent) (obj)));
            return;
        }
    }

    private es c()
    {
        com.facebook.debug.log.b.a(b, "Removing expired tasks from the queue to be executed");
        et et1 = es.e();
        for (; !d(); et1.b(((ae)g.remove()).a)) { }
        return et1.b();
    }

    private boolean d()
    {
        f.a();
        return g.isEmpty() || ((ae)g.peek()).b > d.a();
    }

    public ac a(Runnable runnable)
    {
        return a(runnable, null);
    }

    public ac a(Runnable runnable, long l, TimeUnit timeunit)
    {
        runnable = b(runnable, null);
        a(((ac) (runnable)), d.a() + timeunit.toMillis(l));
        return runnable;
    }

    public ac a(Runnable runnable, Object obj)
    {
        runnable = b(runnable, obj);
        a(((ac) (runnable)), d.a());
        return runnable;
    }

    public ac a(Callable callable)
    {
        return a(callable, 0L, TimeUnit.MILLISECONDS);
    }

    public ac a(Callable callable, long l, TimeUnit timeunit)
    {
        callable = b(callable);
        a(((ac) (callable)), d.a() + timeunit.toMillis(l));
        return callable;
    }

    public boolean awaitTermination(long l, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException();
    }

    public s b(Runnable runnable)
    {
        return a(runnable);
    }

    public s c(Callable callable)
    {
        return a(callable);
    }

    public void execute(Runnable runnable)
    {
        a(runnable);
    }

    public boolean isShutdown()
    {
        return false;
    }

    public boolean isTerminated()
    {
        return false;
    }

    protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new ad(runnable, obj);
    }

    protected RunnableFuture newTaskFor(Callable callable)
    {
        return new ad(callable);
    }

    public ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
    {
        return a(runnable, l, timeunit);
    }

    public ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
    {
        return a(callable, l, timeunit);
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException();
    }

    public void shutdown()
    {
        throw new UnsupportedOperationException();
    }

    public List shutdownNow()
    {
        throw new UnsupportedOperationException();
    }

    public Future submit(Runnable runnable)
    {
        return a(runnable);
    }

    public Future submit(Runnable runnable, Object obj)
    {
        return a(runnable, obj);
    }

    public Future submit(Callable callable)
    {
        return a(callable);
    }

}
