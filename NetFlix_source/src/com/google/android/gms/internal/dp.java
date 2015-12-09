// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            dw

public final class dp
{

    private static final ThreadFactory ra;
    private static final ThreadPoolExecutor rb;

    public static void execute(Runnable runnable)
    {
        try
        {
            rb.execute(new Runnable(runnable) {

                final Runnable rc;

                public void run()
                {
                    Process.setThreadPriority(10);
                    rc.run();
                }

            
            {
                rc = runnable;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            dw.c((new StringBuilder()).append("Too many background threads already running. Aborting task.  Current pool size: ").append(getPoolSize()).toString(), runnable);
        }
    }

    public static int getPoolSize()
    {
        return rb.getPoolSize();
    }

    static 
    {
        ra = new ThreadFactory() {

            private final AtomicInteger rd = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker #").append(rd.getAndIncrement()).toString());
            }

        };
        rb = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, new SynchronousQueue(true), ra);
    }
}
