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
//            eu

public final class en
{

    private static final ThreadFactory sh;
    private static final ThreadPoolExecutor si;

    public static void execute(Runnable runnable)
    {
        try
        {
            si.execute(new Runnable(runnable) {

                final Runnable sj;

                public void run()
                {
                    Process.setThreadPriority(10);
                    sj.run();
                }

            
            {
                sj = runnable;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            eu.c((new StringBuilder()).append("Too many background threads already running. Aborting task.  Current pool size: ").append(getPoolSize()).toString(), runnable);
        }
    }

    public static int getPoolSize()
    {
        return si.getPoolSize();
    }

    static 
    {
        sh = new ThreadFactory() {

            private final AtomicInteger sk = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker #").append(sk.getAndIncrement()).toString());
            }

        };
        si = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, new SynchronousQueue(true), sh);
    }
}
