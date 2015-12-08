// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;

public final class OperatorFinally
    implements rx.Observable.Operator
{

    final Action0 action;

    public OperatorFinally(Action0 action0)
    {
        action = action0;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            final OperatorFinally this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                child.onCompleted();
                action.call();
                return;
                Exception exception;
                exception;
                action.call();
                throw exception;
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
                action.call();
                return;
                throwable;
                action.call();
                throw throwable;
            }

            public void onNext(Object obj)
            {
                child.onNext(obj);
            }

            
            {
                this$0 = OperatorFinally.this;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }
}
