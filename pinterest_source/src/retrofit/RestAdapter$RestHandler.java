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
//            RetrofitError, RestMethodInfo, RestAdapter, Endpoint, 
//            RequestBuilder, RequestInterceptor, Profiler, Utils, 
//            ResponseWrapper, ExceptionCatchingTypedInput, ErrorHandler, Platform, 
//            RxSupport, RequestInterceptorTape, Callback

class methodDetailsCache
    implements InvocationHandler
{

    private final Map methodDetailsCache;
    final RestAdapter this$0;

    private Object invokeRequest(RequestInterceptor requestinterceptor, RestMethodInfo restmethodinfo, Object aobj[])
    {
        Object obj = null;
        Object obj1;
        Object obj2;
        restmethodinfo.init();
        obj2 = server.getUrl();
        obj1 = new RequestBuilder(((String) (obj2)), restmethodinfo, converter);
        ((RequestBuilder) (obj1)).setArguments(aobj);
        requestinterceptor.intercept(((stFacade) (obj1)));
        obj1 = ((RequestBuilder) (obj1)).build();
        requestinterceptor = ((Request) (obj1)).getUrl();
        int j;
        if (restmethodinfo.isSynchronous)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        j = requestinterceptor.indexOf("?", ((String) (obj2)).length());
        int i;
        i = j;
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        i = requestinterceptor.length();
        Thread.currentThread().setName((new StringBuilder("Retrofit-")).append(requestinterceptor.substring(((String) (obj2)).length(), i)).toString());
        obj = obj1;
        if (logLevel.())
        {
            obj = logAndReplaceRequest("HTTP", ((Request) (obj1)), aobj);
        }
        if (RestAdapter.access$200(RestAdapter.this) == null)
        {
            break MISSING_BLOCK_LABEL_742;
        }
        aobj = ((Object []) (RestAdapter.access$200(RestAdapter.this).beforeCall()));
_L16:
        long l;
        l = System.nanoTime();
        obj1 = RestAdapter.access$300(RestAdapter.this).t().execute(((Request) (obj)));
        l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
        i = ((Response) (obj1)).getStatus();
        if (RestAdapter.access$200(RestAdapter.this) != null)
        {
            obj = RestAdapter.access$400(((String) (obj2)), restmethodinfo, ((Request) (obj)));
            RestAdapter.access$200(RestAdapter.this).afterCall(((ion) (obj)), l, i, ((Object) (aobj)));
        }
        if (!logLevel.()) goto _L2; else goto _L1
_L1:
        aobj = RestAdapter.access$500(RestAdapter.this, requestinterceptor, ((Response) (obj1)), l);
_L15:
        obj1 = restmethodinfo.responseObjectType;
        if (i < 200 || i >= 300) goto _L4; else goto _L3
_L3:
        if (!obj1.equals(retrofit/client/Response)) goto _L6; else goto _L5
_L5:
        boolean flag;
        if (!restmethodinfo.isStreaming)
        {
            aobj = Utils.readBodyToBytesIfNecessary(((Response) (aobj)));
        }
        flag = restmethodinfo.isSynchronous;
        if (!flag) goto _L8; else goto _L7
_L7:
        requestinterceptor = ((RequestInterceptor) (aobj));
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
            requestinterceptor = ((RequestInterceptor) (aobj));
        }
_L10:
        return requestinterceptor;
_L8:
        aobj = new ResponseWrapper(((Response) (aobj)), ((Object) (aobj)));
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
        }
        return ((Object) (aobj));
_L6:
        retrofit.mime.TypedInput typedinput = ((Response) (aobj)).getBody();
        if (typedinput != null)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        flag = restmethodinfo.isSynchronous;
        if (flag)
        {
            if (!restmethodinfo.isSynchronous)
            {
                Thread.currentThread().setName("Retrofit-Idle");
            }
            return null;
        }
        aobj = new ResponseWrapper(((Response) (aobj)), null);
        requestinterceptor = ((RequestInterceptor) (aobj));
        if (restmethodinfo.isSynchronous) goto _L10; else goto _L9
