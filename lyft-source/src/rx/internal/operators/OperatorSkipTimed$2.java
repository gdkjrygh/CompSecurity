// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSkipTimed

class val.child extends Subscriber
{

    final OperatorSkipTimed this$0;
    final Subscriber val$child;
    final AtomicBoolean val$gate;

    public void onCompleted()
    {
        val$child.onCompleted();
        unsubscribe();
        return;
        Exception exception;
        exception;
        unsubscribe();
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
        unsubscribe();
        return;
        throwable;
        unsubscribe();
        throw throwable;
    }

    public void onNext(Object obj)
    {
        if (val$gate.get())
        {
            val$child.onNext(obj);
        }
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatorskiptimed;
        val$gate = AtomicBoolean.this;
        val$child = subscriber1;
        super(final_subscriber);
    }
}
