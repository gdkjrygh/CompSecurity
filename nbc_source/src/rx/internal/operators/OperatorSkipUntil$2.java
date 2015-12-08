// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSkipUntil

class val.s extends Subscriber
{

    final OperatorSkipUntil this$0;
    final AtomicBoolean val$gate;
    final SerializedSubscriber val$s;

    public void onCompleted()
    {
        val$s.onCompleted();
        unsubscribe();
    }

    public void onError(Throwable throwable)
    {
        val$s.onError(throwable);
        unsubscribe();
    }

    public void onNext(Object obj)
    {
        if (val$gate.get())
        {
            val$s.onNext(obj);
            return;
        } else
        {
            request(1L);
            return;
        }
    }

    (SerializedSubscriber serializedsubscriber)
    {
        this$0 = final_operatorskipuntil;
        val$gate = AtomicBoolean.this;
        val$s = serializedsubscriber;
        super(final_subscriber);
    }
}
