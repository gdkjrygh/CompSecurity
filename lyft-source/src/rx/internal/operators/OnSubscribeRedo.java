// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.observers.Subscribers;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils

public final class OnSubscribeRedo
    implements rx.Observable.OnSubscribe
{

    static final Func1 REDO_INFINITE = new Func1() {

        public volatile Object call(Object obj)
        {
            return call((Observable)obj);
        }

        public Observable call(Observable observable)
        {
            return observable.map(new Func1() {

                final _cls1 this$0;

                public volatile Object call(Object obj)
                {
                    return call((Notification)obj);
                }

                public Notification call(Notification notification)
                {
                    return Notification.createOnNext(null);
                }

            
            {
                this$0 = _cls1.this;
                super();
            }
            });
        }

    };
    private final Func1 controlHandlerFunction;
    private final Scheduler scheduler;
    private final Observable source;
    private final boolean stopOnComplete;
    private final boolean stopOnError;

    private OnSubscribeRedo(Observable observable, Func1 func1, boolean flag, boolean flag1, Scheduler scheduler1)
    {
        source = observable;
        controlHandlerFunction = func1;
        stopOnComplete = flag;
        stopOnError = flag1;
        scheduler = scheduler1;
    }

    public static Observable redo(Observable observable, Func1 func1, Scheduler scheduler1)
    {
        return Observable.create(new OnSubscribeRedo(observable, func1, false, false, scheduler1));
    }

    public static Observable repeat(Observable observable)
    {
        return repeat(observable, Schedulers.trampoline());
    }

    public static Observable repeat(Observable observable, long l)
    {
        return repeat(observable, l, Schedulers.trampoline());
    }

    public static Observable repeat(Observable observable, long l, Scheduler scheduler1)
    {
        if (l == 0L)
        {
            return Observable.empty();
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("count >= 0 expected");
        } else
        {
            return repeat(observable, ((Func1) (new RedoFinite(l - 1L))), scheduler1);
        }
    }

    public static Observable repeat(Observable observable, Scheduler scheduler1)
    {
        return repeat(observable, REDO_INFINITE, scheduler1);
    }

    public static Observable repeat(Observable observable, Func1 func1)
    {
        return Observable.create(new OnSubscribeRedo(observable, func1, false, true, Schedulers.trampoline()));
    }

    public static Observable repeat(Observable observable, Func1 func1, Scheduler scheduler1)
    {
        return Observable.create(new OnSubscribeRedo(observable, func1, false, true, scheduler1));
    }

    public static Observable retry(Observable observable)
    {
        return retry(observable, REDO_INFINITE);
    }

    public static Observable retry(Observable observable, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("count >= 0 expected");
        }
        if (l == 0L)
        {
            return observable;
        } else
        {
            return retry(observable, ((Func1) (new RedoFinite(l))));
        }
    }

    public static Observable retry(Observable observable, Func1 func1)
    {
        return Observable.create(new OnSubscribeRedo(observable, func1, true, false, Schedulers.trampoline()));
    }

    public static Observable retry(Observable observable, Func1 func1, Scheduler scheduler1)
    {
        return Observable.create(new OnSubscribeRedo(observable, func1, true, false, scheduler1));
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber child)
    {
        final AtomicBoolean resumeBoundary = new AtomicBoolean(true);
        final AtomicLong consumerCapacity = new AtomicLong(0L);
        final rx.Scheduler.Worker worker = scheduler.createWorker();
        child.add(worker);
        final SerialSubscription sourceSubscriptions = new SerialSubscription();
        child.add(sourceSubscriptions);
        final BehaviorSubject terminals = BehaviorSubject.create();
        terminals.subscribe(Subscribers.empty());
        final ProducerArbiter arbiter = new ProducerArbiter();
        final Action0 subscribeToSource = new Action0() {

            final OnSubscribeRedo this$0;
            final ProducerArbiter val$arbiter;
            final Subscriber val$child;
            final AtomicLong val$consumerCapacity;
            final SerialSubscription val$sourceSubscriptions;
            final BehaviorSubject val$terminals;

            public void call()
            {
                if (child.isUnsubscribed())
                {
                    return;
                } else
                {
                    Subscriber subscriber = new Subscriber() {

                        boolean done;
                        final _cls2 this$1;

                        private void decrementConsumerCapacity()
                        {
                            long l;
                            do
                            {
                                l = consumerCapacity.get();
                            } while (l != 0x7fffffffffffffffL && !consumerCapacity.compareAndSet(l, l - 1L));
                        }

                        public void onCompleted()
                        {
                            if (!done)
                            {
                                done = true;
                                unsubscribe();
                                terminals.onNext(Notification.createOnCompleted());
                            }
                        }

                        public void onError(Throwable throwable)
                        {
                            if (!done)
                            {
                                done = true;
                                unsubscribe();
                                terminals.onNext(Notification.createOnError(throwable));
                            }
                        }

                        public void onNext(Object obj)
                        {
                            if (!done)
                            {
                                child.onNext(obj);
                                decrementConsumerCapacity();
                                arbiter.produced(1L);
                            }
                        }

                        public void setProducer(Producer producer)
                        {
                            arbiter.setProducer(producer);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    };
                    sourceSubscriptions.set(subscriber);
                    source.unsafeSubscribe(subscriber);
                    return;
                }
            }

            
            {
                this$0 = OnSubscribeRedo.this;
                child = subscriber;
                terminals = behaviorsubject;
                arbiter = producerarbiter;
                consumerCapacity = atomiclong;
                sourceSubscriptions = serialsubscription;
                super();
            }
        };
        worker.schedule(new Action0() {

            final OnSubscribeRedo this$0;
            final Subscriber val$child;
            final AtomicLong val$consumerCapacity;
            final Observable val$restarts;
            final AtomicBoolean val$resumeBoundary;
            final Action0 val$subscribeToSource;
            final rx.Scheduler.Worker val$worker;

            public void call()
            {
                restarts.unsafeSubscribe(new Subscriber(child) {

                    final _cls4 this$1;

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
label0:
                        {
                            if (!child.isUnsubscribed())
                            {
                                if (consumerCapacity.get() <= 0L)
                                {
                                    break label0;
                                }
                                worker.schedule(subscribeToSource);
                            }
                            return;
                        }
                        resumeBoundary.compareAndSet(false, true);
                    }

                    public void setProducer(Producer producer)
                    {
                        producer.request(0x7fffffffffffffffL);
                    }

            
            {
                this$1 = _cls4.this;
                super(subscriber);
            }
                });
            }

            
            {
                this$0 = OnSubscribeRedo.this;
                restarts = observable;
                child = subscriber;
                consumerCapacity = atomiclong;
                worker = worker1;
                subscribeToSource = action0;
                resumeBoundary = atomicboolean;
                super();
            }
        });
        child.setProducer(new Producer() {

            final OnSubscribeRedo this$0;
            final ProducerArbiter val$arbiter;
            final AtomicLong val$consumerCapacity;
            final AtomicBoolean val$resumeBoundary;
            final Action0 val$subscribeToSource;
            final rx.Scheduler.Worker val$worker;

            public void request(long l)
            {
                if (l > 0L)
                {
                    BackpressureUtils.getAndAddRequest(consumerCapacity, l);
                    arbiter.request(l);
                    if (resumeBoundary.compareAndSet(true, false))
                    {
                        worker.schedule(subscribeToSource);
                    }
                }
            }

            
            {
                this$0 = OnSubscribeRedo.this;
                consumerCapacity = atomiclong;
                arbiter = producerarbiter;
                resumeBoundary = atomicboolean;
                worker = worker1;
                subscribeToSource = action0;
                super();
            }
        });
    }





    // Unreferenced inner class rx/internal/operators/OnSubscribeRedo$3

