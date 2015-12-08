// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.az.f;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.m;
import com.google.android.m4b.maps.bn.c;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.g;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, ab, n

public final class a extends r
{

    private static k j;
    private static c k;
    private static k l;
    private static c m;
    g a;
    int b;
    int c;
    int d;
    float e;
    private String f;
    private com.google.android.m4b.maps.ak.c g;
    private com.google.android.m4b.maps.bo.m h;
    private float i;

    public a(String s)
    {
        a = null;
        b = 0;
        b();
        c = 0;
        d = 0;
        e = 1.0F;
        g = null;
        f = s;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        while (ab1.b > 0 || a == null || i == 0.0F || !b1.h().c.b(h)) 
        {
            return;
        }
        ab1 = d1.a;
        ab1.glPushMatrix();
        if (g != null)
        {
            f f2 = com.google.android.m4b.maps.az.i.a().a(g, false, false);
            if (f2 != null)
            {
                a.c = (int)f2.a(b1, a);
            }
        }
        float f1 = b1.g();
        n.a(d1, b1, a, f1);
        f1 = i / f1;
        b1 = d1.a;
        b1.glScalef(f1, f1, f1);
        b1.glBlendFunc(770, 771);
        l.d(d1);
        com.google.android.m4b.maps.bm.c.a(b1, d);
        m.a(d1, 6);
        j.d(d1);
        com.google.android.m4b.maps.bm.c.a(b1, c);
        b1.glLineWidth(e);
        k.a(d1, 2);
        ab1.glPopMatrix();
    }

    public final boolean a(b b1, d d1)
    {
        return true;
    }

    final void b()
    {
        int i1 = b / 2;
        g g1 = a;
        float f1;
        if (g1 == null || i1 == 0)
        {
            f1 = 0.0F;
        } else
        {
            f1 = (float)i1 * (float)com.google.android.m4b.maps.bo.g.a(g1.b());
        }
        i = f1;
        if (a != null)
        {
            h = com.google.android.m4b.maps.bo.m.a(a, (int)i + 1);
        }
    }

    public final r.a d()
    {
        return r.a.a;
    }

    static 
    {
        j = new k(100);
        k = new c(100);
        l = new k(101);
        m = new c(102);
        com.google.android.m4b.maps.bm.m.a(j, k);
        com.google.android.m4b.maps.bm.m.b(l, m);
    }
}
