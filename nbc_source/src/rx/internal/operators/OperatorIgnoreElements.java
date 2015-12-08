// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

public class OperatorIgnoreElements
    implements rx.Observable.Operator
{
    private static class Holder
    {

        static final OperatorIgnoreElements INSTANCE = new OperatorIgnoreElements();


        private Holder()
        {
        }
    }


    private OperatorIgnoreElements()
    {
    }


    public static OperatorIgnoreElements instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber child)
    {
        Subscriber subscriber = new Subscriber() {

            final OperatorIgnoreElements this$0;
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
            }

            
            {
                this$0 = OperatorIgnoreElements.this;
                child = subscriber;
                super();
            }
        };
        child.add(subscriber);
        return subscriber;
    }
}
