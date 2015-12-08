// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.bc;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.ax:
//            i

public final class c extends i
{

    private aq d;
    private final List e = new ArrayList();
    private final g f = new g();
    private b g;
    private aq h;
    private float i;
    private final float j;
    private long k;

    public c(ah ah, int l, ag ag1, com.google.android.m4b.maps.bw.g g1)
    {
        super(ah, ag1, g1);
        k = 0L;
        j = l * l;
    }

    private void a(ac ac1, g g1, boolean flag)
    {
        if (!flag || h.b(ac1.d()))
        {
            int l = ac1.a;
            int j1 = 0x20000000 >> l;
            f.d(ac1.e + j1, ac1.f + j1);
            float f1 = g.b(f);
            b b1 = g;
            f1 = ((float)(j1 * 2) * b1.f * (float)b1.i) / f1;
            if (f1 * (i * f1) >= j && l < 30)
            {
                ArrayList arraylist = new ArrayList();
                s s1 = super.c(g1);
                int i1 = ac1.a;
                if (i1 < 0 || i1 >= s1.g.length)
                {
                    i1 = -1;
                } else
                {
                    i1 = s1.g[i1];
                }
                if (i1 >= 0)
                {
                    int i2 = i1 - ac1.a;
                    int j2 = 1 << i2;
                    for (int k1 = 0; k1 < j2; k1++)
                    {
                        for (int l1 = 0; l1 < j2; l1++)
                        {
                            arraylist.add(ac1.a(i1, (ac1.b << i2) + l1, (ac1.c << i2) + k1));
                        }

                    }

                }
                if (arraylist.isEmpty())
                {
                    e.add(ac1);
                    return;
                }
                ac1 = arraylist.iterator();
                while (ac1.hasNext()) 
                {
                    a((ac)ac1.next(), g1, true);
                }
            } else
            {
                e.add(ac1);
                return;
            }
        }
    }

    public final long a()
    {
        return k;
    }

    public final List a(b b1)
    {
        aq aq1 = b1.h();
        if (d != null && aq1.equals(d))
        {
            boolean flag;
            if (e.isEmpty())
            {
                flag = true;
            } else
            {
                flag = ((ac)e.get(0)).d.equals(b.a());
            }
            if (flag)
            {
                return e;
            }
        }
        k = k + 1L;
        Object obj = (bc)aq1.b;
        int l = (int)(30F - b.a((((bc) (obj)).a[3].c(((bc) (obj)).a[2]) / (float)b1.h) * (256F * b1.j)));
        e.clear();
        g = b1;
        h = b1.h();
        i = (float)Math.cos(b1.b.c * 0.01745329F);
        obj = ac.a(aq1.c, l, b.a());
        for (int i1 = 0; i1 < ((ArrayList) (obj)).size(); i1++)
        {
            a((ac)((ArrayList) (obj)).get(i1), com.google.android.m4b.maps.bo.g.a(b1.d), false);
        }

        d = aq1;
        return e;
    }
}
