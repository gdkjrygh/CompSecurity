// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Action1;

// Referenced classes of package rx:
//            Observer, Observable

class <init>
    implements Observer
{

    final Observable this$0;
    final Action1 val$onError;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        val$onError.call(throwable);
    }

    public final void onNext(Object obj)
    {
    }

    on1()
    {
        this$0 = final_observable;
        val$onError = Action1.this;
        super();
    }
}
