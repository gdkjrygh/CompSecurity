// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.converter.Converter;
import retrofit.mime.MimeUtil;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit:
//            RestMethodInfo, Utils, ErrorHandler, Profiler, 
//            RequestInterceptor, RxSupport, Endpoint

public class RestAdapter
{

    static final String IDLE_THREAD_NAME = "Retrofit-Idle";
    static final String THREAD_PREFIX = "Retrofit-";
    final Executor callbackExecutor;
    private final retrofit.client.Client.Provider clientProvider;
    final Converter converter;
    final ErrorHandler errorHandler;
    final Executor httpExecutor;
    final Log log;
    volatile LogLevel logLevel;
    private final Profiler profiler;
    final RequestInterceptor requestInterceptor;
    private RxSupport rxSupport;
    final Endpoint server;
    private final Map serviceMethodInfoCache;

    private RestAdapter(Endpoint endpoint, retrofit.client.Client.Provider provider, Executor executor, Executor executor1, RequestInterceptor requestinterceptor, Converter converter1, Profiler profiler1, 
            ErrorHandler errorhandler, Log log1, LogLevel loglevel)
    {
        serviceMethodInfoCache = new LinkedHashMap();
        server = endpoint;
        clientProvider = provider;
        httpExecutor = executor;
        callbackExecutor = executor1;
        requestInterceptor = requestinterceptor;
        converter = converter1;
        profiler = profiler1;
        errorHandler = errorhandler;
        log = log1;
        logLevel = loglevel;
    }

    RestAdapter(Endpoint endpoint, retrofit.client.Client.Provider provider, Executor executor, Executor executor1, RequestInterceptor requestinterceptor, Converter converter1, Profiler profiler1, 
            ErrorHandler errorhandler, Log log1, LogLevel loglevel, _cls1 _pcls1)
    {
        this(endpoint, provider, executor, executor1, requestinterceptor, converter1, profiler1, errorhandler, log1, loglevel);
    }

