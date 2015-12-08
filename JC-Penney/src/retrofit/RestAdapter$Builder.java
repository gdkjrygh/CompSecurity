// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.Executor;
import retrofit.client.Client;
import retrofit.converter.Converter;

// Referenced classes of package retrofit:
//            Platform, ErrorHandler, RequestInterceptor, RestAdapter, 
//            Endpoints, Endpoint, Profiler

public class .NONE
{

    private Executor callbackExecutor;
    private retrofit.client.Interceptor clientProvider;
    private Converter converter;
    private Endpoint endpoint;
    private ErrorHandler errorHandler;
    private Executor httpExecutor;
    private  log;
    private  logLevel;
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
            return new RestAdapter(endpoint, clientProvider, httpExecutor, callbackExecutor, requestInterceptor, converter, profiler, errorHandler, log, logLevel, null);
        }
    }

    public er setClient(retrofit.client.l l)
    {
        if (l == null)
        {
            throw new NullPointerException("Client provider may not be null.");
        } else
        {
            clientProvider = l;
            return this;
        }
    }

    public clientProvider setClient(final Client client)
    {
        class _cls1
            implements retrofit.client.Client.Provider
        {

            final RestAdapter.Builder this$0;
            final Client val$client;

            public Client get()
            {
                return client;
            }

            _cls1()
            {
                this$0 = RestAdapter.Builder.this;
                client = client1;
                super();
            }
        }

        if (client == null)
        {
            throw new NullPointerException("Client may not be null.");
        } else
        {
            return setClient(((retrofit.client.nt) (new _cls1())));
        }
    }

    public _cls1 setConverter(Converter converter1)
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

    public converter setEndpoint(String s)
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

    public dpoint setEndpoint(Endpoint endpoint1)
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

    public endpoint setErrorHandler(ErrorHandler errorhandler)
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

    public  setExecutors(Executor executor, Executor executor1)
    {
        if (executor == null)
        {
            throw new NullPointerException("HTTP executor may not be null.");
        }
        Object obj = executor1;
        if (executor1 == null)
        {
            obj = new cutor();
        }
        httpExecutor = executor;
        callbackExecutor = ((Executor) (obj));
        return this;
    }

    public  setLog( )
    {
        if ( == null)
        {
            throw new NullPointerException("Log may not be null.");
        } else
        {
            log = ;
            return this;
        }
    }

    public  setLogLevel( )
    {
        if ( == null)
        {
            throw new NullPointerException("Log level may not be null.");
        } else
        {
            logLevel = ;
            return this;
        }
    }

    public logLevel setProfiler(Profiler profiler1)
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

    public profiler setRequestInterceptor(RequestInterceptor requestinterceptor)
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

    public ()
    {
        logLevel = .NONE;
    }
}
