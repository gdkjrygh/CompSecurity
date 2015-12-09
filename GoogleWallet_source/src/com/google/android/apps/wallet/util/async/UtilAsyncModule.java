// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            SequentialExecutor

public class UtilAsyncModule
{

    public UtilAsyncModule()
    {
    }

    private static BlockingQueue getBlockingQueue()
    {
        return new LinkedBlockingQueue(10);
    }

    static Executor getParallelExecutor()
    {
        return new ThreadPoolExecutor(10, 128, 1L, TimeUnit.SECONDS, getBlockingQueue(), getThreadFactory());
    }

    static ActionRequests.RequestFactory getRequestFactory(Handler handler)
    {
        return new ActionRequests.RequestFactory(handler);
    }

    public static Executor getSequentialThreadExecutor(SequentialExecutor sequentialexecutor)
    {
        return sequentialexecutor;
    }

    private static ThreadFactory getThreadFactory()
    {
        return new ThreadFactory() {

            private final AtomicInteger threadId = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable)
            {
                int i = threadId.getAndIncrement();
                return new Thread(runnable, (new StringBuilder(30)).append("Wallet pool thread ").append(i).toString());
            }

        };
    }
}
