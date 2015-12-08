// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Action0;

// Referenced classes of package rx:
//            Observer, Observable

class <init>
    implements Observer
{

    final Observable this$0;
    final Action0 val$onTerminate;

    public final void onCompleted()
    {
        val$onTerminate.call();
    }

    public final void onError(Throwable throwable)
    {
        val$onTerminate.call();
    }

    public final void onNext(Object obj)
    {
    }

    on0()
    {
        this$0 = final_observable;
        val$onTerminate = Action0.this;
        super();
    }
}
