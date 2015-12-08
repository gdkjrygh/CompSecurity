// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.n;
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
//            g

public final class h
    implements g
{
    public static interface a
    {

        public abstract String a();
    }


    private final a a;
    private final SSLSocketFactory b;

    public h()
    {
        this((byte)0);
    }

    private h(byte byte0)
    {
        this('\0');
    }

    private h(char c)
    {
        a = null;
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

    private static void a(HttpURLConnection httpurlconnection, n n1)
    {
        byte abyte0[] = n1.m();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", n1.l());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(abyte0);
            httpurlconnection.close();
        }
    }

    public final HttpResponse a(n n1, Map map)
    {
        Object obj = n1.d();
        HashMap hashmap = new HashMap();
        hashmap.putAll(n1.i());
        hashmap.putAll(map);
        if (a != null)
        {
            String s = a.a();
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
        int i = n1.p();
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

        n1.a();
        JVM INSTR tableswitch -1 3: default 244
    //                   -1 254
    //                   0 335
    //                   1 353
    //                   2 367
    //                   3 344;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalStateException("Unknown method type.");
_L2:
        byte abyte0[] = n1.k();
        if (abyte0 != null)
        {
            map.setDoOutput(true);
            map.setRequestMethod("POST");
            map.addRequestProperty("Content-Type", n1.j());
            n1 = new DataOutputStream(map.getOutputStream());
            n1.write(abyte0);
            n1.close();
        }
_L8:
        n1 = new ProtocolVersion("HTTP", 1, 1);
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
        a(((HttpURLConnection) (map)), n1);
        continue; /* Loop/switch isn't completed */
_L5:
        map.setRequestMethod("PUT");
        a(((HttpURLConnection) (map)), n1);
        if (true) goto _L8; else goto _L7
_L7:
        n1 = new BasicHttpResponse(new BasicStatusLine(n1, map.getResponseCode(), map.getResponseMessage()));
        n1.setEntity(a(((HttpURLConnection) (map))));
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
                n1.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return n1;
    }
}
