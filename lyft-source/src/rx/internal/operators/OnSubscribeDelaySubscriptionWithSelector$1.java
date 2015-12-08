// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.observers.Subscribers;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeDelaySubscriptionWithSelector

class val.child extends Subscriber
{

    final OnSubscribeDelaySubscriptionWithSelector this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        source.unsafeSubscribe(Subscribers.wrap(val$child));
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
    }

    ()
    {
        this$0 = final_onsubscribedelaysubscriptionwithselector;
        val$child = Subscriber.this;
        super();
    }
}
