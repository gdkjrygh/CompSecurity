// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

public class OperatorUnsubscribeOn
    implements rx.Observable.Operator
{

    private final Scheduler scheduler;

    public OperatorUnsubscribeOn(Scheduler scheduler1)
    {
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber subscriber)
    {
        final Subscriber parent = new Subscriber() {

            final OperatorUnsubscribeOn this$0;
            final Subscriber val$subscriber;

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

            
            {
                this$0 = OperatorUnsubscribeOn.this;
                subscriber = subscriber1;
                super();
            }
        };
        subscriber.add(Subscriptions.create(new Action0() {

            final OperatorUnsubscribeOn this$0;
            final Subscriber val$parent;

            public void call()
            {
                rx.Scheduler.Worker worker = scheduler.createWorker();
                worker.schedule(worker. new Action0() {

                    final _cls2 this$1;
                    final rx.Scheduler.Worker val$inner;

                    public void call()
                    {
                        parent.unsubscribe();
                        inner.unsubscribe();
                    }

            
            {
                this$1 = final__pcls2;
                inner = rx.Scheduler.Worker.this;
                super();
            }
                });
            }

            
            {
                this$0 = OperatorUnsubscribeOn.this;
                parent = subscriber;
                super();
            }
        }));
        return parent;
    }

}
