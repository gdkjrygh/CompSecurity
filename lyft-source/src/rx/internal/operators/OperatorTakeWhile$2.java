// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorTakeWhile

class done extends Subscriber
{

    private int counter;
    private boolean done;
    final OperatorTakeWhile this$0;
    final Subscriber val$subscriber;

    public void onCompleted()
    {
        if (!done)
        {
            val$subscriber.onCompleted();
        }
    }

    public void onError(Throwable throwable)
    {
        if (!done)
        {
            val$subscriber.onError(throwable);
        }
    }

    public void onNext(Object obj)
    {
        boolean flag;
        try
        {
            Func2 func2 = OperatorTakeWhile.access$000(OperatorTakeWhile.this);
            int i = counter;
            counter = i + 1;
            flag = ((Boolean)func2.call(obj, Integer.valueOf(i))).booleanValue();
        }
        catch (Throwable throwable)
        {
            done = true;
            Exceptions.throwIfFatal(throwable);
            val$subscriber.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            unsubscribe();
            return;
        }
        if (flag)
        {
            val$subscriber.onNext(obj);
            return;
        } else
        {
            done = true;
            val$subscriber.onCompleted();
            unsubscribe();
            return;
        }
    }

    (boolean flag, Subscriber subscriber2)
    {
        this$0 = final_operatortakewhile;
        val$subscriber = subscriber2;
        super(Subscriber.this, flag);
        counter = 0;
        done = false;
    }
}
