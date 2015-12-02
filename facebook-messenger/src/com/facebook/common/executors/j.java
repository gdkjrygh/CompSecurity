// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;
import com.facebook.debug.log.b;
import com.google.common.d.a.s;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.common.executors:
//            i, l, k, m

public class j extends AbstractExecutorService
    implements i
{

    private final Handler a;

    public j(Handler handler)
    {
        a = handler;
    }

    public l a(Runnable runnable)
    {
        return b(runnable, (Void)null);
    }

    public l a(Runnable runnable, long l1, long l2, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException();
    }

    public l a(Runnable runnable, long l1, TimeUnit timeunit)
    {
        runnable = a(runnable, null);
        a.postDelayed(runnable, timeunit.toMillis(l1));
        return runnable;
    }

    protected l a(Runnable runnable, Object obj)
    {
        return new l(c(), runnable, obj);
    }

    protected l a(Callable callable)
    {
        return new l(c(), callable);
    }

    public l a(Callable callable, long l1, TimeUnit timeunit)
    {
        callable = a(callable);
        a.postDelayed(callable, timeunit.toMillis(l1));
        return callable;
    }

    public void a()
    {
        a.getLooper().quit();
    }

    public boolean awaitTermination(long l1, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException();
    }

    public l b(Runnable runnable, long l1, long l2, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException();
    }

    public l b(Runnable runnable, Object obj)
    {
        if (runnable == null)
        {
            throw new NullPointerException();
        } else
        {
            runnable = a(runnable, obj);
            execute(runnable);
            return runnable;
        }
    }

    public l b(Callable callable)
    {
        if (callable == null)
        {
            throw new NullPointerException();
        } else
        {
            callable = a(callable);
            execute(callable);
            return callable;
        }
    }

    public s b(Runnable runnable)
    {
        return a(runnable);
    }

    public boolean b()
    {
        return Thread.currentThread() == a.getLooper().getThread();
    }

    public Handler c()
    {
        return a;
    }

    public s c(Callable callable)
    {
        return b(callable);
    }

    public void execute(Runnable runnable)
    {
        if ((runnable instanceof Future) && !(runnable instanceof k))
        {
            com.facebook.debug.log.b.d(getClass(), "%s submitted as runnable to %s. Potential deadlocks on get().", new Object[] {
                runnable.getClass(), getClass()
            });
        }
        a.post(runnable);
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
        return new m(c(), runnable, obj);
    }

    protected RunnableFuture newTaskFor(Callable callable)
    {
        return new m(c(), callable);
    }

    public ScheduledFuture schedule(Runnable runnable, long l1, TimeUnit timeunit)
    {
        return a(runnable, l1, timeunit);
    }

    public ScheduledFuture schedule(Callable callable, long l1, TimeUnit timeunit)
    {
        return a(callable, l1, timeunit);
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l1, long l2, TimeUnit timeunit)
    {
        return a(runnable, l1, l2, timeunit);
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l1, long l2, TimeUnit timeunit)
    {
        return b(runnable, l1, l2, timeunit);
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
        return b(runnable, obj);
    }

    public Future submit(Callable callable)
    {
        return b(callable);
    }
}
