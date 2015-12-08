// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Action0;

// Referenced classes of package rx:
//            Observer, Observable

class 
    implements Observer
{

    final Observable this$0;
    final Action0 val$onCompleted;

    public final void onCompleted()
    {
        val$onCompleted.call();
    }

    public final void onError(Throwable throwable)
    {
    }

    public final void onNext(Object obj)
    {
    }

    ion0()
    {
        this$0 = final_observable;
        val$onCompleted = Action0.this;
        super();
    }
}
