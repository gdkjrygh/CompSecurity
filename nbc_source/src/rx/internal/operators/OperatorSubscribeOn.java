// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

public class OperatorSubscribeOn
    implements rx.Observable.Operator
{

    private final Scheduler scheduler;

    public OperatorSubscribeOn(Scheduler scheduler1)
    {
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        final_subscriber1.add(worker);
        return new Subscriber(worker) {

            final OperatorSubscribeOn this$0;
            final rx.Scheduler.Worker val$inner;
            final Subscriber val$subscriber;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                subscriber.onError(throwable);
            }

            public volatile void onNext(Object obj)
            {
                onNext((Observable)obj);
            }

            public void onNext(Observable observable)
            {
                inner.schedule(observable. new Action0() {

                    final _cls1 this$1;
                    final Observable val$o;

                    public void call()
                    {
                        Thread thread = Thread.currentThread();
                        o.unsafeSubscribe(subscriber. new Subscriber(thread) {

                            final _cls1 this$2;
                            final Thread val$t;

                            public void onCompleted()
                            {
                                subscriber.onCompleted();
                            }

                            public void onError(Throwable throwable)
                            {
                                subscriber.onError(throwable);
                            }

                            public void onNext(Object obj)
                            {
                                subscriber.onNext(obj);
                            }

                            public void setProducer(Producer producer)
                            {
                                subscriber.setProducer(producer. new Producer() {

                                    final _cls1 this$3;
                                    final Producer val$producer;

                                    public void request(long l)
                                    {
                                        if (Thread.currentThread() == t)
                                        {
                                            producer.request(l);
                                            return;
                                        } else
                                        {
                                            inner.schedule(l. new Action0() {

                                                final _cls1 this$4;
                                                final long val$n;

                                                public void call()
                                                {
                                                    producer.request(n);
                                                }

            
            {
                this$4 = final__pcls1;
                n = J.this;
                super();
            }
                                            });
                                            return;
                                        }
                                    }

            
            {
                this$3 = final__pcls1;
                producer = Producer.this;
                super();
            }
                                });
                            }

            
            {
                this$2 = final__pcls1;
                t = thread;
                super(Subscriber.this);
            }
                        });
                    }

            
            {
                this$1 = final__pcls1;
                o = Observable.this;
                super();
            }
                });
            }

            
            {
                this$0 = OperatorSubscribeOn.this;
                subscriber = subscriber2;
                inner = worker;
                super(final_subscriber1);
            }
        };
    }
}
