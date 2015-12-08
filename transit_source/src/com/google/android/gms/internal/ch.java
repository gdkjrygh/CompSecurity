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
//            cn

public final class ch
{

    private static final ThreadFactory hF;
    private static final ThreadPoolExecutor hG;

    public static void execute(Runnable runnable)
    {
        try
        {
            hG.execute(new Runnable(runnable) {

                final Runnable hH;

                public void run()
                {
                    Process.setThreadPriority(10);
                    hH.run();
                }

            
            {
                hH = runnable;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            cn.b("Too many background threads already running. Aborting task.", runnable);
        }
    }

    static 
    {
        hF = new ThreadFactory() {

            private final AtomicInteger hI = new AtomicInteger(1);

            public Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, (new StringBuilder()).append("AdWorker #").append(hI.getAndIncrement()).toString());
            }

        };
        hG = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, new SynchronousQueue(true), hF);
    }
}
