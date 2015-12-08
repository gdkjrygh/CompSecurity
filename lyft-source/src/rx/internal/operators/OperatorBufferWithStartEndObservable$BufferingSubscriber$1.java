// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.List;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

class val.chunk extends Subscriber
{

    final val.chunk this$1;
    final List val$chunk;

    public void onCompleted()
    {
        osingSubscriptions.remove(this);
        dBuffer(val$chunk);
    }

    public void onError(Throwable throwable)
    {
        Error(throwable);
    }

    public void onNext(Object obj)
    {
        osingSubscriptions.remove(this);
        dBuffer(val$chunk);
    }

    ()
    {
        this$1 = final_;
        val$chunk = List.this;
        super();
    }
}
