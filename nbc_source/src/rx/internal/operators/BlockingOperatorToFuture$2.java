// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorToFuture

static final class cancelled
    implements Future
{

    private volatile boolean cancelled;
    final AtomicReference val$error;
    final CountDownLatch val$finished;
    final Subscription val$s;
    final AtomicReference val$value;

    private Object getValue()
        throws ExecutionException
    {
        if (val$error.get() != null)
        {
            throw new ExecutionException("Observable onError", (Throwable)val$error.get());
        }
        if (cancelled)
        {
            throw new CancellationException("Subscription unsubscribed");
        } else
        {
            return val$value.get();
        }
    }

    public boolean cancel(boolean flag)
    {
        if (val$finished.getCount() > 0L)
        {
            cancelled = true;
            val$s.unsubscribe();
            val$finished.countDown();
            return true;
        } else
        {
            return false;
        }
    }

    public Object get()
        throws InterruptedException, ExecutionException
    {
        val$finished.await();
        return getValue();
    }

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        if (val$finished.await(l, timeunit))
        {
            return getValue();
        } else
        {
            throw new TimeoutException((new StringBuilder()).append("Timed out after ").append(timeunit.toMillis(l)).append("ms waiting for underlying Observable.").toString());
        }
    }

    public boolean isCancelled()
    {
        return cancelled;
    }

    public boolean isDone()
    {
        return val$finished.getCount() == 0L;
    }

    (CountDownLatch countdownlatch, Subscription subscription, AtomicReference atomicreference, AtomicReference atomicreference1)
    {
        val$finished = countdownlatch;
        val$s = subscription;
        val$error = atomicreference;
        val$value = atomicreference1;
        super();
        cancelled = false;
    }
}
