// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;

final class child extends AtomicLong
    implements Producer, Subscription
{

    static final long UNSUBSCRIBED = 0x8000000000000000L;
    private static final long serialVersionUID = 0xc23093c4d18f2746L;
    final Subscriber child;
    boolean emitting;
    Object index;
    boolean missed;
    final er parent;
    final AtomicLong totalRequested = new AtomicLong();

    void addTotalRequested(long l)
    {
        long l1;
        long l3;
        do
        {
            l3 = totalRequested.get();
            long l2 = l3 + l;
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = 0x7fffffffffffffffL;
            }
        } while (!totalRequested.compareAndSet(l3, l1));
    }

    Object index()
    {
        return index;
    }

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
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        long l3;
        return;
_L2:
        long l1;
        do
        {
            if ((l3 = get()) == 0x8000000000000000L || l3 >= 0L && l == 0L)
            {
                continue; /* Loop/switch isn't completed */
            }
            long l2 = l3 + l;
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = 0x7fffffffffffffffL;
            }
        } while (!compareAndSet(l3, l1));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        addTotalRequested(l);
        parent.manageRequests();
        parent.buffer.eplay(this);
        return;
    }

    public void unsubscribe()
    {
        if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
        {
            parent.remove(this);
            parent.manageRequests();
        }
    }

    public er(er er, Subscriber subscriber)
    {
        parent = er;
        child = subscriber;
    }
}
