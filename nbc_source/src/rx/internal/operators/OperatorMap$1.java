// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorMap

class val.o extends Subscriber
{

    final OperatorMap this$0;
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
        try
        {
            val$o.onNext(OperatorMap.access$000(OperatorMap.this).call(obj));
            return;
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatormap;
        val$o = subscriber1;
        super(Subscriber.this);
    }
}
