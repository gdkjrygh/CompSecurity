// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.operators.BackpressureUtils;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

public final class QueuedValueProducer extends AtomicLong
    implements Producer
{

    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 0x64fd87a3da19de97L;
    final Subscriber child;
    final Queue queue;
    final AtomicInteger wip;

    public QueuedValueProducer(Subscriber subscriber)
    {
        Object obj;
        if (UnsafeAccess.isUnsafeAvailable())
        {
            obj = new SpscLinkedQueue();
        } else
        {
            obj = new SpscLinkedAtomicQueue();
        }
        this(subscriber, ((Queue) (obj)));
    }

    public QueuedValueProducer(Subscriber subscriber, Queue queue1)
    {
        child = subscriber;
        queue = queue1;
        wip = new AtomicInteger();
    }

    private void drain()
    {
        if (wip.getAndIncrement() != 0) goto _L2; else goto _L1
_L1:
        Subscriber subscriber;
        Queue queue1;
        subscriber = child;
        queue1 = queue;
_L8:
        if (!subscriber.isUnsubscribed()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        long l;
        long l1;
        wip.lazySet(1);
        l1 = get();
        l = 0L;
_L5:
        Object obj;
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj = queue1.poll();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (obj != NULL_SENTINEL)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        subscriber.onNext(null);
_L6:
        if (subscriber.isUnsubscribed()) goto _L2; else goto _L4
_L4:
        l1--;
        l++;
          goto _L5
        try
        {
            subscriber.onNext(obj);
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            if (obj == NULL_SENTINEL)
            {
                obj = null;
            }
            subscriber.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
          goto _L6
        if (l != 0L && get() != 0x7fffffffffffffffL)
        {
            addAndGet(-l);
        }
        if (wip.decrementAndGet() == 0)
        {
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean offer(Object obj)
    {
        if (obj != null ? !queue.offer(obj) : !queue.offer(NULL_SENTINEL))
        {
            return false;
        } else
        {
            drain();
            return true;
        }
    }

    public void request(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (l > 0L)
        {
            BackpressureUtils.getAndAddRequest(this, l);
            drain();
        }
    }

}
