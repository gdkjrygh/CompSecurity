// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.a;
import com.android.volley.k;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.android.volley.toolbox:
//            f

public class d
    implements f
{
    public static final class a extends HttpEntityEnclosingRequestBase
    {

        public String getMethod()
        {
            return "PATCH";
        }

        public a()
        {
        }

        public a(String s)
        {
            setURI(URI.create(s));
        }
    }


    protected final HttpClient a;

    public d(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, k k1)
        throws com.android.volley.a
    {
        k1 = k1.s();
        if (k1 != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(k1));
        }
    }

    private static void a(HttpUriRequest httpurirequest, Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    static HttpUriRequest b(k k1, Map map)
        throws com.android.volley.a
    {
        switch (k1.a())
        {
        default:
            throw new IllegalStateException("Unknown request method.");

        case -1: 
            map = k1.o();
            if (map != null)
            {
                HttpPost httppost = new HttpPost(k1.e());
                httppost.addHeader("Content-Type", k1.n());
                httppost.setEntity(new ByteArrayEntity(map));
                return httppost;
            } else
            {
                return new HttpGet(k1.e());
            }

        case 0: // '\0'
            return new HttpGet(k1.e());

        case 3: // '\003'
            return new HttpDelete(k1.e());

        case 1: // '\001'
            map = new HttpPost(k1.e());
            map.addHeader("Content-Type", k1.r());
            a(map, k1);
            return map;

        case 2: // '\002'
            map = new HttpPut(k1.e());
            map.addHeader("Content-Type", k1.r());
            a(map, k1);
            return map;

        case 4: // '\004'
            return new HttpHead(k1.e());

        case 5: // '\005'
            return new HttpOptions(k1.e());

        case 6: // '\006'
            return new HttpTrace(k1.e());

        case 7: // '\007'
            map = new a(k1.e());
            map.addHeader("Content-Type", k1.r());
            a(map, k1);
            return map;
        }
    }

    public HttpResponse a(k k1, Map map)
        throws IOException, com.android.volley.a
    {
        HttpUriRequest httpurirequest = b(k1, map);
        a(httpurirequest, map);
        a(httpurirequest, k1.k());
        a(httpurirequest);
        map = httpurirequest.getParams();
        int i = k1.v();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(httpurirequest);
    }

    protected void a(HttpUriRequest httpurirequest)
        throws IOException
    {
    }
}
