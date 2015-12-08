// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;

public final class OperatorFilter
    implements rx.Observable.Operator
{

    private final Func1 predicate;

    public OperatorFilter(Func1 func1)
    {
        predicate = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            final OperatorFilter this$0;
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
                if (((Boolean)predicate.call(obj)).booleanValue())
                {
                    child.onNext(obj);
                    return;
                }
                try
                {
                    request(1L);
                    return;
                }
                catch (Throwable throwable)
                {
                    child.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                }
                return;
            }

            
            {
                this$0 = OperatorFilter.this;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }

}
