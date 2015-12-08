// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

public class cxm
{

    public final float a[][];
    private final cxj b[];

    public cxm(List list, cxd cxd1, cxm cxm1)
    {
        int i = list.size();
        a = (float[][])Array.newInstance(Float.TYPE, new int[] {
            i, i
        });
        b = (cxj[])list.toArray(new cxj[0]);
        if (cxm1 != null)
        {
            a(cxm1);
        }
        a(cxd1);
    }

    private void a(cxd cxd1)
    {
        for (int i = 0; i < b.length; i++)
        {
            a[i][i] = 0;
            int j = i + 1;
            while (j < b.length) 
            {
                if (a[i][j] <= 0.0F)
                {
                    float af[] = a[i];
                    cof cof = b[i].b;
                    cqh cqh = b[i].c;
                    cof cof1 = b[j].b;
                    cqh cqh1 = b[j].c;
                    float f;
                    if (cxd1.b(cqh, cof, cqh1, cof1))
                    {
                        f = cxd1.a(cqh, cof, cqh1, cof1);
                    } else
                    {
                        f = 3.402823E+38F;
                    }
                    af[j] = f;
                    a[j][i] = a[i][j];
                }
                j++;
            }
        }

    }

    private void a(cxm cxm1)
    {
        int ai[] = new int[cxm1.b.length];
        java.util.HashMap hashmap = b.l(b.length);
        cxj acxj[] = b;
        int i1 = acxj.length;
        int i = 0;
        int k = 0;
        for (; i < i1; i++)
        {
            hashmap.put(acxj[i].a, Integer.valueOf(k));
            k++;
        }

        acxj = cxm1.b;
        int l1 = acxj.length;
        k = 0;
        i = 0;
        while (k < l1) 
        {
            Integer integer = (Integer)hashmap.get(acxj[k].a);
            int j1;
            if (integer != null)
            {
                j1 = integer.intValue();
            } else
            {
                j1 = -1;
            }
            ai[i] = j1;
            k++;
            i++;
        }
        for (int j = 0; j < cxm1.b.length; j++)
        {
            for (int l = j + 1; l < cxm1.b.length; l++)
            {
                int k1 = ai[j];
                int i2 = ai[l];
                if (k1 >= 0 && i2 >= 0)
                {
                    a[k1][i2] = cxm1.a[j][l];
                    a[i2][k1] = a[k1][i2];
                }
            }

        }

    }

    static 
    {
        cxm.getSimpleName();
    }
}
