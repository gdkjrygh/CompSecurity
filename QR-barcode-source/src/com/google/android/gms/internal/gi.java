// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            gs, gl, gb

public final class gi
{

    private static final ThreadFactory wh;
    private static final ExecutorService wi;

    public static Future a(Runnable runnable)
    {
        return submit(new Callable(runnable) {

            final Runnable wj;

            public Object call()
                throws Exception
            {
                return dj();
            }

            public Void dj()
            {
                wj.run();
                return null;
            }

            
            {
                wj = runnable;
                super();
            }
        });
    }

    public static Future submit(Callable callable)
    {
        try
        {
            callable = wi.submit(new Callable(callable) {

                final Callable wk;

                public Object call()
                    throws Exception
                {
                    Object obj;
                    try
                    {
                        Process.setThreadPriority(10);
                        obj = wk.call();
                    }
                    catch (Exception exception)
                    {
                        gb.e(exception);
                        return null;
                    }
                    return obj;
                }

            
            {
                wk = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            gs.d("Thread execution is rejected.", callable);
            return new gl(null);
        }
        return callable;
    }

    static 
    {
        wh = new ThreadFactory() {

            private final AtomicInteger wl = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker #").append(wl.getAndIncrement()).toString());
            }

        };
        wi = Executors.newFixedThreadPool(10, wh);
    }
}
