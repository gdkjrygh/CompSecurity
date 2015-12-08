// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.operators:
//            OperatorCast

class val.o extends Subscriber
{

    final OperatorCast this$0;
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
            val$o.onNext(OperatorCast.access$000(OperatorCast.this).cast(obj));
            return;
        }
        catch (Throwable throwable)
        {
            onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
        }
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatorcast;
        val$o = subscriber1;
        super(Subscriber.this);
    }
}
