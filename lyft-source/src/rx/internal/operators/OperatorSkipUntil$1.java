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
        unsubscribe();
    }

    public void onError(Throwable throwable)
    {
        val$s.onError(throwable);
        val$s.unsubscribe();
    }

    public void onNext(Object obj)
    {
        val$gate.set(true);
        unsubscribe();
    }

    ()
    {
        this$0 = final_operatorskipuntil;
        val$gate = atomicboolean;
        val$s = SerializedSubscriber.this;
        super();
    }
}
