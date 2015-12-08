// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bn.d;
import com.google.android.m4b.maps.bn.h;
import com.google.android.m4b.maps.bn.l;
import com.google.android.m4b.maps.bo.an;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.i;
import com.google.android.m4b.maps.bo.k;
import java.util.Iterator;
import java.util.List;

public final class e
{

    private static final float a = (float)Math.sqrt(2D);
    private static final ThreadLocal t = new ThreadLocal() {

        protected final Object initialValue()
        {
            return new e((byte)0);
        }

    };
    private static final int u[] = {
        0, 0x10000, 0x10000, 0x10000, 0, 32768, 0x10000, 32768
    };
    private static final int v[] = {
        0, 32768, 0x10000, 32768, 0, 0x10000, 0x10000, 0x10000
    };
    private static final int w[] = {
        0, 16384, 0x10000, 16384
    };
    private static final int x[] = {
        0, 16384, 0x10000, 16384, 32768, 16384, 0, 16384, 0x10000, 16384
    };
    private static final int y[][] = new int[16][];
    private final g b;
    private final g c;
    private final g d;
    private final g e;
    private final g f;
    private final g g;
    private final g h;
    private final g i;
    private final g j;
    private final g k;
    private final an l;
    private final an m;
    private final an n;
    private final an o;
    private final an p;
    private final an q;
    private final an r;
    private final an s;

    private e()
    {
        b = new g();
        c = new g();
        d = new g();
        e = new g();
        f = new g();
        g = new g();
        h = new g();
        i = new g();
        j = new g();
        k = new g();
        l = new an();
        m = new an();
        n = new an();
        o = new an();
        p = new an();
        q = new an();
        r = new an();
        s = new an();
    }

    e(byte byte0)
    {
        this();
    }

    public static int a(k k1)
    {
        int i1 = k1.a.length / 3 - 1;
        if (i1 == 1)
        {
            return 6;
        } else
        {
            return (i1 - 1) * 5 + 8;
        }
    }

    public static int a(List list)
    {
        list = list.iterator();
        int i1;
        for (i1 = 0; list.hasNext(); i1 = (((k)list.next()).a.length / 3) * 5 + i1) { }
        return i1;
    }

    public static e a()
    {
        return (e)t.get();
    }

    public static void a(int i1, int j1, int ai[], h h1)
    {
        h1.c((i1 - 1) * 5 + h1.e());
        if (y[j1] == null)
        {
            int ai1[][] = y;
            int j2 = 1 << j1;
            int ai3[] = new int[j2 * 5 * 2];
            int i2 = 32768 / j2;
            for (int k1 = 0; k1 < ai3.length; k1 += 10)
            {
                ai3[k1] = 0;
                ai3[k1 + 1] = i2;
                ai3[k1 + 2] = 0x10000;
                ai3[k1 + 3] = i2;
                ai3[k1 + 4] = 0x10000;
                ai3[k1 + 5] = i2;
                ai3[k1 + 6] = 0;
                ai3[k1 + 7] = i2;
                ai3[k1 + 8] = 32768;
                ai3[k1 + 9] = i2;
                i2 += 0x10000 / j2;
            }

            ai1[j1] = ai3;
        }
        int ai2[] = y[j1];
        int l1 = ai[0];
        for (j1 = 1; j1 < i1; j1++)
        {
            h1.a(ai2, l1 * 5 * 2, 10);
        }

    }

    public static int b(k k1)
    {
        int i1 = k1.a.length / 3 - 1;
        if (i1 == 1)
        {
            return 12;
        } else
        {
            return (i1 - 1) * 3 + (i1 + 2) * 6;
        }
    }

    public static int b(List list)
    {
        list = list.iterator();
        int i1;
        int j1;
        for (i1 = 0; list.hasNext(); i1 = j1 * 3 * 6 + i1)
        {
            k k1 = (k)list.next();
            j1 = k1.a.length / 3 - 1;
            if (k1.d())
            {
                j1++;
            }
        }

        return i1;
    }

