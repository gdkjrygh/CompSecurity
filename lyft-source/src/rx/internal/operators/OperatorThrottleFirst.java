// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;

public final class OperatorThrottleFirst
    implements rx.Observable.Operator
{

    private final Scheduler scheduler;
    private final long timeInMilliseconds;

    public OperatorThrottleFirst(long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        timeInMilliseconds = timeunit.toMillis(l);
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        return new Subscriber(final_subscriber1) {

            private long lastOnNext;
            final OperatorThrottleFirst this$0;
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
                if (lastOnNext == 0L || l - lastOnNext >= timeInMilliseconds)
                {
                    lastOnNext = l;
                    subscriber.onNext(obj);
                }
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorThrottleFirst.this;
                subscriber = subscriber2;
                super(final_subscriber1);
                lastOnNext = 0L;
            }
        };
    }


}
