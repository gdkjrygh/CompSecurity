// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Timestamped;

public final class OperatorTimestamp
    implements rx.Observable.Operator
{

    private final Scheduler scheduler;

    public OperatorTimestamp(Scheduler scheduler1)
    {
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            final OperatorTimestamp this$0;
            final Subscriber val$o;

            public void onCompleted()
            {
                o.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                o.onError(throwable);
            }

            public void onNext(Object obj)
            {
                o.onNext(new Timestamped(scheduler.now(), obj));
            }

            
            {
                this$0 = OperatorTimestamp.this;
                o = subscriber1;
                super(final_subscriber);
            }
        };
    }

}
