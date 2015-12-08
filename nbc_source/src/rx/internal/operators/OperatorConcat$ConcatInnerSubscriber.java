// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Producer;
import rx.Subscriber;
import rx.internal.producers.ProducerArbiter;

// Referenced classes of package rx.internal.operators:
//            OperatorConcat

static class arbiter extends Subscriber
{

    private static final AtomicIntegerFieldUpdater ONCE = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorConcat$ConcatInnerSubscriber, "once");
    private final ProducerArbiter arbiter;
    private final Subscriber child;
    private volatile int once;
    private final dater parent;

    public void onCompleted()
    {
        if (ONCE.compareAndSet(this, 0, 1))
        {
            parent.eteInner();
        }
    }

    public void onError(Throwable throwable)
    {
        if (ONCE.compareAndSet(this, 0, 1))
        {
            parent.or(throwable);
        }
    }

    public void onNext(Object obj)
    {
        child.onNext(obj);
        s._mth200(parent);
        arbiter.produced(1L);
    }

    public void setProducer(Producer producer)
    {
        arbiter.setProducer(producer);
    }


    public ( , Subscriber subscriber, ProducerArbiter producerarbiter)
    {
        once = 0;
        parent = ;
        child = subscriber;
        arbiter = producerarbiter;
    }
}
