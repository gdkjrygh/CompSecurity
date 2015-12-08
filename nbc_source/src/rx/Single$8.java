// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Action1;

// Referenced classes of package rx:
//            Subscriber, Single

class r extends Subscriber
{

    final Single this$0;
    final Action1 val$onError;
    final Action1 val$onSuccess;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        val$onError.call(throwable);
    }

    public final void onNext(Object obj)
    {
        val$onSuccess.call(obj);
    }

    .Action1()
    {
        this$0 = final_single;
        val$onError = action1;
        val$onSuccess = Action1.this;
        super();
    }
}
