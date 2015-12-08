// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import rx.Subscriber;
import rx.functions.Func1;

public final class OperatorDistinct
    implements rx.Observable.Operator
{

    final Func1 keySelector;

    public OperatorDistinct(Func1 func1)
    {
        keySelector = func1;
    }

    public static OperatorDistinct instance()
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

            Set keyMemory;
            final OperatorDistinct this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                keyMemory = null;
                child.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                keyMemory = null;
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                Object obj1 = keySelector.call(obj);
                if (keyMemory.add(obj1))
                {
                    child.onNext(obj);
                    return;
                } else
                {
                    request(1L);
                    return;
                }
            }

            
            {
                this$0 = OperatorDistinct.this;
                child = subscriber1;
                super(final_subscriber);
                keyMemory = new HashSet();
            }
        };
    }

    private class Holder
    {

        static final OperatorDistinct INSTANCE = new OperatorDistinct(UtilityFunctions.identity());


        private Holder()
        {
        }
    }

}
