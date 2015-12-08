// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.SynchronizedQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

final class current extends Subscriber
    implements Subscription
{

    static final t EMPTY[] = new t[0];
    static final t TERMINATED[] = new t[0];
    final AtomicReference current;
    boolean emitting;
    boolean missed;
    final NotificationLite nl = NotificationLite.instance();
    final AtomicReference producers;
    final Queue queue;
    final AtomicBoolean shouldConnect = new AtomicBoolean();
    volatile Object terminalEvent;

    boolean add(current current1)
    {
        if (current1 == null)
        {
            throw new NullPointerException();
        }
        current acurrent[];
        current acurrent1[];
        do
        {
            acurrent = (current[])producers.get();
            if (acurrent == TERMINATED)
            {
                return false;
            }
            int i = acurrent.length;
            acurrent1 = new TERMINATED[i + 1];
            System.arraycopy(acurrent, 0, acurrent1, 0, i);
            acurrent1[i] = current1;
        } while (!producers.compareAndSet(acurrent, acurrent1));
        return true;
    }

    boolean checkTerminated(Object obj, boolean flag)
    {
        int i;
        int j;
        j = 0;
        i = 0;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (!nl.isCompleted(obj))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        current.compareAndSet(this, null);
        obj = (t[])producers.getAndSet(TERMINATED);
        j = obj.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((TERMINATED) (obj[i])).d.onCompleted();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        unsubscribe();
        return true;
        obj;
        unsubscribe();
        throw obj;
        obj = nl.getError(obj);
        current.compareAndSet(this, null);
        t at[];
        int k;
        at = (t[])producers.getAndSet(TERMINATED);
        k = at.length;
        i = j;
_L4:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        at[i].d.onError(((Throwable) (obj)));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        unsubscribe();
        return true;
        obj;
        unsubscribe();
        throw obj;
        return false;
    }

    void dispatch()
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
        boolean flag = false;
_L11:
        Object obj;
        boolean flag1;
        obj = terminalEvent;
        flag1 = queue.isEmpty();
        if (checkTerminated(obj, flag1)) goto _L2; else goto _L1
_L1:
        if (flag1) goto _L4; else goto _L3
_L3:
        int l;
        int i1;
        obj = (checkTerminated[])producers.get();
        l = obj.length;
        i1 = obj.length;
        int i;
        int j;
        long l1;
        j = 0;
        l1 = 0x7fffffffffffffffL;
        i = 0;
_L6:
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        long l4 = obj[i].producers();
        if (l4 < 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        long l2 = Math.min(l1, l4);
        int k = j;
_L7:
        i++;
        j = k;
        l1 = l2;
        if (true) goto _L6; else goto _L5
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        k = j;
        l2 = l1;
        if (l4 == 0x8000000000000000L)
        {
            k = j + 1;
            l2 = l1;
        }
          goto _L7
        if (l != j) goto _L9; else goto _L8
_L8:
        obj = terminalEvent;
        if (queue.poll() == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (checkTerminated(obj, flag1)) goto _L2; else goto _L10
_L10:
        request(1L);
          goto _L11
        obj;
        i = ((flag) ? 1 : 0);
_L22:
        if (i != 0) goto _L13; else goto _L12
_L12:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L13:
        throw obj;
_L9:
        i = 0;
_L23:
        if ((long)i >= l1) goto _L15; else goto _L14
_L14:
        Object obj1;
        Object obj2;
        obj1 = terminalEvent;
        obj2 = queue.poll();
        if (obj2 == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (checkTerminated(obj1, flag1)) goto _L2; else goto _L16
_L16:
        if (!flag1) goto _L17; else goto _L15
_L15:
        if (i <= 0) goto _L19; else goto _L18
_L18:
        request(i);
          goto _L19
_L4:
        this;
        JVM INSTR monitorenter ;
        if (missed) goto _L21; else goto _L20
_L20:
        emitting = false;
        j = 1;
        this;
        JVM INSTR monitorexit ;
        return;
_L24:
        j = i;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
          goto _L22
_L17:
        obj1 = nl.getValue(obj2);
        k = obj.length;
        Exception exception;
        unsubscribe unsubscribe;
        Throwable throwable;
        long l3;
        for (j = 0; j >= k; j++)
        {
            break MISSING_BLOCK_LABEL_431;
        }

        unsubscribe = obj[j];
        l3 = unsubscribe.nl();
        if (l3 <= 0L)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        unsubscribe.d.onNext(obj1);
        unsubscribe.uced(1L);
        break MISSING_BLOCK_LABEL_489;
        throwable;
        unsubscribe.bscribe();
        unsubscribe.d.onError(throwable);
        break MISSING_BLOCK_LABEL_489;
        i++;
          goto _L23
_L21:
        missed = false;
        this;
        JVM INSTR monitorexit ;
        break; /* Loop/switch isn't completed */
        obj;
        i = 0;
          goto _L24
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        return;
_L19:
        if (l1 != 0L && !flag1) goto _L11; else goto _L4
        exception;
        i = j;
          goto _L24
    }

    void init()
    {
        add(Subscriptions.create(new Action0() {

            final OperatorPublish.PublishSubscriber this$0;

            public void call()
            {
                producers.getAndSet(OperatorPublish.PublishSubscriber.TERMINATED);
                current.compareAndSet(OperatorPublish.PublishSubscriber.this, null);
            }

            
            {
                this$0 = OperatorPublish.PublishSubscriber.this;
                super();
            }
        }));
    }

    public void onCompleted()
    {
        if (terminalEvent == null)
        {
            terminalEvent = nl.completed();
            dispatch();
        }
    }

    public void onError(Throwable throwable)
    {
        if (terminalEvent == null)
        {
            terminalEvent = nl.error(throwable);
            dispatch();
        }
    }

    public void onNext(Object obj)
    {
        if (!queue.offer(nl.next(obj)))
        {
            onError(new MissingBackpressureException());
            return;
        } else
        {
            dispatch();
            return;
        }
    }

    public void onStart()
    {
        request(RxRingBuffer.SIZE);
    }

    void remove(request request)
    {
_L4:
        request arequest1[] = (request[])producers.get();
        if (arequest1 != EMPTY && arequest1 != TERMINATED) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        byte byte0;
        int k;
        byte0 = -1;
        k = arequest1.length;
        i = 0;
_L5:
        int j;
        j = byte0;
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!arequest1[i].equals(request))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        j = i;
        if (j < 0) goto _L1; else goto _L3
_L3:
        request arequest[];
        if (k == 1)
        {
            arequest = EMPTY;
        } else
        {
            arequest = new EMPTY[k - 1];
            System.arraycopy(arequest1, 0, arequest, 0, j);
            System.arraycopy(arequest1, j + 1, arequest, j, k - j - 1);
        }
        if (producers.compareAndSet(arequest1, arequest))
        {
            return;
        }
          goto _L4
        i++;
          goto _L5
    }


    public _cls1.this._cls0(AtomicReference atomicreference)
    {
        Object obj;
        if (UnsafeAccess.isUnsafeAvailable())
        {
            obj = new SpscArrayQueue(RxRingBuffer.SIZE);
        } else
        {
            obj = new SynchronizedQueue(RxRingBuffer.SIZE);
        }
        queue = ((Queue) (obj));
        producers = new AtomicReference(EMPTY);
        current = atomicreference;
    }
}
