// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;

public class OperatorCast
    implements rx.Observable.Operator
{

    private final Class castClass;

    public OperatorCast(Class class1)
    {
        castClass = class1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            final OperatorCast this$0;
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
                    o.onNext(castClass.cast(obj));
                    return;
                }
                catch (Throwable throwable)
                {
                    onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                }
            }

            
            {
                this$0 = OperatorCast.this;
                o = subscriber1;
                super(final_subscriber);
            }
        };
    }

}
