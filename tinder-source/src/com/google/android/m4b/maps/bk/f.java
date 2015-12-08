// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bn.d;
import com.google.android.m4b.maps.bn.l;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.k;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            k, d, g, e, 
//            m

public final class f
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static a e;
        private static final a f[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/bk/f$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            e = new a("NO_VERIFICATION", 0);
            a = new a("NO_VERIFICATION_WITH_REASON", 1);
            b = new a("AREA_VERIFICATION", 2);
            c = new a("AREA_VERIFICATION_WITH_REASON", 3);
            d = new a("COMPLETE_VERIFICATION", 4);
            f = (new a[] {
                e, a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public static com.google.android.m4b.maps.bk.k a(List list, a a1)
    {
        boolean flag1 = false;
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        list = k.a();
_L13:
        return list;
_L2:
        Object obj;
        int ai[] = new int[list.size() + 1];
        obj = list.iterator();
        int i = 0;
        int i1;
        for (i1 = 0; ((Iterator) (obj)).hasNext(); i1++)
        {
            k k1 = (k)((Iterator) (obj)).next();
            ai[i1] = i;
            i += k1.a.length / 3 - 1;
            if (!k1.b().equals(k1.a(0)))
            {
                i++;
            }
        }

        ai[i1] = i;
        double ad[] = new double[i * 2];
        a((k)list.get(0), false, ad, 0);
        list = list.subList(1, list.size()).iterator();
        for (int j = 1; list.hasNext(); j++)
        {
            a((k)list.next(), true, ad, ai[j]);
        }

        ad = new com.google.android.m4b.maps.bk.d(g.a(ad, ai));
        if (a1 == com.google.android.m4b.maps.bk.a.d)
        {
            e.d d3 = e.b(ad);
            if (d3 != null)
            {
                list = String.valueOf(d3.toString());
                if (list.length() != 0)
                {
                    list = "Verification failed, the polygon violates ".concat(list);
                } else
                {
                    list = new String("Verification failed, the polygon violates ");
                }
                list = new e.b(list, null);
                list.a = d3;
                throw list;
            }
        }
        list = e.a(ad);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.google.android.m4b.maps.bk.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 3: default 469
    //                   1 340
    //                   2 340
    //                   3 340;
           goto _L3 _L4 _L4 _L4
_L4:
        double d1;
        double d2;
        d1 = ad.a();
        d2 = list.b();
        if (Math.abs(d1 - d2) <= 0.001D * d1 || d1 == d2) goto _L6; else goto _L5
_L5:
        boolean flag = flag1;
        if (!Double.isNaN(d1)) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (!Double.isNaN(d2)) goto _L8; else goto _L6
_L8:
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            throw new e.b("Could not tessellate polygon, area not equal", null);
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 2 4: default 452
    //                   2 454
    //                   3 452
    //                   4 454;
           goto _L9 _L10 _L9 _L10
_L9:
        throw list;
_L10:
        list.a = e.b(ad);
          goto _L9
_L3:
        return list;
_L6:
        flag = true;
        if (true) goto _L8; else goto _L11
_L11:
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static void a(com.google.android.m4b.maps.bk.k k1, d d1, int i)
    {
        d1.b(d1.b() + k1.c() * 3);
        int i1 = k1.c();
        for (int j = 0; j < i1; j++)
        {
            d1.a(k1.a(j, 0) + i, k1.a(j, 1) + i, k1.a(j, 2) + i);
        }

    }

    public static void a(com.google.android.m4b.maps.bk.k k1, l l1, g g1, int i)
    {
        g g2 = new g();
        int i1 = k1.d();
        l1.a(l1.a() + i1);
        for (int j = 0; j < i1; j++)
        {
            if (j < 0 || j >= k1.a.e())
            {
                throw new IllegalArgumentException();
            }
            int j1 = (int)k1.a.b(j);
            if (j < 0 || j >= k1.a.e())
            {
                throw new IllegalArgumentException();
            }
            g2.d(j1, (int)k1.a.c(j));
            g.b(g2, g1, g2);
            l1.a(g2, i);
        }

    }

    private static void a(k k1, boolean flag, double ad[], int i)
    {
        boolean flag1 = false;
        g g1 = new g();
        int j;
        byte byte0;
        int i1;
        int j1;
        int l1;
        if (flag)
        {
            j = k1.a.length / 3 - 1;
        } else
        {
            j = 0;
        }
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        l1 = k1.a.length / 3;
        i1 = l1;
        j1 = ((flag1) ? 1 : 0);
        if (k1.b().equals(k1.a(0)))
        {
            i1 = l1 - 1;
            j1 = ((flag1) ? 1 : 0);
        }
        for (; j1 < i1; j1++)
        {
            k1.a(byte0 * j1 + j, g1);
            ad[(i + j1) * 2] = g1.a;
            ad[(i + j1) * 2 + 1] = g1.b;
        }

    }
}
