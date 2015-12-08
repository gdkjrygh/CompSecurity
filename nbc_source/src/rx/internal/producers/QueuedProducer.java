// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.operators.BackpressureUtils;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

public final class QueuedProducer extends AtomicLong
    implements Observer, Producer
{

    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 0x64fd87a3da19de97L;
    final Subscriber child;
    volatile boolean done;
    Throwable error;
    final Queue queue;
    final AtomicInteger wip;

    public QueuedProducer(Subscriber subscriber)
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

    public QueuedProducer(Subscriber subscriber, Queue queue1)
    {
        child = subscriber;
        queue = queue1;
        wip = new AtomicInteger();
    }

    private boolean checkTerminated(boolean flag, boolean flag1)
    {
        if (child.isUnsubscribed())
        {
            return true;
        }
        if (flag)
        {
            Throwable throwable = error;
            if (throwable != null)
            {
                queue.clear();
                child.onError(throwable);
                return true;
            }
            if (flag1)
            {
                child.onCompleted();
                return true;
            }
        }
        return false;
    }

    private void drain()
    {
        if (wip.getAndIncrement() != 0) goto _L2; else goto _L1
_L1:
        Subscriber subscriber;
        Queue queue1;
        subscriber = child;
        queue1 = queue;
_L6:
        if (!checkTerminated(done, queue1.isEmpty())) goto _L3; else goto _L2
_L2:
        return;
_L3:
        long l;
        long l1;
        wip.lazySet(1);
        l1 = get();
        l = 0L;
_L7:
        Object obj;
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        boolean flag1 = done;
        obj = queue1.poll();
        boolean flag;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (checkTerminated(flag1, flag)) goto _L2; else goto _L4
_L4:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (l != 0L && get() != 0x7fffffffffffffffL)
        {
            addAndGet(-l);
        }
        if (wip.decrementAndGet() != 0) goto _L6; else goto _L5
_L5:
        return;
label0:
        {
            if (obj == NULL_SENTINEL)
            {
                subscriber.onNext(null);
                break label0;
            }
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
        }
        l1--;
        l++;
          goto _L7
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

    public void onCompleted()
    {
        done = true;
        drain();
    }

    public void onError(Throwable throwable)
    {
        error = throwable;
        done = true;
        drain();
    }

    public void onNext(Object obj)
    {
        if (!offer(obj))
        {
            onError(new MissingBackpressureException());
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
