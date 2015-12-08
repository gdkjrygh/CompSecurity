// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import retrofit.client.Client;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;

// Referenced classes of package retrofit:
//            RestAdapter, RetrofitError, RestMethodInfo, Endpoint, 
//            RequestBuilder, RequestInterceptor, Profiler, Utils, 
//            ResponseWrapper, ExceptionCatchingTypedInput, ErrorHandler, Platform, 
//            RxSupport, RequestInterceptorTape, Callback, CallbackRunnable

private class methodDetailsCache
    implements InvocationHandler
{

    private final Map methodDetailsCache;
    final RestAdapter this$0;

    private Object invokeRequest(RequestInterceptor requestinterceptor, RestMethodInfo restmethodinfo, Object aobj[])
    {
        String s;
        String s1;
        String s2;
        ExceptionCatchingTypedInput exceptioncatchingtypedinput;
        exceptioncatchingtypedinput = null;
        s2 = null;
        s = s2;
        s1 = exceptioncatchingtypedinput;
        restmethodinfo.init();
        s = s2;
        s1 = exceptioncatchingtypedinput;
        Object obj1 = server.getUrl();
        s = s2;
        s1 = exceptioncatchingtypedinput;
        Object obj = new RequestBuilder(((String) (obj1)), restmethodinfo, converter);
        s = s2;
        s1 = exceptioncatchingtypedinput;
        ((RequestBuilder) (obj)).setArguments(aobj);
        s = s2;
        s1 = exceptioncatchingtypedinput;
        requestinterceptor.intercept(((stFacade) (obj)));
        s = s2;
        s1 = exceptioncatchingtypedinput;
        obj = ((RequestBuilder) (obj)).build();
        s = s2;
        s1 = exceptioncatchingtypedinput;
        s2 = ((Request) (obj)).getUrl();
        s = s2;
        s1 = s2;
        if (restmethodinfo.isSynchronous)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        s = s2;
        s1 = s2;
        int j = s2.indexOf("?", ((String) (obj1)).length());
        int i;
        i = j;
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        s = s2;
        s1 = s2;
        i = s2.length();
        s = s2;
        s1 = s2;
        Thread.currentThread().setName((new StringBuilder()).append("Retrofit-").append(s2.substring(((String) (obj1)).length(), i)).toString());
        requestinterceptor = ((RequestInterceptor) (obj));
        s = s2;
        s1 = s2;
        if (!logLevel.())
        {
            break MISSING_BLOCK_LABEL_278;
        }
        s = s2;
        s1 = s2;
        requestinterceptor = logAndReplaceRequest("HTTP", ((Request) (obj)), aobj);
        aobj = null;
        s = s2;
        s1 = s2;
        if (RestAdapter.access$200(RestAdapter.this) == null)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        s = s2;
        s1 = s2;
        aobj = ((Object []) (RestAdapter.access$200(RestAdapter.this).beforeCall()));
        s = s2;
        s1 = s2;
        long l = System.nanoTime();
        s = s2;
        s1 = s2;
        obj = RestAdapter.access$300(RestAdapter.this).t().execute(requestinterceptor);
        s = s2;
        s1 = s2;
        l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
        s = s2;
        s1 = s2;
        i = ((Response) (obj)).getStatus();
        s = s2;
        s1 = s2;
        if (RestAdapter.access$200(RestAdapter.this) == null)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        s = s2;
        s1 = s2;
        requestinterceptor = RestAdapter.access$400(((String) (obj1)), restmethodinfo, requestinterceptor);
        s = s2;
        s1 = s2;
        RestAdapter.access$200(RestAdapter.this).afterCall(requestinterceptor, l, i, ((Object) (aobj)));
        requestinterceptor = ((RequestInterceptor) (obj));
        s = s2;
        s1 = s2;
        if (!logLevel.())
        {
            break MISSING_BLOCK_LABEL_503;
        }
        s = s2;
        s1 = s2;
        requestinterceptor = RestAdapter.access$500(RestAdapter.this, s2, ((Response) (obj)), l);
        s = s2;
        s1 = s2;
        obj = restmethodinfo.responseObjectType;
        if (i < 200 || i >= 300)
        {
            break MISSING_BLOCK_LABEL_997;
        }
        s = s2;
        s1 = s2;
        if (!obj.equals(retrofit/client/Response)) goto _L2; else goto _L1
_L1:
        aobj = requestinterceptor;
        s = s2;
        s1 = s2;
        if (restmethodinfo.isStreaming)
        {
            break MISSING_BLOCK_LABEL_581;
        }
        s = s2;
        s1 = s2;
        aobj = Utils.readBodyToBytesIfNecessary(requestinterceptor);
        s = s2;
        s1 = s2;
        boolean flag = restmethodinfo.isSynchronous;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
        }
        requestinterceptor = ((RequestInterceptor) (aobj));
_L6:
        return requestinterceptor;
_L4:
        s = s2;
        s1 = s2;
        aobj = new ResponseWrapper(((Response) (aobj)), ((Object) (aobj)));
        requestinterceptor = ((RequestInterceptor) (aobj));
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
            return ((Object) (aobj));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        s = s2;
        s1 = s2;
        obj1 = requestinterceptor.getBody();
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s2;
        s1 = s2;
        flag = restmethodinfo.isSynchronous;
        if (flag)
        {
            requestinterceptor = null;
            if (!restmethodinfo.isSynchronous)
            {
                Thread.currentThread().setName("Retrofit-Idle");
                return null;
            }
            continue; /* Loop/switch isn't completed */
        }
        s = s2;
        s1 = s2;
        aobj = new ResponseWrapper(requestinterceptor, null);
        requestinterceptor = ((RequestInterceptor) (aobj));
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
            return ((Object) (aobj));
        }
        if (true) goto _L6; else goto _L5
