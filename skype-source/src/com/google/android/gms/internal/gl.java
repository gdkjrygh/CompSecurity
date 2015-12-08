// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            gx, ha, gd

public final class gl
{

    private static final ExecutorService a = Executors.newFixedThreadPool(10, a("Default"));
    private static final ExecutorService b = Executors.newFixedThreadPool(5, a("Loader"));

    public static ha a(int i, Runnable runnable)
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

    public static ha a(Runnable runnable)
    {
        return a(0, runnable);
    }

    public static ha a(Callable callable)
    {
        return a(a, callable);
    }

    private static ha a(ExecutorService executorservice, Callable callable)
    {
        gx gx1 = new gx();
        try
        {
            executorservice.submit(new Runnable(gx1, callable) {

                final gx a;
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
                        p.h().a(exception, true);
                    }
                    a.cancel(true);
                }

            
            {
                a = gx1;
                b = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (ExecutorService executorservice)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Thread execution is rejected.", executorservice);
            gx1.cancel(true);
            return gx1;
        }
        return gx1;
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
