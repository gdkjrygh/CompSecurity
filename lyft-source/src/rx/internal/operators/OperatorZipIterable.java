// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import rx.Subscriber;
import rx.functions.Func2;
import rx.observers.Subscribers;

public final class OperatorZipIterable
    implements rx.Observable.Operator
{

    final Iterable iterable;
    final Func2 zipFunction;

    public OperatorZipIterable(Iterable iterable1, Func2 func2)
    {
        iterable = iterable1;
        zipFunction = func2;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        Iterator iterator = iterable.iterator();
        Subscriber subscriber;
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        final_subscriber1.onCompleted();
        subscriber = Subscribers.empty();
        return subscriber;
        Throwable throwable;
        throwable;
        final_subscriber1.onError(throwable);
        return new Subscriber(iterator) {

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
                    subscriber.onCompleted();
                    return;
                }
            }

            public void onError(Throwable throwable1)
            {
                subscriber.onError(throwable1);
            }

            public void onNext(Object obj)
            {
                try
                {
                    subscriber.onNext(zipFunction.call(obj, iterator.next()));
                    if (!iterator.hasNext())
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

            
            {
                this$0 = OperatorZipIterable.this;
                subscriber = subscriber2;
                iterator = iterator1;
                super(final_subscriber1);
            }
        };
    }
}
