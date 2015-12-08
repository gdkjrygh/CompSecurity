// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorSkipWhile

class skipping extends Subscriber
{

    int index;
    boolean skipping;
    final OperatorSkipWhile this$0;
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
        if (!skipping)
        {
            val$child.onNext(obj);
            return;
        }
        Func2 func2 = OperatorSkipWhile.access$000(OperatorSkipWhile.this);
        int i = index;
        index = i + 1;
        if (!((Boolean)func2.call(obj, Integer.valueOf(i))).booleanValue())
        {
            skipping = false;
            val$child.onNext(obj);
            return;
        } else
        {
            request(1L);
            return;
        }
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatorskipwhile;
        val$child = subscriber1;
        super(Subscriber.this);
        skipping = true;
    }
}
