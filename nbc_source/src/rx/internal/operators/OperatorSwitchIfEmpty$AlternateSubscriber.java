// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;
import rx.internal.producers.ProducerArbiter;

// Referenced classes of package rx.internal.operators:
//            OperatorSwitchIfEmpty

private static final class arbiter extends Subscriber
{

    private final ProducerArbiter arbiter;
    private final Subscriber child;

    public void onCompleted()
    {
        child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        child.onNext(obj);
        arbiter.produced(1L);
    }

    public void setProducer(Producer producer)
    {
        arbiter.setProducer(producer);
    }

    (Subscriber subscriber, ProducerArbiter producerarbiter)
    {
        child = subscriber;
        arbiter = producerarbiter;
    }
}
