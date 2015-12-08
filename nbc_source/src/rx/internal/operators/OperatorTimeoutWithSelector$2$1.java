// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
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

    // Unreferenced inner class rx/internal/operators/OperatorTimeoutWithSelector$2

/* anonymous class */
    class OperatorTimeoutWithSelector._cls2
        implements OperatorTimeoutBase.TimeoutStub
    {

        final Func1 val$timeoutSelector;

        public volatile Object call(Object obj, Object obj1, Object obj2, Object obj3)
        {
            return call((OperatorTimeoutBase.TimeoutSubscriber)obj, (Long)obj1, obj2, (rx.Scheduler.Worker)obj3);
        }

        public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber timeoutSubscriber, Long long1, Object obj, rx.Scheduler.Worker worker)
        {
            try
            {
                obj = (Observable)timeoutSelector.call(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Long long1)
            {
                Exceptions.throwIfFatal(long1);
                timeoutSubscriber.onError(long1);
                return Subscriptions.unsubscribed();
            }
            return ((Observable) (obj)).unsafeSubscribe(long1. new OperatorTimeoutWithSelector._cls2._cls1());
        }

            
            {
                timeoutSelector = func1;
                super();
            }
    }

}
