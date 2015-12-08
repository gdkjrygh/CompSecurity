// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class gzz extends ThreadPoolExecutor
{

    private static final int a;
    private static final int b;
    private static final int c;

    private gzz(int i, int j, TimeUnit timeunit, DependencyPriorityBlockingQueue dependencypriorityblockingqueue, ThreadFactory threadfactory)
    {
        super(i, j, 1L, timeunit, dependencypriorityblockingqueue, threadfactory);
        prestartAllCoreThreads();
    }

    public static gzz a()
    {
        return new gzz(b, c, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new haa());
    }

    protected final void afterExecute(Runnable runnable, Throwable throwable)
    {
        hab hab1 = (hab)runnable;
        hab1.a(true);
        hab1.a(throwable);
        ((DependencyPriorityBlockingQueue)super.getQueue()).a();
        super.afterExecute(runnable, throwable);
    }

    public final void execute(Runnable runnable)
    {
        if (gzy.b(runnable))
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
        return new gzw(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable)
    {
        return new gzw(callable);
    }

    static 
    {
        int i = Runtime.getRuntime().availableProcessors();
        a = i;
        b = i + 1;
        c = (a << 1) + 1;
    }
}
