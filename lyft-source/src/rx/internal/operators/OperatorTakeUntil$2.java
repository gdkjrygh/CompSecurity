// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorTakeUntil

class val.main extends Subscriber
{

    final OperatorTakeUntil this$0;
    final Subscriber val$main;

    public void onCompleted()
    {
        val$main.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$main.onError(throwable);
    }

    public void onNext(Object obj)
    {
        onCompleted();
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    ()
    {
        this$0 = final_operatortakeuntil;
        val$main = Subscriber.this;
        super();
    }
}
