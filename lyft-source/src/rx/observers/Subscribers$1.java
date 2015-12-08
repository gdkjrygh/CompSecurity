// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.Subscriber;

// Referenced classes of package rx.observers:
//            Subscribers

final class val.o extends Subscriber
{

    final Observer val$o;

    public void onCompleted()
    {
        val$o.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$o.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$o.onNext(obj);
    }

    ()
    {
        val$o = observer;
        super();
    }
}