_L9:
        Thread.currentThread().setName("Retrofit-Idle");
        return ((Object) (aobj));
        obj2 = new ExceptionCatchingTypedInput(typedinput);
        obj = converter.fromBody(((retrofit.mime.TypedInput) (obj2)), ((java.lang.reflect.Type) (obj1)));
        RestAdapter.access$600(RestAdapter.this, typedinput, obj);
        flag = restmethodinfo.isSynchronous;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_544;
        }
        requestinterceptor = ((RequestInterceptor) (obj));
        if (restmethodinfo.isSynchronous) goto _L10; else goto _L11
_L11:
        Thread.currentThread().setName("Retrofit-Idle");
        return obj;
        obj = new ResponseWrapper(((Response) (aobj)), obj);
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
        }
        return obj;
        obj;
        if (((ExceptionCatchingTypedInput) (obj2)).threwException())
        {
            throw ((ExceptionCatchingTypedInput) (obj2)).getThrownException();
        }
        break MISSING_BLOCK_LABEL_611;
        requestinterceptor;
        throw requestinterceptor;
        requestinterceptor;
        if (!restmethodinfo.isSynchronous)
        {
            Thread.currentThread().setName("Retrofit-Idle");
        }
        throw requestinterceptor;
        throw RetrofitError.conversionError(requestinterceptor, Utils.replaceResponseBody(((Response) (aobj)), null), converter, ((java.lang.reflect.Type) (obj1)), ((ConversionException) (obj)));
        obj;
        aobj = requestinterceptor;
        requestinterceptor = ((RequestInterceptor) (obj));
_L14:
        if (logLevel.())
        {
            logException(requestinterceptor, ((String) (aobj)));
        }
        throw RetrofitError.networkError(((String) (aobj)), requestinterceptor);
_L4:
        throw RetrofitError.httpError(requestinterceptor, Utils.readBodyToBytesIfNecessary(((Response) (aobj))), converter, ((java.lang.reflect.Type) (obj1)));
        obj;
        aobj = requestinterceptor;
        requestinterceptor = ((RequestInterceptor) (obj));
_L13:
        if (logLevel.())
        {
            logException(requestinterceptor, ((String) (aobj)));
        }
        throw RetrofitError.unexpectedError(((String) (aobj)), requestinterceptor);
        requestinterceptor;
        aobj = null;
        if (true) goto _L13; else goto _L12
_L12:
        requestinterceptor;
        aobj = ((Object []) (obj));
        if (true) goto _L14; else goto _L2
_L2:
        aobj = ((Object []) (obj1));
          goto _L15
        aobj = null;
          goto _L16
    }

    public Object invoke(final Object methodInfo, Method method, final Object args[])
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
                class _cls1
                    implements RxSupport.Invoker
                {

                    final RestAdapter.RestHandler this$1;
                    final Object val$args[];
                    final RestMethodInfo val$methodInfo;

                    public ResponseWrapper invoke(RequestInterceptor requestinterceptor)
                    {
                        return (ResponseWrapper)invokeRequest(requestinterceptor, methodInfo, args);
                    }

            _cls1()
            {
                this$1 = RestAdapter.RestHandler.this;
                methodInfo = restmethodinfo;
                args = aobj;
                super();
            }
                }

                return RestAdapter.access$000(RestAdapter.this).createRequestObservable(new _cls1());
            }
            throw new IllegalStateException("Observable method found but no RxJava on classpath.");
        }
        method = new RequestInterceptorTape();
        requestInterceptor.intercept(method);
        final Callback final_callback = (Callback)args[args.length - 1];
        class _cls2 extends CallbackRunnable
        {

            final RestAdapter.RestHandler this$1;
            final Object val$args[];
            final RequestInterceptorTape val$interceptorTape;
            final RestMethodInfo val$methodInfo;

            public ResponseWrapper obtainResponse()
            {
                return (ResponseWrapper)invokeRequest(interceptorTape, methodInfo, args);
            }

            _cls2(RequestInterceptorTape requestinterceptortape, RestMethodInfo restmethodinfo, Object aobj[])
            {
                this$1 = RestAdapter.RestHandler.this;
                interceptorTape = requestinterceptortape;
                methodInfo = restmethodinfo;
                args = aobj;
                super(final_callback, final_executor, final_errorhandler);
            }
        }

        httpExecutor.execute(new _cls2(method, ((RestMethodInfo) (methodInfo)), args));
        return null;
    }


    ption(Map map)
    {
        this$0 = RestAdapter.this;
        super();
        methodDetailsCache = map;
    }
}
