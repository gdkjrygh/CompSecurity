// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class ad
    implements ThreadFactory
{

    private final ThreadGroup a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c;

    ad(String s)
    {
        Object obj = System.getSecurityManager();
        if (obj != null)
        {
            obj = ((SecurityManager) (obj)).getThreadGroup();
        } else
        {
            obj = Thread.currentThread().getThreadGroup();
        }
        a = ((ThreadGroup) (obj));
        c = s;
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(a, runnable, (new StringBuilder()).append(c).append(b.getAndIncrement()).toString(), 0L);
        if (runnable.isDaemon())
        {
            runnable.setDaemon(false);
        }
        if (runnable.getPriority() != 5)
        {
            runnable.setPriority(5);
        }
        return runnable;
    }
}
