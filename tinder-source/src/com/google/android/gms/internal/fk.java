// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.google.android.gms.internal:
//            fm, zza, zzk

public final class fk
    implements fm
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

    public fk(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpUriRequest httpurirequest, Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    public final HttpResponse a(zzk zzk1, Map map)
        throws IOException, zza
    {
        zzk1.c;
        JVM INSTR tableswitch -1 7: default 56
    //                   -1 66
    //                   0 128
    //                   1 158
    //                   2 182
    //                   3 143
    //                   4 206
    //                   5 221
    //                   6 236
    //                   7 251;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown request method.");
_L2:
        Object obj = new HttpGet(zzk1.d);
_L12:
        a(((HttpUriRequest) (obj)), map);
        a(((HttpUriRequest) (obj)), zzk1.a());
        map = ((HttpUriRequest) (obj)).getParams();
        int i = zzk1.c();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(((HttpUriRequest) (obj)));
_L3:
        obj = new HttpGet(zzk1.d);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new HttpDelete(zzk1.d);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new HttpPost(zzk1.d);
        ((HttpPost) (obj)).addHeader("Content-Type", zzk.b());
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new HttpPut(zzk1.d);
        ((HttpPut) (obj)).addHeader("Content-Type", zzk.b());
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new HttpHead(zzk1.d);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new HttpOptions(zzk1.d);
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new HttpTrace(zzk1.d);
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new a(zzk1.d);
        ((a) (obj)).addHeader("Content-Type", zzk.b());
        if (true) goto _L12; else goto _L11
_L11:
    }
}
