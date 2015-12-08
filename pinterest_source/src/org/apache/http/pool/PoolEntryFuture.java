// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.pool;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.http.concurrent.FutureCallback;

abstract class PoolEntryFuture
    implements Future
{

    private final FutureCallback callback;
    private volatile boolean cancelled;
    private volatile boolean completed;
    private final Condition condition;
    private final Lock lock;
    private Object result;

    PoolEntryFuture(Lock lock1, FutureCallback futurecallback)
    {
        lock = lock1;
        condition = lock1.newCondition();
        callback = futurecallback;
    }

    public boolean await(Date date)
    {
        lock.lock();
        if (cancelled)
        {
            throw new InterruptedException("Operation interrupted");
        }
        break MISSING_BLOCK_LABEL_38;
        date;
        lock.unlock();
        throw date;
        if (date == null) goto _L2; else goto _L1
_L1:
        boolean flag = condition.awaitUntil(date);
_L3:
        if (cancelled)
        {
            throw new InterruptedException("Operation interrupted");
        }
        break MISSING_BLOCK_LABEL_84;
_L2:
        condition.await();
        flag = true;
          goto _L3
        lock.unlock();
        return flag;
    }

    public boolean cancel(boolean flag)
    {
        lock.lock();
        flag = completed;
        if (flag)
        {
            lock.unlock();
            return false;
        }
        completed = true;
        cancelled = true;
        if (callback != null)
        {
            callback.cancelled();
        }
        condition.signalAll();
        lock.unlock();
        return true;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object get()
    {
        Object obj;
        try
        {
            obj = get(0L, TimeUnit.MILLISECONDS);
        }
        catch (TimeoutException timeoutexception)
        {
            throw new ExecutionException(timeoutexception);
        }
        return obj;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        lock.lock();
        if (!completed)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        timeunit = ((TimeUnit) (result));
        lock.unlock();
        return timeunit;
        result = getPoolEntry(l, timeunit);
        completed = true;
        if (callback != null)
        {
            callback.completed(result);
        }
        timeunit = ((TimeUnit) (result));
        lock.unlock();
        return timeunit;
        timeunit;
        completed = true;
        result = null;
        if (callback != null)
        {
            callback.failed(timeunit);
        }
        throw new ExecutionException(timeunit);
        timeunit;
        lock.unlock();
        throw timeunit;
    }

    protected abstract Object getPoolEntry(long l, TimeUnit timeunit);

    public boolean isCancelled()
    {
        return cancelled;
    }

    public boolean isDone()
    {
        return completed;
    }

    public void wakeup()
    {
        lock.lock();
        condition.signalAll();
        lock.unlock();
        return;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }
}
