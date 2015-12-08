// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext, HttpProcessor

public class HttpRequestExecutor
{

    public HttpRequestExecutor()
    {
    }

    private static final void closeConnection(HttpClientConnection httpclientconnection)
    {
        try
        {
            httpclientconnection.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpClientConnection httpclientconnection)
        {
            return;
        }
    }

    protected boolean canResponseHaveBody(HttpRequest httprequest, HttpResponse httpresponse)
    {
        int i;
        if (!"HEAD".equalsIgnoreCase(httprequest.getRequestLine().getMethod()))
        {
            if ((i = httpresponse.getStatusLine().getStatusCode()) >= 200 && i != 204 && i != 304 && i != 205)
            {
                return true;
            }
        }
        return false;
    }

    protected HttpResponse doReceiveResponse(HttpRequest httprequest, HttpClientConnection httpclientconnection, HttpContext httpcontext)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpclientconnection == null)
        {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        httpcontext = null;
        for (int i = 0; httpcontext == null || i < 200; i = httpcontext.getStatusLine().getStatusCode())
        {
            httpcontext = httpclientconnection.receiveResponseHeader();
            if (canResponseHaveBody(httprequest, httpcontext))
            {
                httpclientconnection.receiveResponseEntity(httpcontext);
            }
        }

        return httpcontext;
    }

    protected HttpResponse doSendRequest(HttpRequest httprequest, HttpClientConnection httpclientconnection, HttpContext httpcontext)
    {
        Object obj;
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpclientconnection == null)
        {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        httpcontext.setAttribute("http.connection", httpclientconnection);
        httpcontext.setAttribute("http.request_sent", Boolean.FALSE);
        httpclientconnection.sendRequestHeader(httprequest);
        if (!(httprequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_292;
        }
        obj = httprequest.getRequestLine().getProtocolVersion();
        if (!((HttpEntityEnclosingRequest)httprequest).expectContinue() || ((ProtocolVersion) (obj)).lessEquals(HttpVersion.HTTP_1_0)) goto _L2; else goto _L1
_L1:
        httpclientconnection.flush();
        if (!httpclientconnection.isResponseAvailable(httprequest.getParams().getIntParameter("http.protocol.wait-for-continue", 2000))) goto _L2; else goto _L3
_L3:
        HttpResponse httpresponse;
        boolean flag;
        obj = httpclientconnection.receiveResponseHeader();
        if (canResponseHaveBody(httprequest, ((HttpResponse) (obj))))
        {
            httpclientconnection.receiveResponseEntity(((HttpResponse) (obj)));
        }
        int i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i < 200)
        {
            if (i != 100)
            {
                throw new ProtocolException((new StringBuilder("Unexpected response: ")).append(((HttpResponse) (obj)).getStatusLine()).toString());
            }
            obj = null;
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        httpresponse = ((HttpResponse) (obj));
        if (flag)
        {
            httpclientconnection.sendRequestEntity((HttpEntityEnclosingRequest)httprequest);
            httpresponse = ((HttpResponse) (obj));
        }
_L5:
        httpclientconnection.flush();
        httpcontext.setAttribute("http.request_sent", Boolean.TRUE);
        return httpresponse;
_L2:
        obj = null;
        flag = true;
          goto _L4
        httpresponse = null;
          goto _L5
    }

    public HttpResponse execute(HttpRequest httprequest, HttpClientConnection httpclientconnection, HttpContext httpcontext)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpclientconnection == null)
        {
            throw new IllegalArgumentException("Client connection may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        HttpResponse httpresponse;
        HttpResponse httpresponse1;
        try
        {
            httpresponse1 = doSendRequest(httprequest, httpclientconnection, httpcontext);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            closeConnection(httpclientconnection);
            throw httprequest;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            closeConnection(httpclientconnection);
            throw httprequest;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            closeConnection(httpclientconnection);
            throw httprequest;
        }
        httpresponse = httpresponse1;
        if (httpresponse1 != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        httpresponse = doReceiveResponse(httprequest, httpclientconnection, httpcontext);
        return httpresponse;
    }

    public void postProcess(HttpResponse httpresponse, HttpProcessor httpprocessor, HttpContext httpcontext)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (httpprocessor == null)
        {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else
        {
            httpcontext.setAttribute("http.response", httpresponse);
            httpprocessor.process(httpresponse, httpcontext);
            return;
        }
    }

    public void preProcess(HttpRequest httprequest, HttpProcessor httpprocessor, HttpContext httpcontext)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpprocessor == null)
        {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else
        {
            httpcontext.setAttribute("http.request", httprequest);
            httpprocessor.process(httprequest, httpcontext);
            return;
        }
    }
}
