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
//            OperatorPublish, NotificationLite

static final class current extends Subscriber
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
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (!nl.isCompleted(obj))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        current.compareAndSet(this, null);
        int j;
        obj = (t[])producers.getAndSet(TERMINATED);
        j = obj.length;
        int i = 0;
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
        at = (t[])producers.getAndSet(TERMINATED);
        j = at.length;
        i = 0;
_L4:
        if (i >= j)
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
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
_L17:
        int i = ((flag) ? 1 : 0);
        Object obj = terminalEvent;
        i = ((flag) ? 1 : 0);
        boolean flag2 = queue.isEmpty();
        i = ((flag) ? 1 : 0);
        boolean flag3 = checkTerminated(obj, flag2);
        if (!flag3) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
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
_L2:
        if (flag2) goto _L6; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        exception = (emitting[])producers.get();
        i = ((flag) ? 1 : 0);
        int l = exception.length;
        int k;
        long l1;
        l1 = 0x7fffffffffffffffL;
        k = 0;
        i = ((flag) ? 1 : 0);
        int i1 = exception.length;
        int j = 0;
_L36:
        if (j >= i1) goto _L8; else goto _L7
_L7:
        i = ((flag) ? 1 : 0);
        long l3 = exception[j].producers();
        if (l3 < 0L) goto _L10; else goto _L9
_L9:
        i = ((flag) ? 1 : 0);
        long l2 = Math.min(l1, l3);
        i = k;
          goto _L11
_L8:
        if (l != k) goto _L13; else goto _L12
_L12:
        i = ((flag) ? 1 : 0);
        exception = ((Exception) (terminalEvent));
        i = ((flag) ? 1 : 0);
        if (queue.poll() == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i = ((flag) ? 1 : 0);
        flag2 = checkTerminated(exception, flag2);
        if (!flag2) goto _L15; else goto _L14
_L14:
        if (true) goto _L4; else goto _L16
_L16:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L15:
        i = ((flag) ? 1 : 0);
        request(1L);
          goto _L17
        exception;
        if (i != 0) goto _L19; else goto _L18
_L18:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L19:
        throw exception;
_L13:
        j = 0;
_L35:
        if ((long)j >= l1) goto _L21; else goto _L20
_L20:
        i = ((flag) ? 1 : 0);
        Object obj1 = terminalEvent;
        i = ((flag) ? 1 : 0);
        Object obj2 = queue.poll();
        boolean flag4;
        if (obj2 == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i = ((flag) ? 1 : 0);
        flag4 = checkTerminated(obj1, flag2);
        if (!flag4) goto _L23; else goto _L22
_L22:
        if (true) goto _L4; else goto _L24
_L24:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L23:
        if (!flag2) goto _L25; else goto _L21
_L21:
        if (j <= 0) goto _L27; else goto _L26
_L26:
        l2 = j;
        i = ((flag) ? 1 : 0);
        request(l2);
          goto _L27
_L6:
        i = ((flag) ? 1 : 0);
        this;
        JVM INSTR monitorenter ;
        i = ((flag1) ? 1 : 0);
        if (missed) goto _L29; else goto _L28
_L28:
        i = ((flag1) ? 1 : 0);
        emitting = false;
        i = 1;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L4; else goto _L30
_L30:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L25:
        i = ((flag) ? 1 : 0);
        obj1 = nl.getValue(obj2);
        i = ((flag) ? 1 : 0);
        l = exception.length;
        k = 0;
_L37:
        if (k >= l) goto _L32; else goto _L31
_L31:
        obj2 = exception[k];
        i = ((flag) ? 1 : 0);
        l2 = ((nl) (obj2)).nl();
        if (l2 <= 0L) goto _L34; else goto _L33
_L33:
        i = ((flag) ? 1 : 0);
        ((nl) (obj2)).d.onNext(obj1);
        i = ((flag) ? 1 : 0);
        ((d) (obj2)).uced(1L);
          goto _L34
        Throwable throwable;
        throwable;
        i = ((flag) ? 1 : 0);
        ((uced) (obj2)).bscribe();
        i = ((flag) ? 1 : 0);
        ((bscribe) (obj2)).d.onError(throwable);
          goto _L34
_L32:
        j++;
          goto _L35
_L29:
        i = ((flag1) ? 1 : 0);
        missed = false;
        i = ((flag1) ? 1 : 0);
        this;
        JVM INSTR monitorexit ;
        break; /* Loop/switch isn't completed */
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        return;
_L11:
        j++;
        l1 = l2;
        k = i;
          goto _L36
_L10:
        l2 = l1;
        i = k;
        if (l3 == 0x8000000000000000L)
        {
            i = k + 1;
            l2 = l1;
        }
          goto _L11
_L27:
        if (l1 != 0L && !flag2) goto _L17; else goto _L6
_L34:
        k++;
          goto _L37
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
