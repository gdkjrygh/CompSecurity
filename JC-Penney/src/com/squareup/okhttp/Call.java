// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.IOException;
import java.net.ProtocolException;

// Referenced classes of package com.squareup.okhttp:
//            OkHttpClient, Request, HttpUrl, Dispatcher, 
//            RequestBody, MediaType, Response, Callback

public class Call
{

    volatile boolean canceled;
    private final OkHttpClient client;
    HttpEngine engine;
    private boolean executed;
    Request originalRequest;

    protected Call(OkHttpClient okhttpclient, Request request)
    {
        client = okhttpclient.copyWithDefaults();
        originalRequest = request;
    }

    private Response getResponseWithInterceptorChain(boolean flag)
    {
        return (new ApplicationInterceptorChain(0, originalRequest, flag)).proceed(originalRequest);
    }

    private String toLoggableString()
    {
        String s;
        HttpUrl httpurl;
        if (canceled)
        {
            s = "canceled call";
        } else
        {
            s = "call";
        }
        httpurl = originalRequest.httpUrl().resolve("/...");
        return (new StringBuilder()).append(s).append(" to ").append(httpurl).toString();
    }

    public void cancel()
    {
        canceled = true;
        if (engine != null)
        {
            engine.disconnect();
        }
    }

    public void enqueue(Callback callback)
    {
        enqueue(callback, false);
    }

    void enqueue(Callback callback, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (executed)
        {
            throw new IllegalStateException("Already Executed");
        }
        break MISSING_BLOCK_LABEL_24;
        callback;
        this;
        JVM INSTR monitorexit ;
        throw callback;
        executed = true;
        this;
        JVM INSTR monitorexit ;
        client.getDispatcher().enqueue(new AsyncCall(callback, flag, null));
        return;
    }

    public Response execute()
    {
        this;
        JVM INSTR monitorenter ;
        if (executed)
        {
            throw new IllegalStateException("Already Executed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        executed = true;
        this;
        JVM INSTR monitorexit ;
        Object obj;
        client.getDispatcher().executed(this);
        obj = getResponseWithInterceptorChain(false);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        throw new IOException("Canceled");
        obj;
        client.getDispatcher().finished(this);
        throw obj;
        client.getDispatcher().finished(this);
        return ((Response) (obj));
    }

    Response getResponse(Request request, boolean flag)
    {
        RequestBody requestbody = request.body();
        int i;
        if (requestbody != null)
        {
            request = request.newBuilder();
            MediaType mediatype = requestbody.contentType();
            if (mediatype != null)
            {
                request.header("Content-Type", mediatype.toString());
            }
            long l = requestbody.contentLength();
            if (l != -1L)
            {
                request.header("Content-Length", Long.toString(l));
                request.removeHeader("Transfer-Encoding");
            } else
            {
                request.header("Transfer-Encoding", "chunked");
                request.removeHeader("Content-Length");
            }
            request = request.build();
        }
        engine = new HttpEngine(client, request, false, false, flag, null, null, null, null);
        i = 0;
        do
        {
            if (canceled)
            {
                engine.releaseConnection();
                throw new IOException("Canceled");
            }
            Object obj;
            try
            {
                engine.sendRequest();
                engine.readResponse();
            }
            // Misplaced declaration of an exception variable
            catch (Request request)
            {
                throw request.getCause();
            }
            // Misplaced declaration of an exception variable
            catch (Request request)
            {
                obj = engine.recover(request);
                if (obj != null)
                {
                    engine = ((HttpEngine) (obj));
                } else
                {
                    throw request.getLastConnectException();
                }
                continue;
            }
            // Misplaced declaration of an exception variable
            catch (Request request)
            {
                obj = engine.recover(request, null);
                if (obj != null)
                {
                    engine = ((HttpEngine) (obj));
                } else
                {
                    throw request;
                }
                continue;
            }
            request = engine.getResponse();
            obj = engine.followUpRequest();
            if (obj == null)
            {
                if (!flag)
                {
                    engine.releaseConnection();
                }
                return request;
            }
            i++;
            if (i > 20)
            {
                throw new ProtocolException((new StringBuilder()).append("Too many follow-up requests: ").append(i).toString());
            }
            if (!engine.sameConnection(((Request) (obj)).httpUrl()))
            {
                engine.releaseConnection();
            }
            Connection connection = engine.close();
            engine = new HttpEngine(client, ((Request) (obj)), false, false, flag, connection, null, null, request);
        } while (true);
    }

    public boolean isCanceled()
    {
        return canceled;
    }

    Object tag()
    {
        return originalRequest.tag();
    }




    private class ApplicationInterceptorChain
        implements Interceptor.Chain
    {

        private final boolean forWebSocket;
        private final int index;
        private final Request request;
        final Call this$0;

        public Connection connection()
        {
            return null;
        }

        public Response proceed(Request request1)
        {
            if (index < client.interceptors().size())
            {
                request1 = new ApplicationInterceptorChain(index + 1, request1, forWebSocket);
                return ((Interceptor)client.interceptors().get(index)).intercept(request1);
            } else
            {
                return getResponse(request1, forWebSocket);
            }
        }

        public Request request()
        {
            return request;
        }

        ApplicationInterceptorChain(int i, Request request1, boolean flag)
        {
            this$0 = Call.this;
            super();
            index = i;
            request = request1;
            forWebSocket = flag;
        }
    }


    private class AsyncCall extends NamedRunnable
    {

        private final boolean forWebSocket;
        private final Callback responseCallback;
        final Call this$0;

        void cancel()
        {
            Call.this.cancel();
        }

        protected void execute()
        {
            boolean flag = true;
            Response response;
            boolean flag1;
            response = getResponseWithInterceptorChain(forWebSocket);
            flag1 = canceled;
            if (!flag1) goto _L2; else goto _L1
_L1:
            responseCallback.onFailure(originalRequest, new IOException("Canceled"));
_L4:
            client.getDispatcher().finished(this);
            return;
_L2:
            responseCallback.onResponse(response);
            if (true) goto _L4; else goto _L3
_L3:
            Object obj;
            obj;
_L10:
            if (!flag) goto _L6; else goto _L5
_L5:
            Internal.logger.log(Level.INFO, (new StringBuilder()).append("Callback failure for ").append(toLoggableString()).toString(), ((Throwable) (obj)));
_L8:
            client.getDispatcher().finished(this);
            return;
_L6:
            responseCallback.onFailure(engine.getRequest(), ((IOException) (obj)));
            if (true) goto _L8; else goto _L7
_L7:
            obj;
            client.getDispatcher().finished(this);
            throw obj;
            obj;
            flag = false;
            if (true) goto _L10; else goto _L9
_L9:
        }

        Call get()
        {
            return Call.this;
        }

        String host()
        {
            return originalRequest.httpUrl().host();
        }

        Request request()
        {
            return originalRequest;
        }

        Object tag()
        {
            return originalRequest.tag();
        }

        private AsyncCall(Callback callback, boolean flag)
        {
            this$0 = Call.this;
            super("OkHttp %s", new Object[] {
                originalRequest.urlString()
            });
            responseCallback = callback;
            forWebSocket = flag;
        }

        AsyncCall(Callback callback, boolean flag, _cls1 _pcls1)
        {
            this(callback, flag);
        }
    }

}
