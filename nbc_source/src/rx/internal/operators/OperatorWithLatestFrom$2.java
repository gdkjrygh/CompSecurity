// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorWithLatestFrom

class val.s extends Subscriber
{

    final OperatorWithLatestFrom this$0;
    final AtomicReference val$current;
    final SerializedSubscriber val$s;

    public void onCompleted()
    {
        if (val$current.get() == OperatorWithLatestFrom.EMPTY)
        {
            val$s.onCompleted();
            val$s.unsubscribe();
        }
    }

    public void onError(Throwable throwable)
    {
        val$s.onError(throwable);
        val$s.unsubscribe();
    }

    public void onNext(Object obj)
    {
        val$current.set(obj);
    }

    ()
    {
        this$0 = final_operatorwithlatestfrom;
        val$current = atomicreference;
        val$s = SerializedSubscriber.this;
        super();
    }
}
