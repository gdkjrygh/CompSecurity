// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorDistinct

class keyMemory extends Subscriber
{

    Set keyMemory;
    final OperatorDistinct this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        keyMemory = null;
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        keyMemory = null;
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        Object obj1 = keySelector.call(obj);
        if (keyMemory.add(obj1))
        {
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
        this$0 = final_operatordistinct;
        val$child = subscriber1;
        super(Subscriber.this);
        keyMemory = new HashSet();
    }
}
