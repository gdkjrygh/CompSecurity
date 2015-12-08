// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Subscriber;

// Referenced classes of package rx.observers:
//            Subscribers

static final class val.subscriber extends Subscriber
{

    final Subscriber val$subscriber;

    public void onCompleted()
    {
        val$subscriber.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$subscriber.onNext(obj);
    }

    (Subscriber subscriber1, Subscriber subscriber2)
    {
        val$subscriber = subscriber2;
        super(subscriber1);
    }
}
