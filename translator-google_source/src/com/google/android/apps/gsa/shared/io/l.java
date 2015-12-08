// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.base.Predicates;
import com.google.common.base.p;
import com.google.common.base.q;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            m, i

public final class l
{

    public static final Set a = ImmutableSet.of("GET", "POST");
    public static final Set b;
    public static final q c = Predicates.a(ImmutableSet.of(Integer.valueOf(200), Integer.valueOf(204)));
    public static final q d = Predicates.a(ImmutableSet.of(Integer.valueOf(200), Integer.valueOf(204), Integer.valueOf(503)));
    public static final q e = Predicates.a();
    public final URL f;
    public final String g;
    public final ImmutableList h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final boolean r;
    public final q s;

    l(m m1)
    {
        com.google.common.collect.ej ej;
        boolean flag;
        boolean flag1;
        boolean flag4;
        flag4 = true;
        super();
        f = (URL)com.google.common.base.p.a(m1.b);
        com.google.common.base.p.a(a.contains(m1.a));
        g = (String)com.google.common.base.p.a(m1.a);
        h = ImmutableList.copyOf(m1.c);
        i = m1.h;
        ej = h.iterator();
        flag1 = false;
        flag = false;
_L2:
        boolean flag2;
        if (!ej.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        i i1 = (i)ej.next();
        flag2 = flag;
        if (!i1.b.equalsIgnoreCase("Cache-Control"))
        {
            break MISSING_BLOCK_LABEL_366;
        }
        if (i1.c.toLowerCase().contains("no-cache"))
        {
            flag = true;
        }
        flag2 = flag;
        if (!i1.c.toLowerCase().contains("no-store"))
        {
            break MISSING_BLOCK_LABEL_366;
        }
        flag2 = true;
        flag1 = flag;
        flag = flag2;
_L3:
        flag2 = flag1;
        flag1 = flag;
        flag = flag2;
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag3;
        if (!flag || !flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        r = flag3;
        j = m1.g;
        k = m1.d;
        if (k && "POST".equals(g))
        {
            L.a(5, "HttpRequestData", "Trying to follow redirects on a POST request.", new Object[0]);
        }
        l = m1.e;
        if (m1.i != -1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        com.google.common.base.p.a(flag3);
        m = m1.i;
        if (m1.f >= 0)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        com.google.common.base.p.a(flag3);
        n = m1.f;
        o = a(m1.j);
        p = a(m1.k);
        q = m1.l;
        s = (q)com.google.common.base.p.a(m1.m);
        return;
        flag = flag1;
        flag1 = flag2;
          goto _L3
    }

    private static int a(int i1)
    {
        boolean flag;
        if (i1 > 0 || i1 == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.common.base.p.a(flag, "Invalid timeout value: %s.", new Object[] {
            Integer.valueOf(i1)
        });
        return i1;
    }

    public static m a()
    {
        m m1 = new m();
        com.google.common.base.p.a(a.contains("POST"));
        m1.a = "POST";
        m1.d = false;
        m1 = m1.b("Cache-Control", "no-cache, no-store");
        m1.g = false;
        return m1;
    }

    static 
    {
        b = ImmutableSet.of("Authorization".toLowerCase(Locale.US), "Cookie".toLowerCase(Locale.US), "From".toLowerCase(Locale.US), "If-Modified-Since".toLowerCase(Locale.US), "If-Range".toLowerCase(Locale.US), "If-Unmodified-Since".toLowerCase(Locale.US), new String[] {
            "Max-Forwards".toLowerCase(Locale.US), "Proxy-Authorization".toLowerCase(Locale.US), "Referer".toLowerCase(Locale.US), "User-Agent".toLowerCase(Locale.US)
        });
    }
}
