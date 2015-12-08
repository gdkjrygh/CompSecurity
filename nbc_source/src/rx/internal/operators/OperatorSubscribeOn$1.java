// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorSubscribeOn

class val.inner extends Subscriber
{

    final OperatorSubscribeOn this$0;
    final rx.ratorSubscribeOn val$inner;
    final Subscriber val$subscriber;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        val$subscriber.onError(throwable);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Observable)obj);
    }

    public void onNext(final Observable o)
    {
        val$inner.ule(new Action0() {

            final OperatorSubscribeOn._cls1 this$1;
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
                this$1 = OperatorSubscribeOn._cls1.this;
                o = observable;
                super();
            }
        });
    }

    _cls1.val.o(rx.ratorSubscribeOn ratorsubscribeon)
    {
        this$0 = final_operatorsubscribeon;
        val$subscriber = Subscriber.this;
        val$inner = ratorsubscribeon;
        super(final_subscriber1);
    }
}
