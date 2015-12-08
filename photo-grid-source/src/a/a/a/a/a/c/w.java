// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package a.a.a.a.a.c:
//            m, x, y, v, 
//            t

public final class w extends ThreadPoolExecutor
{

    private static final int a;
    private static final int b;
    private static final int c;

    private w(int i, int j, TimeUnit timeunit, m m1, ThreadFactory threadfactory)
    {
        super(i, j, 1L, timeunit, m1, threadfactory);
        prestartAllCoreThreads();
    }

    public static w a()
    {
        return new w(b, c, TimeUnit.SECONDS, new m(), new x());
    }

    protected final void afterExecute(Runnable runnable, Throwable throwable)
    {
        y y1 = (y)runnable;
        y1.a(true);
        y1.a(throwable);
        ((m)super.getQueue()).a();
        super.afterExecute(runnable, throwable);
    }

    public final void execute(Runnable runnable)
    {
        if (v.b(runnable))
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
        return (m)super.getQueue();
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new t(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable)
    {
        return new t(callable);
    }

    static 
    {
        int i = Runtime.getRuntime().availableProcessors();
        a = i;
        b = i + 1;
        c = a * 2 + 1;
    }
}
