// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import java.lang.reflect.Array;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            u, h, t, g

public final class f
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static a f;
        private static final a g[];
        public final boolean d;
        public final boolean e;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/cf/f$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("NOT_LIVE", 0, false, false);
            b = new a("NOT_LIVE_WITH_NEW_CONTEXT", 1, false, true);
            c = new a("LIVE", 2, true, false);
            f = new a("LIVE_WITH_NEW_CONTEXT", 3, true, true);
            g = (new a[] {
                a, b, c, f
            });
        }

        private a(String s, int l, boolean flag, boolean flag1)
        {
            super(s, l);
            d = flag;
            e = flag1;
        }
    }


    volatile t a;
    protected boolean b;
    protected boolean c;
    private final h d[][];
    private final u e[] = new u[5];
    private t f[];
    private int g[];
    private float h[][];
    private byte i;
    private byte j;
    private g k;

    public f()
    {
        b = true;
        c = false;
        i = 0;
        j = -1;
        d = (h[][])Array.newInstance(com/google/android/m4b/maps/cf/h, new int[] {
            5, h.j
        });
        a = new t();
        f = new t[5];
        h = new float[5][];
        g = new int[5];
    }

    final boolean a(g g1, a a1)
    {
        if (a1.d == c && !a1.e)
        {
            return false;
        }
        k = g1;
        Object obj = e;
        int l = 0;
        while (l < 5) 
        {
            u u1 = obj[l];
            if (u1 == null)
            {
                continue;
            }
            if (!a1.e)
            {
                if (a1.d)
                {
                    u1.a = u1.a + 1;
                } else
                {
                    u1.a = u1.a - 1;
                }
            }
            u1.a(g1, a1);
            l++;
        }
        com.google.android.m4b.maps.cf.g.a("Entity", "vertex data setLive");
        obj = d;
        int k1 = obj.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            h ah[] = obj[i1];
            int l1 = ah.length;
            int j1 = 0;
            while (j1 < l1) 
            {
                h h1 = ah[j1];
                if (h1 == null)
                {
                    continue;
                }
                if (!a1.e)
                {
                    if (a1.d)
                    {
                        h1.l = h1.l + 1;
                    } else
                    {
                        h1.l = h1.l - 1;
                    }
                }
                h1.a(g1, a1);
                j1++;
            }
        }

        com.google.android.m4b.maps.cf.g.a("Entity", "entity state setLive");
        c = a1.d;
        return true;
    }
}
