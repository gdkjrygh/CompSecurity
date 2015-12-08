// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import rx.Observable;
import rx.Subscriber;
import rx.subscriptions.Subscriptions;

// Referenced classes of package retrofit:
//            ErrorHandler, RequestInterceptor, RequestInterceptorTape, ResponseWrapper, 
//            RetrofitError

final class RxSupport
{
    static interface Invoker
    {

        public abstract ResponseWrapper invoke(RequestInterceptor requestinterceptor);
    }


    private final ErrorHandler errorHandler;
    private final Executor executor;
    private final RequestInterceptor requestInterceptor;

    RxSupport(Executor executor1, ErrorHandler errorhandler, RequestInterceptor requestinterceptor)
    {
        executor = executor1;
        errorHandler = errorhandler;
        requestInterceptor = requestinterceptor;
    }

    private Runnable getRunnable(final Subscriber subscriber, final Invoker invoker, final RequestInterceptorTape interceptorTape)
    {
        return new Runnable() {

            final RxSupport this$0;
            final RequestInterceptorTape val$interceptorTape;
            final Invoker val$invoker;
            final Subscriber val$subscriber;

            public void run()
            {
                if (subscriber.isUnsubscribed())
                {
                    return;
                }
                try
                {
                    ResponseWrapper responsewrapper = invoker.invoke(interceptorTape);
                    subscriber.onNext(responsewrapper.responseBody);
                    subscriber.onCompleted();
                    return;
                }
                catch (RetrofitError retrofiterror)
                {
                    subscriber.onError(errorHandler.handleError(retrofiterror));
                }
                return;
            }

            
            {
                this$0 = RxSupport.this;
                subscriber = subscriber1;
                invoker = invoker1;
                interceptorTape = requestinterceptortape;
                super();
            }
        };
    }

    Observable createRequestObservable(final Invoker invoker)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final RxSupport this$0;
            final Invoker val$invoker;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Object obj = new RequestInterceptorTape();
                requestInterceptor.intercept(((RequestInterceptor.RequestFacade) (obj)));
                obj = new FutureTask(getRunnable(subscriber, invoker, ((RequestInterceptorTape) (obj))), null);
                subscriber.add(Subscriptions.from(((java.util.concurrent.Future) (obj))));
                executor.execute(((Runnable) (obj)));
            }

            
            {
                this$0 = RxSupport.this;
                invoker = invoker1;
                super();
            }
        });
    }




}
