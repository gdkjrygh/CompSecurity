// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithObservable

static final class sub extends Subscriber
{

    final request sub;

    public void onCompleted()
    {
        sub.Completed();
    }

    public void onError(Throwable throwable)
    {
        sub.Error(throwable);
    }

    public void onNext(Object obj)
    {
        sub.placeWindow();
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    public (Subscriber subscriber,  )
    {
        sub = ;
    }
}
