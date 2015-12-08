// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.c;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.bumptech.glide.load.b.c:
//            e, b, d

public final class a extends ThreadPoolExecutor
{

    private final AtomicInteger a;
    private final e b;

    public a(int i)
    {
        this(i, e.b);
    }

    private a(int i, int j, TimeUnit timeunit, ThreadFactory threadfactory, e e1)
    {
        super(i, j, 0L, timeunit, new PriorityBlockingQueue(), threadfactory);
        a = new AtomicInteger();
        b = e1;
    }

    private a(int i, e e1)
    {
        this(i, i, TimeUnit.MILLISECONDS, ((ThreadFactory) (new b())), e1);
    }

    protected final void afterExecute(Runnable runnable, Throwable throwable)
    {
        super.afterExecute(runnable, throwable);
        if (throwable != null || !(runnable instanceof Future))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        runnable = (Future)runnable;
        if (!runnable.isDone() || runnable.isCancelled())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        runnable.get();
        return;
        runnable;
        b.a(runnable);
        return;
        runnable;
        b.a(runnable);
        return;
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new d(runnable, obj, a.getAndIncrement());
    }
}
