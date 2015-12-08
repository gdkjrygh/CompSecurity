// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

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
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.android.volley.a:
//            f

public final class g
    implements f
{
    public static interface a
    {

        public abstract String a();
    }


    private final a a;
    private final SSLSocketFactory b;

    public g()
    {
        this((byte)0);
    }

    private g(byte byte0)
    {
        this('\0');
    }

    private g(char c)
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

    private static void a(HttpURLConnection httpurlconnection, Request request)
        throws IOException, AuthFailureError
    {
        byte abyte0[] = request.h();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", request.g());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(abyte0);
            httpurlconnection.close();
        }
    }

    public final HttpResponse a(Request request, Map map)
        throws IOException, AuthFailureError
    {
        Object obj = request.b();
        HashMap hashmap = new HashMap();
        hashmap.putAll(request.d());
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
        int i = request.j();
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

        request.a;
        JVM INSTR tableswitch -1 7: default 260
    //                   -1 270
    //                   0 354
    //                   1 372
    //                   2 386
    //                   3 363
    //                   4 400
    //                   5 409
    //                   6 418
    //                   7 427;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown method type.");
_L2:
        byte abyte0[] = request.f();
        if (abyte0 != null)
        {
            map.setDoOutput(true);
            map.setRequestMethod("POST");
            map.addRequestProperty("Content-Type", request.e());
            DataOutputStream dataoutputstream = new DataOutputStream(map.getOutputStream());
            dataoutputstream.write(abyte0);
            dataoutputstream.close();
        }
_L12:
        Object obj1;
        obj1 = new ProtocolVersion("HTTP", 1, 1);
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
        a(((HttpURLConnection) (map)), request);
        continue; /* Loop/switch isn't completed */
_L5:
        map.setRequestMethod("PUT");
        a(((HttpURLConnection) (map)), request);
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
        a(((HttpURLConnection) (map)), request);
        if (true) goto _L12; else goto _L11
_L11:
        BasicStatusLine basicstatusline = new BasicStatusLine(((ProtocolVersion) (obj1)), map.getResponseCode(), map.getResponseMessage());
        obj1 = new BasicHttpResponse(basicstatusline);
        int j = request.a;
        int k = basicstatusline.getStatusCode();
        boolean flag;
        if (j != 4 && (100 > k || k >= 200) && k != 204 && k != 304)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ((BasicHttpResponse) (obj1)).setEntity(a(((HttpURLConnection) (map))));
        }
        request = map.getHeaderFields().entrySet().iterator();
        do
        {
            if (!request.hasNext())
            {
                break;
            }
            map = (java.util.Map.Entry)request.next();
            if (map.getKey() != null)
            {
                ((BasicHttpResponse) (obj1)).addHeader(new BasicHeader((String)map.getKey(), (String)((List)map.getValue()).get(0)));
            }
        } while (true);
        return ((HttpResponse) (obj1));
    }
}
