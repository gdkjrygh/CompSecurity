// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.aggregator.Algorithms;

public final class bie
{

    private final cmi a;
    private final long b[];
    private final cos c;

    public bie(cmi cmi1, long al[], cos cos)
    {
        a = cmi1;
        b = al;
        c = cos;
    }

    public final float[] a()
    {
        double d5 = 0.0D;
        double d2 = 0.0D;
        float af[] = new float[b.length];
        double d = 3.4028234663852886E+38D;
        double d1 = 0.0D;
        int j = 0;
        for (int i = 0; i < af.length;)
        {
            Float float1 = (Float)a.a(c, b[i]);
            double d8 = d2;
            double d7 = d5;
            int k = j;
            double d6 = d1;
            double d3 = d;
            if (float1 != null)
            {
                af[j] = float1.floatValue();
                d7 = d5 + (double)float1.floatValue();
                d8 = d2 + (double)(float1.floatValue() * float1.floatValue());
                d2 = d1;
                if ((double)float1.floatValue() > d1)
                {
                    d2 = float1.floatValue();
                }
                d1 = d;
                if ((double)float1.floatValue() < d)
                {
                    d1 = float1.floatValue();
                }
                k = j + 1;
                d3 = d1;
                d6 = d2;
            }
            i++;
            d2 = d8;
            d5 = d7;
            j = k;
            d1 = d6;
            d = d3;
        }

        double d4;
        if (j > 0)
        {
            d4 = Algorithms.a(af, 0, j / 2, j);
            d5 /= j;
            d2 -= (double)j * d5 * d5;
            if (j > 1 && d2 > 0.0D)
            {
                d2 = Math.sqrt(d2 / (double)(j - 1));
            } else
            {
                d2 = 0.0D;
            }
        } else
        {
            d2 = 0.0D;
            d4 = 0.0D;
            d5 = 0.0D;
        }
        return (new float[] {
            (float)d5, (float)d2, (float)d4, (float)d, (float)d1, (float)j
        });
    }
}
