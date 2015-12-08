// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bm.a;
import com.google.android.m4b.maps.bm.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bn.m;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.k;
import com.google.android.m4b.maps.bo.s;
import com.google.android.m4b.maps.bo.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            d

public final class l extends com.google.android.m4b.maps.cc.d
{

    private static int c = 16384;
    private static int d = 1;
    private static float e = 1.0F;
    private static float f = 1.0F;
    private final com.google.android.m4b.maps.bn.k g;
    private final b h;
    private final int i;
    private final g j = new g();

    private l(int i1, int j1, Set set, d d1)
    {
        super(set);
        g = new m(i1);
        h = new b(i1, d1.A);
        i = 0x10000 * j1;
    }

    public static l a(ac ac1, String as[], com.google.android.m4b.maps.bo.ap.b b1, d d1)
    {
        com.google.android.m4b.maps.bo.m m1 = ac1.d();
        HashSet hashset = new HashSet();
        ArrayList arraylist = new ArrayList();
        int i1 = -1;
        int l1 = 0;
        int k1;
        do
        {
            k1 = i1;
            if (!b1.hasNext())
            {
                break;
            }
            Object obj = b1.a();
            int j1;
            if (obj instanceof bo)
            {
                k1 = i1;
                if (i1 > 1)
                {
                    break;
                }
                k1 = 1;
                i1 = 1;
                j1 = ((bo)obj).a.a.length / 3;
                if (j1 > c)
                {
                    if (ab.a("GLLineMesh", 3))
                    {
                        obj = String.valueOf(ac1);
                        k1 = c;
                        Log.d("GLLineMesh", (new StringBuilder(String.valueOf(obj).length() + 90)).append("unable to handle the LineMesh with ").append(j1).append(" vertices in ").append(((String) (obj))).append(" since the limit is ").append(k1).toString());
                    }
                    b1.next();
                    continue;
                }
                if (j1 + l1 > c)
                {
                    break;
                }
                arraylist.add(obj);
                j1 += l1;
                i1 = 1;
            } else
            {
                k1 = i1;
                if (!(obj instanceof bm))
                {
                    break;
                }
                k1 = i1;
                if (!a((bm)obj))
                {
                    break;
                }
                int j2 = b(((bb) (obj)).d().c[0].b);
                j1 = i1;
                if (j2 != i1)
                {
                    k1 = i1;
                    if (i1 > 0)
                    {
                        break;
                    }
                    j1 = j2;
                }
                i1 = (((bm)obj).b.a.length / 3 - 1) * 2;
                if (i1 > c)
                {
                    if (ab.a("GLLineMesh", 3))
                    {
                        obj = String.valueOf(ac1);
                        k1 = c;
                        Log.d("GLLineMesh", (new StringBuilder(String.valueOf(obj).length() + 86)).append("unable to handle the Line with ").append(i1).append(" vertices in ").append(((String) (obj))).append(" since the limit is ").append(k1).toString());
                    }
                    b1.next();
                    i1 = j1;
                    continue;
                }
                k1 = j1;
                if (i1 + l1 > c)
                {
                    break;
                }
                arraylist.add(obj);
                k1 = i1 + l1;
                i1 = j1;
                j1 = k1;
            }
            obj = ((bb) (obj)).f();
            l1 = obj.length;
            for (k1 = 0; k1 < l1; k1++)
            {
                int i2 = obj[k1];
                if (i2 >= 0 && i2 < as.length)
                {
                    hashset.add(as[i2]);
                }
            }

            b1.next();
            l1 = j1;
        } while (true);
        i1 = k1;
        if (k1 < 0)
        {
            i1 = 1;
        }
        ac1 = new l(l1, i1, hashset, d1);
        as = arraylist.iterator();
        do
        {
            if (!as.hasNext())
            {
                break;
            }
            b1 = (bb)as.next();
            if (b1.a() == 5)
            {
                ac1.a(m1, (bo)b1);
            } else
            if (b1.a() == 8)
            {
                ac1.a(m1, (bm)b1);
            }
        } while (true);
        return ac1;
    }

    public static void a(float f1)
    {
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorenter ;
        f = f1;
        e = Math.max(1.0F, (float)Math.min(5, d) / f);
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(int i1)
    {
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorenter ;
        d = i1;
        e = Math.max(1.0F, (float)Math.min(5, d) / f);
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(com.google.android.m4b.maps.bo.m m1, bm bm1)
    {
        t t1 = bm1.d;
        if (t1.b() == 0 || t1.c[0].b == 0.0F || t1.c[0].a == 0)
        {
            return;
        }
        bm1 = bm1.b;
        int j1 = ((k) (bm1)).a.length / 3 - 1;
        g g1 = m1.c();
        int k1 = m1.f();
        for (int i1 = 0; i1 <= j1; i1++)
        {
            bm1.a(i1, j);
            com.google.android.m4b.maps.bo.g.b(j, g1, j);
            g.a(j, k1);
            if (i1 > 0 && i1 < j1)
            {
                g.a(j, k1);
            }
        }

        h.a(t1.c[0].a, j1 * 2);
    }

    private void a(com.google.android.m4b.maps.bo.m m1, bo bo1)
    {
        t t1 = bo1.b;
        if (t1.b() == 0 || t1.c[0].b == 0.0F || t1.c[0].a == 0)
        {
            return;
        }
        bo1 = bo1.a;
        int j1 = ((k) (bo1)).a.length / 3;
        g g1 = m1.c();
        int k1 = m1.f();
        for (int i1 = 0; i1 < j1; i1++)
        {
            bo1.a(i1, j);
            com.google.android.m4b.maps.bo.g.b(j, g1, j);
            g.a(j, k1);
        }

        h.a(t1.c[0].a, j1);
    }

    public static boolean a(bm bm1)
    {
        boolean flag1 = true;
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorenter ;
        bm1 = bm1.d;
        float f1;
        float f2;
        boolean flag;
        if (bm1.d() && ((t) (bm1)).c[0].c.length != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bm1.b() != 1) goto _L2; else goto _L1
_L1:
        f1 = ((t) (bm1)).c[0].b;
        f2 = e;
        if (f1 > f2 || flag) goto _L2; else goto _L3
_L3:
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        flag1 = false;
        if (true) goto _L3; else goto _L4
_L4:
        bm1;
        throw bm1;
    }

    private static int b(float f1)
    {
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorenter ;
        int i1 = Math.max(1, Math.min(d, Math.round(f * f1)));
        com/google/android/m4b/maps/cc/l;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int a()
    {
        return g.c() + h.a.b();
    }

    public final void a(d d1, com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.ab ab1)
    {
        if (g.a() == 0)
        {
            return;
        }
        b1 = d1.a;
        if (i > 0x10000)
        {
            b1.glLineWidthx(i);
        }
        g.d(d1);
        h.a(d1);
        com.google.android.m4b.maps.bm.a.c(d1);
        b1.glDrawArrays(1, 0, g.a());
        b1.glLineWidthx(0x10000);
        com.google.android.m4b.maps.bm.a.d(d1);
    }

    public final int b()
    {
        return g.d() + 120 + h.a();
    }

    public final void b(d d1)
    {
        g.b(d1);
        h.b(d1);
    }

    public final void c(d d1)
    {
        g.c(d1);
        h.c(d1);
    }

}
