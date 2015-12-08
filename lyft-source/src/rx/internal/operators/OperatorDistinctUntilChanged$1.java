// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorDistinctUntilChanged

class val.child extends Subscriber
{

    boolean hasPrevious;
    Object previousKey;
    final OperatorDistinctUntilChanged this$0;
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
        Object obj1 = previousKey;
        Object obj2 = keySelector.call(obj);
        previousKey = obj2;
        if (hasPrevious)
        {
            if (obj1 != obj2 && (obj2 == null || !obj2.equals(obj1)))
            {
                val$child.onNext(obj);
                return;
            } else
            {
                request(1L);
                return;
            }
        } else
        {
            hasPrevious = true;
            val$child.onNext(obj);
            return;
        }
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatordistinctuntilchanged;
        val$child = subscriber1;
        super(Subscriber.this);
    }
}
