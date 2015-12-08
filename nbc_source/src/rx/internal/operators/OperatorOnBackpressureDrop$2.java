// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Subscriber;
import rx.functions.Action1;

// Referenced classes of package rx.internal.operators:
//            OperatorOnBackpressureDrop

class val.requested extends Subscriber
{

    final OperatorOnBackpressureDrop this$0;
    final Subscriber val$child;
    final AtomicLong val$requested;

    public void onCompleted()
    {
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (val$requested.get() > 0L)
        {
            val$child.onNext(obj);
            val$requested.decrementAndGet();
        } else
        if (OperatorOnBackpressureDrop.access$100(OperatorOnBackpressureDrop.this) != null)
        {
            OperatorOnBackpressureDrop.access$100(OperatorOnBackpressureDrop.this).call(obj);
            return;
        }
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    (AtomicLong atomiclong)
    {
        this$0 = final_operatoronbackpressuredrop;
        val$child = Subscriber.this;
        val$requested = atomiclong;
        super(final_subscriber);
    }
}
