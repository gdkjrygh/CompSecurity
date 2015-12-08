// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            DependencyPriorityBlockingQueue, i, g, e

public final class h extends ThreadPoolExecutor
{
    protected static final class a
        implements ThreadFactory
    {

        private final int a = 10;

        public final Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable);
            runnable.setPriority(a);
            runnable.setName("Queue");
            return runnable;
        }

        public a()
        {
        }
    }


    private static final int a;
    private static final int b;
    private static final int c;

    private h(int j, int k, TimeUnit timeunit, DependencyPriorityBlockingQueue dependencypriorityblockingqueue, ThreadFactory threadfactory)
    {
        super(j, k, 1L, timeunit, dependencypriorityblockingqueue, threadfactory);
        prestartAllCoreThreads();
    }

    public static h a()
    {
        return new h(b, c, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new a());
    }

    protected final void afterExecute(Runnable runnable, Throwable throwable)
    {
        i j = (i)runnable;
        j.a(true);
        j.a(throwable);
        ((DependencyPriorityBlockingQueue)super.getQueue()).a();
        super.afterExecute(runnable, throwable);
    }

    public final void execute(Runnable runnable)
    {
        if (g.b(runnable))
        {
            super.execute(runnable);
            return;
        } else
        {
            super.execute(newTaskFor(runnable, null));
            return;
        }
    }

    public final volatile BlockingQueue getQueue()
    {
        return (DependencyPriorityBlockingQueue)super.getQueue();
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new e(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable)
    {
        return new e(callable);
    }

    static 
    {
        int j = Runtime.getRuntime().availableProcessors();
        a = j;
        b = j + 1;
        c = a * 2 + 1;
    }
}
