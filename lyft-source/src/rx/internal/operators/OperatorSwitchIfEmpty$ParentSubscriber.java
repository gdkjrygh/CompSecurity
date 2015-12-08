// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.internal.producers.ProducerArbiter;
import rx.subscriptions.SerialSubscription;

final class alternate extends Subscriber
{

    private final Observable alternate;
    private final ProducerArbiter arbiter;
    private final Subscriber child;
    private boolean empty;
    private final SerialSubscription ssub;

    private void subscribeToAlternate()
    {
        er er = new er(child, arbiter);
        ssub.set(er);
        alternate.unsafeSubscribe(er);
    }

    public void onCompleted()
    {
        if (!empty)
        {
            child.onCompleted();
        } else
        if (!child.isUnsubscribed())
        {
            subscribeToAlternate();
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        empty = false;
        child.onNext(obj);
        arbiter.produced(1L);
    }

    public void setProducer(Producer producer)
    {
        arbiter.setProducer(producer);
    }

    er(Subscriber subscriber, SerialSubscription serialsubscription, ProducerArbiter producerarbiter, Observable observable)
    {
        empty = true;
        child = subscriber;
        ssub = serialsubscription;
        arbiter = producerarbiter;
        alternate = observable;
    }
}
