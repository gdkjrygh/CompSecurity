// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorTakeUntilPredicate

private final class <init> extends Subscriber
{

    private final Subscriber child;
    private boolean done;
    final OperatorTakeUntilPredicate this$0;

    void downstreamRequest(long l)
    {
        request(l);
    }

    public void onCompleted()
    {
        if (!done)
        {
            child.onCompleted();
        }
    }

    public void onError(Throwable throwable)
    {
        if (!done)
        {
            child.onError(throwable);
        }
    }

    public void onNext(Object obj)
    {
        child.onNext(obj);
        boolean flag;
        try
        {
            flag = ((Boolean)OperatorTakeUntilPredicate.access$000(OperatorTakeUntilPredicate.this).call(obj)).booleanValue();
        }
        catch (Throwable throwable)
        {
            done = true;
            Exceptions.throwIfFatal(throwable);
            child.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            unsubscribe();
            return;
        }
        if (flag)
        {
            done = true;
            child.onCompleted();
            unsubscribe();
        }
    }

    private (Subscriber subscriber)
    {
        this$0 = OperatorTakeUntilPredicate.this;
        super();
        done = false;
        child = subscriber;
    }

    child(Subscriber subscriber, child child1)
    {
        this(subscriber);
    }
}
