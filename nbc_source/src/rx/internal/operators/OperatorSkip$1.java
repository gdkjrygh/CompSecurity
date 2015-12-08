// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSkip

class skipped extends Subscriber
{

    int skipped;
    final OperatorSkip this$0;
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
        if (skipped >= toSkip)
        {
            val$child.onNext(obj);
            return;
        } else
        {
            skipped = skipped + 1;
            return;
        }
    }

    public void setProducer(Producer producer)
    {
        val$child.setProducer(producer);
        producer.request(toSkip);
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatorskip;
        val$child = subscriber1;
        super(Subscriber.this);
        skipped = 0;
    }
}
