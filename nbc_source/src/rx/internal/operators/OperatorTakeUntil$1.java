// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorTakeUntil

class val.serial extends Subscriber
{

    final OperatorTakeUntil this$0;
    final Subscriber val$serial;

    public void onCompleted()
    {
        val$serial.onCompleted();
        val$serial.unsubscribe();
        return;
        Exception exception;
        exception;
        val$serial.unsubscribe();
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        val$serial.onError(throwable);
        val$serial.unsubscribe();
        return;
        throwable;
        val$serial.unsubscribe();
        throw throwable;
    }

    public void onNext(Object obj)
    {
        val$serial.onNext(obj);
    }

    (boolean flag, Subscriber subscriber1)
    {
        this$0 = final_operatortakeuntil;
        val$serial = subscriber1;
        super(Subscriber.this, flag);
    }
}
