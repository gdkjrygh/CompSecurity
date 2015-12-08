// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;

public class bif
{

    public bif()
    {
    }

    private static void a(LongSparseArray longsparsearray)
    {
        if (longsparsearray.size() == 0)
        {
            return;
        }
        long l = longsparsearray.keyAt(0);
        for (int i = 1; i < longsparsearray.size();)
        {
            long l1 = longsparsearray.keyAt(i);
            big big1 = (big)longsparsearray.valueAt(i);
            if (l1 - l > 0L)
            {
                float f = 33000F / (float)(l1 - l);
                big1.a = big1.a * f;
                big1.b = f * big1.b;
            }
            i++;
            l = l1;
        }

        longsparsearray.removeAt(0);
    }

    public static float[] a(cmi cmi1, long al[])
    {
        LongSparseArray longsparsearray;
        int i;
        int j;
        longsparsearray = new LongSparseArray();
        j = al.length;
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        Long long1 = Long.valueOf(al[i]);
        obj = b.a(cmi1);
        if (obj != cos.a && obj != cos.r)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (cxh)cmi1.a(((cos) (obj)), long1.longValue());
        if (obj != null)
        {
            obj = new big(((cxh) (obj)).c(), ((cxh) (obj)).d());
            longsparsearray.append(long1.longValue(), obj);
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (obj == null) goto _L4; else goto _L3
_L3:
        cmi1 = String.valueOf(obj);
        throw b.a((new StringBuilder(String.valueOf(cmi1).length() + 20)).append("Invalid field type: ").append(cmi1).toString());
        if (longsparsearray.size() == 0)
        {
            return null;
        } else
        {
            a(longsparsearray);
            al = b(longsparsearray);
            a(((LongSparseArray) (al)));
            cmi1 = c(longsparsearray);
            al = c(al);
            float af[] = new float[12];
            System.arraycopy(cmi1, 0, af, 0, 6);
            System.arraycopy(al, 0, af, 6, 6);
            return af;
        }
    }

    private static LongSparseArray b(LongSparseArray longsparsearray)
    {
        int i = 1;
        LongSparseArray longsparsearray1 = new LongSparseArray();
        if (longsparsearray.size() > 1)
        {
            big big2;
            for (big big1 = (big)longsparsearray.valueAt(0); i < longsparsearray.size(); big1 = big2)
            {
                big2 = (big)longsparsearray.valueAt(i);
                longsparsearray1.append(longsparsearray.keyAt(i), new big(big2.a - big1.a, big2.b - big1.b));
                i++;
            }

        }
        return longsparsearray1;
    }

    private static float[] c(LongSparseArray longsparsearray)
    {
        float f = 0.0F;
        int j = longsparsearray.size();
        float f1;
        float f2;
        float f3;
        float f4;
        if (j > 0)
        {
            int i = 0;
            f = 0.0F;
            f1 = 0.0F;
            f2 = 0.0F;
            f3 = 0.0F;
            f4 = 0.0F;
            for (; i < longsparsearray.size(); i++)
            {
                big big1 = (big)longsparsearray.valueAt(i);
                f4 += big1.a;
                f3 += big1.b;
                f2 += big1.a * big1.a;
                f1 += big1.b * big1.b;
                float f5 = big1.a;
                f += big1.b * f5;
            }

            f4 /= j;
            f3 /= j;
            f2 /= j;
            f1 = f1 / (float)j - f3 * f3;
            f = f / (float)j - f4 * f3;
            f2 -= f4 * f4;
        } else
        {
            f1 = 0.0F;
            f2 = 0.0F;
            f3 = 0.0F;
            f4 = 0.0F;
        }
        return (new float[] {
            f4, f3, f2, f1, f, (float)j
        });
    }

    static 
    {
        bif.getSimpleName();
    }
}
