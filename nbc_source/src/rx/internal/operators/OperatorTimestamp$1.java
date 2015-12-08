// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Timestamped;

// Referenced classes of package rx.internal.operators:
//            OperatorTimestamp

class val.o extends Subscriber
{

    final OperatorTimestamp this$0;
    final Subscriber val$o;

    public void onCompleted()
    {
        val$o.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$o.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$o.onNext(new Timestamped(OperatorTimestamp.access$000(OperatorTimestamp.this).now(), obj));
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatortimestamp;
        val$o = subscriber1;
        super(Subscriber.this);
    }
}
