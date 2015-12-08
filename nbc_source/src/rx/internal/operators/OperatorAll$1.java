// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;

// Referenced classes of package rx.internal.operators:
//            OperatorAll

class val.child extends Subscriber
{

    boolean done;
    final OperatorAll this$0;
    final Subscriber val$child;
    final SingleDelayedProducer val$producer;

    public void onCompleted()
    {
        if (!done)
        {
            done = true;
            val$producer.setValue(Boolean.valueOf(true));
        }
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        Boolean boolean1;
        try
        {
            boolean1 = (Boolean)OperatorAll.access$000(OperatorAll.this).call(obj);
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
        if (!boolean1.booleanValue() && !done)
        {
            done = true;
            val$producer.setValue(Boolean.valueOf(false));
            unsubscribe();
        }
    }

    roducer()
    {
        this$0 = final_operatorall;
        val$producer = singledelayedproducer;
        val$child = Subscriber.this;
        super();
    }
}
