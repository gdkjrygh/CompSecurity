// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeFromIterable, BackpressureUtils

private static final class <init>
    implements Producer
{

    private static final AtomicLongFieldUpdater REQUESTED_UPDATER = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OnSubscribeFromIterable$IterableProducer, "requested");
    private final Iterator it;
    private final Subscriber o;
    private volatile long requested;

    public void request(long l)
    {
        if (requested != 0x7fffffffffffffffL)
        {
            if (l != 0x7fffffffffffffffL || !REQUESTED_UPDATER.compareAndSet(this, 0L, 0x7fffffffffffffffL))
            {
                continue;
            }
            while (!o.isUnsubscribed()) 
            {
                if (!it.hasNext())
                {
                    continue;
                }
                o.onNext(it.next());
            }
        }
_L2:
        do
        {
            do
            {
                return;
            } while (o.isUnsubscribed());
            o.onCompleted();
            return;
        } while (l <= 0L || BackpressureUtils.getAndAddRequest(REQUESTED_UPDATER, this, l) != 0L);
_L5:
        long l1;
        l1 = requested;
        l = l1;
        while (!o.isUnsubscribed()) 
        {
            if (!it.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            l--;
            if (l < 0L)
            {
                continue; /* Loop/switch isn't completed */
            }
            o.onNext(it.next());
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (o.isUnsubscribed()) goto _L2; else goto _L3
_L3:
        o.onCompleted();
        return;
        if (REQUESTED_UPDATER.addAndGet(this, -l1) != 0L) goto _L5; else goto _L4
_L4:
    }


    private (Subscriber subscriber, Iterator iterator)
    {
        requested = 0L;
        o = subscriber;
        it = iterator;
    }

    it(Subscriber subscriber, Iterator iterator, it it1)
    {
        this(subscriber, iterator);
    }
}
