// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bi.d;
import com.google.android.m4b.maps.bi.e;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.p;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            v

public final class u
{

    int a;
    int b;
    int c[] = {
        0, 0, 0, 0
    };
    v d;
    final p e;
    private int f;
    private int g;

    public u(p p1, v v1)
    {
        f = 0;
        g = 0;
        a = 0;
        b = 0;
        d = null;
        e = p1;
        d = v1;
    }

    public final float a(float f1, float f2, float f3, int i)
    {
        return e.a(f1, f2, f3, i);
    }

    public final int a()
    {
        return c[0] + c[2];
    }

    public final c a(c c1, float f1)
    {
        c();
        Object obj = d.p();
        f1 = (float)Math.pow(2D, ((b) (obj)).b.b - c1.b) * f1;
        float f2 = (float)((double)d.getWidth() / 2D - (double)a);
        float f4 = (float)((double)d.getHeight() / 2D - (double)b);
        float f3 = ((b) (obj)).g();
        f4 = (-(f1 * f4) * ((b) (obj)).g()) / (float)Math.cos(((b) (obj)).b.c * 0.01745329F);
        g g1 = ((b) (obj)).d();
        obj = ((b) (obj)).e();
        g1 = new g(g1.a, g1.b);
        obj = new g(((g) (obj)).a, ((g) (obj)).b);
        com.google.android.m4b.maps.bo.g.b(g1, f2 * f1 * f3, g1);
        com.google.android.m4b.maps.bo.g.b(((g) (obj)), f4, ((g) (obj)));
        g g2 = com.google.android.m4b.maps.bo.g.a(c1.a);
        f1 = c1.b;
        int i = g2.c;
        g1 = g2.e(g1);
        com.google.android.m4b.maps.bo.g.a(g1, ((g) (obj)), g1);
        g1.c = i;
        return new c(g1, f1, c1.c, c1.d, 0.0F);
    }

    public final void a(float f1, int i)
    {
        c();
        c c1 = d();
        a(((d) (new c(com.google.android.m4b.maps.bo.g.a(c1.a), f1, c1.c, c1.d, c1.e))), i);
    }

    final void a(d d1, int i)
    {
        int j;
        if (i == 0)
        {
            j = 0;
        } else
        {
            j = -1;
        }
        a(d1, i, j);
    }

    public final void a(d d1, int i, int j)
    {
        boolean flag;
        boolean flag1 = true;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        flag = flag1;
        if (c[0] == 0)
        {
            flag = flag1;
            if (c[2] == 0)
            {
                flag = flag1;
                if (c[1] == 0)
                {
                    if (c[3] == 0)
                    {
                        break MISSING_BLOCK_LABEL_90;
                    }
                    flag = flag1;
                }
            }
        }
_L1:
        if (flag)
        {
            d1 = a(d1.b(), 1.0F);
            e.a(d1, i, j);
            return;
        } else
        {
            e.a(d1, i, j);
            return;
        }
        flag = false;
          goto _L1
    }

    public final int b()
    {
        return c[1] + c[3];
    }

    final void c()
    {
        if (d != null)
        {
            f = d.getWidth() - c[0] - c[2];
            g = d.getHeight() - c[1] - c[3];
            a = c[0] + f / 2;
            b = c[1] + g / 2;
        }
    }

    public final c d()
    {
        return a(e.c, -1F);
    }

    public final float e()
    {
        com.google.android.m4b.maps.bi.e.a a1 = e.b.b;
        if (a1 == null)
        {
            return 2.0F;
        } else
        {
            return a1.e();
        }
    }
}
