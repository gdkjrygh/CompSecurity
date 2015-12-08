// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorTimeoutBase

public final class OperatorTimeout extends OperatorTimeoutBase
{

    public OperatorTimeout(final long timeout, final TimeUnit timeUnit, Observable observable, Scheduler scheduler)
    {
        super(new OperatorTimeoutBase.FirstTimeoutStub() {

            final TimeUnit val$timeUnit;
            final long val$timeout;

            public volatile Object call(Object obj, Object obj1, Object obj2)
            {
                return call((OperatorTimeoutBase.TimeoutSubscriber)obj, (Long)obj1, (rx.Scheduler.Worker)obj2);
            }

            public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber timeoutSubscriber, Long long1, rx.Scheduler.Worker worker)
            {
                return worker.schedule(long1. new Action0() {

                    final _cls1 this$1;
                    final Long val$seqId;
                    final OperatorTimeoutBase.TimeoutSubscriber val$timeoutSubscriber;

                    public void call()
                    {
                        timeoutSubscriber.onTimeout(seqId.longValue());
                    }

            
            {
                this$1 = final__pcls1;
                timeoutSubscriber = timeoutsubscriber;
                seqId = Long.this;
                super();
            }
                }, timeout, timeUnit);
            }

            
            {
                timeout = l;
                timeUnit = timeunit;
                super();
            }
        }, new OperatorTimeoutBase.TimeoutStub() {

            final TimeUnit val$timeUnit;
            final long val$timeout;

            public volatile Object call(Object obj, Object obj1, Object obj2, Object obj3)
            {
                return call((OperatorTimeoutBase.TimeoutSubscriber)obj, (Long)obj1, obj2, (rx.Scheduler.Worker)obj3);
            }

            public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber timeoutSubscriber, Long long1, Object obj, rx.Scheduler.Worker worker)
            {
                return worker.schedule(long1. new Action0() {

                    final _cls2 this$1;
                    final Long val$seqId;
                    final OperatorTimeoutBase.TimeoutSubscriber val$timeoutSubscriber;

                    public void call()
                    {
                        timeoutSubscriber.onTimeout(seqId.longValue());
                    }

            
            {
                this$1 = final__pcls2;
                timeoutSubscriber = timeoutsubscriber;
                seqId = Long.this;
                super();
            }
                }, timeout, timeUnit);
            }

            
            {
                timeout = l;
                timeUnit = timeunit;
                super();
            }
        }, observable, scheduler);
    }

    public volatile Subscriber call(Subscriber subscriber)
    {
        return super.call(subscriber);
    }
}
