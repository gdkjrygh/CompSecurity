// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import retrofit.client.Client;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.MimeUtil;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit:
//            RestMethodInfo, Utils, ErrorHandler, Profiler, 
//            RequestInterceptor, RxSupport, Endpoint, Platform, 
//            Endpoints, RetrofitError, RequestBuilder, ResponseWrapper, 
//            ExceptionCatchingTypedInput, RequestInterceptorTape, Callback, CallbackRunnable

public class RestAdapter
{
    public static class Builder
    {

        private Executor callbackExecutor;
        private retrofit.client.Client.Provider clientProvider;
        private Converter converter;
        private Endpoint endpoint;
        private ErrorHandler errorHandler;
        private Executor httpExecutor;
        private Log log;
        private LogLevel logLevel;
        private Profiler profiler;
        private RequestInterceptor requestInterceptor;

        private void ensureSaneDefaults()
        {
            if (converter == null)
            {
                converter = Platform.get().defaultConverter();
            }
            if (clientProvider == null)
            {
                clientProvider = Platform.get().defaultClient();
            }
            if (httpExecutor == null)
            {
                httpExecutor = Platform.get().defaultHttpExecutor();
            }
            if (callbackExecutor == null)
            {
                callbackExecutor = Platform.get().defaultCallbackExecutor();
            }
            if (errorHandler == null)
            {
                errorHandler = ErrorHandler.DEFAULT;
            }
            if (log == null)
            {
                log = Platform.get().defaultLog();
            }
            if (requestInterceptor == null)
            {
                requestInterceptor = RequestInterceptor.NONE;
            }
        }

        public RestAdapter build()
        {
            if (endpoint == null)
            {
                throw new IllegalArgumentException("Endpoint may not be null.");
            } else
            {
                ensureSaneDefaults();
                return new RestAdapter(endpoint, clientProvider, httpExecutor, callbackExecutor, requestInterceptor, converter, profiler, errorHandler, log, logLevel);
            }
        }

        public Builder setClient(retrofit.client.Client.Provider provider)
        {
            if (provider == null)
            {
                throw new NullPointerException("Client provider may not be null.");
            } else
            {
                clientProvider = provider;
                return this;
            }
        }

        public Builder setClient(Client client)
        {
            if (client == null)
            {
                throw new NullPointerException("Client may not be null.");
            } else
            {
                return setClient(client. new retrofit.client.Client.Provider() {

                    final Builder this$0;
                    final Client val$client;

                    public Client get()
                    {
                        return client;
                    }

            
            {
                this$0 = final_builder;
                client = Client.this;
                super();
            }
                });
            }
        }

        public Builder setConverter(Converter converter1)
        {
            if (converter1 == null)
            {
                throw new NullPointerException("Converter may not be null.");
            } else
            {
                converter = converter1;
                return this;
            }
        }

        public Builder setEndpoint(String s)
        {
            if (s == null || s.trim().length() == 0)
            {
                throw new NullPointerException("Endpoint may not be blank.");
            } else
            {
                endpoint = Endpoints.newFixedEndpoint(s);
                return this;
            }
        }

        public Builder setEndpoint(Endpoint endpoint1)
        {
            if (endpoint1 == null)
            {
                throw new NullPointerException("Endpoint may not be null.");
            } else
            {
                endpoint = endpoint1;
                return this;
            }
        }

        public Builder setErrorHandler(ErrorHandler errorhandler)
        {
            if (errorhandler == null)
            {
                throw new NullPointerException("Error handler may not be null.");
            } else
            {
                errorHandler = errorhandler;
                return this;
            }
        }

        public Builder setExecutors(Executor executor, Executor executor1)
        {
            if (executor == null)
            {
                throw new NullPointerException("HTTP executor may not be null.");
            }
            Object obj = executor1;
            if (executor1 == null)
            {
                obj = new Utils.SynchronousExecutor();
            }
            httpExecutor = executor;
            callbackExecutor = ((Executor) (obj));
            return this;
        }

        public Builder setLog(Log log1)
        {
            if (log1 == null)
            {
                throw new NullPointerException("Log may not be null.");
            } else
            {
                log = log1;
                return this;
            }
        }

