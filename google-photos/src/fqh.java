// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;

final class fqh
    implements Interpolator
{

    private final float a[];
    private final float b[];

    public fqh(float af[], float af1[])
    {
        a = af;
        b = af1;
    }

    public final float getInterpolation(float f)
    {
        if (f <= 0.0F)
        {
            return 0.0F;
        }
        if (f >= 1.0F)
        {
            return 1.0F;
        }
        int j = a.length - 1;
        int i;
        for (i = 0; j - i > 1;)
        {
            int k = (i + j) / 2;
            if (f < a[k])
            {
                j = k;
            } else
            {
                i = k;
            }
        }

        float f1 = a[j] - a[i];
        if (f1 == 0.0F)
        {
            return b[i];
        } else
        {
            f = (f - a[i]) / f1;
            f1 = b[i];
            return f * (b[j] - f1) + f1;
        }
    }
}
