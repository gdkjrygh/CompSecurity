// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSerialize

class val.s extends Subscriber
{

    final OperatorSerialize this$0;
    final Subscriber val$s;

    public void onCompleted()
    {
        val$s.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$s.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$s.onNext(obj);
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatorserialize;
        val$s = subscriber1;
        super(Subscriber.this);
    }
}
