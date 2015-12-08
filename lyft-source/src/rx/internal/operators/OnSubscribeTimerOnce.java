// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

public final class OnSubscribeTimerOnce
    implements rx.Observable.OnSubscribe
{

    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public OnSubscribeTimerOnce(long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        time = l;
        unit = timeunit;
        scheduler = scheduler1;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber child)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        child.add(worker);
        worker.schedule(new Action0() {

            final OnSubscribeTimerOnce this$0;
            final Subscriber val$child;

            public void call()
            {
                try
                {
                    child.onNext(Long.valueOf(0L));
                }
                catch (Throwable throwable)
                {
                    child.onError(throwable);
                    return;
                }
                child.onCompleted();
            }

            
            {
                this$0 = OnSubscribeTimerOnce.this;
                child = subscriber;
                super();
            }
        }, time, unit);
    }
}
