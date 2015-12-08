// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import com.b.a.c.a.a.b;
import com.b.a.c.a.a.c;
import com.b.a.c.a.a.d;
import com.b.a.c.a.a.e;
import com.b.a.c.a.a.f;
import com.b.a.c.a.a.g;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.b.a.c:
//            bj, bm, bg, bb, 
//            bc, bk, bl, bf, 
//            ba, bd, aw, bh, 
//            be, bi, f

final class az
{

    private static final e a = new e("", "");
    private static final bj b[] = new bj[0];
    private static final bm c[] = new bm[0];
    private static final bg d[] = new bg[0];
    private static final bb e[] = new bb[0];
    private static final bc f[] = new bc[0];

    private static bk a(b ab[])
    {
        bc abc[] = new bc[ab.length];
        for (int i = 0; i < abc.length; i++)
        {
            abc[i] = new bc(ab[i]);
        }

        return new bk(abc);
    }

    private static bk a(g ag[])
    {
        bg abg[];
        int i;
        if (ag != null)
        {
            abg = new bg[ag.length];
        } else
        {
            abg = d;
        }
        for (i = 0; i < abg.length; i++)
        {
            abg[i] = new bg(ag[i]);
        }

        return new bk(abg);
    }

    public static void a(d d1, aw aw1, Map map, com.b.a.c.f f1)
    {
        Object aobj[];
        Object obj1;
        f af[];
        int i;
        if (d1.b != null)
        {
            aobj = d1.b;
        } else
        {
            aobj = a;
        }
        obj1 = new bl(((e) (aobj)));
        af = d1.c;
        if (af != null)
        {
            aobj = new bm[af.length];
        } else
        {
            aobj = c;
        }
        for (i = 0; i < aobj.length; i++)
        {
            f f2 = af[i];
            aobj[i] = new bm(f2, a(f2.c));
        }

        bk bk1 = new bk(((bj []) (aobj)));
        com.b.a.c.a.a.a aa[] = d1.d;
        if (aa != null)
        {
            aobj = new bb[aa.length];
        } else
        {
            aobj = e;
        }
        for (i = 0; i < aobj.length; i++)
        {
            aobj[i] = new bb(aa[i]);
        }

        Object obj = new bf(((bl) (obj1)), bk1, new bk(((bj []) (aobj))));
        b ab[] = d1.e;
        map = new TreeMap(map);
        if (ab != null)
        {
            int l = ab.length;
            for (int j = 0; j < l; j++)
            {
                b b1 = ab[j];
                map.put(b1.a, b1.b);
            }

        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(new java.util.Map.Entry[map.size()]);
        ab = new b[map.length];
        for (int k = 0; k < ab.length; k++)
        {
            ab[k] = new b((String)map[k].getKey(), (String)map[k].getValue());
        }

        map = new ba(((bf) (obj)), a(ab));
        obj = d1.f;
        obj = new bd((float)((c) (obj)).f / 100F, ((c) (obj)).g, ((c) (obj)).h, ((c) (obj)).a, ((c) (obj)).b - ((c) (obj)).d, ((c) (obj)).c - ((c) (obj)).e);
        ab = aw1.a();
        if (ab == null)
        {
            a.a.a.a.f.d();
        }
        aw1.b();
        if (ab != null)
        {
            aw1 = new bh(ab);
        } else
        {
            aw1 = new bi();
        }
        (new be(d1.a, "ndk-crash", new bj[] {
            map, obj, aw1
        })).b(f1);
    }

    static bj[] a()
    {
        return b;
    }

}
