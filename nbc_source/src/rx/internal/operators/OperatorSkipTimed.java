// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

public final class OperatorSkipTimed
    implements rx.Observable.Operator
{

    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public OperatorSkipTimed(long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        time = l;
        unit = timeunit;
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        final_subscriber.add(worker);
        final AtomicBoolean gate = new AtomicBoolean();
        worker.schedule(new Action0() {

            final OperatorSkipTimed this$0;
            final AtomicBoolean val$gate;

            public void call()
            {
                gate.set(true);
            }

            
            {
                this$0 = OperatorSkipTimed.this;
                gate = atomicboolean;
                super();
            }
        }, time, unit);
        return new Subscriber(final_subscriber) {

            final OperatorSkipTimed this$0;
            final Subscriber val$child;
            final AtomicBoolean val$gate;

            public void onCompleted()
            {
                child.onCompleted();
                unsubscribe();
                return;
                Exception exception;
                exception;
                unsubscribe();
                throw exception;
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
                unsubscribe();
                return;
                throwable;
                unsubscribe();
                throw throwable;
            }

            public void onNext(Object obj)
            {
                if (gate.get())
                {
                    child.onNext(obj);
                }
            }

            
            {
                this$0 = OperatorSkipTimed.this;
                gate = atomicboolean;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }
}
