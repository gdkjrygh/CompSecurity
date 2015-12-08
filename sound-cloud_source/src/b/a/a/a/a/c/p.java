// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package b.a.a.a.a.c:
//            g, q, o, m

public final class p extends ThreadPoolExecutor
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

    private p(int i, int j, TimeUnit timeunit, g g1, ThreadFactory threadfactory)
    {
        super(i, j, 1L, timeunit, g1, threadfactory);
        prestartAllCoreThreads();
    }

    public static p a()
    {
        return new p(b, c, TimeUnit.SECONDS, new g(), new a());
    }

    protected final void afterExecute(Runnable runnable, Throwable throwable)
    {
        q q1 = (q)runnable;
        q1.a(true);
        q1.a(throwable);
        ((g)super.getQueue()).a();
        super.afterExecute(runnable, throwable);
    }

    public final void execute(Runnable runnable)
    {
        if (o.b(runnable))
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
        return (g)super.getQueue();
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new m(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable)
    {
        return new m(callable);
    }

    static 
    {
        int i = Runtime.getRuntime().availableProcessors();
        a = i;
        b = i + 1;
        c = a * 2 + 1;
    }
}
