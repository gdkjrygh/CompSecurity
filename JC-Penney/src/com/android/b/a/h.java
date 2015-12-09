// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import com.android.b.q;
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

// Referenced classes of package com.android.b.a:
//            k, i

public class h
    implements k
{

    protected final HttpClient a;

    public h(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, q q1)
    {
        q1 = q1.p();
        if (q1 != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(q1));
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

    static HttpUriRequest b(q q1, Map map)
    {
        switch (q1.a())
        {
        default:
            throw new IllegalStateException("Unknown request method.");

        case -1: 
            map = q1.l();
            if (map != null)
            {
                HttpPost httppost = new HttpPost(q1.c());
                httppost.addHeader("Content-Type", q1.k());
                httppost.setEntity(new ByteArrayEntity(map));
                return httppost;
            } else
            {
                return new HttpGet(q1.c());
            }

        case 0: // '\0'
            return new HttpGet(q1.c());

        case 3: // '\003'
            return new HttpDelete(q1.c());

        case 1: // '\001'
            map = new HttpPost(q1.c());
            map.addHeader("Content-Type", q1.o());
            a(map, q1);
            return map;

        case 2: // '\002'
            map = new HttpPut(q1.c());
            map.addHeader("Content-Type", q1.o());
            a(map, q1);
            return map;

        case 4: // '\004'
            return new HttpHead(q1.c());

        case 5: // '\005'
            return new HttpOptions(q1.c());

        case 6: // '\006'
            return new HttpTrace(q1.c());

        case 7: // '\007'
            map = new i(q1.c());
            map.addHeader("Content-Type", q1.o());
            a(map, q1);
            return map;
        }
    }

    public HttpResponse a(q q1, Map map)
    {
        HttpUriRequest httpurirequest = b(q1, map);
        a(httpurirequest, map);
        a(httpurirequest, q1.h());
        a(httpurirequest);
        map = httpurirequest.getParams();
        int j = q1.s();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, j);
        return a.execute(httpurirequest);
    }

    protected void a(HttpUriRequest httpurirequest)
    {
    }
}
