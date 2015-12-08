// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.task;

import com.comscore.analytics.Core;
import com.comscore.utils.CSLog;
import com.comscore.utils.Constants;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.comscore.utils.task:
//            CustomThreadPoolExecutor, a

public class TaskExecutor
{

    private static final int b = 1;
    private static final int c = 1;
    private static final long d = 20000L;
    Core a;
    private BlockingQueue e;
    private CustomThreadPoolExecutor f;

    public TaskExecutor(Core core)
    {
        e = new LinkedBlockingQueue();
        f = new CustomThreadPoolExecutor(1, 1, 20000L, TimeUnit.MILLISECONDS, e);
        a = core;
    }

    private void a(CustomThreadPoolExecutor customthreadpoolexecutor)
    {
        do
        {
            if (customthreadpoolexecutor.getTasksRunning() == 0 && customthreadpoolexecutor.getQueue().size() == 0)
            {
                return;
            }
            try
            {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }

    public void clear()
    {
        e.clear();
    }

    public boolean execute(Runnable runnable, boolean flag)
    {
        if (a.isEnabled()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (flag) goto _L4; else goto _L3
_L3:
        runnable.run();
_L5:
        return true;
        runnable;
        if (Constants.DEBUG)
        {
            CSLog.e(getClass(), "Unexpected error: ");
            CSLog.printStackTrace(runnable);
        }
        if (true) goto _L5; else goto _L4
_L4:
        f.execute(new a(this, runnable));
        return true;
        runnable;
        if (Constants.DEBUG)
        {
            CSLog.e(getClass(), "Unable to queue a task: ");
            CSLog.printStackTrace(runnable);
            return false;
        }
        continue; /* Loop/switch isn't completed */
        runnable;
        if (Constants.DEBUG)
        {
            CSLog.e(getClass(), "Unexpected error: ");
            CSLog.printStackTrace(runnable);
            return false;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void waitForTasks()
    {
        a(f);
    }
}
