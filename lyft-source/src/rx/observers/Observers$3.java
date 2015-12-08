// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.functions.Action1;

// Referenced classes of package rx.observers:
//            Observers

final class val.onNext
    implements Observer
{

    final Action1 val$onError;
    final Action1 val$onNext;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        val$onError.call(throwable);
    }

    public final void onNext(Object obj)
    {
        val$onNext.call(obj);
    }

    ()
    {
        val$onError = action1;
        val$onNext = action1_1;
        super();
    }
}
