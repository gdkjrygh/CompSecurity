// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

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
import p.k.a;
import p.k.l;

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

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, l l1)
        throws p.k.a
    {
        l1 = l1.q();
        if (l1 != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(l1));
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

    static HttpUriRequest b(l l1, Map map)
        throws p.k.a
    {
        switch (l1.a())
        {
        default:
            throw new IllegalStateException("Unknown request method.");

        case -1: 
            map = l1.m();
            if (map != null)
            {
                HttpPost httppost = new HttpPost(l1.c());
                httppost.addHeader("Content-Type", l1.l());
                httppost.setEntity(new ByteArrayEntity(map));
                return httppost;
            } else
            {
                return new HttpGet(l1.c());
            }

        case 0: // '\0'
            return new HttpGet(l1.c());

        case 3: // '\003'
            return new HttpDelete(l1.c());

        case 1: // '\001'
            map = new HttpPost(l1.c());
            map.addHeader("Content-Type", l1.p());
            a(map, l1);
            return map;

        case 2: // '\002'
            map = new HttpPut(l1.c());
            map.addHeader("Content-Type", l1.p());
            a(map, l1);
            return map;

        case 4: // '\004'
            return new HttpHead(l1.c());

        case 5: // '\005'
            return new HttpOptions(l1.c());

        case 6: // '\006'
            return new HttpTrace(l1.c());

        case 7: // '\007'
            map = new a(l1.c());
            map.addHeader("Content-Type", l1.p());
            a(map, l1);
            return map;
        }
    }

    public HttpResponse a(l l1, Map map)
        throws IOException, p.k.a
    {
        HttpUriRequest httpurirequest = b(l1, map);
        a(httpurirequest, map);
        a(httpurirequest, l1.i());
        a(httpurirequest);
        map = httpurirequest.getParams();
        int i = l1.t();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(httpurirequest);
    }

    protected void a(HttpUriRequest httpurirequest)
        throws IOException
    {
    }
}
