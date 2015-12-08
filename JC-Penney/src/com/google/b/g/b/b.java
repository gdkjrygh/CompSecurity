// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.b;

import com.google.b.m;
import com.google.b.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.b.g.b:
//            a

final class b
{

    private final com.google.b.b.b a;
    private final List b = new ArrayList(5);
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final int h[] = new int[3];
    private final t i;

    b(com.google.b.b.b b1, int j, int k, int l, int i1, float f1, t t1)
    {
        a = b1;
        c = j;
        d = k;
        e = l;
        f = i1;
        g = f1;
        i = t1;
    }

    private float a(int j, int k, int l, int i1)
    {
        com.google.b.b.b b1 = a;
        int k1 = b1.g();
        int ai[] = h;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        int j1;
        for (j1 = j; j1 >= 0 && b1.a(k, j1) && ai[1] <= l; j1--)
        {
            ai[1] = ai[1] + 1;
        }

        if (j1 >= 0 && ai[1] <= l)
        {
            for (; j1 >= 0 && !b1.a(k, j1) && ai[0] <= l; j1--)
            {
                ai[0] = ai[0] + 1;
            }

            if (ai[0] <= l)
            {
                for (j++; j < k1 && b1.a(k, j) && ai[1] <= l; j++)
                {
                    ai[1] = ai[1] + 1;
                }

                if (j != k1 && ai[1] <= l)
                {
                    for (; j < k1 && !b1.a(k, j) && ai[2] <= l; j++)
                    {
                        ai[2] = ai[2] + 1;
                    }

                    if (ai[2] <= l && Math.abs((ai[0] + ai[1] + ai[2]) - i1) * 5 < i1 * 2 && a(ai))
                    {
                        return a(ai, j);
                    }
                }
            }
        }
        return (0.0F / 0.0F);
    }

    private static float a(int ai[], int j)
    {
        return (float)(j - ai[2]) - (float)ai[1] / 2.0F;
    }

    private a a(int ai[], int j, int k)
    {
        int l = ai[0];
        int i1 = ai[1];
        int j1 = ai[2];
        float f1 = a(ai, k);
        float f2 = a(j, (int)f1, ai[1] * 2, l + i1 + j1);
        if (!Float.isNaN(f2))
        {
            float f3 = (float)(ai[0] + ai[1] + ai[2]) / 3F;
            for (ai = b.iterator(); ai.hasNext();)
            {
                a a1 = (a)ai.next();
                if (a1.a(f3, f2, f1))
                {
                    return a1.b(f2, f1, f3);
                }
            }

            ai = new a(f1, f2, f3);
            b.add(ai);
            if (i != null)
            {
                i.a(ai);
            }
        }
        return null;
    }

    private boolean a(int ai[])
    {
        float f1 = g;
        float f2 = f1 / 2.0F;
        for (int j = 0; j < 3; j++)
        {
            if (Math.abs(f1 - (float)ai[j]) >= f2)
            {
                return false;
            }
        }

        return true;
    }

    a a()
    {
        int ai[];
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        j1 = c;
        k1 = f;
        l1 = j1 + e;
        i2 = d;
        j2 = k1 / 2;
        ai = new int[3];
        l = 0;
_L17:
        if (l >= k1) goto _L2; else goto _L1
_L1:
        int j;
        int i1;
        int k2;
        if ((l & 1) == 0)
        {
            j = (l + 1) / 2;
        } else
        {
            j = -((l + 1) / 2);
        }
        k2 = i2 + j2 + j;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        for (j = j1; j < l1 && !a.a(j, k2); j++) { }
        boolean flag = false;
        i1 = j;
        j = ((flag) ? 1 : 0);
_L9:
        if (i1 >= l1) goto _L4; else goto _L3
_L3:
        if (!a.a(i1, k2)) goto _L6; else goto _L5
_L5:
        if (j != 1) goto _L8; else goto _L7
_L7:
        ai[j] = ai[j] + 1;
_L15:
        i1++;
          goto _L9
_L8:
        if (j != 2) goto _L11; else goto _L10
_L10:
        if (!a(ai)) goto _L13; else goto _L12
_L12:
        a a1 = a(ai, k2, i1);
        if (a1 == null) goto _L13; else goto _L14
_L14:
        return a1;
_L13:
        ai[0] = ai[2];
        ai[1] = 1;
        ai[2] = 0;
        j = 1;
          goto _L15
_L11:
        j++;
        ai[j] = ai[j] + 1;
          goto _L15
_L6:
        int k = j;
        if (j == 1)
        {
            k = j + 1;
        }
        ai[k] = ai[k] + 1;
        j = k;
          goto _L15
_L4:
        a a2;
        if (!a(ai))
        {
            continue; /* Loop/switch isn't completed */
        }
        a2 = a(ai, k2, l1);
        a1 = a2;
        if (a2 != null) goto _L14; else goto _L16
_L16:
        l++;
          goto _L17
_L2:
        if (!b.isEmpty())
        {
            return (a)b.get(0);
        } else
        {
            throw m.a();
        }
    }
}
