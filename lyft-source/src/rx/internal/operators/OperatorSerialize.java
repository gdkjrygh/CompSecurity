// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.observers.SerializedSubscriber;

public final class OperatorSerialize
    implements rx.Observable.Operator
{

    private OperatorSerialize()
    {
    }


    public static OperatorSerialize instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new SerializedSubscriber(new Subscriber(final_subscriber) {

            final OperatorSerialize this$0;
            final Subscriber val$s;

            public void onCompleted()
            {
                s.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                s.onError(throwable);
            }

            public void onNext(Object obj)
            {
                s.onNext(obj);
            }

            
            {
                this$0 = OperatorSerialize.this;
                s = subscriber1;
                super(final_subscriber);
            }
        });
    }

    private class Holder
    {

        static final OperatorSerialize INSTANCE = new OperatorSerialize();


        private Holder()
        {
        }
    }

}