    public final int a(k k1, float f1, g g1, int i1, l l1, h h1, d d1, 
            boolean flag, boolean flag1)
    {
        g g5;
        g g7;
        g g13;
        g g18;
        int i2;
        int j2;
        boolean flag3;
        if (f1 < 1.0F)
        {
            return 0;
        }
        int l2 = k1.a.length / 3;
        if (l2 == 2)
        {
            int j1 = l1.a();
            g g2 = b;
            g g4 = c;
            g g6 = d;
            g g8 = e;
            g g10 = f;
            g g12 = g;
            g g14 = h;
            k1.a(0, g1, g2);
            k1.a(1, g1, g4);
            com.google.android.m4b.maps.bo.i.d(g4, g2, g6);
            com.google.android.m4b.maps.bo.i.a(g6, f1, g8);
            com.google.android.m4b.maps.bo.i.a(g8, g10);
            if (flag)
            {
                com.google.android.m4b.maps.bo.i.c(g2, g10, g2);
            }
            if (flag1)
            {
                com.google.android.m4b.maps.bo.i.d(g4, g10, g4);
            }
            com.google.android.m4b.maps.bo.i.c(g2, g8, g14);
            l1.b(g14, i1);
            com.google.android.m4b.maps.bo.i.d(g2, g8, g14);
            l1.b(g14, i1);
            g12.a = g2.a / 2 + g4.a / 2;
            g12.b = g2.b / 2 + g4.b / 2;
            com.google.android.m4b.maps.bo.i.c(g12, g8, g14);
            l1.b(g14, i1);
            com.google.android.m4b.maps.bo.i.d(g12, g8, g14);
            l1.b(g14, i1);
            com.google.android.m4b.maps.bo.i.c(g4, g8, g14);
            l1.b(g14, i1);
            com.google.android.m4b.maps.bo.i.d(g4, g8, g14);
            l1.b(g14, i1);
            i1 = (int)((-0.25F * (g6.e() / f1) + 0.5F) * 65536F);
            if (flag)
            {
                h1.a(0, 0x10000);
                h1.a(0x10000, 0x10000);
            } else
            {
                h1.a(0, i1);
                h1.a(0x10000, i1);
            }
            h1.a(0, i1);
            h1.a(0x10000, i1);
            if (flag1)
            {
                h1.a(0, 0x10000);
                h1.a(0x10000, 0x10000);
            } else
            {
                h1.a(0, i1);
                h1.a(0x10000, i1);
            }
            d1.a(j1, j1 + 1, j1 + 2, j1 + 3);
            d1.a(j1 + 2, j1 + 3, j1 + 4, j1 + 5);
            return 6;
        }
        if (l2 < 2)
        {
            return 0;
        }
        g g9 = b;
        g g11 = c;
        g13 = d;
        g g15 = e;
        g g16 = f;
        g g17 = g;
        g18 = h;
        g5 = i;
        g g19 = j;
        g7 = k;
        j2 = l1.a();
        k1.a(0, g1, g9);
        k1.a(1, g1, g11);
        com.google.android.m4b.maps.bo.i.d(g11, g9, g15);
        com.google.android.m4b.maps.bo.i.a(g15, f1, g17);
        com.google.android.m4b.maps.bo.i.a(g17, g5);
        com.google.android.m4b.maps.bo.i.c(g9, g5, g9);
        com.google.android.m4b.maps.bo.i.c(g9, g17, g7);
        l1.b(g7, i1);
        com.google.android.m4b.maps.bo.i.d(g9, g17, g7);
        l1.b(g7, i1);
        com.google.android.m4b.maps.bo.i.d(g9, g5, g9);
        com.google.android.m4b.maps.bo.i.c(g9, g17, g7);
        l1.b(g7, i1);
        com.google.android.m4b.maps.bo.i.d(g9, g17, g7);
        l1.b(g7, i1);
        h1.a(u);
        i2 = 4;
        float f2;
        int k2;
        if (flag)
        {
            d1.a(j2, j2 + 1, j2 + 2, j2 + 3);
        } else
        {
            d1.a(j2 + 2, j2 + 2, j2 + 2, j2 + 2);
        }
        d1.a(j2 + 2, j2 + 3, j2 + 4, j2 + 5);
        j2 += 4;
        k2 = 1;
        if (k2 >= l2 - 1) goto _L2; else goto _L1
_L1:
        k1.a(k2 + 1, g1, g13);
        com.google.android.m4b.maps.bo.i.d(g13, g11, g16);
        com.google.android.m4b.maps.bo.i.a(g16, f1, g18);
        g g3;
        boolean flag2;
        if (com.google.android.m4b.maps.bo.i.c(g15, g16) > 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.m4b.maps.bo.i.c(g17, g18, g19);
        f2 = com.google.android.m4b.maps.bo.g.b(g18, g19);
        if (f2 <= 1.0F || com.google.android.m4b.maps.bo.g.b(g15, g16) < 0.0F)
        {
            break MISSING_BLOCK_LABEL_1428;
        }
        com.google.android.m4b.maps.bo.g.a(g19, (f1 * f1) / f2, g19);
        com.google.android.m4b.maps.bo.i.c(g11, g19, g7);
        com.google.android.m4b.maps.bo.i.d(g11, g19, g5);
        if (flag2)
        {
            g3 = g7;
        } else
        {
            g3 = g5;
        }
        if (com.google.android.m4b.maps.bo.g.c(g11, g9, g3) >= 0.5F || com.google.android.m4b.maps.bo.g.c(g11, g13, g3) >= 0.5F)
        {
            break MISSING_BLOCK_LABEL_1428;
        }
        l1.b(g7, i1);
        l1.b(g5, i1);
        h1.a(w);
        d1.a(j2, j2 + 1, j2 + 2, j2 + 3);
        flag3 = false;
        j2 += 2;
        i2 += 2;
_L4:
        if (flag3)
        {
            com.google.android.m4b.maps.bo.i.c(g11, g17, g7);
            l1.b(g7, i1);
            com.google.android.m4b.maps.bo.i.d(g11, g17, g7);
            l1.b(g7, i1);
            l1.b(g11, i1);
            com.google.android.m4b.maps.bo.i.c(g11, g18, g7);
            l1.b(g7, i1);
            com.google.android.m4b.maps.bo.i.d(g11, g18, g7);
            l1.b(g7, i1);
            h1.a(x);
            if (flag2)
            {
                d1.a(j2 + 2, j2 + 1, j2 + 4);
            } else
            {
                d1.a(j2 + 0, j2 + 2, j2 + 3);
            }
            d1.a(j2 + 3, j2 + 4, j2 + 5, j2 + 6);
            j2 += 5;
            i2 += 5;
        }
        g17.b(g18);
        g15.b(g16);
        g9.b(g11);
        g11.b(g13);
        k2++;
        break MISSING_BLOCK_LABEL_775;
_L2:
        com.google.android.m4b.maps.bo.i.c(g13, g18, g7);
        l1.b(g7, i1);
        com.google.android.m4b.maps.bo.i.d(g13, g18, g7);
        l1.b(g7, i1);
        com.google.android.m4b.maps.bo.i.a(g18, g5);
        com.google.android.m4b.maps.bo.i.d(g13, g5, g13);
        com.google.android.m4b.maps.bo.i.c(g13, g18, g7);
        l1.b(g7, i1);
        com.google.android.m4b.maps.bo.i.d(g13, g18, g7);
        l1.b(g7, i1);
        h1.a(v);
        i1 = i2 + 4;
        if (flag1)
        {
            d1.a(j2, j2 + 1, j2 + 2, j2 + 3);
            return i1;
        } else
        {
            d1.a(j2, j2, j2, j2);
            return i1;
        }
        flag3 = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(k k1, float f1, float f2, g g1, int i1, int j1, int l1, 
            l l2, d d1, h h1)
    {
        int l6 = k1.a.length / 3;
        if (l6 > 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        g g2;
        g g3;
        g g4;
        g g5;
        g g6;
        g g7;
        g g8;
        an an3;
        an an4;
        an an5;
        an an6;
        an an7;
        an an8;
        int i2;
        int i3;
        int j3;
        int i5;
        int j5;
        int k5;
        int l5;
        int i7;
        boolean flag;
        i2 = l2.a();
        int j2 = l6 * 5;
        flag = k1.d();
        l2.a(i2 + j2);
        if (h1 != null)
        {
            h1.c(j2 + h1.e());
        }
        d1.b((l6 - 1) * 3 * 6 + d1.b());
        g2 = b;
        g3 = c;
        g4 = d;
        g5 = e;
        g6 = f;
        g7 = g;
        g8 = h;
        an3 = l;
        an4 = m;
        an5 = n;
        an6 = o;
        an7 = p;
        an8 = q;
        j3 = -1;
        i3 = -1;
        i7 = (int)(((float)j1 * f2 + (float)l1 * f1) / (f1 + f2));
        i5 = 0;
        j5 = -1;
        k5 = -1;
        l5 = -1;
_L4:
        if (i5 >= l6) goto _L1; else goto _L3
_L3:
        int k2;
        int k3;
        int j4;
        k1.a(i5, g1, g3);
        int l3 = i5 - 1;
        j4 = i5 + 1;
        k3 = l3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1485;
        }
        k2 = l3;
        if (l3 < 0)
        {
            k2 = l6 - 2;
        }
        k3 = k2;
        if (j4 < l6)
        {
            break MISSING_BLOCK_LABEL_1485;
        }
        k3 = 1;
_L5:
        an an1;
        an an2;
        int i4;
        int k4;
        int l4;
        if (k2 >= 0)
        {
            k1.a(k2, g1, g2);
            an1 = r.a(g3, g2);
        } else
        {
            an1 = null;
        }
        if (k3 < l6)
        {
            k1.a(k3, g1, g4);
            an2 = s.a(g3, g4);
        } else
        {
            an2 = null;
        }
        if (an1 != null && an2 != null)
        {
            an3.a(an1).b();
            an4.a(an2).b();
            an an9 = an5.a(an3);
            an9.a = an9.a + an4.a;
            an9.b = an9.b + an4.b;
            int i6;
            if (an5.a == 0.0F && an5.b == 0.0F)
            {
                k2 = 1;
            } else
            {
                k2 = 0;
            }
            if (k2 != 0)
            {
                an5.a(an3).c();
                k2 = 1;
            } else
            {
                k2 = 0;
            }
        } else
        if (an1 != null)
        {
            an5.a(an1).c().b();
            k2 = 1;
        } else
        {
            an an10 = an5.a(an2).c().b();
            an10.a = -an10.a;
            an10.b = -an10.b;
            k2 = 1;
        }
        if (k2 != 0)
        {
            an.a(g3, an8.a(an5).a(-f1), g5);
            an.a(g3, an8.a(an5).a(f2), g6);
            l2.a(g5, i1);
            l2.a(g6, i1);
            if (h1 != null)
            {
                h1.a(j1, 0);
                h1.a(l1, 0);
            }
            k4 = i2 + 1;
            l4 = i2;
            i4 = k4;
            k3 = k4 + 1;
            j4 = i2;
        } else
        {
            an5.b();
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            if (an1.a * an2.b - an2.a * an1.b < 0.0F)
            {
                i3 = 1;
            } else
            {
                i3 = 0;
            }
            an6.a(an2).c().b();
            f5 = an5.b(an6);
            if (i3 != 0)
            {
                f3 = f1;
            } else
            {
                f3 = f2;
            }
            f4 = f3 / -f5;
            an7.a(an5).a(f4);
            f3 = an1.a();
            f6 = an2.a();
            f7 = Math.abs(an7.b(an8.a(an1).b()));
            f8 = Math.abs(an7.b(an8.a(an2).b()));
            f6 = Math.min(f3 / f7, f6 / f8);
            f3 = f4;
            if (f6 < 1.0F)
            {
                f3 = f4 * Math.max(Math.abs(f5), f6);
            }
            if (i3 != 0)
            {
                an.a(g3, an8.a(an5).a(-f2), g5);
                an.a(g3, an8.a(an5).a(-f3), g6);
                an.a(g3, an8.a(an2).c().b().a(-f2), g7);
                an.a(g3, an8.a(an1).c().b().a(f2), g8);
                l2.a(g5, i1);
                l2.a(g6, i1);
                l2.a(g7, i1);
                l2.a(g8, i1);
                if (h1 != null)
                {
                    h1.a(l1, 0);
                    h1.a(j1, 0);
                    h1.a(l1, 0);
                    h1.a(l1, 0);
                }
                k3 = i2 + 1;
                j3 = k3 + 1;
                k4 = j3 + 1;
                l4 = k3;
                i4 = j3;
                int j6 = k4 + 1;
                i3 = k4;
                j4 = k3;
                k3 = j6;
            } else
            {
                an.a(g3, an8.a(an5).a(f3), g6);
                an.a(g3, an8.a(an5).a(-f1), g5);
                an.a(g3, an8.a(an1).c().b().a(-f1), g7);
                an.a(g3, an8.a(an2).c().b().a(f1), g8);
                l2.a(g5, i1);
                l2.a(g6, i1);
                l2.a(g7, i1);
                l2.a(g8, i1);
                if (h1 != null)
                {
                    h1.a(j1, 0);
                    h1.a(l1, 0);
                    h1.a(j1, 0);
                    h1.a(j1, 0);
                }
                k4 = i2 + 1;
                j3 = k4 + 1;
                k3 = j3 + 1;
                l4 = j3;
                i4 = k4;
                int k6 = k3 + 1;
                i3 = k3;
                j4 = k3;
                k3 = k6;
            }
        }
        i6 = i2;
        l2.a(g3, i1);
        if (h1 != null)
        {
            h1.a(i7, 0);
        }
        if (flag && i5 == l6 - 1)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (k2 == 0 && i2 == 0)
        {
            d1.a(j3, k3, i6);
            d1.a(k3, i3, i6);
        }
        if (i5 > 0)
        {
            d1.a(k5, j5, k3);
            d1.a(j5, l5, k3);
            d1.a(k5, k3, l4);
            d1.a(k3, l5, k4);
        }
        i5++;
        j5 = k3;
        i2 = k3 + 1;
        k5 = j4;
        l5 = i4;
          goto _L4
          goto _L1
        k2 = k3;
        k3 = j4;
          goto _L5
    }

    public final void a(k k1, float f1, g g1, int i1, float f2, l l1, d d1, 
            h h1)
    {
        int l2 = k1.a.length / 3;
        int j2 = l2 - 1;
        int i2 = l1.a();
        int j1 = j2 * 4;
        g g3 = b;
        g g2 = c;
        g g5 = d;
        g g6 = e;
        g g7 = f;
        l1.a(l1.a() + j1);
        if (h1 != null)
        {
            h1.c(j1 + h1.e());
        }
        k1.a(0, g3);
        com.google.android.m4b.maps.bo.i.d(g3, g1, g3);
        float f3 = 0.0F;
        for (j1 = 1; j1 < l2;)
        {
            k1.a(j1, g2);
            com.google.android.m4b.maps.bo.i.d(g2, g1, g2);
            com.google.android.m4b.maps.bo.i.d(g2, g3, g5);
            com.google.android.m4b.maps.bo.i.a(g5, -f1, g6);
            l1.a(g3, i1);
            com.google.android.m4b.maps.bo.i.c(g3, g6, g7);
            l1.a(g7, i1);
            com.google.android.m4b.maps.bo.i.c(g2, g6, g7);
            l1.a(g7, i1);
            l1.a(g2, i1);
            float f4 = f3;
            if (h1 != null)
            {
                f4 = g5.e() / (float)i1;
                h1.a(0.0F, f3);
                h1.a(1.0F, f3);
                f4 = f3 + f4 * f2;
                h1.a(1.0F, f4);
                h1.a(0.0F, f4);
            }
            j1++;
            g g4 = g2;
            g2 = g3;
            f3 = f4;
            g3 = g4;
        }

        j1 = j2 - 1;
        d1.b((j2 * 2 + j1) * 3 + d1.b());
        g1 = d;
        l1 = e;
        h1 = f;
        i1 = 0;
        do
        {
            int k2 = i1 * 4 + i2;
            if (f1 > 0.0F)
            {
                d1.a(k2, k2 + 1, k2 + 2);
                d1.a(k2, k2 + 2, k2 + 3);
            } else
            {
                d1.a(k2, k2 + 2, k2 + 1);
                d1.a(k2, k2 + 3, k2 + 2);
            }
            if (i1 != j1)
            {
                k1.a(i1, g3);
                k1.a(i1 + 1, g2);
                k1.a(i1 + 2, g1);
                com.google.android.m4b.maps.bo.i.d(g2, g3, l1);
                com.google.android.m4b.maps.bo.i.d(g1, g2, h1);
                if ((float)com.google.android.m4b.maps.bo.i.c(l1, h1) * f1 > 0.0F)
                {
                    int i3 = k2 + 4;
                    if (f1 > 0.0F)
                    {
                        d1.a(k2 + 3, k2 + 2, i3 + 1);
                    } else
                    {
                        d1.a(k2 + 2, k2 + 3, i3 + 1);
                    }
                }
                i1++;
            } else
            {
                return;
            }
        } while (true);
    }

    public final void a(k k1, float f1, boolean flag, g g1, int i1, float f2, l l1, 
            d d1, h h1)
    {
        int j3 = k1.a.length / 3;
        int i3 = j3 - 1;
        int l2 = l1.a();
        if (i3 <= 0)
        {
            if (ab.a("GeometryUtil", 6))
            {
                Log.e("GeometryUtil", "Polyline has no segments.");
            }
        } else
        {
            float f3;
            g g2;
            g g3;
            g g5;
            byte byte0;
            int l3;
            if (flag)
            {
                byte0 = 5;
            } else
            {
                byte0 = 4;
            }
            l3 = byte0 * i3;
            g3 = b;
            g2 = c;
            l1.a(l1.a() + l3);
            g5 = d;
            if (h1 != null)
            {
                h1.c(h1.e() + l3);
            }
            k1.a(0, g2);
            com.google.android.m4b.maps.bo.i.d(g2, g1, g2);
            f3 = 0.0F;
            for (int i2 = 1; i2 < j3;)
            {
                k1.a(i2, g3);
                com.google.android.m4b.maps.bo.i.d(g3, g1, g3);
                g g4 = d;
                g g6 = e;
                com.google.android.m4b.maps.bo.i.d(g3, g2, g4);
                com.google.android.m4b.maps.bo.i.a(g4, f1, g6);
                com.google.android.m4b.maps.bo.i.c(g2, g6, g4);
                l1.a(g4, i1);
                com.google.android.m4b.maps.bo.i.d(g2, g6, g4);
                l1.a(g4, i1);
                com.google.android.m4b.maps.bo.i.d(g3, g6, g4);
                l1.a(g4, i1);
                com.google.android.m4b.maps.bo.i.c(g3, g6, g4);
                l1.a(g4, i1);
                if (flag)
                {
                    l1.a(g3, i1);
                }
                float f4 = f3;
                if (h1 != null)
                {
                    com.google.android.m4b.maps.bo.i.d(g3, g2, g5);
                    f4 = g5.e() / (float)i1;
                    h1.a(0.0F, f3);
                    h1.a(1.0F, f3);
                    f3 += f4 * f2;
                    h1.a(1.0F, f3);
                    h1.a(0.0F, f3);
                    f4 = f3;
                    if (flag)
                    {
                        h1.a(0.5F, f3);
                        f4 = f3;
                    }
                }
                i2++;
                g4 = g2;
                g2 = g3;
                f3 = f4;
                g3 = g4;
            }

            if (d1 != null)
            {
                i1 = l2 + l3;
                if (i1 > 32767)
                {
                    throw new ArrayIndexOutOfBoundsException((new StringBuilder(50)).append(i1).append(" required, but we can only store 32767").toString());
                }
                g1 = d;
                l1 = e;
                h1 = f;
                int j2 = i3 * 2;
                if (k1.d())
                {
                    i1 = 0;
                } else
                {
                    i1 = 1;
                }
                if (flag)
                {
                    d1.b(((i3 - i1) + j2) * 3 + d1.b());
                } else
                {
                    d1.b(d1.b() + j2 * 3);
                }
                for (i1 = 0; i1 < i3; i1++)
                {
                    j2 = i1 * byte0 + l2;
                    d1.a(j2, j2 + 1, j2 + 2);
                    d1.a(j2, j2 + 2, j2 + 3);
                }

                if (flag)
                {
                    i1 = 0;
                    while (i1 < i3 - 1) 
                    {
                        k1.a(i1, g2);
                        k1.a(i1 + 1, g3);
                        k1.a(i1 + 2, g1);
                        com.google.android.m4b.maps.bo.i.d(g3, g2, l1);
                        com.google.android.m4b.maps.bo.i.d(g1, g3, h1);
                        boolean flag1;
                        int k2;
                        int k3;
                        if (com.google.android.m4b.maps.bo.i.c(l1, h1) > 0L)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        k2 = i1 * 5 + l2;
                        k3 = k2 + 5;
                        if (flag1)
                        {
                            d1.a(k2 + 2, k3 + 1, k2 + 4);
                        } else
                        {
                            d1.a(k2 + 3, k2 + 4, k3);
                        }
                        i1++;
                    }
                    if (k1.d())
                    {
                        k1.a(i3 - 1, g2);
                        k1.a(0, g3);
                        k1.a(1, g1);
                        com.google.android.m4b.maps.bo.i.d(g3, g2, l1);
                        com.google.android.m4b.maps.bo.i.d(g1, g3, h1);
                        int j1;
                        if (com.google.android.m4b.maps.bo.i.c(l1, h1) > 0L)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        j1 = (i3 - 1) * 5 + l2;
                        if (i1 != 0)
                        {
                            d1.a(j1 + 2, l2 + 1, j1 + 4);
                            return;
                        } else
                        {
                            d1.a(j1 + 3, j1 + 4, l2);
                            return;
                        }
                    }
                }
            }
        }
    }

}
