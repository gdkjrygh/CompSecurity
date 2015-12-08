// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.am;

import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.o;
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

// Referenced classes of package com.google.android.m4b.maps.am:
//            e

public final class f
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
        this(a1, (byte)0);
    }

    private f(a a1, byte byte0)
    {
        a = a1;
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

    private static void a(HttpURLConnection httpurlconnection, k k1)
    {
        byte abyte0[] = k1.c();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", k1.b());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(abyte0);
            httpurlconnection.close();
        }
    }

    public final HttpResponse a(k k1, Map map)
    {
        Object obj = k1.b;
        HashMap hashmap = new HashMap();
        hashmap.putAll(k1.a());
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
        obj = new URL(map);
        map = (HttpURLConnection)((URL) (obj)).openConnection();
        int i = k1.j.a;
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

        k1.a;
        JVM INSTR tableswitch -1 7: default 264
    //                   -1 280
    //                   0 274
    //                   1 319
    //                   2 333
    //                   3 310
    //                   4 347
    //                   5 356
    //                   6 365
    //                   7 374;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException("Unknown method type.");
_L3:
        map.setRequestMethod("GET");
_L12:
        k1 = new ProtocolVersion("HTTP", 1, 1);
        if (map.getResponseCode() == -1)
        {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        break; /* Loop/switch isn't completed */
_L6:
        map.setRequestMethod("DELETE");
        continue; /* Loop/switch isn't completed */
_L4:
        map.setRequestMethod("POST");
        a(((HttpURLConnection) (map)), k1);
        continue; /* Loop/switch isn't completed */
_L5:
        map.setRequestMethod("PUT");
        a(((HttpURLConnection) (map)), k1);
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
        a(((HttpURLConnection) (map)), k1);
        if (true) goto _L12; else goto _L11
_L11:
        k1 = new BasicHttpResponse(new BasicStatusLine(k1, map.getResponseCode(), map.getResponseMessage()));
        k1.setEntity(a(((HttpURLConnection) (map))));
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
                k1.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return k1;
    }
}
