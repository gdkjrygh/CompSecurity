// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.HttpEngine;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            OkHttpClient, Dispatcher, Request, RequestBody, 
//            MediaType, Response, Interceptor

public class Call
{
    class ApplicationInterceptorChain
        implements Interceptor.Chain
    {

        private final boolean forWebSocket;
        private final int index;
        private final Request request;
        final Call this$0;

        public Response proceed(Request request1)
            throws IOException
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

        ApplicationInterceptorChain(int i, Request request1, boolean flag)
        {
            this$0 = Call.this;
            super();
            index = i;
            request = request1;
            forWebSocket = flag;
        }
    }


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
        throws IOException
    {
        return (new ApplicationInterceptorChain(0, originalRequest, flag)).proceed(originalRequest);
    }

    public Response execute()
        throws IOException
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
        throws IOException
    {
        int i;
        RequestBody requestbody = request.body();
        Object obj = request;
        if (requestbody != null)
        {
            request = request.newBuilder();
            obj = requestbody.contentType();
            if (obj != null)
            {
                request.header("Content-Type", ((MediaType) (obj)).toString());
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
            obj = request.build();
        }
        engine = new HttpEngine(client, ((Request) (obj)), false, false, flag, null, null, null, null);
        i = 0;
_L6:
        if (!canceled) goto _L2; else goto _L1
_L1:
        engine.releaseConnection();
        request = null;
_L4:
        return request;
_L2:
        Object obj1;
        try
        {
            engine.sendRequest();
            engine.readResponse();
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            obj1 = engine.recover(request, null);
            if (obj1 != null)
            {
                engine = ((HttpEngine) (obj1));
            } else
            {
                throw request;
            }
            continue; /* Loop/switch isn't completed */
        }
        obj1 = engine.getResponse();
        request = engine.followUpRequest();
        if (request != null)
        {
            break; /* Loop/switch isn't completed */
        }
        request = ((Request) (obj1));
        if (!flag)
        {
            engine.releaseConnection();
            return ((Response) (obj1));
        }
        if (true) goto _L4; else goto _L3
_L3:
        i++;
        if (i > 20)
        {
            throw new ProtocolException((new StringBuilder()).append("Too many follow-up requests: ").append(i).toString());
        }
        if (!engine.sameConnection(request.url()))
        {
            engine.releaseConnection();
        }
        Connection connection = engine.close();
        engine = new HttpEngine(client, request, false, false, flag, connection, null, null, ((Response) (obj1)));
        if (true) goto _L6; else goto _L5
_L5:
    }

}
