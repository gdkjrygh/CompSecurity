// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.internal.util.SubscriptionList;

// Referenced classes of package rx:
//            Observer, Subscription, Producer

public abstract class Subscriber
    implements Observer, Subscription
{

    private static final Long NOT_SET = Long.valueOf(0x8000000000000000L);
    private Producer producer;
    private long requested;
    private final Subscriber subscriber;
    private final SubscriptionList subscriptions;

    protected Subscriber()
    {
        this(null, false);
    }

    protected Subscriber(Subscriber subscriber1)
    {
        this(subscriber1, true);
    }

    protected Subscriber(Subscriber subscriber1, boolean flag)
    {
        requested = NOT_SET.longValue();
        subscriber = subscriber1;
        if (flag && subscriber1 != null)
        {
            subscriber1 = subscriber1.subscriptions;
        } else
        {
            subscriber1 = new SubscriptionList();
        }
        subscriptions = subscriber1;
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

    public final void add(Subscription subscription)
    {
        subscriptions.add(subscription);
    }

    public final boolean isUnsubscribed()
    {
        return subscriptions.isUnsubscribed();
    }

    public void onStart()
    {
    }

    protected final void request(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("number requested cannot be negative: ").append(l).toString());
        }
        this;
        JVM INSTR monitorenter ;
        Producer producer1;
        if (producer == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        producer1 = producer;
        this;
        JVM INSTR monitorexit ;
        producer1.request(l);
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

    public void setProducer(Producer producer1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        long l;
        l = requested;
        producer = producer1;
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
        producer1;
        this;
        JVM INSTR monitorexit ;
        throw producer1;
        if (l == NOT_SET.longValue())
        {
            producer.request(0x7fffffffffffffffL);
            return;
        } else
        {
            producer.request(l);
            return;
        }
    }

    public final void unsubscribe()
    {
        subscriptions.unsubscribe();
    }

}
