// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Subscriber;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action1;

// Referenced classes of package rx.observers:
//            Subscribers

final class val.onNext extends Subscriber
{

    final Action1 val$onNext;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        throw new OnErrorNotImplementedException(throwable);
    }

    public final void onNext(Object obj)
    {
        val$onNext.call(obj);
    }

    lementedException()
    {
        val$onNext = action1;
        super();
    }
}
