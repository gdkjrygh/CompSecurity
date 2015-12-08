// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Func2;
import rx.internal.producers.ProducerArbiter;
import rx.schedulers.Schedulers;
import rx.subscriptions.SerialSubscription;

public final class OperatorRetryWithPredicate
    implements rx.Observable.Operator
{

    final Func2 predicate;

    public OperatorRetryWithPredicate(Func2 func2)
    {
        predicate = func2;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        rx.Scheduler.Worker worker = Schedulers.trampoline().createWorker();
        subscriber.add(worker);
        SerialSubscription serialsubscription = new SerialSubscription();
        subscriber.add(serialsubscription);
        ProducerArbiter producerarbiter = new ProducerArbiter();
        subscriber.setProducer(producerarbiter);
        return new SourceSubscriber(subscriber, predicate, worker, serialsubscription, producerarbiter);
    }

    private class SourceSubscriber extends Subscriber
    {

        static final AtomicIntegerFieldUpdater ATTEMPTS_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorRetryWithPredicate$SourceSubscriber, "attempts");
        volatile int attempts;
        final Subscriber child;
        final rx.Scheduler.Worker inner;
        final ProducerArbiter pa;
        final Func2 predicate;
        final SerialSubscription serialSubscription;

        public void onCompleted()
        {
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
        }

        public volatile void onNext(Object obj)
        {
            onNext((Observable)obj);
        }

        public void onNext(final Observable o)
        {
            inner.schedule(new Action0() {

                final SourceSubscriber this$0;
                final Observable val$o;

                public void call()
                {
                    SourceSubscriber.ATTEMPTS_UPDATER.incrementAndGet(SourceSubscriber.this);
                    Subscriber subscriber = new Subscriber() {

                        boolean done;
                        final _cls1 this$1;
                        final Action0 val$_self;

                        public void onCompleted()
                        {
                            if (!done)
                            {
                                done = true;
                                child.onCompleted();
                            }
                        }

                        public void onError(Throwable throwable)
                        {
label0:
                            {
                                if (!done)
                                {
                                    done = true;
                                    if (!((Boolean)predicate.call(Integer.valueOf(attempts), throwable)).booleanValue() || inner.isUnsubscribed())
                                    {
                                        break label0;
                                    }
                                    inner.schedule(_self);
                                }
                                return;
                            }
                            child.onError(throwable);
                        }

                        public void onNext(Object obj)
                        {
                            if (!done)
                            {
                                child.onNext(obj);
                                pa.produced(1L);
                            }
                        }

                        public void setProducer(Producer producer)
                        {
                            pa.setProducer(producer);
                        }

                
                {
                    this$1 = final__pcls1;
                    _self = Action0.this;
                    super();
                }
                    };
                    serialSubscription.set(subscriber);
                    o.unsafeSubscribe(subscriber);
                }

                
                {
                    this$0 = SourceSubscriber.this;
                    o = observable;
                    super();
                }
            });
        }


        public SourceSubscriber(Subscriber subscriber, Func2 func2, rx.Scheduler.Worker worker, SerialSubscription serialsubscription, ProducerArbiter producerarbiter)
        {
            child = subscriber;
            predicate = func2;
            inner = worker;
            serialSubscription = serialsubscription;
            pa = producerarbiter;
        }
    }

}
