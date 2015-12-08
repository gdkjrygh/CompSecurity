// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subjects.PublishSubject;

// Referenced classes of package rx.internal.operators:
//            OperatorDelayWithSelector

class val.t
    implements Func1
{

    final val.t this$1;
    final Object val$t;

    public Object call(Object obj)
    {
        return val$t;
    }

    l.child()
    {
        this$1 = final_child;
        val$t = Object.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorDelayWithSelector$1

/* anonymous class */
    class OperatorDelayWithSelector._cls1 extends Subscriber
    {

        final OperatorDelayWithSelector this$0;
        final SerializedSubscriber val$child;
        final PublishSubject val$delayedEmissions;

        public void onCompleted()
        {
            delayedEmissions.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
        }

        public void onNext(Object obj)
        {
            try
            {
                delayedEmissions.onNext(((Observable)itemDelay.call(obj)).take(1).defaultIfEmpty(null).map(((OperatorDelayWithSelector._cls1._cls1) (obj)). new OperatorDelayWithSelector._cls1._cls1()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                onError(((Throwable) (obj)));
            }
        }

            
            {
                this$0 = final_operatordelaywithselector;
                delayedEmissions = PublishSubject.this;
                child = serializedsubscriber;
                super(final_subscriber);
            }
    }

}
