// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bm.e;
import com.google.android.m4b.maps.bn.c;
import com.google.android.m4b.maps.bn.i;
import com.google.android.m4b.maps.bn.m;
import com.google.android.m4b.maps.bo.ak;
import com.google.android.m4b.maps.bo.au;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.k;
import com.google.android.m4b.maps.bo.t;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            a

static final class h
{

    final com.google.android.m4b.maps.bn.k a;
    final c b;
    final com.google.android.m4b.maps.bn.g c;
    final com.google.android.m4b.maps.bn.k d;
    final com.google.android.m4b.maps.bn.g e;
    final int f;

    private void a(com.google.android.m4b.maps.bo.m m1, au au1, h h)
    {
        if (au1.d.c() != 0)
        {
            au1 = au1.b;
            int i1 = au1.a();
            if (i1 != 0)
            {
                int j = m1.c().a;
                int l = (int)h.d;
                int j1 = m1.c().b;
                g g1 = new g(j + l, (int)h.e + j1);
                j1 = m1.f();
                m1 = ((g[])com.google.android.m4b.maps.cc.a.c().get())[0];
                g g2 = ((g[])com.google.android.m4b.maps.cc.a.c().get())[1];
                g g3 = ((g[])com.google.android.m4b.maps.cc.a.c().get())[2];
                l = 0;
                j = 0;
                for (; l < i1; l++)
                {
                    au1.a(l, g1, m1, g2, g3);
                    d.a(m1, j1);
                    d.a(g2, j1);
                    d.a(g3, j1);
                    j += 3;
                }

                if (h.c)
                {
                    l = 0x10000;
                } else
                {
                    l = 0;
                }
                e.a(l, 0, j);
                return;
            }
        }
    }

    public (com.google.android.m4b.maps.bo.m m1, List list, List list1,  )
    {
        int j = com.google.android.m4b.maps.bm.e.a(list);
        a = new m(j);
        c = new i(j);
        b = new com.google.android.m4b.maps.bn.e(com.google.android.m4b.maps.bm.e.b(list));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            list = (k)iterator.next();
            g g1 = new g(m1.c().a + (int).d, m1.c().b + (int).e);
            int i1 = m1.f();
            float f1;
            float f2;
            e e1;
            int l;
            if (.c)
            {
                j = 0x10000;
            } else
            {
                j = 0;
            }
            if (.c)
            {
                l = 0;
            } else
            {
                l = 0x10000;
            }
            if (.g > 0.0F)
            {
                list = list.c(.g);
            }
            e1 = com.google.android.m4b.maps.bm.e.a();
            if (.c)
            {
                f1 = .b;
            } else
            {
                f1 = .a;
            }
            if (.c)
            {
                f2 = .a;
            } else
            {
                f2 = .b;
            }
            e1.a(list, f1, f2, g1, i1, j, l, a, b, c);
        }
        list = list1.iterator();
        for (j = 0; list.hasNext(); j = com.google.android.m4b.maps.cc.a.a((au)list.next()) + j) { }
        if (.f && j > 0)
        {
            d = new m(j);
            e = new i(j);
            for (list = list1.iterator(); list.hasNext(); a(m1, (au)list.next(), )) { }
        } else
        {
            d = null;
            e = null;
        }
        f = .h;
    }
}
