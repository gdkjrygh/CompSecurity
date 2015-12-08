// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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

// Referenced classes of package com.google.android.gms.internal:
//            yo, tj, yq

public final class yp
    implements yo
{

    private final yq a;
    private final SSLSocketFactory b;

    public yp()
    {
        this((byte)0);
    }

    private yp(byte byte0)
    {
        this('\0');
    }

    private yp(char c)
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

    public final HttpResponse a(tj tj1, Map map)
    {
        Object obj = tj1.d();
        HashMap hashmap = new HashMap();
        hashmap.putAll(tj1.a());
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
        int i = tj1.j();
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

        tj1.b();
        JVM INSTR tableswitch -1 7: default 260
    //                   -1 276
    //                   0 270
    //                   1 315
    //                   2 324
    //                   3 306
    //                   4 333
    //                   5 342
    //                   6 351
    //                   7 360;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException("Unknown method type.");
_L3:
        map.setRequestMethod("GET");
_L12:
        tj1 = new ProtocolVersion("HTTP", 1, 1);
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
        continue; /* Loop/switch isn't completed */
_L5:
        map.setRequestMethod("PUT");
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
        if (true) goto _L12; else goto _L11
_L11:
        tj1 = new BasicHttpResponse(new BasicStatusLine(tj1, map.getResponseCode(), map.getResponseMessage()));
        tj1.setEntity(a(((HttpURLConnection) (map))));
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
                tj1.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return tj1;
    }
}