/* anonymous class */
    class _cls3
        implements rx.Observable.Operator
    {

        final OnSubscribeRedo this$0;

        public volatile Object call(Object obj)
        {
            return call((Subscriber)obj);
        }

        public Subscriber call(Subscriber subscriber)
        {
            return subscriber. new Subscriber(subscriber) {

                final _cls3 this$1;
                final Subscriber val$filteredTerminals;

                public void onCompleted()
                {
                    filteredTerminals.onCompleted();
                }

                public void onError(Throwable throwable)
                {
                    filteredTerminals.onError(throwable);
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Notification)obj);
                }

                public void onNext(Notification notification)
                {
                    if (notification.isOnCompleted() && stopOnComplete)
                    {
                        filteredTerminals.onCompleted();
                        return;
                    }
                    if (notification.isOnError() && stopOnError)
                    {
                        filteredTerminals.onError(notification.getThrowable());
                        return;
                    } else
                    {
                        filteredTerminals.onNext(notification);
                        return;
                    }
                }

                public void setProducer(Producer producer)
                {
                    producer.request(0x7fffffffffffffffL);
                }

            
            {
                this$1 = final__pcls3;
                filteredTerminals = subscriber1;
                super(Subscriber.this);
            }
            };
        }

            
            {
                this$0 = OnSubscribeRedo.this;
                super();
            }
    }


    private class RedoFinite
        implements Func1
    {

        private final long count;

        public volatile Object call(Object obj)
        {
            return call((Observable)obj);
        }

        public Observable call(Observable observable)
        {
            return observable.map(new Func1() {

                int num;
                final RedoFinite this$0;

                public volatile Object call(Object obj)
                {
                    return call((Notification)obj);
                }

                public Notification call(Notification notification)
                {
                    if (count != 0L)
                    {
                        num = num + 1;
                        if ((long)num <= count)
                        {
                            return Notification.createOnNext(Integer.valueOf(num));
                        }
                    }
                    return notification;
                }

                
                {
                    this$0 = RedoFinite.this;
                    super();
                    num = 0;
                }
            }).dematerialize();
        }


        public RedoFinite(long l)
        {
            count = l;
        }
    }

}
