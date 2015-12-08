// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorFinally

class val.child extends Subscriber
{

    final OperatorFinally this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        val$child.onCompleted();
        action.call();
        return;
        Exception exception;
        exception;
        action.call();
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
        action.call();
        return;
        throwable;
        action.call();
        throw throwable;
    }

    public void onNext(Object obj)
    {
        val$child.onNext(obj);
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatorfinally;
        val$child = subscriber1;
        super(Subscriber.this);
    }
}
