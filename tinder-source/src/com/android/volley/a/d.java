// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
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

// Referenced classes of package com.android.volley.a:
//            f

public final class d
    implements f
{
    public static final class a extends HttpEntityEnclosingRequestBase
    {

        public final String getMethod()
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

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, Request request)
        throws AuthFailureError
    {
        request = request.h();
        if (request != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(request));
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

    public final HttpResponse a(Request request, Map map)
        throws IOException, AuthFailureError
    {
        request.a;
        JVM INSTR tableswitch -1 7: default 56
    //                   -1 66
    //                   0 177
    //                   1 207
    //                   2 237
    //                   3 192
    //                   4 267
    //                   5 282
    //                   6 297
    //                   7 312;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown request method.");
_L2:
        Object obj;
        byte abyte0[] = request.f();
        int i;
        if (abyte0 != null)
        {
            obj = new HttpPost(request.b());
            ((HttpPost) (obj)).addHeader("Content-Type", request.e());
            ((HttpPost) (obj)).setEntity(new ByteArrayEntity(abyte0));
        } else
        {
            obj = new HttpGet(request.b());
        }
_L12:
        a(((HttpUriRequest) (obj)), map);
        a(((HttpUriRequest) (obj)), request.d());
        map = ((HttpUriRequest) (obj)).getParams();
        i = request.j();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(((HttpUriRequest) (obj)));
_L3:
        obj = new HttpGet(request.b());
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new HttpDelete(request.b());
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new HttpPost(request.b());
        ((HttpPost) (obj)).addHeader("Content-Type", request.g());
        a(((HttpEntityEnclosingRequestBase) (obj)), request);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new HttpPut(request.b());
        ((HttpPut) (obj)).addHeader("Content-Type", request.g());
        a(((HttpEntityEnclosingRequestBase) (obj)), request);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new HttpHead(request.b());
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new HttpOptions(request.b());
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new HttpTrace(request.b());
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new a(request.b());
        ((a) (obj)).addHeader("Content-Type", request.g());
        a(((HttpEntityEnclosingRequestBase) (obj)), request);
        if (true) goto _L12; else goto _L11
_L11:
    }
}
