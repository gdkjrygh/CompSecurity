// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.internal.util.o;

// Referenced classes of package rx:
//            P, Y, Q

public abstract class X
    implements P, Y
{

    private static final Long NOT_SET = Long.valueOf(0x8000000000000000L);
    private Q producer;
    private long requested;
    private final X subscriber;
    private final o subscriptions;

    public X()
    {
        this(null, false);
    }

    public X(X x)
    {
        this(x, true);
    }

    public X(X x, boolean flag)
    {
        requested = NOT_SET.longValue();
        subscriber = x;
        if (flag && x != null)
        {
            x = x.subscriptions;
        } else
        {
            x = new o();
        }
        subscriptions = x;
    }

    private void addToRequested(long l)
    {
        if (requested == NOT_SET.longValue())
        {
            requested = l;
            return;
        }
        l = requested + l;
        if (l < 0L)
        {
            requested = 0x7fffffffffffffffL;
            return;
        } else
        {
            requested = l;
            return;
        }
    }

    public final void add(Y y)
    {
        subscriptions.a(y);
    }

    public final boolean isUnsubscribed()
    {
        return subscriptions.isUnsubscribed();
    }

    public void onStart()
    {
    }

    public final void request(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("number requested cannot be negative: ")).append(l).toString());
        }
        this;
        JVM INSTR monitorenter ;
        Q q;
        if (producer == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        q = producer;
        this;
        JVM INSTR monitorexit ;
        q.a(l);
        return;
        addToRequested(l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setProducer(Q q)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        long l;
        l = requested;
        producer = q;
        boolean flag = flag1;
        if (subscriber == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        flag = flag1;
        if (l == NOT_SET.longValue())
        {
            flag = true;
        }
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            subscriber.setProducer(producer);
            return;
        }
        break MISSING_BLOCK_LABEL_63;
        q;
        this;
        JVM INSTR monitorexit ;
        throw q;
        if (l == NOT_SET.longValue())
        {
            producer.a(0x7fffffffffffffffL);
            return;
        } else
        {
            producer.a(l);
            return;
        }
    }

    public final void unsubscribe()
    {
        subscriptions.unsubscribe();
    }

}
