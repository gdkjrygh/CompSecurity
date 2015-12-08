// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.httpstack;

import com.netflix.mediaclient.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.netflix.mediaclient.httpstack:
//            HttpStack, HttpUrlStackConnection, HttpStackConnection

public class HttpUrlStack
    implements HttpStack
{

    private static final boolean LOG_VERBOSE = false;
    private static final String TAG = "HttpUrlStack";

    public HttpUrlStack()
    {
    }

    private static HttpEntity entityFromConnection(HttpURLConnection httpurlconnection)
    {
        BasicHttpEntity basichttpentity = new BasicHttpEntity();
        java.io.InputStream inputstream;
        try
        {
            inputstream = httpurlconnection.getInputStream();
        }
        catch (IOException ioexception)
        {
            ioexception = httpurlconnection.getErrorStream();
        }
        basichttpentity.setContent(inputstream);
        basichttpentity.setContentLength(httpurlconnection.getContentLength());
        basichttpentity.setContentEncoding(httpurlconnection.getContentEncoding());
        basichttpentity.setContentType(httpurlconnection.getContentType());
        return basichttpentity;
    }

    public void disconnect(HttpStackConnection httpstackconnection)
    {
        if (!(httpstackconnection instanceof HttpUrlStackConnection))
        {
            Log.e("HttpUrlStack", "urlConnection null - wrong HttpStackConnection object?");
        } else
        {
            httpstackconnection = ((HttpUrlStackConnection)httpstackconnection).getUrlConnection();
            if (httpstackconnection != null)
            {
                httpstackconnection.disconnect();
                return;
            }
        }
    }

    public HttpStackConnection getConnection(String s)
        throws IOException
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
        if (!(httpurlconnection instanceof HttpURLConnection))
        {
            throw new IOException("Not an HTTP connection");
        } else
        {
            httpurlconnection.setRequestMethod("GET");
            httpurlconnection.setRequestProperty("Accept-Charset", "UTF-8");
            httpurlconnection.setDoOutput(false);
            httpurlconnection.setDoInput(true);
            httpurlconnection.setConnectTimeout(15000);
            httpurlconnection.setReadTimeout(10000);
            return new HttpUrlStackConnection(httpurlconnection, s);
        }
    }

    public List getResponseCookies(HttpStackConnection httpstackconnection)
    {
        if (httpstackconnection instanceof HttpUrlStackConnection) goto _L2; else goto _L1
_L1:
        Log.e("HttpUrlStack", "urlConnection null - wrong HttpStackConnection object?");
        httpstackconnection = null;
_L4:
        return httpstackconnection;
_L2:
        httpstackconnection = ((HttpUrlStackConnection)httpstackconnection).getUrlConnection();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = ((List)httpstackconnection.getHeaderFields().get("Set-Cookie")).iterator();
        do
        {
            httpstackconnection = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            httpstackconnection = (String)iterator.next();
            arraylist.add(new BasicClientCookie(httpstackconnection.substring(0, httpstackconnection.indexOf("=")), httpstackconnection.substring(httpstackconnection.indexOf("=") + 1, httpstackconnection.length())));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public HttpResponse performGet(HttpStackConnection httpstackconnection)
        throws IOException
    {
        if (!(httpstackconnection instanceof HttpUrlStackConnection))
        {
            throw new IOException("urlConnection null - wrong HttpStackConnection object?");
        }
        Object obj = ((HttpUrlStackConnection)httpstackconnection).getUrlConnection();
        ((HttpURLConnection) (obj)).setRequestProperty("Cookie", ((HttpUrlStackConnection)httpstackconnection).getCookies());
        httpstackconnection = new ProtocolVersion("HTTP", 1, 1);
        if (((HttpURLConnection) (obj)).getResponseCode() == -1)
        {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        httpstackconnection = new BasicHttpResponse(new BasicStatusLine(httpstackconnection, ((HttpURLConnection) (obj)).getResponseCode(), ((HttpURLConnection) (obj)).getResponseMessage()));
        httpstackconnection.setEntity(entityFromConnection(((HttpURLConnection) (obj))));
        obj = ((HttpURLConnection) (obj)).getHeaderFields().entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (entry.getKey() != null)
            {
                httpstackconnection.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return httpstackconnection;
    }
}
