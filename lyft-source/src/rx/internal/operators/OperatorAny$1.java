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
//            OperatorAny

class val.child extends Subscriber
{

    boolean done;
    boolean hasElements;
    final OperatorAny this$0;
    final Subscriber val$child;
    final SingleDelayedProducer val$producer;

    public void onCompleted()
    {
label0:
        {
            if (!done)
            {
                done = true;
                if (!hasElements)
                {
                    break label0;
                }
                val$producer.setValue(Boolean.valueOf(false));
            }
            return;
        }
        val$producer.setValue(Boolean.valueOf(OperatorAny.access$100(OperatorAny.this)));
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        hasElements = true;
        boolean flag;
        try
        {
            flag = ((Boolean)OperatorAny.access$000(OperatorAny.this).call(obj)).booleanValue();
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
        if (flag && !done)
        {
            done = true;
            obj = val$producer;
            boolean flag1;
            if (!OperatorAny.access$100(OperatorAny.this))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((SingleDelayedProducer) (obj)).setValue(Boolean.valueOf(flag1));
            unsubscribe();
        }
    }

    roducer()
    {
        this$0 = final_operatorany;
        val$producer = singledelayedproducer;
        val$child = Subscriber.this;
        super();
    }
}
