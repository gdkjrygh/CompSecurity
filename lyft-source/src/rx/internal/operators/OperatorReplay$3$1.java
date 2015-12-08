// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

class val.child extends Subscriber
{

    final val.child this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$child.onNext(obj);
    }

    l.observable(Subscriber subscriber1)
    {
        this$0 = final_observable;
        val$child = subscriber1;
        super(Subscriber.this);
    }

    // Unreferenced inner class rx/internal/operators/OperatorReplay$3

/* anonymous class */
    final class OperatorReplay._cls3
        implements rx.Observable.OnSubscribe
    {

        final Observable val$observable;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            observable.unsafeSubscribe(subscriber. new OperatorReplay._cls3._cls1(subscriber));
        }

            
            {
                observable = observable1;
                super();
            }
    }

}
