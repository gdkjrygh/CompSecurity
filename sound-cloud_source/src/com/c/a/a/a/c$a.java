// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import com.c.a.A;
import com.c.a.p;
import com.c.a.w;
import java.util.Date;

// Referenced classes of package com.c.a.a.a:
//            c, f, d, m

public static final class 
{

    public final long a;
    public final w b;
    public final A c;
    public Date d;
    public String e;
    public Date f;
    public String g;
    public Date h;
    public long i;
    public long j;
    public String k;
    public int l;

    public static boolean a(w w1)
    {
        return w1.a("If-Modified-Since") != null || w1.a("If-None-Match") != null;
    }

    public (long l1, w w1, A a1)
    {
        l = -1;
        a = l1;
        b = w1;
        c = a1;
        if (a1 != null)
        {
            w1 = a1.f;
            int i1 = 0;
            int j1 = ((p) (w1)).a.length / 2;
            while (i1 < j1) 
            {
                a1 = w1.a(i1);
                String s = w1.b(i1);
                if ("Date".equalsIgnoreCase(a1))
                {
                    d = com.c.a.a.a.f.a(s);
                    e = s;
                } else
                if ("Expires".equalsIgnoreCase(a1))
                {
                    h = com.c.a.a.a.f.a(s);
                } else
                if ("Last-Modified".equalsIgnoreCase(a1))
                {
                    f = com.c.a.a.a.f.a(s);
                    g = s;
                } else
                if ("ETag".equalsIgnoreCase(a1))
                {
                    k = s;
                } else
                if ("Age".equalsIgnoreCase(a1))
                {
                    l = com.c.a.a.a.d.b(s, -1);
                } else
                if (m.b.equalsIgnoreCase(a1))
                {
                    i = Long.parseLong(s);
                } else
                if (m.c.equalsIgnoreCase(a1))
                {
                    j = Long.parseLong(s);
                }
                i1++;
            }
        }
    }
}
