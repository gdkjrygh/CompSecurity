// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.o;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import java.util.Date;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            c, g, e, k

public static final class j
{

    public final long a;
    public final t b;
    public final v c;
    public Date d;
    public String e;
    public Date f;
    public String g;
    public Date h;
    public long i;
    public long j;
    public String k;
    public int l;

    public static boolean a(t t1)
    {
        return t1.a("If-Modified-Since") != null || t1.a("If-None-Match") != null;
    }

    public (long l1, t t1, v v1)
    {
        l = -1;
        a = l1;
        b = t1;
        c = v1;
        if (v1 != null)
        {
            t1 = v1.f;
            int i1 = 0;
            int j1 = ((o) (t1)).a.length / 2;
            while (i1 < j1) 
            {
                v1 = t1.a(i1);
                String s = t1.b(i1);
                if ("Date".equalsIgnoreCase(v1))
                {
                    d = com.squareup.okhttp.internal.http.g.a(s);
                    e = s;
                } else
                if ("Expires".equalsIgnoreCase(v1))
                {
                    h = com.squareup.okhttp.internal.http.g.a(s);
                } else
                if ("Last-Modified".equalsIgnoreCase(v1))
                {
                    f = com.squareup.okhttp.internal.http.g.a(s);
                    g = s;
                } else
                if ("ETag".equalsIgnoreCase(v1))
                {
                    k = s;
                } else
                if ("Age".equalsIgnoreCase(v1))
                {
                    l = com.squareup.okhttp.internal.http.e.b(s, -1);
                } else
                if (k.b.equalsIgnoreCase(v1))
                {
                    i = Long.parseLong(s);
                } else
                if (k.c.equalsIgnoreCase(v1))
                {
                    j = Long.parseLong(s);
                }
                i1++;
            }
        }
    }
}
