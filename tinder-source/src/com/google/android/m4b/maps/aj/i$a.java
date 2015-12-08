// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            h, i

static final class <init> extends h
{

    private final Lock a;
    private final Condition b;
    private int c;
    private boolean d;

    private void a()
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

    public final boolean awaitTermination(long l, TimeUnit timeunit)
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

    public final void execute(Runnable runnable)
    {
        a.lock();
        if (isShutdown())
        {
            throw new RejectedExecutionException("Executor already shutdown");
        }
        break MISSING_BLOCK_LABEL_38;
        runnable;
        a.unlock();
        throw runnable;
        c = c + 1;
        a.unlock();
        runnable.run();
        a();
        return;
        runnable;
        a();
        throw runnable;
    }

    public final boolean isShutdown()
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

    public final boolean isTerminated()
    {
        a.lock();
        if (!d) goto _L2; else goto _L1
_L1:
        int j = c;
        if (j != 0) goto _L2; else goto _L3
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

    public final void shutdown()
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

    public final List shutdownNow()
    {
        shutdown();
        return Collections.emptyList();
    }

    private n()
    {
        a = new ReentrantLock();
        b = a.newCondition();
        c = 0;
        d = false;
    }

    d(byte byte0)
    {
        this();
    }
}
