// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.google.android.libraries.commerce.ocr.util:
//            ExecutorServiceFactory

static final class 
    implements RejectedExecutionHandler
{

    private static void cleanupRunnable(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        }
        if (runnable instanceof )
        {
            (()runnable).();
            return;
        }
        runnable = String.valueOf(runnable.getClass().getName());
        if (runnable.length() != 0)
        {
            runnable = "Must be of type RetirableRunnable, but was: ".concat(runnable);
        } else
        {
            runnable = new String("Must be of type RetirableRunnable, but was: ");
        }
        throw new RejectedExecutionException(runnable);
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
    {
        if (!threadpoolexecutor.isShutdown())
        {
            Runnable runnable1 = (Runnable)threadpoolexecutor.getQueue().poll();
            threadpoolexecutor.execute(runnable);
            cleanupRunnable(runnable1);
            return;
        } else
        {
            cleanupRunnable(runnable);
            return;
        }
    }

    ()
    {
    }
}
