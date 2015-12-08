// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.android.volley.toolbox:
//            g

public final class e
    implements g
{

    protected final HttpClient a;

    public e(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, n n1)
    {
        n1 = n1.m();
        if (n1 != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(n1));
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

    public final HttpResponse a(n n1, Map map)
    {
        n1.a();
        JVM INSTR tableswitch -1 3: default 40
    //                   -1 50
    //                   0 161
    //                   1 191
    //                   2 221
    //                   3 176;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalStateException("Unknown request method.");
_L2:
        Object obj;
        byte abyte0[] = n1.k();
        int i;
        if (abyte0 != null)
        {
            obj = new HttpPost(n1.d());
            ((HttpPost) (obj)).addHeader("Content-Type", n1.j());
            ((HttpPost) (obj)).setEntity(new ByteArrayEntity(abyte0));
        } else
        {
            obj = new HttpGet(n1.d());
        }
_L8:
        a(((HttpUriRequest) (obj)), map);
        a(((HttpUriRequest) (obj)), n1.i());
        map = ((HttpUriRequest) (obj)).getParams();
        i = n1.p();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(((HttpUriRequest) (obj)));
_L3:
        obj = new HttpGet(n1.d());
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new HttpDelete(n1.d());
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new HttpPost(n1.d());
        ((HttpPost) (obj)).addHeader("Content-Type", n1.l());
        a(((HttpEntityEnclosingRequestBase) (obj)), n1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new HttpPut(n1.d());
        ((HttpPut) (obj)).addHeader("Content-Type", n1.l());
        a(((HttpEntityEnclosingRequestBase) (obj)), n1);
        if (true) goto _L8; else goto _L7
_L7:
    }
}
