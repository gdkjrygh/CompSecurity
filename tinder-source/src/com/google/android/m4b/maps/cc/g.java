// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.a;
import com.google.android.m4b.maps.bo.h;
import com.google.android.m4b.maps.bx.ah;
import com.google.android.m4b.maps.bx.v;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            n, i

public final class g extends n
    implements v
{

    public final h a;
    private boolean u;
    private final com.google.android.m4b.maps.bo.g v = new com.google.android.m4b.maps.bo.g();

    g(h h1, com.google.android.m4b.maps.br.b b1, String s, a a1, float f1, float f2, boolean flag, 
            boolean flag1, i i1, i j1, n.b ab[], boolean flag2)
    {
        super(h1, b1, s, a1, null, f1, f2, flag, flag1, i1, j1, ab, flag2, true, null);
        a = h1;
    }

    public final int a(float f1, float f2, b b1)
    {
        b1 = b1.c(m.a);
        f1 -= b1[0];
        f2 -= b1[1];
        return (int)(f2 * f2 + f1 * f1);
    }

    public final boolean a(b b1)
    {
        int ai[] = b1.c(m.a);
        float f1 = ai[0];
        float f2 = ai[1];
        return q + f1 < (float)b1.h && f1 + r >= 0.0F && s + f2 < (float)b1.i && f2 + t >= 0.0F;
    }

    public final boolean a(b b1, d d)
    {
        com.google.android.m4b.maps.bo.g g1 = m.a;
        float f2 = n.b / 2.0F;
        float f1 = f2;
        if (o != null)
        {
            f1 = f2;
            if (p.a == com.google.android.m4b.maps.cc.n.a.b)
            {
                f1 = f2 + o.b;
            }
        }
        ah.a(b1, g1, 0, (int)f1, v);
        return super.a(b1, d);
    }

    public final void b()
    {
        u = true;
    }

    public final void c()
    {
        u = false;
    }

    public final com.google.android.m4b.maps.bo.g f()
    {
        return m.a;
    }

    public final com.google.android.m4b.maps.bo.g j()
    {
        return v;
    }

    public final String k()
    {
        return a.c;
    }

    public final boolean l()
    {
        return true;
    }

    public final c n_()
    {
        return null;
    }
}
