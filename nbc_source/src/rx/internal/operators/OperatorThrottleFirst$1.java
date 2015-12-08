// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Scheduler;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorThrottleFirst

class lastOnNext extends Subscriber
{

    private long lastOnNext;
    final OperatorThrottleFirst this$0;
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
        long l = OperatorThrottleFirst.access$000(OperatorThrottleFirst.this).now();
        if (lastOnNext == 0L || l - lastOnNext >= OperatorThrottleFirst.access$100(OperatorThrottleFirst.this))
        {
            lastOnNext = l;
            val$subscriber.onNext(obj);
        }
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    (Subscriber subscriber2)
    {
        this$0 = final_operatorthrottlefirst;
        val$subscriber = subscriber2;
        super(Subscriber.this);
        lastOnNext = 0L;
    }
}
