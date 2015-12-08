// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

public final class OperatorTakeTimed
    implements rx.Observable.Operator
{

    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public OperatorTakeTimed(long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        time = l;
        unit = timeunit;
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        subscriber.add(worker);
        subscriber = new TakeSubscriber(new SerializedSubscriber(subscriber));
        worker.schedule(subscriber, time, unit);
        return subscriber;
    }

    private class TakeSubscriber extends Subscriber
        implements Action0
    {

        final Subscriber child;

        public void call()
        {
            onCompleted();
        }

        public void onCompleted()
        {
            child.onCompleted();
            unsubscribe();
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
            unsubscribe();
        }

        public void onNext(Object obj)
        {
            child.onNext(obj);
        }

        public TakeSubscriber(Subscriber subscriber)
        {
            super(subscriber);
            child = subscriber;
        }
    }

}
