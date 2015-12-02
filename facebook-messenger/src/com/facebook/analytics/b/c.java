// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.b;

import com.facebook.common.time.a;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.analytics.b:
//            a

public class c
{

    private final d a;
    private final String b;
    private final com.facebook.analytics.b.a c;
    private final a d;

    public c(d d1, String s, com.facebook.analytics.b.a a1, a a2)
    {
        a = d1;
        c = a1;
        b = s;
        d = a2;
    }

    private long a()
    {
        return a.a(aj.l, 0x1d4c0L);
    }

    private ae b(String s)
    {
        return c.b(b, s);
    }

    private ae c(String s)
    {
        return c.c(b, s);
    }

    public void a(String s, String s1)
    {
        a.b().a(c(s), s1).a(b(s), d.a()).a();
    }

    public boolean a(String s)
    {
        return d.a() - a.a(b(s), 0L) > a() && !a.a(c(s));
    }
}
