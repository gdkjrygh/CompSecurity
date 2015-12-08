// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;

// Referenced classes of package retrofit:
//            RestAdapter, ErrorHandler, RestMethodInfo, RequestInterceptor

class errorHandler
{

    private final ErrorHandler errorHandler;
    private final Scheduler httpScheduler;

    Observable createMockObservable(final errorHandler mockHandler, final RestMethodInfo methodInfo, final RequestInterceptor interceptor, final Object args[])
    {
        class _cls1
            implements Func1
        {

            final MockRestAdapter.MockRxSupport this$0;
            final Object val$args[];
            final RequestInterceptor val$interceptor;
            final RestMethodInfo val$methodInfo;
            final MockRestAdapter.MockHandler val$mockHandler;

            public volatile Object call(Object obj)
            {
                return call((String)obj);
            }

            public Observable call(String s)
            {
                try
                {
                    s = (Observable)MockRestAdapter.MockHandler.access$500(mockHandler, methodInfo, interceptor, args);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return Observable.error(errorHandler.handleError(s));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return Observable.error(s);
                }
                return s;
            }

            _cls1()
            {
                this$0 = MockRestAdapter.MockRxSupport.this;
                mockHandler = mockhandler;
                methodInfo = restmethodinfo;
                interceptor = requestinterceptor;
                args = aobj;
                super();
            }
        }

        return Observable.just("nothing").flatMap(new _cls1()).subscribeOn(httpScheduler);
    }


    _cls1(RestAdapter restadapter)
    {
        httpScheduler = Schedulers.from(restadapter.httpExecutor);
        errorHandler = restadapter.errorHandler;
    }
}
