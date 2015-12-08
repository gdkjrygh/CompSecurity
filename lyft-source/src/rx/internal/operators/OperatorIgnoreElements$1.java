// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorIgnoreElements

class val.child extends Subscriber
{

    final OperatorIgnoreElements this$0;
    final Subscriber val$child;

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
    }

    ()
    {
        this$0 = final_operatorignoreelements;
        val$child = Subscriber.this;
        super();
    }
}
