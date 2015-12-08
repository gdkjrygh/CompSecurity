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
//            gr, gk, ga

public final class gh
{

    private static final ThreadFactory ww;
    private static final ExecutorService wx;

    public static Future a(Runnable runnable)
    {
        return submit(new Callable(runnable) {

            final Runnable wy;

            public Object call()
                throws Exception
            {
                return ds();
            }

            public Void ds()
            {
                wy.run();
                return null;
            }

            
            {
                wy = runnable;
                super();
            }
        });
    }

    public static Future submit(Callable callable)
    {
        try
        {
            callable = wx.submit(new Callable(callable) {

                final Callable wz;

                public Object call()
                    throws Exception
                {
                    Object obj;
                    try
                    {
                        Process.setThreadPriority(10);
                        obj = wz.call();
                    }
                    catch (Exception exception)
                    {
                        ga.e(exception);
                        return null;
                    }
                    return obj;
                }

            
            {
                wz = callable;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            gr.d("Thread execution is rejected.", callable);
            return new gk(null);
        }
        return callable;
    }

    static 
    {
        ww = new ThreadFactory() {

            private final AtomicInteger wA = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker #").append(wA.getAndIncrement()).toString());
            }

        };
        wx = Executors.newFixedThreadPool(10, ww);
    }
}
