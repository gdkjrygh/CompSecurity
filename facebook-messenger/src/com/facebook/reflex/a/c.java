// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.a;

import com.facebook.analytics.cb;
import com.facebook.prefs.shared.d;
import com.facebook.reflex.ae;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.reflex.a:
//            a, b

public class c extends a
{

    private final b a = new b(0.25D, 0.5D, 0.75D);
    private final b b = new b(1.0D, 10D, 100D, 1000D);

    public c(d d)
    {
        super(d);
    }

    com.facebook.prefs.shared.ae a()
    {
        return ae.e;
    }

    public List a(long l, String s)
    {
        b(l);
        s = new cb("reflex_checkerboard");
        int ai[] = a.a();
        int ai1[] = b.a();
        s.a("prop_lt_0.25", ai[0]);
        s.a("prop_lt_0.5", ai[1]);
        s.a("prop_lt_0.75", ai[2]);
        s.a("prop_lt_1", ai[3]);
        s.a("lat_lt_1", ai1[0]);
        s.a("lat_lt_10", ai1[1]);
        s.a("lat_lt_100", ai1[2]);
        s.a("lat_lt_1000", ai1[3]);
        s.a("lat_lt_inf", ai1[4]);
        return Collections.singletonList(s);
    }

    public void a(double d)
    {
        a.a(d);
    }

    public boolean a(long l)
    {
        if (a.b() == 0 && b.b() == 0)
        {
            return false;
        } else
        {
            return super.a(l);
        }
    }

    long b()
    {
        return 0x1b7740L;
    }

    public void b(double d)
    {
        b.a(d);
    }
}
