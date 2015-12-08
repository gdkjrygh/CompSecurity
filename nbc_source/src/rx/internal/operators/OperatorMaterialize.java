// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Subscriber;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

public final class OperatorMaterialize
    implements rx.Observable.Operator
{
    private static final class Holder
    {

        static final OperatorMaterialize INSTANCE = new OperatorMaterialize();


        private Holder()
        {
        }
    }


    private OperatorMaterialize()
    {
    }


    public static OperatorMaterialize instance()
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

            final OperatorMaterialize this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                child.onNext(Notification.createOnCompleted());
                child.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
                child.onNext(Notification.createOnError(throwable));
                child.onCompleted();
            }

            public void onNext(Object obj)
            {
                child.onNext(Notification.createOnNext(obj));
            }

            
            {
                this$0 = OperatorMaterialize.this;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }
}
