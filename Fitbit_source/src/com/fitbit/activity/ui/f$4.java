// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.e.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.fitbit.activity.ui:
//            f

static final class PoolExecutor
    implements RejectedExecutionHandler
{

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
    {
        a.a("GraphDataDownloader", "Rejected task. Poll old task and push new.", new Object[0]);
        threadpoolexecutor.getQueue().poll();
        threadpoolexecutor.execute(runnable);
    }

    PoolExecutor()
    {
    }
}
