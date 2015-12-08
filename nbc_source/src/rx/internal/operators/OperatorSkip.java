// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;

public final class OperatorSkip
    implements rx.Observable.Operator
{

    final int toSkip;

    public OperatorSkip(int i)
    {
        toSkip = i;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            int skipped;
            final OperatorSkip this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                child.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                if (skipped >= toSkip)
                {
                    child.onNext(obj);
                    return;
                } else
                {
                    skipped = skipped + 1;
                    return;
                }
            }

            public void setProducer(Producer producer)
            {
                child.setProducer(producer);
                producer.request(toSkip);
            }

            
            {
                this$0 = OperatorSkip.this;
                child = subscriber1;
                super(final_subscriber);
                skipped = 0;
            }
        };
    }
}
