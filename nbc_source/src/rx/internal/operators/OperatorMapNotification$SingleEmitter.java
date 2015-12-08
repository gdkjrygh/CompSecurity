// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

// Referenced classes of package rx.internal.operators:
//            OperatorMapNotification, NotificationLite

static final class queue extends AtomicLong
    implements Producer, Subscription
{

    private static final long serialVersionUID = 0xfc8848db9615d8dcL;
    final Subscription cancel;
    final Subscriber child;
    volatile boolean complete;
    boolean emitting;
    boolean missed;
    final NotificationLite nl = NotificationLite.instance();
    final Producer producer;
    final Queue queue;

    void drain()
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        missed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        missed = false;
        this;
        JVM INSTR monitorexit ;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
_L7:
        boolean flag = flag2;
        long l = get();
        flag = flag2;
        boolean flag3 = complete;
        flag = flag2;
        boolean flag4 = queue.isEmpty();
        if (!flag3 || !flag4)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        flag = flag2;
        child.onCompleted();
        if (true)
        {
            break; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        flag = flag2;
        Object obj = queue.poll();
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag2;
        child.onNext(nl.getValue(obj));
        flag = flag2;
        produced(1L);
_L2:
        flag = flag2;
        this;
        JVM INSTR monitorenter ;
        flag = flag1;
        if (missed)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        flag1 = true;
        flag = flag1;
        emitting = false;
        flag = flag1;
        this;
        JVM INSTR monitorexit ;
        if (true)
        {
            break; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        if (!flag3) goto _L2; else goto _L5
_L5:
        flag = flag2;
        child.onCompleted();
        if (true)
        {
            break; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        flag = flag1;
        missed = false;
        flag = flag1;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L7; else goto _L6
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (flag) goto _L9; else goto _L8
_L8:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L9:
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L6:
    }

    public boolean isUnsubscribed()
    {
        return get() < 0L;
    }

    public void offer(Object obj)
    {
        if (!queue.offer(obj))
        {
            child.onError(new MissingBackpressureException());
            unsubscribe();
            return;
        } else
        {
            drain();
            return;
        }
    }

    public void offerAndComplete(Object obj)
    {
        if (!queue.offer(obj))
        {
            child.onError(new MissingBackpressureException());
            unsubscribe();
            return;
        } else
        {
            complete = true;
            drain();
            return;
        }
    }

    void produced(long l)
    {
        long l1;
        long l2;
        do
        {
            l1 = get();
            if (l1 < 0L)
            {
                return;
            }
            l2 = l1 - l;
            if (l2 < 0L)
            {
                throw new IllegalStateException((new StringBuilder()).append("More produced (").append(l).append(") than requested (").append(l1).append(")").toString());
            }
        } while (!compareAndSet(l1, l2));
    }

    public void request(long l)
    {
        long l1;
        long l3;
        do
        {
            l3 = get();
            if (l3 < 0L)
            {
                return;
            }
            long l2 = l3 + l;
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = 0x7fffffffffffffffL;
            }
        } while (!compareAndSet(l3, l1));
        producer.request(l);
        drain();
    }

    public void unsubscribe()
    {
        if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
        {
            cancel.unsubscribe();
        }
    }

    public A(Subscriber subscriber, Producer producer1, Subscription subscription)
    {
        child = subscriber;
        producer = producer1;
        cancel = subscription;
        if (UnsafeAccess.isUnsafeAvailable())
        {
            subscriber = new SpscArrayQueue(2);
        } else
        {
            subscriber = new ConcurrentLinkedQueue();
        }
        queue = subscriber;
    }
}
