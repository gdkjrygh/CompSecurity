// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.reflect.Proxy;
import java.util.Random;

// Referenced classes of package retrofit:
//            Utils, RestAdapter

public final class MockRestAdapter
{

    private static final int DEFAULT_DELAY_MS = 2000;
    private static final int DEFAULT_ERROR_PCT = 3;
    private static final int DEFAULT_VARIANCE_PCT = 40;
    private static final int ERROR_DELAY_FACTOR = 3;
    private int delayMs;
    private int errorPct;
    private ValueChangeListener listener;
    private MockRxSupport mockRxSupport;
    final Random random = new Random();
    private final RestAdapter restAdapter;
    private int variancePct;

    private MockRestAdapter(RestAdapter restadapter)
    {
        listener = ValueChangeListener.EMPTY;
        delayMs = 2000;
        variancePct = 40;
        errorPct = 3;
        restAdapter = restadapter;
    }

    public static MockRestAdapter from(RestAdapter restadapter)
    {
        return new MockRestAdapter(restadapter);
    }

    private void notifyValueChangeListener()
    {
        listener.onMockValuesChanged(delayMs, variancePct, errorPct);
    }

    private static void sleep(long l)
    {
        long l2 = uptimeMillis();
        boolean flag = false;
        long l1 = l;
        while (l1 > 0L) 
        {
            try
            {
                Thread.sleep(l1);
            }
            catch (InterruptedException interruptedexception)
            {
                flag = true;
            }
            l1 = (l2 + l) - uptimeMillis();
        }
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
    }

    private static long uptimeMillis()
    {
        return System.nanoTime() / 0xf4240L;
    }

    public final int calculateDelayForCall()
    {
        float f = (float)variancePct / 100F;
        float f1 = 1.0F - f;
        return (int)((((f + 1.0F) - f1) * random.nextFloat() + f1) * (float)delayMs);
    }

    public final int calculateDelayForError()
    {
        return random.nextInt(delayMs * 3);
    }

    public final boolean calculateIsFailure()
    {
        return random.nextInt(100) + 1 <= errorPct;
    }

    public final Object create(Class class1, Object obj)
    {
        Utils.validateServiceClass(class1);
        ClassLoader classloader = class1.getClassLoader();
        obj = new MockHandler(obj, restAdapter.getMethodInfoCache(class1));
        return Proxy.newProxyInstance(classloader, new Class[] {
            class1
        }, ((InvocationHandler) (obj)));
    }

    public final long getDelay()
    {
        return (long)delayMs;
    }

    public final int getErrorPercentage()
    {
        return errorPct;
    }

    public final int getVariancePercentage()
    {
        return variancePct;
    }

    public final void setDelay(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("Delay must be positive value.");
        }
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Delay value too large. Max: 2147483647");
        }
        if ((long)delayMs != l)
        {
            delayMs = (int)l;
            notifyValueChangeListener();
        }
    }

    public final void setErrorPercentage(int i)
    {
        if (i < 0 || i > 100)
        {
            throw new IllegalArgumentException("Error percentage must be between 0 and 100.");
        }
        if (errorPct != i)
        {
            errorPct = i;
            notifyValueChangeListener();
        }
    }

    public final void setValueChangeListener(ValueChangeListener valuechangelistener)
    {
        listener = valuechangelistener;
    }

    public final void setVariancePercentage(int i)
    {
        if (i < 0 || i > 100)
        {
            throw new IllegalArgumentException("Variance percentage must be between 0 and 100.");
        }
        if (variancePct != i)
        {
            variancePct = i;
            notifyValueChangeListener();
        }
    }




