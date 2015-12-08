// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;

final class lazySet extends AtomicLong
    implements Producer, Subscription
{

    static final long NOT_REQUESTED = 0xc000000000000000L;
    static final long UNSUBSCRIBED = 0x8000000000000000L;
    private static final long serialVersionUID = 0xc23093c4d18f2746L;
    final Subscriber child;
    final ber parent;

    public boolean isUnsubscribed()
    {
        return get() == 0x8000000000000000L;
    }

    public long produced(long l)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException("Cant produce zero or less");
        }
        long l1;
        long l2;
        do
        {
            l1 = get();
            if (l1 == 0xc000000000000000L)
            {
                throw new IllegalStateException("Produced without request");
            }
            if (l1 == 0x8000000000000000L)
            {
                return 0x8000000000000000L;
            }
            l2 = l1 - l;
            if (l2 < 0L)
            {
                throw new IllegalStateException((new StringBuilder()).append("More produced (").append(l).append(") than requested (").append(l1).append(")").toString());
            }
        } while (!compareAndSet(l1, l2));
        return l2;
    }

    public void request(long l)
    {
        long l3;
        if (l >= 0L)
        {
            while ((l3 = get()) != 0x8000000000000000L && (l3 < 0L || l != 0L)) 
            {
                long l1;
                if (l3 == 0xc000000000000000L)
                {
                    l1 = l;
                } else
                {
                    long l2 = l3 + l;
                    l1 = l2;
                    if (l2 < 0L)
                    {
                        l1 = 0x7fffffffffffffffL;
                    }
                }
                if (compareAndSet(l3, l1))
                {
                    parent.dispatch();
                    return;
                }
            }
        }
    }

    public void unsubscribe()
    {
        if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
        {
            parent.remove(this);
            parent.dispatch();
        }
    }

    public ber(ber ber, Subscriber subscriber)
    {
        parent = ber;
        child = subscriber;
        lazySet(0xc000000000000000L);
    }
}
