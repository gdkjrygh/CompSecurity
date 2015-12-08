// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.functions.Func2;

public final class OperatorTakeWhile
    implements rx.Observable.Operator
{

    private final Func2 predicate;

    public OperatorTakeWhile(final Func1 underlying)
    {
        this(new Func2() {

            final Func1 val$underlying;

            public Boolean call(Object obj, Integer integer)
            {
                return (Boolean)underlying.call(obj);
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call(obj, (Integer)obj1);
            }

            
            {
                underlying = func1;
                super();
            }
        });
    }

    public OperatorTakeWhile(Func2 func2)
    {
        predicate = func2;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        Subscriber subscriber = new Subscriber(false, final_subscriber1) {

            private int counter;
            private boolean done;
            final OperatorTakeWhile this$0;
            final Subscriber val$subscriber;

            public void onCompleted()
            {
                if (!done)
                {
                    subscriber.onCompleted();
                }
            }

            public void onError(Throwable throwable)
            {
                if (!done)
                {
                    subscriber.onError(throwable);
                }
            }

            public void onNext(Object obj)
            {
                boolean flag;
                try
                {
                    Func2 func2 = predicate;
                    int i = counter;
                    counter = i + 1;
                    flag = ((Boolean)func2.call(obj, Integer.valueOf(i))).booleanValue();
                }
                catch (Throwable throwable)
                {
                    done = true;
                    Exceptions.throwIfFatal(throwable);
                    subscriber.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                    unsubscribe();
                    return;
                }
                if (flag)
                {
                    subscriber.onNext(obj);
                    return;
                } else
                {
                    done = true;
                    subscriber.onCompleted();
                    unsubscribe();
                    return;
                }
            }

            
            {
                this$0 = OperatorTakeWhile.this;
                subscriber = subscriber2;
                super(final_subscriber1, flag);
                counter = 0;
                done = false;
            }
        };
        final_subscriber1.add(subscriber);
        return subscriber;
    }

}