/*
    static MockRxSupport access$102(MockRestAdapter mockrestadapter, MockRxSupport mockrxsupport)
    {
        mockrestadapter.mockRxSupport = mockrxsupport;
        return mockrxsupport;
    }

*/


    private class ValueChangeListener
    {

        public static final ValueChangeListener EMPTY = new _cls1();

        public abstract void onMockValuesChanged(long l, int i, int j);


        class _cls1
            implements ValueChangeListener
        {

            public final void onMockValuesChanged(long l, int i, int j)
            {
            }

                _cls1()
                {
                }
        }

    }


    private class MockHandler
        implements InvocationHandler
    {

        private final Map methodInfoCache;
        private final Object mockService;
        final MockRestAdapter this$0;

        private Request buildRequest(RestMethodInfo restmethodinfo, RequestInterceptor requestinterceptor, Object aobj[])
        {
            restmethodinfo.init();
            restmethodinfo = new RequestBuilder(restAdapter.server.getUrl(), restmethodinfo, restAdapter.converter);
            restmethodinfo.setArguments(aobj);
            requestinterceptor.intercept(restmethodinfo);
            requestinterceptor = restmethodinfo.build();
            restmethodinfo = requestinterceptor;
            if (restAdapter.logLevel.log())
            {
                restmethodinfo = restAdapter.logAndReplaceRequest("MOCK", requestinterceptor, aobj);
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

                    final MockHandler this$1;
                    final Throwable val$throwable;

                    public void run()
                    {
                        throw new RuntimeException(throwable);
                    }

                _cls2()
                {
                    this$1 = MockHandler.this;
                    throwable = throwable1;
                    super();
                }
                }

                restAdapter.callbackExecutor.execute(new _cls2());
                return;
            }
            url = callback.getUrl();
            callback = (Callback)args[args.length - 1];
            if (calculateIsFailure())
            {
                MockRestAdapter.sleep(calculateDelayForError());
                e = new IOException("Mock network error!");
                if (restAdapter.logLevel.log())
                {
                    restAdapter.logException(e, url);
                }
                e = RetrofitError.networkError(url, e);
                args = restAdapter.errorHandler.handleError(e);
                class _cls3
                    implements Runnable
                {

                    final MockHandler this$1;
                    final Callback val$callback;
                    final RetrofitError val$e;

                    public void run()
                    {
                        callback.failure(e);
                    }

                _cls3()
                {
                    this$1 = MockHandler.this;
                    callback = callback1;
                    e = retrofiterror;
                    super();
                }
                }

                if (args != e)
                {
                    e = RetrofitError.unexpectedError(e.getUrl(), ((Throwable) (args)));
                }
                restAdapter.callbackExecutor.execute(new _cls3());
                return;
            } else
            {
                final int callDelay = calculateDelayForCall();
                MockRestAdapter.sleep(callDelay);
                class _cls4
                    implements Runnable
                {

                    final MockHandler this$1;
                    final Object val$args[];
                    final int val$callDelay;
                    final Callback val$callback;
                    final RestMethodInfo val$methodInfo;
                    final String val$url;

                    public void run()
                    {
                        Object obj = restAdapter.logLevel;
                        Object obj1 = restAdapter.log;
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
                        retrofit.client.Response response = ((MockHttpException) (obj2)).toResponse(restAdapter.converter);
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
                        obj1 = restAdapter.errorHandler.handleError(((RetrofitError) (obj)));
                        if (obj1 != obj)
                        {
                            obj = RetrofitError.unexpectedError(((RetrofitError) (obj)).getUrl(), ((Throwable) (obj1)));
                        }
                        callback.failure(((RetrofitError) (obj)));
                    }

                _cls4()
                {
                    this$1 = MockHandler.this;
                    methodInfo = restmethodinfo;
                    args = aobj;
                    url = s;
                    callDelay = i;
                    callback = callback1;
                    super();
                }
                }

                restAdapter.callbackExecutor.execute(new _cls4());
                return;
            }
        }

        private Object invokeSync(RestMethodInfo restmethodinfo, RequestInterceptor requestinterceptor, Object aobj[])
        {
            requestinterceptor = buildRequest(restmethodinfo, requestinterceptor, aobj).getUrl();
            if (calculateIsFailure())
            {
                MockRestAdapter.sleep(calculateDelayForError());
                restmethodinfo = new IOException("Mock network error!");
                if (restAdapter.logLevel.log())
                {
                    restAdapter.logException(restmethodinfo, requestinterceptor);
                }
                throw RetrofitError.networkError(requestinterceptor, restmethodinfo);
            }
            RestAdapter.LogLevel loglevel = restAdapter.logLevel;
            RestAdapter.Log log = restAdapter.log;
            int i = calculateDelayForCall();
            long l = System.nanoTime();
            try
            {
                aobj = ((Object []) (restmethodinfo.method.invoke(mockService, aobj)));
                long l1 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
                MockRestAdapter.sleep((long)i - l1);
                if (loglevel.log())
                {
                    log.log(String.format("<--- MOCK 200 %s (%sms)", new Object[] {
                        requestinterceptor, Integer.valueOf(i)
                    }));
                    if (loglevel.ordinal() >= RestAdapter.LogLevel.FULL.ordinal())
                    {
                        log.log(String.valueOf(((Object) (aobj))));
                        log.log("<--- END MOCK");
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
                retrofit.client.Response response = ((MockHttpException) (aobj)).toResponse(restAdapter.converter);
                l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
                MockRestAdapter.sleep((long)i - l);
                if (loglevel.log())
                {
                    log.log(String.format("<---- MOCK %s %s (%sms)", new Object[] {
                        Integer.valueOf(((MockHttpException) (aobj)).code), requestinterceptor, Integer.valueOf(i)
                    }));
                    if (loglevel.ordinal() >= RestAdapter.LogLevel.FULL.ordinal())
                    {
                        log.log((new StringBuilder()).append(((MockHttpException) (aobj)).responseBody).toString());
                        log.log("<--- END MOCK");
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
                            methodInfo = invokeSync(((RestMethodInfo) (methodInfo)), restAdapter.requestInterceptor, args);
                        }
                        // Misplaced declaration of an exception variable
                        catch (final Object methodInfo)
                        {
                            interceptorTape = restAdapter.errorHandler.handleError(((RetrofitError) (methodInfo)));
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
                    if (restAdapter.httpExecutor == null || restAdapter.callbackExecutor == null)
                    {
                        throw new IllegalStateException("Asynchronous invocation requires calling setExecutors.");
                    }
                    interceptorTape = new RequestInterceptorTape();
                    restAdapter.requestInterceptor.intercept(interceptorTape);
                    if (!((RestMethodInfo) (methodInfo)).isObservable)
                    {
                        break label0;
                    }
                    if (mockRxSupport == null)
                    {
                        if (!Platform.HAS_RX_JAVA)
                        {
                            break label1;
                        }
                        mockRxSupport = new MockRxSupport(restAdapter);
                    }
                    return mockRxSupport.createMockObservable(this, ((RestMethodInfo) (methodInfo)), interceptorTape, args);
                }
                throw new IllegalStateException("Observable method found but no RxJava on classpath");
            }
            class _cls1
                implements Runnable
            {

                final MockHandler this$1;
                final Object val$args[];
                final RequestInterceptorTape val$interceptorTape;
                final RestMethodInfo val$methodInfo;

                public void run()
                {
                    invokeAsync(methodInfo, interceptorTape, args);
                }

                _cls1()
                {
                    this$1 = MockHandler.this;
                    methodInfo = restmethodinfo;
                    interceptorTape = requestinterceptortape;
                    args = aobj;
                    super();
                }
            }

            restAdapter.httpExecutor.execute(new _cls1());
            return null;
        }




        public MockHandler(Object obj, Map map)
        {
            this$0 = MockRestAdapter.this;
            super();
            mockService = obj;
            methodInfoCache = map;
        }

        private class MockRxSupport
        {

            private final ErrorHandler errorHandler;
            private final Scheduler httpScheduler;

            Observable createMockObservable(MockHandler mockhandler, final RestMethodInfo methodInfo, final RequestInterceptor interceptor, final Object args[])
            {
                class _cls1
                    implements Func1
                {

                    final MockRxSupport this$0;
                    final Object val$args[];
                    final RequestInterceptor val$interceptor;
                    final RestMethodInfo val$methodInfo;
                    final MockHandler val$mockHandler;

                    public volatile Object call(Object obj)
                    {
                        return call((String)obj);
                    }

                    public Observable call(String s)
                    {
                        try
                        {
                            s = (Observable)mockHandler.invokeSync(methodInfo, interceptor, args);
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


// JavaClassFileOutputException: Invalid index accessing method local variables table of <init>
                }

                return Observable.just("nothing").flatMap(mockhandler. new _cls1()).subscribeOn(httpScheduler);
            }


            MockRxSupport(RestAdapter restadapter)
            {
                httpScheduler = Schedulers.from(restadapter.httpExecutor);
                errorHandler = restadapter.errorHandler;
            }
        }

    }

}