        public Builder setLogLevel(LogLevel loglevel)
        {
            if (loglevel == null)
            {
                throw new NullPointerException("Log level may not be null.");
            } else
            {
                logLevel = loglevel;
                return this;
            }
        }

        public Builder setProfiler(Profiler profiler1)
        {
            if (profiler1 == null)
            {
                throw new NullPointerException("Profiler may not be null.");
            } else
            {
                profiler = profiler1;
                return this;
            }
        }

        public Builder setRequestInterceptor(RequestInterceptor requestinterceptor)
        {
            if (requestinterceptor == null)
            {
                throw new NullPointerException("Request interceptor may not be null.");
            } else
            {
                requestInterceptor = requestinterceptor;
                return this;
            }
        }

        public Builder()
        {
            logLevel = LogLevel.NONE;
        }
    }

    public static interface Log
    {

        public static final Log NONE = new Log() {

            public void log(String s)
            {
            }

        };

        public abstract void log(String s);

    }

    public static final class LogLevel extends Enum
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

        public boolean log()
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
            requestinterceptor.intercept(((RequestInterceptor.RequestFacade) (obj)));
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
            if (!logLevel.log())
            {
                break MISSING_BLOCK_LABEL_278;
            }
            s = s2;
            s1 = s2;
            requestinterceptor = logAndReplaceRequest("HTTP", ((Request) (obj)), aobj);
            aobj = null;
            s = s2;
            s1 = s2;
            if (profiler == null)
            {
                break MISSING_BLOCK_LABEL_319;
            }
            s = s2;
            s1 = s2;
            aobj = ((Object []) (profiler.beforeCall()));
            s = s2;
            s1 = s2;
            long l = System.nanoTime();
            s = s2;
            s1 = s2;
            obj = clientProvider.get().execute(requestinterceptor);
            s = s2;
            s1 = s2;
            l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l);
            s = s2;
            s1 = s2;
            i = ((Response) (obj)).getStatus();
            s = s2;
            s1 = s2;
            if (profiler == null)
            {
                break MISSING_BLOCK_LABEL_457;
            }
            s = s2;
            s1 = s2;
            requestinterceptor = RestAdapter.getRequestInfo(((String) (obj1)), restmethodinfo, requestinterceptor);
            s = s2;
            s1 = s2;
            profiler.afterCall(requestinterceptor, l, i, ((Object) (aobj)));
            requestinterceptor = ((RequestInterceptor) (obj));
            s = s2;
            s1 = s2;
            if (!logLevel.log())
            {
                break MISSING_BLOCK_LABEL_503;
            }
            s = s2;
            s1 = s2;
            requestinterceptor = logAndReplaceResponse(s2, ((Response) (obj)), l);
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
            exceptioncatchingtypedinput = new ExceptionCatchingTypedInput(((TypedInput) (obj1)));
            s = s2;
            s1 = s2;
            aobj = ((Object []) (converter.fromBody(exceptioncatchingtypedinput, ((java.lang.reflect.Type) (obj)))));
            s = s2;
            s1 = s2;
            logResponseBody(((TypedInput) (obj1)), ((Object) (aobj)));
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
            if (logLevel.log())
            {
                logException(requestinterceptor, s);
            }
            throw RetrofitError.networkError(s, requestinterceptor);
            s = s2;
            s1 = s2;
            throw RetrofitError.httpError(s2, Utils.readBodyToBytesIfNecessary(requestinterceptor), converter, ((java.lang.reflect.Type) (obj)));
            requestinterceptor;
            if (logLevel.log())
            {
                logException(requestinterceptor, s1);
            }
            throw RetrofitError.unexpectedError(s1, requestinterceptor);
        }

        public Object invoke(final Object methodInfo, Method method, Object aobj[])
            throws Throwable
        {
label0:
            {
label1:
                {
                    if (method.getDeclaringClass() == java/lang/Object)
                    {
                        return method.invoke(this, aobj);
                    }
                    methodInfo = RestAdapter.getMethodInfo(methodDetailsCache, method);
                    if (((RestMethodInfo) (methodInfo)).isSynchronous)
                    {
                        try
                        {
                            methodInfo = invokeRequest(requestInterceptor, ((RestMethodInfo) (methodInfo)), aobj);
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
                    return rxSupport.createRequestObservable(((_cls1) (aobj)). new RxSupport.Invoker() {

                        final RestHandler this$1;
                        final Object val$args[];
                        final RestMethodInfo val$methodInfo;

                        public ResponseWrapper invoke(RequestInterceptor requestinterceptor)
                        {
                            return (ResponseWrapper)invokeRequest(requestinterceptor, methodInfo, args);
                        }

            
            {
                this$1 = final_resthandler;
                methodInfo = restmethodinfo;
                args = _5B_Ljava.lang.Object_3B_.this;
                super();
            }
                    });
                }
                throw new IllegalStateException("Observable method found but no RxJava on classpath.");
            }
            method = new RequestInterceptorTape();
            requestInterceptor.intercept(method);
            final Callback final_callback = (Callback)aobj[aobj.length - 1];
            httpExecutor.execute(errorHandler. new CallbackRunnable(method, ((RestMethodInfo) (methodInfo)), aobj) {

                final RestHandler this$1;
                final Object val$args[];
                final RequestInterceptorTape val$interceptorTape;
                final RestMethodInfo val$methodInfo;

                public ResponseWrapper obtainResponse()
                {
                    return (ResponseWrapper)invokeRequest(interceptorTape, methodInfo, args);
                }

            
            {
                this$1 = final_resthandler;
                interceptorTape = requestinterceptortape;
                methodInfo = restmethodinfo;
                args = aobj;
                super(final_callback, final_executor, ErrorHandler.this);
            }
            });
            return null;
        }


        RestHandler(Map map)
        {
            this$0 = RestAdapter.this;
            super();
            methodDetailsCache = map;
        }
    }


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
        throws IOException
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
        throws IOException
    {
        Object obj;
        log.log(String.format("---> %s %s %s", new Object[] {
            s, request.getMethod(), request.getUrl()
        }));
        obj = request;
        if (logLevel.ordinal() < LogLevel.HEADERS.ordinal()) goto _L2; else goto _L1
_L1:
        String s1;
        TypedOutput typedoutput;
        Header header;
        for (obj = request.getHeaders().iterator(); ((Iterator) (obj)).hasNext(); log.log(header.toString()))
        {
            header = (Header)((Iterator) (obj)).next();
        }

        s1 = "no";
        typedoutput = request.getBody();
        obj = request;
        if (typedoutput == null) goto _L4; else goto _L3
_L3:
        String s2;
        obj = typedoutput.mimeType();
        if (obj != null)
        {
            log.log((new StringBuilder()).append("Content-Type: ").append(((String) (obj))).toString());
        }
        long l = typedoutput.length();
        s2 = (new StringBuilder()).append(l).append("-byte").toString();
        if (l != -1L)
        {
            log.log((new StringBuilder()).append("Content-Length: ").append(l).toString());
        }
        if (logLevel.ordinal() < LogLevel.FULL.ordinal()) goto _L6; else goto _L5
_L5:
        if (!request.getHeaders().isEmpty())
        {
            log.log("");
        }
        obj = typedoutput;
        aobj = request;
        if (!(typedoutput instanceof TypedByteArray))
        {
            aobj = Utils.readBodyToBytesIfNecessary(request);
            obj = ((Request) (aobj)).getBody();
        }
        request = ((TypedByteArray)obj).getBytes();
        obj = MimeUtil.parseCharset(((TypedOutput) (obj)).mimeType(), "UTF-8");
        log.log(new String(request, ((String) (obj))));
        obj = ((Object) (aobj));
        s1 = s2;
_L4:
        log.log(String.format("---> END %s (%s body)", new Object[] {
            s, s1
        }));
_L2:
        return ((Request) (obj));
_L6:
        s1 = s2;
        obj = request;
        if (logLevel.ordinal() < LogLevel.HEADERS_AND_ARGS.ordinal())
        {
            continue;
        }
        if (!request.getHeaders().isEmpty())
        {
            log.log("---> REQUEST:");
        }
        int i = 0;
        do
        {
            s1 = s2;
            obj = request;
            if (i >= aobj.length)
            {
                continue;
            }
            log.log((new StringBuilder()).append("#").append(i).append(": ").append(aobj[i]).toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L7
_L7:
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





}
