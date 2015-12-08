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
    final Action1 val$onNext;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
    }

    public final void onNext(Object obj)
    {
        val$onNext.call(obj);
    }

    on1()
    {
        this$0 = final_observable;
        val$onNext = Action1.this;
        super();
    }
}
