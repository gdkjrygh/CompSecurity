// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscription;
import rx.functions.Action1;
import rx.observers.SafeSubscriber;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeMulticastSelector

class val.s
    implements Action1
{

    final OnSubscribeMulticastSelector this$0;
    final SafeSubscriber val$s;

    public volatile void call(Object obj)
    {
        call((Subscription)obj);
    }

    public void call(Subscription subscription)
    {
        val$s.add(subscription);
    }

    ()
    {
        this$0 = final_onsubscribemulticastselector;
        val$s = SafeSubscriber.this;
        super();
    }
}
