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

class val.child extends Subscriber
{

    final OperatorDelayWithSelector this$0;
    final SerializedSubscriber val$child;
    final PublishSubject val$delayedEmissions;

    public void onCompleted()
    {
        val$delayedEmissions.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(final Object t)
    {
        try
        {
            val$delayedEmissions.onNext(((Observable)itemDelay.call(t)).take(1).defaultIfEmpty(null).map(new Func1() {

                final OperatorDelayWithSelector._cls1 this$1;
                final Object val$t;

                public Object call(Object obj)
                {
                    return t;
                }

            
            {
                this$1 = OperatorDelayWithSelector._cls1.this;
                t = obj;
                super();
            }
            }));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final Object t)
        {
            onError(((Throwable) (t)));
        }
    }

    _cls1.val.t(SerializedSubscriber serializedsubscriber)
    {
        this$0 = final_operatordelaywithselector;
        val$delayedEmissions = PublishSubject.this;
        val$child = serializedsubscriber;
        super(final_subscriber);
    }
}
