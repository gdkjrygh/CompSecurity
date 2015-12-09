// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class hff
    implements hfb, hfg
{

    private static final Long NOT_SET = Long.valueOf(0x8000000000000000L);
    private hfc producer;
    private long requested;
    private final hff subscriber;
    private final hig subscriptions;

    public hff()
    {
        this(null, false);
    }

    public hff(hff hff1)
    {
        this(hff1, true);
    }

    public hff(hff hff1, boolean flag)
    {
        requested = NOT_SET.longValue();
        subscriber = hff1;
        if (flag && hff1 != null)
        {
            hff1 = hff1.subscriptions;
        } else
        {
            hff1 = new hig();
        }
        subscriptions = hff1;
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

    public final void add(hfg hfg1)
    {
        subscriptions.a(hfg1);
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
        hfc hfc1;
        if (producer == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        hfc1 = producer;
        this;
        JVM INSTR monitorexit ;
        hfc1.a(l);
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

    public void setProducer(hfc hfc1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        long l;
        l = requested;
        producer = hfc1;
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
        hfc1;
        this;
        JVM INSTR monitorexit ;
        throw hfc1;
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
