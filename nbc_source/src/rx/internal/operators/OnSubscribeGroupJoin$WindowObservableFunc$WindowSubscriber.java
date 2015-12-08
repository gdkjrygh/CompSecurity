// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.Subscription;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeGroupJoin

final class ref extends Subscriber
{

    private final Subscription ref;
    final Subscriber subscriber;
    final subscriber this$0;

    public void onCompleted()
    {
        subscriber.onCompleted();
        ref.unsubscribe();
    }

    public void onError(Throwable throwable)
    {
        subscriber.onError(throwable);
        ref.unsubscribe();
    }

    public void onNext(Object obj)
    {
        subscriber.onNext(obj);
    }

    public (Subscriber subscriber1, Subscription subscription)
    {
        this$0 = this._cls0.this;
        super(subscriber1);
        subscriber = subscriber1;
        ref = subscription;
    }
}
