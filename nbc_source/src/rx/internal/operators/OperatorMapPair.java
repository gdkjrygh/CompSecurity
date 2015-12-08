// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.functions.Func2;

public final class OperatorMapPair
    implements rx.Observable.Operator
{

    final Func1 collectionSelector;
    final Func2 resultSelector;

    public OperatorMapPair(Func1 func1, Func2 func2)
    {
        collectionSelector = func1;
        resultSelector = func2;
    }

    public static Func1 convertSelector(Func1 func1)
    {
        return new Func1(func1) {

            final Func1 val$selector;

            public volatile Object call(Object obj)
            {
                return call(obj);
            }

            public Observable call(Object obj)
            {
                return Observable.from((Iterable)selector.call(obj));
            }

            
            {
                selector = func1;
                super();
            }
        };
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            final OperatorMapPair this$0;
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
                    o.onNext(((Observable)collectionSelector.call(obj)).map(((_cls1) (obj)). new Func1() {

                        final _cls2 this$1;
                        final Object val$outer;

                        public Object call(Object obj)
                        {
                            return resultSelector.call(outer, obj);
                        }

            
            {
                this$1 = final__pcls2;
                outer = Object.this;
                super();
            }
                    }));
                    return;
                }
                catch (Throwable throwable)
                {
                    o.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                }
            }

            
            {
                this$0 = OperatorMapPair.this;
                o = subscriber1;
                super(final_subscriber);
            }
        };
    }
}
