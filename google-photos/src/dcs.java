// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class dcs
{

    private final ddd a;
    private final int b;
    private final int c;
    private final boolean d = false;
    private final boolean e;
    private final float f[][];

    public dcs(int i, int j, boolean flag, boolean flag1)
    {
        b = i;
        c = j;
        e = flag1;
        i = b * c + 2;
        f = (float[][])Array.newInstance(Float.TYPE, new int[] {
            i, i
        });
        a = new ddd(f.length);
    }

    private static ArrayList a(int i, int j, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        for (int k = i - 1; k <= i + 1; k += 2)
        {
            int l = b(k, j, flag);
            if (l >= 0)
            {
                arraylist.add(Integer.valueOf(l));
            }
        }

        return arraylist;
    }

    private static int b(int i, int j, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        int k = i % j;
_L4:
        return k;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (i < j) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public final float a(float af[], float af1[])
    {
        int j;
        int l1;
        b.a(af, "hist1", null);
        b.a(af, "hist2", null);
        float af2[][];
        int l;
        boolean flag;
        if (af.length == b * c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "histogram dimensions are mismatched.");
        if (af1.length == b * c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "histogram dimensions are mismatched.");
        l1 = f.length - 1;
        af2 = f;
        l = af2.length;
        for (int i = 0; i < l; i++)
        {
            Arrays.fill(af2[i], 0.0F);
        }

        j = 0;
        while (j < b * c) 
        {
            float f1 = af[j] - af1[j];
            int i1 = j + 1;
            if (f1 > 0.0F)
            {
                f[0][i1] = f1;
            } else
            if (f1 < 0.0F)
            {
                f[i1][l1] = -f1;
            }
            j++;
        }
        j = 1;
_L8:
        if (j >= l1) goto _L2; else goto _L1
_L1:
        if (f[0][j] == 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b != 1) goto _L4; else goto _L3
_L3:
        af = a(j, c, e);
_L6:
        af = af.iterator();
        do
        {
            do
            {
                if (!af.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                af1 = (Integer)af.next();
            } while (f[af1.intValue()][l1] <= 0.0F);
            f[j][af1.intValue()] = 0x7f7fffff;
        } while (true);
_L4:
        if (c != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        af = a(j, b, d);
        if (true) goto _L6; else goto _L5
_L5:
        int i2 = b;
        int j2 = c;
        boolean flag1 = d;
        boolean flag2 = e;
        af1 = new ArrayList();
        int k2 = (j - 1) % j2;
        int l2 = (j - 1) / j2;
        int j1 = k2 - 1;
        do
        {
            af = af1;
            if (j1 > k2 + 1)
            {
                break;
            }
            int i3 = b(j1, j2, flag2);
            if (i3 != -1)
            {
                for (int k1 = l2 - 1; k1 <= l2 + 1; k1++)
                {
                    int j3 = b(k1, i2, flag1);
                    if (j3 != -1)
                    {
                        af1.add(Integer.valueOf(j3 * j2 + i3 + 1));
                    }
                }

            }
            j1++;
        } while (true);
        if (true) goto _L6; else goto _L7
_L7:
        j++;
          goto _L8
_L2:
        float f3 = a.a(f);
        float f2 = 0.0F;
        for (int k = 0; k < f.length; k++)
        {
            f2 += f[0][k];
        }

        return f2 - 0.5F * f3;
    }
}
