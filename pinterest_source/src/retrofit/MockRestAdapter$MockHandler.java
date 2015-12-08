// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import retrofit.client.Request;

// Referenced classes of package retrofit:
//            RestMethodInfo, RequestBuilder, MockRestAdapter, RestAdapter, 
//            Endpoint, RequestInterceptor, Callback, RetrofitError, 
//            ErrorHandler, MockHttpException, MockHttpRetrofitError, RequestInterceptorTape, 
//            Platform

class methodInfoCache
    implements InvocationHandler
{

    private final Map methodInfoCache;
    private final Object mockService;
    final MockRestAdapter this$0;

    private Request buildRequest(RestMethodInfo restmethodinfo, RequestInterceptor requestinterceptor, Object aobj[])
    {
        restmethodinfo.init();
        restmethodinfo = new RequestBuilder(MockRestAdapter.access$000(MockRestAdapter.this).server.getUrl(), restmethodinfo, MockRestAdapter.access$000(MockRestAdapter.this).converter);
        restmethodinfo.setArguments(aobj);
        requestinterceptor.intercept(restmethodinfo);
        requestinterceptor = restmethodinfo.build();
        restmethodinfo = requestinterceptor;
        if (MockRestAdapter.access$000(MockRestAdapter.this).logLevel._mth0())
        {
            restmethodinfo = MockRestAdapter.access$000(MockRestAdapter.this).logAndReplaceRequest("MOCK", requestinterceptor, aobj);
        }
        return restmethodinfo;
    }

    private void invokeAsync(final RestMethodInfo e, final RequestInterceptor callback, final Object args[])
    {
        final String url;
        try
        {
            callback = buildRequest(e, callback, args);
        }
        // Misplaced declaration of an exception variable
        catch (final RestMethodInfo e)
        {
            class _cls2
                implements Runnable
            {

                final MockRestAdapter.MockHandler this$1;
                final Throwable val$throwable;

                public void run()
                {
                    throw new RuntimeException(throwable);
                }

            _cls2()
            {
                this$1 = MockRestAdapter.MockHandler.this;
                throwable = throwable1;
                super();
            }
            }

            MockRestAdapter.access$000(MockRestAdapter.this).callbackExecutor.execute(new _cls2());
            return;
        }
        url = callback.getUrl();
        callback = (Callback)args[args.length - 1];
        if (calculateIsFailure())
        {
            MockRestAdapter.access$300(calculateDelayForError());
            e = new IOException("Mock network error!");
            if (MockRestAdapter.access$000(MockRestAdapter.this).logLevel._mth0())
            {
                MockRestAdapter.access$000(MockRestAdapter.this).logException(e, url);
            }
            e = RetrofitError.networkError(url, e);
            args = MockRestAdapter.access$000(MockRestAdapter.this).errorHandler.handleError(e);
            class _cls3
                implements Runnable
            {

                final MockRestAdapter.MockHandler this$1;
                final Callback val$callback;
                final RetrofitError val$e;

                public void run()
                {
                    callback.failure(e);
                }

            _cls3()
            {
                this$1 = MockRestAdapter.MockHandler.this;
                callback = callback1;
                e = retrofiterror;
                super();
            }
            }

            if (args != e)
            {
                e = RetrofitError.unexpectedError(e.getUrl(), ((Throwable) (args)));
            }
            MockRestAdapter.access$000(MockRestAdapter.this).callbackExecutor.execute(new _cls3());
            return;
        } else
        {
            final int callDelay = calculateDelayForCall();
            MockRestAdapter.access$300(callDelay);
            class _cls4
                implements Runnable
            {

                final MockRestAdapter.MockHandler this$1;
                final Object val$args[];
                final int val$callDelay;
                final Callback val$callback;
                final RestMethodInfo val$methodInfo;
                final String val$url;

                public void run()
                {
                    Object obj = MockRestAdapter.access$000(this$0).logLevel;
                    Object obj1 = MockRestAdapter.access$000(this$0).log;
                    Object obj2;
                    try
                    {
                        methodInfo.method.invoke(mockService, args);
                        if (((RestAdapter.LogLevel) (obj)).log())
                        {
                            ((RestAdapter.Log) (obj1)).log(String.format("<--- MOCK 200 %s (%sms)", new Object[] {
                                url, Integer.valueOf(callDelay)
                            }));
                        }
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        obj2 = throwable.getCause();
                    }
                    if (!(obj2 instanceof MockHttpException))
                    {
                        if (obj2 instanceof RuntimeException)
                        {
                            throw (RuntimeException)obj2;
                        } else
                        {
                            throw new RuntimeException(((Throwable) (obj2)));
                        }
                    }
                    obj2 = (MockHttpException)obj2;
                    retrofit.client.Response response = ((MockHttpException) (obj2)).toResponse(MockRestAdapter.access$000(this$0).converter);
                    if (((RestAdapter.LogLevel) (obj)).log())
                    {
                        ((RestAdapter.Log) (obj1)).log(String.format("<---- MOCK %s %s (%sms)", new Object[] {
                            Integer.valueOf(((MockHttpException) (obj2)).code), url, Integer.valueOf(callDelay)
                        }));
                        if (((RestAdapter.LogLevel) (obj)).ordinal() >= RestAdapter.LogLevel.FULL.ordinal())
                        {
                            ((RestAdapter.Log) (obj1)).log(String.valueOf(((MockHttpException) (obj2)).responseBody));
                            ((RestAdapter.Log) (obj1)).log("<--- END MOCK");
                        }
                    }
                    obj = new MockHttpRetrofitError(((MockHttpException) (obj2)).getMessage(), url, response, ((MockHttpException) (obj2)).responseBody, methodInfo.responseObjectType);
                    obj1 = MockRestAdapter.access$000(this$0).errorHandler.handleError(((RetrofitError) (obj)));
                    if (obj1 != obj)
                    {
                        obj = RetrofitError.unexpectedError(((RetrofitError) (obj)).getUrl(), ((Throwable) (obj1)));
                    }
                    callback.failure(((RetrofitError) (obj)));
                }

            _cls4()
            {
                this$1 = MockRestAdapter.MockHandler.this;
                methodInfo = restmethodinfo;
                args = aobj;
                url = s;
                callDelay = i;
                callback = callback1;
                super();
            }
            }

            MockRestAdapter.access$000(MockRestAdapter.this).callbackExecutor.execute(new _cls4());
            return;
        }
    }

    private Object invokeSync(RestMethodInfo restmethodinfo, RequestInterceptor requestinterceptor, Object aobj[])
    {
        requestinterceptor = buildRequest(restmethodinfo, requestinterceptor, aobj).getUrl();
        if (calculateIsFailure())
        {
            MockRestAdapter.access$300(calculateDelayForError());
            restmethodinfo = new IOException("Mock network error!");
            if (MockRestAdapter.access$000(MockRestAdapter.this).logLevel._mth0())
            {
                MockRestAdapter.access$000(MockRestAdapter.this).logException(restmethodinfo, requestinterceptor);
            }
            throw RetrofitError.networkError(requestinterceptor, restmethodinfo);
        }
        _cls4 _lcls4 = MockRestAdapter.access$000(MockRestAdapter.this).logLevel;
        _cls4 _lcls4_1 = MockRestAdapter.access$000(MockRestAdapter.this).log;
        int i = calculateDelayForCall();
        long l = System.nanoTime();
        try
        {
            aobj = ((Object []) (restmethodinfo.method.invoke(mockService, aobj)));
            long l1 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
            MockRestAdapter.access$300((long)i - l1);
            if (_lcls4.s())
            {
                _lcls4_1.s(String.format("<--- MOCK 200 %s (%sms)", new Object[] {
                    requestinterceptor, Integer.valueOf(i)
                }));
                if (_lcls4.() >= .())
                {
                    _lcls4_1.(String.valueOf(((Object) (aobj))));
                    _lcls4_1.("<--- END MOCK");
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            aobj = ((InvocationTargetException) (aobj)).getCause();
            if (!(aobj instanceof MockHttpException))
            {
                throw aobj;
            }
            aobj = (MockHttpException)aobj;
            retrofit.client.Response response = ((MockHttpException) (aobj)).toResponse(MockRestAdapter.access$000(MockRestAdapter.this).converter);
            l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
            MockRestAdapter.access$300((long)i - l);
            if (_lcls4.s())
            {
                _lcls4_1.s(String.format("<---- MOCK %s %s (%sms)", new Object[] {
                    Integer.valueOf(((MockHttpException) (aobj)).code), requestinterceptor, Integer.valueOf(i)
                }));
                if (_lcls4.() >= .())
                {
                    _lcls4_1.((new StringBuilder()).append(((MockHttpException) (aobj)).responseBody).toString());
                    _lcls4_1.dy("<--- END MOCK");
                }
            }
            throw new MockHttpRetrofitError(((MockHttpException) (aobj)).reason, requestinterceptor, response, ((MockHttpException) (aobj)).responseBody, restmethodinfo.responseObjectType);
        }
        return ((Object) (aobj));
    }

    public Object invoke(final Object methodInfo, final Method interceptorTape, final Object args[])
    {
label0:
        {
label1:
            {
                if (interceptorTape.getDeclaringClass() == java/lang/Object)
                {
                    return interceptorTape.invoke(this, args);
                }
                methodInfo = RestAdapter.getMethodInfo(methodInfoCache, interceptorTape);
                if (((RestMethodInfo) (methodInfo)).isSynchronous)
                {
                    try
                    {
                        methodInfo = invokeSync(((RestMethodInfo) (methodInfo)), MockRestAdapter.access$000(MockRestAdapter.this).requestInterceptor, args);
                    }
                    // Misplaced declaration of an exception variable
                    catch (final Object methodInfo)
                    {
                        interceptorTape = MockRestAdapter.access$000(MockRestAdapter.this).errorHandler.handleError(((RetrofitError) (methodInfo)));
                        if (interceptorTape == null)
                        {
                            throw new IllegalStateException("Error handler returned null for wrapped exception.", ((Throwable) (methodInfo)));
                        } else
                        {
                            throw interceptorTape;
                        }
                    }
                    return methodInfo;
                }
                if (MockRestAdapter.access$000(MockRestAdapter.this).httpExecutor == null || MockRestAdapter.access$000(MockRestAdapter.this).callbackExecutor == null)
                {
                    throw new IllegalStateException("Asynchronous invocation requires calling setExecutors.");
                }
                interceptorTape = new RequestInterceptorTape();
                MockRestAdapter.access$000(MockRestAdapter.this).requestInterceptor.intercept(interceptorTape);
                if (!((RestMethodInfo) (methodInfo)).isObservable)
                {
                    break label0;
                }
                if (MockRestAdapter.access$100(MockRestAdapter.this) == null)
                {
                    if (!Platform.HAS_RX_JAVA)
                    {
                        break label1;
                    }
                    MockRestAdapter.access$102(MockRestAdapter.this, new t(MockRestAdapter.access$000(MockRestAdapter.this)));
                }
                return MockRestAdapter.access$100(MockRestAdapter.this).createMockObservable(this, ((RestMethodInfo) (methodInfo)), interceptorTape, args);
            }
            throw new IllegalStateException("Observable method found but no RxJava on classpath");
        }
        class _cls1
            implements Runnable
        {

            final MockRestAdapter.MockHandler this$1;
            final Object val$args[];
            final RequestInterceptorTape val$interceptorTape;
            final RestMethodInfo val$methodInfo;

            public void run()
            {
                invokeAsync(methodInfo, interceptorTape, args);
            }

            _cls1()
            {
                this$1 = MockRestAdapter.MockHandler.this;
                methodInfo = restmethodinfo;
                interceptorTape = requestinterceptortape;
                args = aobj;
                super();
            }
        }

        MockRestAdapter.access$000(MockRestAdapter.this).httpExecutor.execute(new _cls1());
        return null;
    }




    public eption(Object obj, Map map)
    {
        this$0 = MockRestAdapter.this;
        super();
        mockService = obj;
        methodInfoCache = map;
    }
}
