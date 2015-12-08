// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import rx.Subscription;
import rx.functions.Action1;

// Referenced classes of package rx.observables:
//            ConnectableObservable

class val.out
    implements Action1
{

    final ConnectableObservable this$0;
    final Subscription val$out[];

    public volatile void call(Object obj)
    {
        call((Subscription)obj);
    }

    public void call(Subscription subscription)
    {
        val$out[0] = subscription;
    }

    ()
    {
        this$0 = final_connectableobservable;
        val$out = _5B_Lrx.Subscription_3B_.this;
        super();
    }
}
