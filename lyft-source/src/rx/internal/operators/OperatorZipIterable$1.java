// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import rx.Subscriber;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorZipIterable

class val.iterator extends Subscriber
{

    boolean once;
    final OperatorZipIterable this$0;
    final Iterator val$iterator;
    final Subscriber val$subscriber;

    public void onCompleted()
    {
        if (once)
        {
            return;
        } else
        {
            once = true;
            val$subscriber.onCompleted();
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        try
        {
            val$subscriber.onNext(zipFunction.call(obj, val$iterator.next()));
            if (!val$iterator.hasNext())
            {
                onCompleted();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
        }
    }

    (Iterator iterator1)
    {
        this$0 = final_operatorzipiterable;
        val$subscriber = Subscriber.this;
        val$iterator = iterator1;
        super(final_subscriber1);
    }
}
