// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.bn.g;
import com.google.android.m4b.maps.bn.i;

// Referenced classes of package com.google.android.m4b.maps.bm:
//            j, a, d

public final class b
{

    public final g a;
    private j b;
    private final a.a c = new a.a();
    private final a d;

    public b(int k, a a1)
    {
        a = new i(k, '\0');
        d = a1;
    }

    private void b()
    {
        if (b != null)
        {
            b.c();
            b = null;
        }
    }

    public final int a()
    {
        return a.c() + 24;
    }

    public final void a(int k, int l)
    {
        if (l > 0)
        {
            d.a(k, c);
            a.a(c.a, c.b, l);
        }
    }

    public final void a(d d1)
    {
        if (b != null && b.a().a != d1.a)
        {
            b();
        }
        d.b(d1);
        if (b == null)
        {
            b = d.a(d1);
            b.b();
        }
        b.a(d1.a);
        a.d(d1);
    }

    public final void b(d d1)
    {
        a.b(d1);
        b();
    }

    public final void c(d d1)
    {
        a.c(d1);
        b();
    }
}
