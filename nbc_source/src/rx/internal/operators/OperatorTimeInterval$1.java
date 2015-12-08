// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.TimeInterval;

// Referenced classes of package rx.internal.operators:
//            OperatorTimeInterval

class this._cls0 extends Subscriber
{

    private long lastTimestamp;
    final OperatorTimeInterval this$0;
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
        long l = OperatorTimeInterval.access$000(OperatorTimeInterval.this).now();
        val$subscriber.onNext(new TimeInterval(l - lastTimestamp, obj));
        lastTimestamp = l;
    }

    (Subscriber subscriber2)
    {
        this$0 = final_operatortimeinterval;
        val$subscriber = subscriber2;
        super(Subscriber.this);
        lastTimestamp = OperatorTimeInterval.access$000(OperatorTimeInterval.this).now();
    }
}
