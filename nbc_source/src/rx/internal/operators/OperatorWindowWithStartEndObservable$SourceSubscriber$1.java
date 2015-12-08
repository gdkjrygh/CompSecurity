// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithStartEndObservable

class once extends Subscriber
{

    boolean once;
    final onCompleted this$1;
    final onCompleted val$s;

    public void onCompleted()
    {
        if (once)
        {
            once = false;
            dWindow(val$s);
            ub.remove(this);
        }
    }

    public void onError(Throwable throwable)
    {
    }

    public void onNext(Object obj)
    {
        onCompleted();
    }

    ()
    {
        this$1 = final_;
        val$s = val.s.this;
        super();
        once = true;
    }
}
