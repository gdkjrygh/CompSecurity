// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.d.a:
//            c, x

class z extends c
{

    private final Lock a;
    private final Condition b;
    private int c;
    private boolean d;

    private z()
    {
        a = new ReentrantLock();
        b = a.newCondition();
        c = 0;
        d = false;
    }

    z(x x)
    {
        this();
    }

    private void a()
    {
        a.lock();
        if (isShutdown())
        {
            throw new RejectedExecutionException("Executor already shutdown");
        }
        break MISSING_BLOCK_LABEL_38;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
        c = c + 1;
        a.unlock();
        return;
    }

    private void b()
    {
        a.lock();
        c = c - 1;
        if (isTerminated())
        {
            b.signalAll();
        }
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public boolean awaitTermination(long l, TimeUnit timeunit)
    {
        l = timeunit.toNanos(l);
        a.lock();
_L1:
        boolean flag = isTerminated();
        if (flag)
        {
            a.unlock();
            return true;
        }
        if (l <= 0L)
        {
            a.unlock();
            return false;
        }
        l = b.awaitNanos(l);
          goto _L1
        timeunit;
        a.unlock();
        throw timeunit;
    }

    public void execute(Runnable runnable)
    {
        a();
        runnable.run();
        b();
        return;
        runnable;
        b();
        throw runnable;
    }

    public boolean isShutdown()
    {
        a.lock();
        boolean flag = d;
        a.unlock();
        return flag;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public boolean isTerminated()
    {
        a.lock();
        if (!d) goto _L2; else goto _L1
_L1:
        int i = c;
        if (i != 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        a.unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public void shutdown()
    {
        a.lock();
        d = true;
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public List shutdownNow()
    {
        shutdown();
        return Collections.emptyList();
    }
}
