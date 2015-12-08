// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.g;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            s

public final class t
{
    static final class a
    {

        HashMap a;
        a b[];

        static int a(int i, int j, int k)
        {
            return (i >> k & 1) + ((j >> k & 1) << 1);
        }

        static s a(a a1, ah ah1)
        {
            if (a1.a == null)
            {
                return null;
            } else
            {
                return (s)a1.a.get(ah1);
            }
        }

        a()
        {
        }
    }


    private static final ac b = new ac(0, 0, 0);
    private final a a;
    private final Map c = ax.b();
    private g d;

    private t(a a1)
    {
        a = a1;
    }

    private s a(int i, int j, int k, ah ah1, a a1)
    {
        Object obj = a1;
_L2:
        if (obj != a && com.google.android.m4b.maps.bx.a.a(((a) (obj)), ah1) != null)
        {
            obj = com.google.android.m4b.maps.bx.a.a(((a) (obj)), ah1);
            a1 = ((a) (obj));
            if (obj == null)
            {
                if (ab.a("ZoomTableQuadTree", 6))
                {
                    ah1 = String.valueOf(ah1);
                    Log.e("ZoomTableQuadTree", (new StringBuilder(String.valueOf(ah1).length() + 28)).append("No zoom table for tile type ").append(ah1).toString());
                }
                a1 = s.j;
            }
        } else
        {
            k--;
            int l = com.google.android.m4b.maps.bx.a.a(i, j, k);
            if (((a) (obj)).b == null || l < 0 || l > 3)
            {
                a1 = null;
            } else
            {
                a1 = ((a) (obj)).b[l];
            }
            obj = a1;
            if (a1 != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = com.google.android.m4b.maps.bx.a.a(a, ah1);
            a1 = ((a) (obj));
            if (obj == null)
            {
                if (ab.a("ZoomTableQuadTree", 6))
                {
                    ah1 = String.valueOf(ah1);
                    Log.e("ZoomTableQuadTree", (new StringBuilder(String.valueOf(ah1).length() + 33)).append("No root zoom table for tile type ").append(ah1).toString());
                }
                return s.j;
            }
        }
        return a1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static t a(com.google.android.m4b.maps.ac.a a1)
    {
        a a4;
        int i;
        int j2;
        if (a1 == null)
        {
            return null;
        }
        j2 = a1.j(1);
        if (j2 == 0)
        {
            return null;
        }
        com.google.android.m4b.maps.av.a.a();
        a4 = new a();
        i = 0;
_L9:
        if (i >= j2) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.ac.a a6;
        s s1;
        int l;
        int k2;
        a6 = a1.c(1, i);
        int i1 = a6.d(3);
        k2 = a6.j(2);
        int k1 = a6.d(5);
        int ai[];
        if (k2 > 0)
        {
            int ai1[] = new int[k2];
            int j = 0;
            do
            {
                ai = ai1;
                if (j >= k2)
                {
                    break;
                }
                ai1[j] = a6.b(2, j);
                j++;
            } while (true);
        } else
        {
            int ai2[] = new int[(i1 + 1) - k1];
            int k = 0;
            do
            {
                ai = ai2;
                if (k > i1 - k1)
                {
                    break;
                }
                ai2[k] = k + k1;
                k++;
            } while (true);
        }
        s1 = new s(ai, k1, a6.d(1), i1);
        k2 = a6.j(4);
        l = 0;
_L8:
        com.google.android.m4b.maps.ac.a a7;
        ac ac1;
        int j1;
        int l2;
        if (l >= k2)
        {
            continue; /* Loop/switch isn't completed */
        }
        a7 = a6.c(4, l);
        j1 = a7.d(2);
        int l1 = a7.d(3);
        int i3 = a7.d(4);
        l2 = a7.j(1);
        ac1 = new ac(j1, l1, i3);
        j1 = 0;
_L5:
        ah ah1;
        if (j1 >= l2)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        ah1 = ah.a(a7.b(1, j1));
        if (ah1 == null) goto _L4; else goto _L3
_L3:
        a a3;
        int i2;
        int j3;
        int k3;
        j3 = ac1.b;
        k3 = ac1.c;
        i2 = ac1.a;
        a3 = a4;
_L6:
        if (i2 > 0)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        if (a3.a == null)
        {
            a3.a = ax.b();
        }
        a3.a.put(ah1, s1);
_L4:
        j1++;
          goto _L5
        i2--;
        int l3 = com.google.android.m4b.maps.bx.a.a(j3, k3, i2);
        if (a3.b == null)
        {
            a3.b = new a[4];
        }
        a a5 = a3.b[l3];
        a a2 = a5;
        if (a5 == null)
        {
            a2 = new a();
            a3.b[l3] = a2;
        }
        a3 = a2;
          goto _L6
        l++;
        if (true) goto _L8; else goto _L7
_L7:
        i++;
          goto _L9
_L2:
        com.google.android.m4b.maps.av.a.b();
        return new t(a4);
    }

    public final s a(g g1, ah ah1)
    {
        if (d != null && d.equals(g1))
        {
            s s1 = (s)c.get(ah1);
            if (s1 != null)
            {
                return s1;
            }
        } else
        {
            c.clear();
        }
        ac ac2 = ac.a(g1);
        ac ac1 = ac2;
        if (ac2 == null)
        {
            ac1 = b;
        }
        d = g1;
        if (ah1.H == null)
        {
            g1 = a(ac1.b, ac1.c, ac1.a, ah1, a);
        } else
        {
            g1 = a(ac1.b, ac1.c, ac1.a, ah.a(ah1.d()), a);
        }
        c.put(ah1, g1);
        return g1;
    }

}
