// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

final class request extends Subscriber
    implements Subscription
{

    static final replay EMPTY[] = new replay[0];
    static final replay TERMINATED[] = new replay[0];
    final replay buffer;
    boolean done;
    boolean emitting;
    long maxChildRequested;
    long maxUpstreamRequested;
    boolean missed;
    final NotificationLite nl = NotificationLite.instance();
    volatile Producer producer;
    final AtomicReference producers;
    final AtomicBoolean shouldConnect = new AtomicBoolean();

    boolean add(request request)
    {
        if (request == null)
        {
            throw new NullPointerException();
        }
        request arequest[];
        request arequest1[];
        do
        {
            arequest = (request[])producers.get();
            if (arequest == TERMINATED)
            {
                return false;
            }
            int i = arequest.length;
            arequest1 = new TERMINATED[i + 1];
            System.arraycopy(arequest, 0, arequest1, 0, i);
            arequest1[i] = request;
        } while (!producers.compareAndSet(arequest, arequest1));
        return true;
    }

    void init()
    {
        add(Subscriptions.create(new Action0() {

            final OperatorReplay.ReplaySubscriber this$0;

            public void call()
            {
                producers.getAndSet(OperatorReplay.ReplaySubscriber.TERMINATED);
            }

            
            {
                this$0 = OperatorReplay.ReplaySubscriber.this;
                super();
            }
        }));
    }

    void manageRequests()
    {
        if (!isUnsubscribed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        missed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
_L10:
        Object obj;
        long l;
        long l2;
        long l3;
        if (isUnsubscribed())
        {
            continue; /* Loop/switch isn't completed */
        }
        TERMINATED aterminated[] = (isUnsubscribed[])producers.get();
        l2 = maxChildRequested;
        int j = aterminated.length;
        int i = 0;
        l = 0L;
        for (; i < j; i++)
        {
            l = Math.max(l, aterminated[i].alRequested.get());
        }

        l3 = maxUpstreamRequested;
        obj = producer;
        l2 = l - l2;
        if (l2 == 0L) goto _L4; else goto _L3
_L3:
        maxChildRequested = l;
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (l3 != 0L)
        {
            maxUpstreamRequested = 0L;
            ((Producer) (obj)).request(l3 + l2);
        } else
        {
            ((Producer) (obj)).request(l2);
        }
_L8:
        this;
        JVM INSTR monitorenter ;
        if (missed)
        {
            break; /* Loop/switch isn't completed */
        }
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L6:
        l2 = l3 + l2;
        long l1 = l2;
        if (l2 < 0L)
        {
            l1 = 0x7fffffffffffffffL;
        }
        maxUpstreamRequested = l1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (l3 != 0L && obj != null)
        {
            maxUpstreamRequested = 0L;
            ((Producer) (obj)).request(l3);
        }
        if (true) goto _L8; else goto _L7
_L7:
        missed = false;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L1; else goto _L11
_L11:
    }

    public void onCompleted()
    {
        if (done)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        done = true;
        buffer.lete();
        replay();
        unsubscribe();
        return;
        Exception exception;
        exception;
        unsubscribe();
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        if (done)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        done = true;
        buffer.r(throwable);
        replay();
        unsubscribe();
        return;
        throwable;
        unsubscribe();
        throw throwable;
    }

    public void onNext(Object obj)
    {
        if (!done)
        {
            buffer.(obj);
            replay();
        }
    }

    void remove(replay replay1)
    {
_L4:
        replay areplay1[] = (replay[])producers.get();
        if (areplay1 != EMPTY && areplay1 != TERMINATED) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        byte byte0;
        int k;
        byte0 = -1;
        k = areplay1.length;
        i = 0;
_L5:
        int j;
        j = byte0;
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!areplay1[i].equals(replay1))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        j = i;
        if (j < 0) goto _L1; else goto _L3
_L3:
        replay areplay[];
        if (k == 1)
        {
            areplay = EMPTY;
        } else
        {
            areplay = new EMPTY[k - 1];
            System.arraycopy(areplay1, 0, areplay, 0, j);
            System.arraycopy(areplay1, j + 1, areplay, j, k - j - 1);
        }
        if (producers.compareAndSet(areplay1, areplay))
        {
            return;
        }
          goto _L4
        i++;
          goto _L5
    }

    void replay()
    {
        Set aset[] = (Set[])producers.get();
        int j = aset.length;
        for (int i = 0; i < j; i++)
        {
            Set set = aset[i];
            buffer.ay(set);
        }

    }

    public void setProducer(Producer producer1)
    {
        if (producer != null)
        {
            throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
        } else
        {
            producer = producer1;
            manageRequests();
            replay();
            return;
        }
    }


    public _cls1.this._cls0(AtomicReference atomicreference, _cls1.this._cls0 _pcls0)
    {
        buffer = _pcls0;
        producers = new AtomicReference(EMPTY);
        request(0L);
    }
}
