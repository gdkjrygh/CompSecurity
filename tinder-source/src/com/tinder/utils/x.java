// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.a.f;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.e;
import com.squareup.okhttp.o;
import com.squareup.okhttp.r;
import com.squareup.okhttp.s;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class x
    implements f
{

    private final s a;

    public x(s s1)
    {
        a = s1;
    }

    private static u a(Request request)
        throws AuthFailureError
    {
        byte abyte0[] = request.h();
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return u.a(r.a(request.g()), abyte0);
        }
    }

    public final HttpResponse a(Request request, Map map)
        throws IOException, AuthFailureError
    {
        com.squareup.okhttp.t.a a1;
        a.c().b(request.j(), TimeUnit.MILLISECONDS);
        a1 = new com.squareup.okhttp.t.a();
        a1.a(request.b());
        java.util.Map.Entry entry1;
        for (Iterator iterator = request.d().entrySet().iterator(); iterator.hasNext(); a1.b((String)entry1.getKey(), (String)entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); a1.b((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        request.a;
        JVM INSTR tableswitch -1 7: default 216
    //                   -1 226
    //                   0 322
    //                   1 350
    //                   2 364
    //                   3 333
    //                   4 378
    //                   5 389
    //                   6 400
    //                   7 411;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown method type.");
_L2:
        map = request.f();
        if (map != null)
        {
            a1.a("POST", u.a(r.a(request.e()), map));
        }
_L16:
        request = a1.a();
        map = a.a(request).a();
        request = ((v) (map)).b;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Protocol.values().length];
                try
                {
                    a[Protocol.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Protocol.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Protocol.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Protocol.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[request.ordinal()];
        JVM INSTR tableswitch 1 4: default 312
    //                   1 425
    //                   2 594
    //                   3 609
    //                   4 625;
           goto _L11 _L12 _L13 _L14 _L15
_L11:
        throw new IllegalAccessError("Unkwown protocol");
_L3:
        a1.a("GET", null);
          goto _L16
_L6:
        a1.a("DELETE", u.a(null, new byte[0]));
          goto _L16
_L4:
        a1.a("POST", a(request));
          goto _L16
_L5:
        a1.a("PUT", a(request));
          goto _L16
_L7:
        a1.a("HEAD", null);
          goto _L16
_L8:
        a1.a("OPTIONS", null);
          goto _L16
_L9:
        a1.a("TRACE", null);
          goto _L16
_L10:
        a1.a("PATCH", a(request));
          goto _L16
_L12:
        request = new ProtocolVersion("HTTP", 1, 0);
_L18:
        request = new BasicHttpResponse(new BasicStatusLine(request, ((v) (map)).c, ((v) (map)).d));
        BasicHttpEntity basichttpentity = new BasicHttpEntity();
        w w1 = ((v) (map)).g;
        basichttpentity.setContent(w1.d());
        basichttpentity.setContentLength(w1.b());
        basichttpentity.setContentEncoding(map.a("Content-Encoding"));
        if (w1.a() != null)
        {
            basichttpentity.setContentType(w1.a().a);
        }
        request.setEntity(basichttpentity);
        map = ((v) (map)).f;
        int j = ((o) (map)).a.length / 2;
        for (int i = 0; i < j; i++)
        {
            String s1 = map.a(i);
            String s2 = map.b(i);
            if (s1 != null)
            {
                request.addHeader(new BasicHeader(s1, s2));
            }
        }

        break; /* Loop/switch isn't completed */
_L13:
        request = new ProtocolVersion("HTTP", 1, 1);
        continue; /* Loop/switch isn't completed */
_L14:
        request = new ProtocolVersion("SPDY", 3, 1);
        continue; /* Loop/switch isn't completed */
_L15:
        request = new ProtocolVersion("HTTP", 2, 0);
        if (true) goto _L18; else goto _L17
_L17:
        return request;
    }
}
