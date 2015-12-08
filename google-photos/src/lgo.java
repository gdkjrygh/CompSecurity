// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class lgo
    implements lgn
{

    private final k a;
    private final SSLSocketFactory b;

    public lgo()
    {
        this(null);
    }

    private lgo(k k1)
    {
        this(null, null);
    }

    private lgo(k k1, SSLSocketFactory sslsocketfactory)
    {
        a = k1;
        b = null;
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

    private static void a(HttpURLConnection httpurlconnection, kyw kyw1)
    {
        if (false)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", kyw1.d());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(null);
            httpurlconnection.close();
        }
    }

    public final HttpResponse a(kyw kyw1, Map map)
    {
        Object obj = kyw1.b;
        HashMap hashmap = new HashMap();
        hashmap.putAll(kyw1.a());
        hashmap.putAll(map);
        if (a != null)
        {
            String s = a.w();
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
        int i = kyw1.e();
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

        kyw1.a;
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
        byte abyte0[] = kyw1.c();
        if (abyte0 != null)
        {
            map.setDoOutput(true);
            map.setRequestMethod("POST");
            map.addRequestProperty("Content-Type", kyw1.b());
            kyw1 = new DataOutputStream(map.getOutputStream());
            kyw1.write(abyte0);
            kyw1.close();
        }
_L12:
        kyw1 = new ProtocolVersion("HTTP", 1, 1);
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
        a(((HttpURLConnection) (map)), kyw1);
        continue; /* Loop/switch isn't completed */
_L5:
        map.setRequestMethod("PUT");
        a(((HttpURLConnection) (map)), kyw1);
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
        a(((HttpURLConnection) (map)), kyw1);
        if (true) goto _L12; else goto _L11
_L11:
        kyw1 = new BasicHttpResponse(new BasicStatusLine(kyw1, map.getResponseCode(), map.getResponseMessage()));
        kyw1.setEntity(a(((HttpURLConnection) (map))));
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
                kyw1.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return kyw1;
    }
}