_L5:
        s = s2;
        s1 = s2;
        exceptioncatchingtypedinput = new ExceptionCatchingTypedInput(((retrofit.mime.TypedInput) (obj1)));
        s = s2;
        s1 = s2;
        aobj = ((Object []) (converter.fromBody(exceptioncatchingtypedinput, ((java.lang.reflect.Type) (obj)))));
        s = s2;
        s1 = s2;
        RestAdapter.access$600(RestAdapter.this, ((retrofit.mime.TypedInput) (obj1)), ((Object) (aobj)));
        s = s2;
        s1 = s2;
        flag = restmethodinfo.isSynchronous;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        requestinterceptor = ((RequestInterceptor) (aobj));
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
            return ((Object) (aobj));
        }
        if (true) goto _L6; else goto _L7
_L7:
        s = s2;
        s1 = s2;
        aobj = new ResponseWrapper(requestinterceptor, ((Object) (aobj)));
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
        }
        return ((Object) (aobj));
        aobj;
        s = s2;
        s1 = s2;
        if (!exceptioncatchingtypedinput.threwException())
        {
            break MISSING_BLOCK_LABEL_937;
        }
        s = s2;
        s1 = s2;
        throw exceptioncatchingtypedinput.getThrownException();
        requestinterceptor;
        throw requestinterceptor;
        requestinterceptor;
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
        }
        throw requestinterceptor;
        s = s2;
        s1 = s2;
        throw RetrofitError.conversionError(s2, Utils.replaceResponseBody(requestinterceptor, null), converter, ((java.lang.reflect.Type) (obj)), ((ConversionException) (aobj)));
        requestinterceptor;
        if (logLevel.())
        {
            logException(requestinterceptor, s);
        }
        throw RetrofitError.networkError(s, requestinterceptor);
        s = s2;
        s1 = s2;
        throw RetrofitError.httpError(s2, Utils.readBodyToBytesIfNecessary(requestinterceptor), converter, ((java.lang.reflect.Type) (obj)));
        requestinterceptor;
        if (logLevel.())
        {
            logException(requestinterceptor, s1);
        }
        throw RetrofitError.unexpectedError(s1, requestinterceptor);
    }

    public Object invoke(final Object methodInfo, Method method, final Object args[])
        throws Throwable
    {
label0:
        {
label1:
            {
                if (method.getDeclaringClass() == java/lang/Object)
                {
                    return method.invoke(this, args);
                }
                methodInfo = RestAdapter.getMethodInfo(methodDetailsCache, method);
                if (((RestMethodInfo) (methodInfo)).isSynchronous)
                {
                    try
                    {
                        methodInfo = invokeRequest(requestInterceptor, ((RestMethodInfo) (methodInfo)), args);
                    }
                    // Misplaced declaration of an exception variable
                    catch (final Object methodInfo)
                    {
                        method = errorHandler.handleError(((RetrofitError) (methodInfo)));
                        if (method == null)
                        {
                            throw new IllegalStateException("Error handler returned null for wrapped exception.", ((Throwable) (methodInfo)));
                        } else
                        {
                            throw method;
                        }
                    }
                    return methodInfo;
                }
                if (httpExecutor == null || callbackExecutor == null)
                {
                    throw new IllegalStateException("Asynchronous invocation requires calling setExecutors.");
                }
                if (!((RestMethodInfo) (methodInfo)).isObservable)
                {
                    break label0;
                }
                if (RestAdapter.access$000(RestAdapter.this) == null)
                {
                    if (!Platform.HAS_RX_JAVA)
                    {
                        break label1;
                    }
                    RestAdapter.access$002(RestAdapter.this, new RxSupport(httpExecutor, errorHandler, requestInterceptor));
                }
                return RestAdapter.access$000(RestAdapter.this).createRequestObservable(new RxSupport.Invoker() {

                    final RestAdapter.RestHandler this$1;
                    final Object val$args[];
                    final RestMethodInfo val$methodInfo;

                    public ResponseWrapper invoke(RequestInterceptor requestinterceptor)
                    {
                        return (ResponseWrapper)invokeRequest(requestinterceptor, methodInfo, args);
                    }

            
            {
                this$1 = RestAdapter.RestHandler.this;
                methodInfo = restmethodinfo;
                args = aobj;
                super();
            }
                });
            }
            throw new IllegalStateException("Observable method found but no RxJava on classpath.");
        }
        method = new RequestInterceptorTape();
        requestInterceptor.intercept(method);
        final Callback final_callback = (Callback)args[args.length - 1];
        httpExecutor.execute(new CallbackRunnable(method, ((RestMethodInfo) (methodInfo)), args) {

            final RestAdapter.RestHandler this$1;
            final Object val$args[];
            final RequestInterceptorTape val$interceptorTape;
            final RestMethodInfo val$methodInfo;

            public ResponseWrapper obtainResponse()
            {
                return (ResponseWrapper)invokeRequest(interceptorTape, methodInfo, args);
            }

            
            {
                this$1 = RestAdapter.RestHandler.this;
                interceptorTape = requestinterceptortape;
                methodInfo = restmethodinfo;
                args = aobj;
                super(final_callback, final_executor, final_errorhandler);
            }
        });
        return null;
    }


    _cls2.val.args(Map map)
    {
        this$0 = RestAdapter.this;
        super();
        methodDetailsCache = map;
    }
}
