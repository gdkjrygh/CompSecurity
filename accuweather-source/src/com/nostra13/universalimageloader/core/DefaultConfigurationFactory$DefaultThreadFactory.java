// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            DefaultConfigurationFactory

private static class poolNumber
    implements ThreadFactory
{

    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final String namePrefix;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final int threadPriority;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(group, runnable, (new StringBuilder()).append(namePrefix).append(threadNumber.getAndIncrement()).toString(), 0L);
        if (runnable.isDaemon())
        {
            runnable.setDaemon(false);
        }
        runnable.setPriority(threadPriority);
        return runnable;
    }


    (int i)
    {
        threadPriority = i;
        Object obj = System.getSecurityManager();
        if (obj != null)
        {
            obj = ((SecurityManager) (obj)).getThreadGroup();
        } else
        {
            obj = Thread.currentThread().getThreadGroup();
        }
        group = ((ThreadGroup) (obj));
        namePrefix = (new StringBuilder()).append("uil-pool-").append(poolNumber.getAndIncrement()).append("-thread-").toString();
    }
}
