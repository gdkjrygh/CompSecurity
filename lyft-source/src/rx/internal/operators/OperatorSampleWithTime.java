// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

public final class OperatorSampleWithTime
    implements rx.Observable.Operator
{

    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public OperatorSampleWithTime(long l, TimeUnit timeunit, Scheduler scheduler1)
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
        Object obj = new SerializedSubscriber(subscriber);
        rx.Scheduler.Worker worker = scheduler.createWorker();
        subscriber.add(worker);
        obj = new SamplerSubscriber(((Subscriber) (obj)));
        subscriber.add(((rx.Subscription) (obj)));
        worker.schedulePeriodically(((Action0) (obj)), time, time, unit);
        return ((Subscriber) (obj));
    }

    private class SamplerSubscriber extends Subscriber
        implements Action0
    {

        private static final Object EMPTY_TOKEN = new Object();
        static final AtomicReferenceFieldUpdater VALUE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/internal/operators/OperatorSampleWithTime$SamplerSubscriber, java/lang/Object, "value");
        private final Subscriber subscriber;
        volatile Object value;

        public void call()
        {
            Object obj;
            obj = VALUE_UPDATER.getAndSet(this, EMPTY_TOKEN);
            if (obj == EMPTY_TOKEN)
            {
                break MISSING_BLOCK_LABEL_26;
            }
            subscriber.onNext(obj);
            return;
            Throwable throwable;
            throwable;
            onError(throwable);
            return;
        }

        public void onCompleted()
        {
            subscriber.onCompleted();
            unsubscribe();
        }

        public void onError(Throwable throwable)
        {
            subscriber.onError(throwable);
            unsubscribe();
        }

        public void onNext(Object obj)
        {
            value = obj;
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }


        public SamplerSubscriber(Subscriber subscriber1)
        {
            value = EMPTY_TOKEN;
            subscriber = subscriber1;
        }
    }

}
