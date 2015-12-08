// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.operators:
//            OperatorDoOnEach

class done extends Subscriber
{

    private boolean done;
    final OperatorDoOnEach this$0;
    final Subscriber val$observer;

    public void onCompleted()
    {
        if (done)
        {
            return;
        }
        try
        {
            OperatorDoOnEach.access$000(OperatorDoOnEach.this).onCompleted();
        }
        catch (Throwable throwable)
        {
            onError(throwable);
            return;
        }
        done = true;
        val$observer.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        Exceptions.throwIfFatal(throwable);
        if (done)
        {
            return;
        }
        done = true;
        try
        {
            OperatorDoOnEach.access$000(OperatorDoOnEach.this).onError(throwable);
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            val$observer.onError(throwable);
            return;
        }
        val$observer.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (done)
        {
            return;
        }
        try
        {
            OperatorDoOnEach.access$000(OperatorDoOnEach.this).onNext(obj);
        }
        catch (Throwable throwable)
        {
            onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
        val$observer.onNext(obj);
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatordooneach;
        val$observer = subscriber1;
        super(Subscriber.this);
        done = false;
    }
}
