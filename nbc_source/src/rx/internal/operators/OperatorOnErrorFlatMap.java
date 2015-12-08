// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

public final class OperatorOnErrorFlatMap
    implements rx.Observable.Operator
{

    private final Func1 resumeFunction;

    public OperatorOnErrorFlatMap(Func1 func1)
    {
        resumeFunction = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            final OperatorOnErrorFlatMap this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                child.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                try
                {
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
                    ((Observable)resumeFunction.call(OnErrorThrowable.from(throwable))).unsafeSubscribe(new Subscriber() {

                        final _cls1 this$1;

                        public void onCompleted()
                        {
                        }

                        public void onError(Throwable throwable)
                        {
                            child.onError(throwable);
                        }

                        public void onNext(Object obj)
                        {
                            child.onNext(obj);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable)
                {
                    child.onError(throwable);
                }
            }

            public void onNext(Object obj)
            {
                child.onNext(obj);
            }

            
            {
                this$0 = OperatorOnErrorFlatMap.this;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }

}
