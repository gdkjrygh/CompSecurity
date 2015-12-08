// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cde
    implements cdi
{

    public cde()
    {
    }

    public final float a(cob cob1)
    {
        b.a(cob1.b(), "input.getValueCount()", 24, null);
        float af[] = new float[6];
        for (int i = 0; i < 18; i++)
        {
            int l = i % 6;
            af[l] = af[l] + cob1.c[i] * (float)b.g(i);
        }

        int j = 0;
        float f1 = 0.0F;
        for (; j < 6; j++)
        {
            f1 += af[j];
        }

        float f2;
        if (f1 > 0.0F)
        {
            int k = 0;
            float f = 0.0F;
            do
            {
                f2 = f;
                if (k >= 6)
                {
                    break;
                }
                float f3 = af[k] / f1;
                f2 = f;
                if (f3 > 0.0F)
                {
                    f2 = (float)((double)f + (double)f3 * Math.log(f3));
                }
                k++;
                f = f2;
            } while (true);
        } else
        {
            f2 = 0.0F;
        }
        return -f2;
    }
}
