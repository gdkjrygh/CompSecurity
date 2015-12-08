// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils

final class <init> extends AtomicLong
    implements Producer
{

    private static final long serialVersionUID = 0x86d71ea7ae145b26L;
    private final Iterator it;
    private final Subscriber o;

    void fastpath()
    {
        Subscriber subscriber;
        Iterator iterator;
        subscriber = o;
        iterator = it;
_L5:
        if (!subscriber.isUnsubscribed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        subscriber.onNext(iterator.next());
        continue; /* Loop/switch isn't completed */
        if (subscriber.isUnsubscribed()) goto _L1; else goto _L3
_L3:
        subscriber.onCompleted();
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void request(long l)
    {
        if (get() != 0x7fffffffffffffffL)
        {
            if (l == 0x7fffffffffffffffL && compareAndSet(0L, 0x7fffffffffffffffL))
            {
                fastpath();
                return;
            }
            if (l > 0L && BackpressureUtils.getAndAddRequest(this, l) == 0L)
            {
                slowpath(l);
                return;
            }
        }
    }

    void slowpath(long l)
    {
        Subscriber subscriber;
        Iterator iterator;
        subscriber = o;
        iterator = it;
_L6:
        long l1 = l;
_L3:
        if (!subscriber.isUnsubscribed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        l1--;
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        subscriber.onNext(iterator.next());
          goto _L3
        if (subscriber.isUnsubscribed()) goto _L1; else goto _L4
_L4:
        subscriber.onCompleted();
        return;
        long l2 = addAndGet(-l);
        l = l2;
        if (l2 == 0L)
        {
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private (Subscriber subscriber, Iterator iterator)
    {
        o = subscriber;
        it = iterator;
    }

    it(Subscriber subscriber, Iterator iterator, it it1)
    {
        this(subscriber, iterator);
    }
}
