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
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;

public final class BlockingOperatorToFuture
{

    private BlockingOperatorToFuture()
    {
        throw new IllegalStateException("No instances!");
    }

    public static Future toFuture(Observable observable)
    {
        CountDownLatch countdownlatch = new CountDownLatch(1);
        AtomicReference atomicreference = new AtomicReference();
        AtomicReference atomicreference1 = new AtomicReference();
        return new Future(countdownlatch, observable.single().subscribe(new Subscriber(countdownlatch, atomicreference1, atomicreference) {

            final AtomicReference val$error;
            final CountDownLatch val$finished;
            final AtomicReference val$value;

            public void onCompleted()
            {
                finished.countDown();
            }

            public void onError(Throwable throwable)
            {
                error.compareAndSet(null, throwable);
                finished.countDown();
            }

            public void onNext(Object obj)
            {
                value.set(obj);
            }

            
            {
                finished = countdownlatch;
                error = atomicreference;
                value = atomicreference1;
                super();
            }
        }), atomicreference1, atomicreference) {

            private volatile boolean cancelled;
            final AtomicReference val$error;
            final CountDownLatch val$finished;
            final Subscription val$s;
            final AtomicReference val$value;

            private Object getValue()
                throws ExecutionException
            {
                if (error.get() != null)
                {
                    throw new ExecutionException("Observable onError", (Throwable)error.get());
                }
                if (cancelled)
                {
                    throw new CancellationException("Subscription unsubscribed");
                } else
                {
                    return value.get();
                }
            }

            public boolean cancel(boolean flag)
            {
                if (finished.getCount() > 0L)
                {
                    cancelled = true;
                    s.unsubscribe();
                    finished.countDown();
                    return true;
                } else
                {
                    return false;
                }
            }

            public Object get()
                throws InterruptedException, ExecutionException
            {
                finished.await();
                return getValue();
            }

            public Object get(long l, TimeUnit timeunit)
                throws InterruptedException, ExecutionException, TimeoutException
            {
                if (finished.await(l, timeunit))
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
                return finished.getCount() == 0L;
            }

            
            {
                finished = countdownlatch;
                s = subscription;
                error = atomicreference;
                value = atomicreference1;
                super();
                cancelled = false;
            }
        };
    }
}
