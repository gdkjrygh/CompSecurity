// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.Subscribers;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeDelaySubscription

class val.s
    implements Action0
{

    final OnSubscribeDelaySubscription this$0;
    final Subscriber val$s;

    public void call()
    {
        if (!val$s.isUnsubscribed())
        {
            source.unsafeSubscribe(Subscribers.wrap(val$s));
        }
    }

    ()
    {
        this$0 = final_onsubscribedelaysubscription;
        val$s = Subscriber.this;
        super();
    }
}