    static RestMethodInfo getMethodInfo(Map map, Method method)
    {
        map;
        JVM INSTR monitorenter ;
        RestMethodInfo restmethodinfo1 = (RestMethodInfo)map.get(method);
        RestMethodInfo restmethodinfo;
        restmethodinfo = restmethodinfo1;
        if (restmethodinfo1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        restmethodinfo = new RestMethodInfo(method);
        map.put(method, restmethodinfo);
        map;
        JVM INSTR monitorexit ;
        return restmethodinfo;
        method;
        map;
        JVM INSTR monitorexit ;
        throw method;
    }

    private static Profiler.RequestInformation getRequestInfo(String s, RestMethodInfo restmethodinfo, Request request)
    {
        long l = 0L;
        Object obj = null;
        TypedOutput typedoutput = request.getBody();
        request = obj;
        if (typedoutput != null)
        {
            l = typedoutput.length();
            request = typedoutput.mimeType();
        }
        return new Profiler.RequestInformation(restmethodinfo.requestMethod, s, restmethodinfo.requestUrl, l, request);
    }

    private Response logAndReplaceResponse(String s, Response response, long l)
    {
        log.log(String.format("<--- HTTP %s %s (%sms)", new Object[] {
            Integer.valueOf(response.getStatus()), s, Long.valueOf(l)
        }));
        s = response;
        if (logLevel.ordinal() >= LogLevel.HEADERS.ordinal())
        {
            Header header;
            for (s = response.getHeaders().iterator(); s.hasNext(); log.log(header.toString()))
            {
                header = (Header)s.next();
            }

            l = 0L;
            TypedInput typedinput = response.getBody();
            s = response;
            if (typedinput != null)
            {
                l = typedinput.length();
                s = response;
                if (logLevel.ordinal() >= LogLevel.FULL.ordinal())
                {
                    if (!response.getHeaders().isEmpty())
                    {
                        log.log("");
                    }
                    Object obj = typedinput;
                    s = response;
                    if (!(typedinput instanceof TypedByteArray))
                    {
                        s = Utils.readBodyToBytesIfNecessary(response);
                        obj = s.getBody();
                    }
                    response = ((TypedByteArray)obj).getBytes();
                    l = response.length;
                    obj = MimeUtil.parseCharset(((TypedInput) (obj)).mimeType(), "UTF-8");
                    log.log(new String(response, ((String) (obj))));
                }
            }
            log.log(String.format("<--- END HTTP (%s-byte body)", new Object[] {
                Long.valueOf(l)
            }));
        }
        return s;
    }

    private void logResponseBody(TypedInput typedinput, Object obj)
    {
        if (logLevel.ordinal() == LogLevel.HEADERS_AND_ARGS.ordinal())
        {
            log.log("<--- BODY:");
            log.log(obj.toString());
        }
    }

    public Object create(Class class1)
    {
        Utils.validateServiceClass(class1);
        ClassLoader classloader = class1.getClassLoader();
        RestHandler resthandler = new RestHandler(getMethodInfoCache(class1));
        return Proxy.newProxyInstance(classloader, new Class[] {
            class1
        }, resthandler);
    }

    public LogLevel getLogLevel()
    {
        return logLevel;
    }

    Map getMethodInfoCache(Class class1)
    {
        Map map1 = serviceMethodInfoCache;
        map1;
        JVM INSTR monitorenter ;
        Map map = (Map)serviceMethodInfoCache.get(class1);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj = new LinkedHashMap();
        serviceMethodInfoCache.put(class1, obj);
        map1;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
        class1;
        map1;
        JVM INSTR monitorexit ;
        throw class1;
    }

    Request logAndReplaceRequest(String s, Request request, Object aobj[])
    {
        log.log(String.format("---> %s %s %s", new Object[] {
            s, request.getMethod(), request.getUrl()
        }));
        Object obj = request;
        if (logLevel.ordinal() >= LogLevel.HEADERS.ordinal())
        {
            Header header;
            for (obj = request.getHeaders().iterator(); ((Iterator) (obj)).hasNext(); log.log(header.toString()))
            {
                header = (Header)((Iterator) (obj)).next();
            }

            Object obj1 = "no";
            TypedOutput typedoutput = request.getBody();
            obj = request;
            if (typedoutput != null)
            {
                obj = typedoutput.mimeType();
                if (obj != null)
                {
                    log.log((new StringBuilder("Content-Type: ")).append(((String) (obj))).toString());
                }
                long l = typedoutput.length();
                obj = (new StringBuilder()).append(l).append("-byte").toString();
                if (l != -1L)
                {
                    log.log((new StringBuilder("Content-Length: ")).append(l).toString());
                }
                if (logLevel.ordinal() >= LogLevel.FULL.ordinal())
                {
                    if (!request.getHeaders().isEmpty())
                    {
                        log.log("");
                    }
                    obj1 = typedoutput;
                    aobj = request;
                    if (!(typedoutput instanceof TypedByteArray))
                    {
                        aobj = Utils.readBodyToBytesIfNecessary(request);
                        obj1 = ((Request) (aobj)).getBody();
                    }
                    request = ((TypedByteArray)obj1).getBytes();
                    obj1 = MimeUtil.parseCharset(((TypedOutput) (obj1)).mimeType(), "UTF-8");
                    log.log(new String(request, ((String) (obj1))));
                    obj1 = obj;
                    obj = ((Object) (aobj));
                } else
                {
                    if (logLevel.ordinal() >= LogLevel.HEADERS_AND_ARGS.ordinal())
                    {
                        if (!request.getHeaders().isEmpty())
                        {
                            log.log("---> REQUEST:");
                        }
                        for (int i = 0; i < aobj.length; i++)
                        {
                            log.log((new StringBuilder("#")).append(i).append(": ").append(aobj[i]).toString());
                        }

                    }
                    obj1 = obj;
                    obj = request;
                }
            }
            log.log(String.format("---> END %s (%s body)", new Object[] {
                s, obj1
            }));
        }
        return ((Request) (obj));
    }

    void logException(Throwable throwable, String s)
    {
        Log log1 = log;
        if (s == null)
        {
            s = "";
        }
        log1.log(String.format("---- ERROR %s", new Object[] {
            s
        }));
        s = new StringWriter();
        throwable.printStackTrace(new PrintWriter(s));
        log.log(s.toString());
        log.log("---- END ERROR");
    }

    public void setLogLevel(LogLevel loglevel)
    {
        if (logLevel == null)
        {
            throw new NullPointerException("Log level may not be null.");
        } else
        {
            logLevel = loglevel;
            return;
        }
    }



/*
    static RxSupport access$002(RestAdapter restadapter, RxSupport rxsupport)
    {
        restadapter.rxSupport = rxsupport;
        return rxsupport;
    }

*/






    private class Log
    {

        public static final Log NONE = new _cls1();

        public abstract void log(String s);


        class _cls1
            implements Log
        {

            public final void log(String s)
            {
            }

                _cls1()
                {
                }
        }

    }


    private class LogLevel extends Enum
    {

        private static final LogLevel $VALUES[];
        public static final LogLevel BASIC;
        public static final LogLevel FULL;
        public static final LogLevel HEADERS;
        public static final LogLevel HEADERS_AND_ARGS;
        public static final LogLevel NONE;

        public static LogLevel valueOf(String s)
        {
            return (LogLevel)Enum.valueOf(retrofit/RestAdapter$LogLevel, s);
        }

        public static LogLevel[] values()
        {
            return (LogLevel[])$VALUES.clone();
        }

        public final boolean log()
        {
            return this != NONE;
        }

        static 
        {
            NONE = new LogLevel("NONE", 0);
            BASIC = new LogLevel("BASIC", 1);
            HEADERS = new LogLevel("HEADERS", 2);
            HEADERS_AND_ARGS = new LogLevel("HEADERS_AND_ARGS", 3);
            FULL = new LogLevel("FULL", 4);
            $VALUES = (new LogLevel[] {
                NONE, BASIC, HEADERS, HEADERS_AND_ARGS, FULL
            });
        }

        private LogLevel(String s, int i)
        {
            super(s, i);
        }
    }


    private class RestHandler
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
            requestinterceptor.intercept(((RequestInterceptor.RequestFacade) (obj1)));
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
            if (logLevel.log())
            {
                obj = logAndReplaceRequest("HTTP", ((Request) (obj1)), aobj);
            }
            if (profiler == null)
            {
                break MISSING_BLOCK_LABEL_742;
            }
            aobj = ((Object []) (profiler.beforeCall()));
_L16:
            long l;
            l = System.nanoTime();
            obj1 = clientProvider.get().execute(((Request) (obj)));
            l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
            i = ((Response) (obj1)).getStatus();
            if (profiler != null)
            {
                obj = RestAdapter.getRequestInfo(((String) (obj2)), restmethodinfo, ((Request) (obj)));
                profiler.afterCall(((Profiler.RequestInformation) (obj)), l, i, ((Object) (aobj)));
            }
            if (!logLevel.log()) goto _L2; else goto _L1
_L1:
            aobj = logAndReplaceResponse(requestinterceptor, ((Response) (obj1)), l);
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
            TypedInput typedinput = ((Response) (aobj)).getBody();
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
            obj = converter.fromBody(((TypedInput) (obj2)), ((java.lang.reflect.Type) (obj1)));
            logResponseBody(typedinput, obj);
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
            if (logLevel.log())
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
            if (logLevel.log())
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
                    if (rxSupport == null)
                    {
                        if (!Platform.HAS_RX_JAVA)
                        {
                            break label1;
                        }
                        rxSupport = new RxSupport(httpExecutor, errorHandler, requestInterceptor);
                    }
                    class _cls1
                        implements RxSupport.Invoker
                    {

                        final RestHandler this$1;
                        final Object val$args[];
                        final RestMethodInfo val$methodInfo;

                        public ResponseWrapper invoke(RequestInterceptor requestinterceptor)
                        {
                            return (ResponseWrapper)invokeRequest(requestinterceptor, methodInfo, args);
                        }

                _cls1()
                {
                    this$1 = RestHandler.this;
                    methodInfo = restmethodinfo;
                    args = aobj;
                    super();
                }
                    }

                    return rxSupport.createRequestObservable(new _cls1());
                }
                throw new IllegalStateException("Observable method found but no RxJava on classpath.");
            }
            method = new RequestInterceptorTape();
            requestInterceptor.intercept(method);
            final Callback final_callback = (Callback)args[args.length - 1];
            class _cls2 extends CallbackRunnable
            {

                final RestHandler this$1;
                final Object val$args[];
                final RequestInterceptorTape val$interceptorTape;
                final RestMethodInfo val$methodInfo;

                public ResponseWrapper obtainResponse()
                {
                    return (ResponseWrapper)invokeRequest(interceptorTape, methodInfo, args);
                }

                _cls2(RequestInterceptorTape requestinterceptortape, RestMethodInfo restmethodinfo, Object aobj[])
                {
                    this$1 = RestHandler.this;
                    interceptorTape = requestinterceptortape;
                    methodInfo = restmethodinfo;
                    args = aobj;
                    super(final_callback, final_executor, final_errorhandler);
                }
            }

            httpExecutor.execute(new _cls2(method, ((RestMethodInfo) (methodInfo)), args));
            return null;
        }


        RestHandler(Map map)
        {
            this$0 = RestAdapter.this;
            super();
            methodDetailsCache = map;
        }
    }

}
