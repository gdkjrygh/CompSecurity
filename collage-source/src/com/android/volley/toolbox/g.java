// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.a;
import com.android.volley.k;
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
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.android.volley.toolbox:
//            f

public class g
    implements f
{
    public static interface a
    {

        public abstract String a(String s);
    }


    private final a a;
    private final SSLSocketFactory b;

    public g()
    {
        this(null);
    }

    public g(a a1)
    {
        this(a1, null);
    }

    public g(a a1, SSLSocketFactory sslsocketfactory)
    {
        a = a1;
        b = sslsocketfactory;
    }

    private HttpURLConnection a(URL url, k k1)
        throws IOException
    {
        HttpURLConnection httpurlconnection = a(url);
        int i = k1.v();
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

    static void a(HttpURLConnection httpurlconnection, k k1)
        throws IOException, com.android.volley.a
    {
        switch (k1.a())
        {
        default:
            throw new IllegalStateException("Unknown method type.");

        case -1: 
            byte abyte0[] = k1.o();
            if (abyte0 != null)
            {
                httpurlconnection.setDoOutput(true);
                httpurlconnection.setRequestMethod("POST");
                httpurlconnection.addRequestProperty("Content-Type", k1.n());
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
            b(httpurlconnection, k1);
            return;

        case 2: // '\002'
            httpurlconnection.setRequestMethod("PUT");
            b(httpurlconnection, k1);
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
            httpurlconnection.setRequestMethod("PATCH");
            b(httpurlconnection, k1);
            return;
        }
    }

    private static boolean a(int i, int j)
    {
        return i != 4 && (100 > j || j >= 200) && j != 204 && j != 304;
    }

    private static void b(HttpURLConnection httpurlconnection, k k1)
        throws IOException, com.android.volley.a
    {
        byte abyte0[] = k1.s();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", k1.r());
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

    public HttpResponse a(k k1, Map map)
        throws IOException, com.android.volley.a
    {
        Object obj = k1.e();
        HashMap hashmap = new HashMap();
        hashmap.putAll(k1.k());
        hashmap.putAll(map);
        if (a != null)
        {
            String s = a.a(((String) (obj)));
            map = s;
            if (s == null)
            {
                throw new IOException((new StringBuilder()).append("URL blocked by rewriter: ").append(((String) (obj))).toString());
            }
        } else
        {
            map = ((Map) (obj));
        }
        map = a(new URL(map), k1);
        String s1;
        for (obj = hashmap.keySet().iterator(); ((Iterator) (obj)).hasNext(); map.addRequestProperty(s1, (String)hashmap.get(s1)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        a(((HttpURLConnection) (map)), k1);
        obj = new ProtocolVersion("HTTP", 1, 1);
        if (map.getResponseCode() == -1)
        {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicStatusLine basicstatusline = new BasicStatusLine(((ProtocolVersion) (obj)), map.getResponseCode(), map.getResponseMessage());
        obj = new BasicHttpResponse(basicstatusline);
        if (a(k1.a(), basicstatusline.getStatusCode()))
        {
            ((BasicHttpResponse) (obj)).setEntity(a(((HttpURLConnection) (map))));
        }
        k1 = map.getHeaderFields().entrySet().iterator();
        do
        {
            if (!k1.hasNext())
            {
                break;
            }
            map = (java.util.Map.Entry)k1.next();
            if (map.getKey() != null)
            {
                ((BasicHttpResponse) (obj)).addHeader(new BasicHeader((String)map.getKey(), (String)((List)map.getValue()).get(0)));
            }
        } while (true);
        return ((HttpResponse) (obj));
    }
}
