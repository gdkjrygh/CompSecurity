// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorFilter

class val.child extends Subscriber
{

    final OperatorFilter this$0;
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
        if (((Boolean)OperatorFilter.access$000(OperatorFilter.this).call(obj)).booleanValue())
        {
            val$child.onNext(obj);
            return;
        }
        try
        {
            request(1L);
            return;
        }
        catch (Throwable throwable)
        {
            val$child.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
        }
        return;
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatorfilter;
        val$child = subscriber1;
        super(Subscriber.this);
    }
}
