// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorZip

private final class producer extends Subscriber
{

    final Subscriber child;
    final producer producer;
    boolean started;
    final OperatorZip this$0;
    final producer zipper;

    public void onCompleted()
    {
        if (!started)
        {
            child.onCompleted();
        }
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Observable[])obj);
    }

    public void onNext(Observable aobservable[])
    {
        if (aobservable == null || aobservable.length == 0)
        {
            child.onCompleted();
            return;
        } else
        {
            started = true;
            zipper.zipper(aobservable, producer);
            return;
        }
    }

    public (Subscriber subscriber,  ,  1)
    {
        this$0 = OperatorZip.this;
        super(subscriber);
        started = false;
        child = subscriber;
        zipper = ;
        producer = 1;
    }
}
