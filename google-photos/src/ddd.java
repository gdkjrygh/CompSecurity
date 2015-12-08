// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.util.Arrays;

public final class ddd
{

    private final int a;
    private final int b;
    private final float c[][];
    private final int d[][];
    private final dde e;
    private final dde f;
    private final boolean g[];
    private final int h[];
    private float i[][];

    public ddd(int j)
    {
        a = j;
        b = a - 1;
        j = a;
        int k = a;
        c = (float[][])Array.newInstance(Float.TYPE, new int[] {
            j, k
        });
        f = new dde(a * a);
        e = new dde(a);
        j = a;
        k = a;
        d = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j, k
        });
        g = new boolean[a];
        h = new int[a];
    }

    private float a()
    {
        boolean flag = true;
        float f1 = 3.402823E+38F;
        int j = 1;
        int l;
        do
        {
            l = ((flag) ? 1 : 0);
            if (j >= e.b)
            {
                break;
            }
            l = e.a[j];
            int j1 = e.a[j - 1];
            f1 = Math.min(f1, i[l][j1] - c[l][j1]);
            j++;
        } while (true);
        for (; l < e.b; l++)
        {
            int k = e.a[l];
            int i1 = e.a[l - 1];
            float af[] = c[k];
            af[i1] = af[i1] + f1;
            af = c[i1];
            af[k] = af[k] - f1;
        }

        return f1;
    }

    private boolean a(boolean flag)
    {
        boolean flag3;
        flag3 = false;
        Arrays.fill(g, false);
        e.b = 0;
        f.b = 0;
        f.a(0);
_L12:
        int j;
        int k;
        int l;
        int i1;
        dde dde1;
        boolean flag2;
        if (f.b == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag2 = flag3;
        if (j != 0) goto _L2; else goto _L1
_L1:
        dde1 = f;
        dde1.b = dde1.b - 1;
        l = dde1.a[dde1.b];
        k = 0;
_L10:
        if (k >= a || d[l][k] == 0) goto _L4; else goto _L3
_L3:
        i1 = d[l][k];
        if (g[i1])
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag1;
        if (i[l][i1] - c[l][i1] > 0.0F)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag1 = j;
        if (flag)
        {
            if (i[l][i1] > 0.0F && j != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 != b) goto _L6; else goto _L5
_L5:
        e.a(i1);
        j = l;
_L9:
        e.a(j);
        if (j != 0) goto _L8; else goto _L7
_L7:
        flag2 = true;
_L2:
        return flag2;
_L8:
        j = h[j];
        if (true) goto _L9; else goto _L6
_L6:
        h[i1] = l;
        f.a(i1);
        k++;
          goto _L10
_L4:
        g[l] = true;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final float a(float af[][])
    {
        b.a(af.length, "capacity.length", a, "mNumVertices");
        b.a(af[0].length, "capacity[0].length", a, "mNumVertices");
        i = af;
        af = d;
        int i1 = af.length;
        for (int j = 0; j < i1; j++)
        {
            Arrays.fill(af[j], 0);
        }

        int k = 0;
        do
        {
            if (k >= a)
            {
                break;
            }
            i1 = a - 1;
            int k1;
            for (int j1 = 0; i1 > 0; j1 = k1)
            {
label0:
                {
                    if (i[k][i1] <= 0.0F)
                    {
                        k1 = j1;
                        if (i[i1][k] <= 0.0F)
                        {
                            break label0;
                        }
                    }
                    d[k][j1] = i1;
                    k1 = j1 + 1;
                }
                i1--;
            }

            k++;
        } while (true);
        af = c;
        i1 = af.length;
        for (int l = 0; l < i1; l++)
        {
            Arrays.fill(af[l], 0.0F);
        }

        float f1 = 0.0F;
        float f2;
        do
        {
            f2 = f1;
            if (!a(true))
            {
                break;
            }
            f1 += a();
        } while (true);
        while (a(false)) 
        {
            f2 += a();
        }
        return f2;
    }
}
