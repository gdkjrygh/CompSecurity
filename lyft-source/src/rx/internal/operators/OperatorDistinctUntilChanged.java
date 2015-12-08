// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Func1;

public final class OperatorDistinctUntilChanged
    implements rx.Observable.Operator
{

    final Func1 keySelector;

    public OperatorDistinctUntilChanged(Func1 func1)
    {
        keySelector = func1;
    }

    public static OperatorDistinctUntilChanged instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            boolean hasPrevious;
            Object previousKey;
            final OperatorDistinctUntilChanged this$0;
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
                Object obj1 = previousKey;
                Object obj2 = keySelector.call(obj);
                previousKey = obj2;
                if (hasPrevious)
                {
                    if (obj1 != obj2 && (obj2 == null || !obj2.equals(obj1)))
                    {
                        child.onNext(obj);
                        return;
                    } else
                    {
                        request(1L);
                        return;
                    }
                } else
                {
                    hasPrevious = true;
                    child.onNext(obj);
                    return;
                }
            }

            
            {
                this$0 = OperatorDistinctUntilChanged.this;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }

    private class Holder
    {

        static final OperatorDistinctUntilChanged INSTANCE = new OperatorDistinctUntilChanged(UtilityFunctions.identity());


        private Holder()
        {
        }
    }

}
