// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class cji
{

    private static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
    private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

    public static ckk a(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return a(b, new Callable(runnable) {

                private Runnable a;

                public final Object call()
                {
                    a.run();
                    return null;
                }

            
            {
                a = runnable;
                super();
            }
            });
        } else
        {
            return a(a, new Callable(runnable) {

                private Runnable a;

                public final Object call()
                {
                    a.run();
                    return null;
                }

            
            {
                a = runnable;
                super();
            }
            });
        }
    }

    public static ckk a(Runnable runnable)
    {
        return a(0, runnable);
    }

    public static ckk a(Callable callable)
    {
        return a(a, callable);
    }

    private static ckk a(ExecutorService executorservice, Callable callable)
    {
        ckg ckg1 = new ckg();
        ckl ckl1;
        callable = new Runnable(ckg1, executorservice.submit(new Runnable(ckg1, callable) {

            private ckg a;
            private Callable b;

            public final void run()
            {
                try
                {
                    Process.setThreadPriority(10);
                    a.b(b.call());
                    return;
                }
                catch (Exception exception)
                {
                    bkv.h().a(exception, true);
                }
                a.cancel(true);
            }

            
            {
                a = ckg1;
                b = callable;
                super();
            }
        })) {

            private ckg a;
            private Future b;

            public final void run()
            {
                if (a.isCancelled())
                {
                    b.cancel(true);
                }
            }

            
            {
                a = ckg1;
                b = future;
                super();
            }
        };
        ckl1 = ckg1.a;
        executorservice = ((ExecutorService) (ckl1.a));
        executorservice;
        JVM INSTR monitorenter ;
        if (!ckl1.c)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ckl.b(callable);
_L2:
        return ckg1;
        ckl1.b.add(callable);
        if (true) goto _L2; else goto _L1
_L1:
        callable;
        executorservice;
        JVM INSTR monitorexit ;
        try
        {
            throw callable;
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            bka.c("Thread execution is rejected.", executorservice);
        }
        ckg1.cancel(true);
        return ckg1;
    }

    private static ThreadFactory a(String s)
    {
        return new ThreadFactory(s) {

            private final AtomicInteger a = new AtomicInteger(1);
            private String b;

            public final Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder("AdWorker(")).append(b).append(") #").append(a.getAndIncrement()).toString());
            }

            
            {
                b = s;
                super();
            }
        };
    }

}
