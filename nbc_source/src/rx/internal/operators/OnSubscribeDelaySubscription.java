// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.Subscribers;

public final class OnSubscribeDelaySubscription
    implements rx.Observable.OnSubscribe
{

    final Scheduler scheduler;
    final Observable source;
    final long time;
    final TimeUnit unit;

    public OnSubscribeDelaySubscription(Observable observable, long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        source = observable;
        time = l;
        unit = timeunit;
        scheduler = scheduler1;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber s)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        s.add(worker);
        worker.schedule(new Action0() {

            final OnSubscribeDelaySubscription this$0;
            final Subscriber val$s;

            public void call()
            {
                if (!s.isUnsubscribed())
                {
                    source.unsafeSubscribe(Subscribers.wrap(s));
                }
            }

            
            {
                this$0 = OnSubscribeDelaySubscription.this;
                s = subscriber;
                super();
            }
        }, time, unit);
    }
}
