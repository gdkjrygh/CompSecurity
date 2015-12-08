// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.taplytics:
//            y

public final class x
    implements ExecutorService
{

    ExecutorService a;

    public x(ExecutorService executorservice)
    {
        a = executorservice;
    }

    public final boolean awaitTermination(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return a.awaitTermination(l, timeunit);
    }

    public final void execute(Runnable runnable)
    {
        a.execute(runnable);
        a.execute(new y(this));
    }

    public final List invokeAll(Collection collection)
        throws InterruptedException
    {
        return a.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return a.invokeAll(collection, l, timeunit);
    }

    public final Object invokeAny(Collection collection)
        throws InterruptedException, ExecutionException
    {
        return a.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return a.invokeAny(collection, l, timeunit);
    }

    public final boolean isShutdown()
    {
        return a.isShutdown();
    }

    public final boolean isTerminated()
    {
        return a.isTerminated();
    }

    public final void shutdown()
    {
        a.shutdown();
    }

    public final List shutdownNow()
    {
        return a.shutdownNow();
    }

    public final Future submit(Runnable runnable)
    {
        return a.submit(runnable);
    }

    public final Future submit(Runnable runnable, Object obj)
    {
        return a.submit(runnable, obj);
    }

    public final Future submit(Callable callable)
    {
        return a.submit(callable);
    }
}
