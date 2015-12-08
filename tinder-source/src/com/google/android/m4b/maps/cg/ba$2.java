// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.Handler;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ba

final class a
    implements ScheduledExecutorService
{

    private Handler a;

    public final boolean awaitTermination(long l, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final void execute(Runnable runnable)
    {
        a.post(runnable);
    }

    public final List invokeAll(Collection collection)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final List invokeAll(Collection collection, long l, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final Object invokeAny(Collection collection)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final Object invokeAny(Collection collection, long l, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final boolean isShutdown()
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final boolean isTerminated()
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
    {
        a.postDelayed(runnable, timeunit.toMillis(l));
        return null;
    }

    public final ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final void shutdown()
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final List shutdownNow()
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final Future submit(Runnable runnable)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final Future submit(Runnable runnable, Object obj)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final Future submit(Callable callable)
    {
        throw new UnsupportedOperationException("Not implemented.");
    }

    (Handler handler)
    {
        a = handler;
        super();
    }
}
