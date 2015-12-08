// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;
import rx.internal.producers.ProducerArbiter;

final class parent extends Subscriber
{

    private final ProducerArbiter arbiter;
    private final int id;
    private final  parent;

    public void onCompleted()
    {
        parent.complete(id);
    }

    public void onError(Throwable throwable)
    {
        parent.error(throwable, id);
    }

    public void onNext(Object obj)
    {
        parent.emit(obj, id, this);
    }

    public void setProducer(Producer producer)
    {
        arbiter.setProducer(producer);
    }

    (int i, ProducerArbiter producerarbiter,  )
    {
        id = i;
        arbiter = producerarbiter;
        parent = ;
    }
}
