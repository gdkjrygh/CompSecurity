// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.util.BackpressureDrainManager;

// Referenced classes of package rx.internal.operators:
//            OperatorOnBackpressureBuffer, NotificationLite

private static final class onOverflow extends Subscriber
    implements rx.internal.util.back
{

    private final Long baseCapacity;
    private final AtomicLong capacity;
    private final Subscriber child;
    private final BackpressureDrainManager manager = new BackpressureDrainManager(this);
    private final NotificationLite on = NotificationLite.instance();
    private final Action0 onOverflow;
    private final ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
    private final AtomicBoolean saturated = new AtomicBoolean(false);

    private boolean assertCapacity()
    {
        if (capacity == null)
        {
            return true;
        }
        long l;
        do
        {
            l = capacity.get();
            if (l <= 0L)
            {
                if (saturated.compareAndSet(false, true))
                {
                    unsubscribe();
                    child.onError(new MissingBackpressureException((new StringBuilder()).append("Overflowed buffer of ").append(baseCapacity).toString()));
                    if (onOverflow != null)
                    {
                        onOverflow.call();
                    }
                }
                return false;
            }
        } while (!capacity.compareAndSet(l, l - 1L));
        return true;
    }

    public boolean accept(Object obj)
    {
        return on.accept(child, obj);
    }

    public void complete(Throwable throwable)
    {
        if (throwable != null)
        {
            child.onError(throwable);
            return;
        } else
        {
            child.onCompleted();
            return;
        }
    }

    protected Producer manager()
    {
        return manager;
    }

    public void onCompleted()
    {
        if (!saturated.get())
        {
            manager.terminateAndDrain();
        }
    }

    public void onError(Throwable throwable)
    {
        if (!saturated.get())
        {
            manager.terminateAndDrain(throwable);
        }
    }

    public void onNext(Object obj)
    {
        if (!assertCapacity())
        {
            return;
        } else
        {
            queue.offer(on.next(obj));
            manager.drain();
            return;
        }
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    public Object peek()
    {
        return queue.peek();
    }

    public Object poll()
    {
        Object obj = queue.poll();
        if (capacity != null && obj != null)
        {
            capacity.incrementAndGet();
        }
        return obj;
    }

    public I(Subscriber subscriber, Long long1, Action0 action0)
    {
        child = subscriber;
        baseCapacity = long1;
        if (long1 != null)
        {
            subscriber = new AtomicLong(long1.longValue());
        } else
        {
            subscriber = null;
        }
        capacity = subscriber;
        onOverflow = action0;
    }
}
