// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

public final class OnSubscribeTimerPeriodically
    implements rx.Observable.OnSubscribe
{

    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    public OnSubscribeTimerPeriodically(long l, long l1, TimeUnit timeunit, Scheduler scheduler1)
    {
        initialDelay = l;
        period = l1;
        unit = timeunit;
        scheduler = scheduler1;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber child)
    {
        final rx.Scheduler.Worker worker = scheduler.createWorker();
        child.add(worker);
        worker.schedulePeriodically(new Action0() {

            long counter;
            final OnSubscribeTimerPeriodically this$0;
            final Subscriber val$child;
            final rx.Scheduler.Worker val$worker;

            public void call()
            {
                Subscriber subscriber = child;
                long l = counter;
                counter = 1L + l;
                subscriber.onNext(Long.valueOf(l));
                return;
                Object obj;
                obj;
                child.onError(((Throwable) (obj)));
                worker.unsubscribe();
                return;
                obj;
                worker.unsubscribe();
                throw obj;
            }

            
            {
                this$0 = OnSubscribeTimerPeriodically.this;
                child = subscriber;
                worker = worker1;
                super();
            }
        }, initialDelay, period, unit);
    }
}
