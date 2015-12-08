// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;

public final class OperatorMap
    implements rx.Observable.Operator
{

    private final Func1 transformer;

    public OperatorMap(Func1 func1)
    {
        transformer = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            final OperatorMap this$0;
            final Subscriber val$o;

            public void onCompleted()
            {
                o.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                o.onError(throwable);
            }

            public void onNext(Object obj)
            {
                try
                {
                    o.onNext(transformer.call(obj));
                    return;
                }
                catch (Throwable throwable)
                {
                    Exceptions.throwIfFatal(throwable);
                    onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                    return;
                }
            }

            
            {
                this$0 = OperatorMap.this;
                o = subscriber1;
                super(final_subscriber);
            }
        };
    }

}
