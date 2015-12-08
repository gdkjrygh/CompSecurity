// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.Subscriber;

// Referenced classes of package rx.observers:
//            SerializedObserver

public class SerializedSubscriber extends Subscriber
{

    private final Observer s;

    public SerializedSubscriber(Subscriber subscriber)
    {
        this(subscriber, true);
    }

    public SerializedSubscriber(Subscriber subscriber, boolean flag)
    {
        super(subscriber, flag);
        s = new SerializedObserver(subscriber);
    }

    public void onCompleted()
    {
        s.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        s.onError(throwable);
    }

    public void onNext(Object obj)
    {
        s.onNext(obj);
    }
}
