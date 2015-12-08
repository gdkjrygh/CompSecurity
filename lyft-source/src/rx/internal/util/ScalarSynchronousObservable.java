// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Func1;
import rx.internal.schedulers.EventLoopsScheduler;

public final class ScalarSynchronousObservable extends Observable
{

    private final Object t;

    protected ScalarSynchronousObservable(final Object t)
    {
        super(new rx.Observable.OnSubscribe() {

            final Object val$t;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                subscriber.onNext(t);
                subscriber.onCompleted();
            }

            
            {
                t = obj;
                super();
            }
        });
        this.t = t;
    }

    public static final ScalarSynchronousObservable create(Object obj)
    {
        return new ScalarSynchronousObservable(obj);
    }

    public Object get()
    {
        return t;
    }

    public Observable scalarFlatMap(final Func1 func)
    {
        return create(new rx.Observable.OnSubscribe() {

            final ScalarSynchronousObservable this$0;
            final Func1 val$func;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Observable observable = (Observable)func.call(t);
                if (observable.getClass() == rx/internal/util/ScalarSynchronousObservable)
                {
                    subscriber.onNext(((ScalarSynchronousObservable)observable).t);
                    subscriber.onCompleted();
                    return;
                } else
                {
                    observable.unsafeSubscribe(subscriber. new Subscriber(subscriber) {

                        final _cls2 this$1;
                        final Subscriber val$child;

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
                        }

            
            {
                this$1 = final__pcls2;
                child = subscriber1;
                super(Subscriber.this);
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = ScalarSynchronousObservable.this;
                func = func1;
                super();
            }
        });
    }

    public Observable scalarScheduleOn(Scheduler scheduler)
    {
        if (scheduler instanceof EventLoopsScheduler)
        {
            return create(new DirectScheduledEmission((EventLoopsScheduler)scheduler, t));
        } else
        {
            return create(new NormalScheduledEmission(scheduler, t));
        }
    }


    private class DirectScheduledEmission
        implements rx.Observable.OnSubscribe
    {

        private final EventLoopsScheduler es;
        private final Object value;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            subscriber.add(es.scheduleDirect(new ScalarSynchronousAction(subscriber, value)));
        }

        DirectScheduledEmission(EventLoopsScheduler eventloopsscheduler, Object obj)
        {
            es = eventloopsscheduler;
            value = obj;
        }

        private class ScalarSynchronousAction
            implements Action0
        {

            private final Subscriber subscriber;
            private final Object value;

            public void call()
            {
                try
                {
                    subscriber.onNext(value);
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                    return;
                }
                subscriber.onCompleted();
            }

            private ScalarSynchronousAction(Subscriber subscriber1, Object obj)
            {
                subscriber = subscriber1;
                value = obj;
            }

        }

    }


    private class NormalScheduledEmission
        implements rx.Observable.OnSubscribe
    {

        private final Scheduler scheduler;
        private final Object value;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            rx.Scheduler.Worker worker = scheduler.createWorker();
            subscriber.add(worker);
            worker.schedule(new ScalarSynchronousAction(subscriber, value));
        }

        NormalScheduledEmission(Scheduler scheduler1, Object obj)
        {
            scheduler = scheduler1;
            value = obj;
        }
    }

}
