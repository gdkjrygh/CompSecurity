// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            cs, cu, ct, cf

public final class ck
{

    private static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
    private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

    public static ct a(int i, Runnable runnable)
    {
        if (i == 1)
        {
            return a(b, new Callable(runnable) {

                final Runnable a;

                public final Object call()
                    throws Exception
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

                final Runnable a;

                public final Object call()
                    throws Exception
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

    public static ct a(Runnable runnable)
    {
        return a(0, runnable);
    }

    private static ct a(ExecutorService executorservice, Callable callable)
    {
        cs cs1 = new cs();
        cu cu1;
        callable = new Runnable(cs1, executorservice.submit(new Runnable(cs1, callable) {

            final cs a;
            final Callable b;

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
                    d.f().a(exception, true);
                }
                a.cancel(true);
            }

            
            {
                a = cs1;
                b = callable;
                super();
            }
        })) {

            final cs a;
            final Future b;

            public final void run()
            {
                if (a.isCancelled())
                {
                    b.cancel(true);
                }
            }

            
            {
                a = cs1;
                b = future;
                super();
            }
        };
        cu1 = cs1.b;
        executorservice = ((ExecutorService) (cu1.a));
        executorservice;
        JVM INSTR monitorenter ;
        if (!cu1.c)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        cu.a(callable);
_L2:
        return cs1;
        cu1.b.add(callable);
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
            com.google.android.gms.ads.internal.util.client.b.c("Thread execution is rejected.", executorservice);
        }
        cs1.cancel(true);
        return cs1;
    }

    private static ThreadFactory a(String s)
    {
        return new ThreadFactory(s) {

            final String a;
            private final AtomicInteger b = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder("AdWorker(")).append(a).append(") #").append(b.getAndIncrement()).toString());
            }

            
            {
                a = s;
                super();
            }
        };
    }

}
