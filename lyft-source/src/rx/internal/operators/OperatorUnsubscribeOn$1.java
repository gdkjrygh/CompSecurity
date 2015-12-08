// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorUnsubscribeOn

class val.subscriber extends Subscriber
{

    final OperatorUnsubscribeOn this$0;
    final Subscriber val$subscriber;

    public void onCompleted()
    {
        val$subscriber.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$subscriber.onNext(obj);
    }

    ()
    {
        this$0 = final_operatorunsubscribeon;
        val$subscriber = Subscriber.this;
        super();
    }
}
