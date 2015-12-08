// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.Request;
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

// Referenced classes of package com.mopub.volley.toolbox:
//            HttpStack

public class HurlStack
    implements HttpStack
{

    private final UrlRewriter a;
    private final SSLSocketFactory b;

    public HurlStack()
    {
        this(null);
    }

    public HurlStack(UrlRewriter urlrewriter)
    {
        this(urlrewriter, null);
    }

    public HurlStack(UrlRewriter urlrewriter, SSLSocketFactory sslsocketfactory)
    {
        a = urlrewriter;
        b = sslsocketfactory;
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

    private static void a(HttpURLConnection httpurlconnection, Request request)
    {
        byte abyte0[] = request.getBody();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", request.getBodyContentType());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(abyte0);
            httpurlconnection.close();
        }
    }

    public HttpResponse performRequest(Request request, Map map)
    {
        Object obj = request.getUrl();
        HashMap hashmap = new HashMap();
        hashmap.putAll(request.getHeaders());
        hashmap.putAll(map);
        if (a != null)
        {
            String s = a.rewriteUrl(((String) (obj)));
            map = s;
            if (s == null)
            {
                throw new IOException((new StringBuilder("URL blocked by rewriter: ")).append(((String) (obj))).toString());
            }
        } else
        {
            map = ((Map) (obj));
        }
        obj = new URL(map);
        map = (HttpURLConnection)((URL) (obj)).openConnection();
        int i = request.getTimeoutMs();
        map.setConnectTimeout(i);
        map.setReadTimeout(i);
        map.setUseCaches(false);
        map.setDoInput(true);
        if ("https".equals(((URL) (obj)).getProtocol()) && b != null)
        {
            ((HttpsURLConnection)map).setSSLSocketFactory(b);
        }
        String s1;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); map.addRequestProperty(s1, (String)hashmap.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        request.getMethod();
        JVM INSTR tableswitch -1 7: default 260
    //                   -1 270
    //                   0 351
    //                   1 369
    //                   2 383
    //                   3 360
    //                   4 397
    //                   5 406
    //                   6 415
    //                   7 424;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown method type.");
_L2:
        byte abyte0[] = request.getPostBody();
        if (abyte0 != null)
        {
            map.setDoOutput(true);
            map.setRequestMethod("POST");
            map.addRequestProperty("Content-Type", request.getPostBodyContentType());
            request = new DataOutputStream(map.getOutputStream());
            request.write(abyte0);
            request.close();
        }
_L12:
        request = new ProtocolVersion("HTTP", 1, 1);
        if (map.getResponseCode() == -1)
        {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        break; /* Loop/switch isn't completed */
_L3:
        map.setRequestMethod("GET");
        continue; /* Loop/switch isn't completed */
_L6:
        map.setRequestMethod("DELETE");
        continue; /* Loop/switch isn't completed */
_L4:
        map.setRequestMethod("POST");
        a(map, request);
        continue; /* Loop/switch isn't completed */
_L5:
        map.setRequestMethod("PUT");
        a(map, request);
        continue; /* Loop/switch isn't completed */
_L7:
        map.setRequestMethod("HEAD");
        continue; /* Loop/switch isn't completed */
_L8:
        map.setRequestMethod("OPTIONS");
        continue; /* Loop/switch isn't completed */
_L9:
        map.setRequestMethod("TRACE");
        continue; /* Loop/switch isn't completed */
_L10:
        map.setRequestMethod("PATCH");
        a(map, request);
        if (true) goto _L12; else goto _L11
_L11:
        request = new BasicHttpResponse(new BasicStatusLine(request, map.getResponseCode(), map.getResponseMessage()));
        request.setEntity(a(map));
        map = map.getHeaderFields().entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getKey() != null)
            {
                request.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return request;
    }

    private class UrlRewriter
    {

        public abstract String rewriteUrl(String s);
    }

}
