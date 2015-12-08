// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.internal.producers.ProducerArbiter;
import rx.subscriptions.SerialSubscription;

public final class OperatorSwitchIfEmpty
    implements rx.Observable.Operator
{
    private static final class AlternateSubscriber extends Subscriber
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

        AlternateSubscriber(Subscriber subscriber, ProducerArbiter producerarbiter)
        {
            child = subscriber;
            arbiter = producerarbiter;
        }
    }

    private static final class ParentSubscriber extends Subscriber
    {

        private final Observable alternate;
        private final ProducerArbiter arbiter;
        private final Subscriber child;
        private boolean empty;
        private final SerialSubscription ssub;

        private void subscribeToAlternate()
        {
            AlternateSubscriber alternatesubscriber = new AlternateSubscriber(child, arbiter);
            ssub.set(alternatesubscriber);
            alternate.unsafeSubscribe(alternatesubscriber);
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

        ParentSubscriber(Subscriber subscriber, SerialSubscription serialsubscription, ProducerArbiter producerarbiter, Observable observable)
        {
            empty = true;
            child = subscriber;
            ssub = serialsubscription;
            arbiter = producerarbiter;
            alternate = observable;
        }
    }


    private final Observable alternate;

    public OperatorSwitchIfEmpty(Observable observable)
    {
        alternate = observable;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        SerialSubscription serialsubscription = new SerialSubscription();
        ProducerArbiter producerarbiter = new ProducerArbiter();
        ParentSubscriber parentsubscriber = new ParentSubscriber(subscriber, serialsubscription, producerarbiter, alternate);
        serialsubscription.set(parentsubscriber);
        subscriber.add(serialsubscription);
        subscriber.setProducer(producerarbiter);
        return parentsubscriber;
    }
}
