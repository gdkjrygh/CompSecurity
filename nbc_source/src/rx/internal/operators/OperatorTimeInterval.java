// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.TimeInterval;

public final class OperatorTimeInterval
    implements rx.Observable.Operator
{

    private final Scheduler scheduler;

    public OperatorTimeInterval(Scheduler scheduler1)
    {
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        return new Subscriber(final_subscriber1) {

            private long lastTimestamp;
            final OperatorTimeInterval this$0;
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
                long l = scheduler.now();
                subscriber.onNext(new TimeInterval(l - lastTimestamp, obj));
                lastTimestamp = l;
            }

            
            {
                this$0 = OperatorTimeInterval.this;
                subscriber = subscriber2;
                super(final_subscriber1);
                lastTimestamp = scheduler.now();
            }
        };
    }

}
