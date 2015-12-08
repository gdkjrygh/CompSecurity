// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSampleWithObservable

class val.s extends Subscriber
{

    final OperatorSampleWithObservable this$0;
    final SerializedSubscriber val$s;
    final AtomicReference val$value;

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
        obj = val$value.getAndSet(OperatorSampleWithObservable.EMPTY_TOKEN);
        if (obj != OperatorSampleWithObservable.EMPTY_TOKEN)
        {
            val$s.onNext(obj);
        }
    }

    (SerializedSubscriber serializedsubscriber)
    {
        this$0 = final_operatorsamplewithobservable;
        val$value = AtomicReference.this;
        val$s = serializedsubscriber;
        super(final_subscriber);
    }
}
