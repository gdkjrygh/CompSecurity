// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.c;

import com.facebook.http.b.m;
import javax.inject.a;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.facebook.http.c:
//            h, e

public class g
{

    private final m a;
    private final a b;
    private final e c;

    public g(m m1, a a1, e e1)
    {
        a = m1;
        b = a1;
        c = e1;
        c.a(new h(this));
    }

    private void a()
    {
        a.getConnectionManager().getSchemeRegistry().register(new Scheme("https", (SocketFactory)b.b(), 443));
        a.getParams().setParameter("http.route.default-proxy", c.a());
    }

    static void a(g g1)
    {
        g1.a();
    }
}
