// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            OperatorTimeoutWithSelector

class val.seqId extends Subscriber
{

    final val.seqId this$1;
    final Long val$seqId;
    final riber val$timeoutSubscriber;

    public void onCompleted()
    {
        val$timeoutSubscriber.onTimeout(val$seqId.longValue());
    }

    public void onError(Throwable throwable)
    {
        val$timeoutSubscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$timeoutSubscriber.onTimeout(val$seqId.longValue());
    }

    riber()
    {
        this$1 = final_riber;
        val$timeoutSubscriber = riber1;
        val$seqId = Long.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorTimeoutWithSelector$1

/* anonymous class */
    class OperatorTimeoutWithSelector._cls1
        implements OperatorTimeoutBase.FirstTimeoutStub
    {

        final Func0 val$firstTimeoutSelector;

        public volatile Object call(Object obj, Object obj1, Object obj2)
        {
            return call((OperatorTimeoutBase.TimeoutSubscriber)obj, (Long)obj1, (rx.Scheduler.Worker)obj2);
        }

        public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber timeoutSubscriber, Long long1, rx.Scheduler.Worker worker)
        {
            if (firstTimeoutSelector != null)
            {
                try
                {
                    worker = (Observable)firstTimeoutSelector.call();
                }
                // Misplaced declaration of an exception variable
                catch (Long long1)
                {
                    Exceptions.throwIfFatal(long1);
                    timeoutSubscriber.onError(long1);
                    return Subscriptions.unsubscribed();
                }
                return worker.unsafeSubscribe(long1. new OperatorTimeoutWithSelector._cls1._cls1());
            } else
            {
                return Subscriptions.unsubscribed();
            }
        }

            
            {
                firstTimeoutSelector = func0;
                super();
            }
    }

}
