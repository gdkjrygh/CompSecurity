// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

public final class OperatorDelay
    implements rx.Observable.Operator
{

    final long delay;
    final Scheduler scheduler;
    final Observable source;
    final TimeUnit unit;

    public OperatorDelay(Observable observable, long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        source = observable;
        delay = l;
        unit = timeunit;
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        final rx.Scheduler.Worker worker = scheduler.createWorker();
        final_subscriber.add(worker);
        return new Subscriber(final_subscriber) {

            boolean done;
            final OperatorDelay this$0;
            final Subscriber val$child;
            final rx.Scheduler.Worker val$worker;

            public void onCompleted()
            {
                worker.schedule(new Action0() {

                    final _cls1 this$1;

                    public void call()
                    {
                        if (!done)
                        {
                            done = true;
                            child.onCompleted();
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                }, delay, unit);
            }

            public void onError(Throwable throwable)
            {
                worker.schedule(throwable. new Action0() {

                    final _cls1 this$1;
                    final Throwable val$e;

                    public void call()
                    {
                        if (!done)
                        {
                            done = true;
                            child.onError(e);
                            worker.unsubscribe();
                        }
                    }

            
            {
                this$1 = final__pcls1;
                e = Throwable.this;
                super();
            }
                });
            }

            public void onNext(Object obj)
            {
                worker.schedule(((_cls3) (obj)). new Action0() {

                    final _cls1 this$1;
                    final Object val$t;

                    public void call()
                    {
                        if (!done)
                        {
                            child.onNext(t);
                        }
                    }

            
            {
                this$1 = final__pcls1;
                t = Object.this;
                super();
            }
                }, delay, unit);
            }

            
            {
                this$0 = OperatorDelay.this;
                worker = worker1;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }
}
