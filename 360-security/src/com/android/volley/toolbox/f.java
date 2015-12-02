// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.android.volley.toolbox:
//            e

public class f
    implements e
{
    public static interface a
    {

        public abstract String a(String s);
    }


    private final a a;
    private final SSLSocketFactory b;

    public f()
    {
        this(null);
    }

    public f(a a1)
    {
        this(a1, null);
    }

    public f(a a1, SSLSocketFactory sslsocketfactory)
    {
        a = a1;
        b = sslsocketfactory;
    }

    private HttpURLConnection a(URL url, Request request)
        throws IOException
    {
        HttpURLConnection httpurlconnection = a(url);
        int i = request.t();
        httpurlconnection.setConnectTimeout(i);
        httpurlconnection.setReadTimeout(i);
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && b != null)
        {
            ((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(b);
        }
        return httpurlconnection;
    }

    private static HttpEntity a(HttpURLConnection httpurlconnection)
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

    static void a(HttpURLConnection httpurlconnection, Request request)
        throws IOException, AuthFailureError
    {
        switch (request.a())
        {
        default:
            throw new IllegalStateException("Unknown method type.");

        case -1: 
            byte abyte0[] = request.m();
            if (abyte0 != null)
            {
                httpurlconnection.setDoOutput(true);
                httpurlconnection.setRequestMethod("POST");
                httpurlconnection.addRequestProperty("Content-Type", request.l());
                httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
                httpurlconnection.write(abyte0);
                httpurlconnection.close();
            }
            return;

        case 0: // '\0'
            httpurlconnection.setRequestMethod("GET");
            return;

        case 3: // '\003'
            httpurlconnection.setRequestMethod("DELETE");
            return;

        case 1: // '\001'
            httpurlconnection.setRequestMethod("POST");
            b(httpurlconnection, request);
            return;

        case 2: // '\002'
            httpurlconnection.setRequestMethod("PUT");
            b(httpurlconnection, request);
            return;

        case 4: // '\004'
            httpurlconnection.setRequestMethod("HEAD");
            return;

        case 5: // '\005'
            httpurlconnection.setRequestMethod("OPTIONS");
            return;

        case 6: // '\006'
            httpurlconnection.setRequestMethod("TRACE");
            return;

        case 7: // '\007'
            b(httpurlconnection, request);
            httpurlconnection.setRequestMethod("PATCH");
            return;
        }
    }

    private static void b(HttpURLConnection httpurlconnection, Request request)
        throws IOException, AuthFailureError
    {
        byte abyte0[] = request.q();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", request.p());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(abyte0);
            httpurlconnection.close();
        }
    }

    protected HttpURLConnection a(URL url)
        throws IOException
    {
        return (HttpURLConnection)url.openConnection();
    }

    public HttpResponse a(Request request, Map map)
        throws IOException, AuthFailureError
    {
        Object obj = request.d();
        HashMap hashmap = new HashMap();
        hashmap.putAll(request.i());
        hashmap.putAll(map);
        if (a != null)
        {
            String s = a.a(((String) (obj)));
            map = s;
            if (s == null)
            {
                throw new IOException((new StringBuilder("URL blocked by rewriter: ")).append(((String) (obj))).toString());
            }
        } else
        {
            map = ((Map) (obj));
        }
        map = a(new URL(map), request);
        obj = hashmap.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                a(((HttpURLConnection) (map)), request);
                request = new ProtocolVersion("HTTP", 1, 1);
                if (map.getResponseCode() == -1)
                {
                    throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                }
                break;
            }
            String s1 = (String)((Iterator) (obj)).next();
            map.addRequestProperty(s1, (String)hashmap.get(s1));
        } while (true);
        request = new BasicHttpResponse(new BasicStatusLine(request, map.getResponseCode(), map.getResponseMessage()));
        request.setEntity(a(((HttpURLConnection) (map))));
        map = map.getHeaderFields().entrySet().iterator();
        do
        {
            java.util.Map.Entry entry;
            do
            {
                if (!map.hasNext())
                {
                    return request;
                }
                entry = (java.util.Map.Entry)map.next();
            } while (entry.getKey() == null);
            request.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
        } while (true);
    }
}
