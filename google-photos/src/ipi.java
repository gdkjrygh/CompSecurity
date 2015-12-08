// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;

public final class ipi
    implements Interpolator
{

    private final msx a[];

    public ipi(msx amsx[])
    {
        a = amsx;
    }

    public final float getInterpolation(float f)
    {
        float f2;
        int i;
        int j;
        i = 0;
        f2 = 0.0F;
        j = a.length;
        if (f > a[0].a) goto _L2; else goto _L1
_L1:
        float f1 = a[0].b;
_L4:
        return f1;
_L2:
        if (f >= a[j - 1].g)
        {
            return a[j - 1].h;
        }
        msx amsx[] = a;
        j = amsx.length;
        do
        {
            f1 = f2;
            if (i >= j)
            {
                continue;
            }
            msx msx1 = amsx[i];
            if (f >= msx1.a && f <= msx1.g)
            {
                return msx1.a(msx1.b(f));
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
