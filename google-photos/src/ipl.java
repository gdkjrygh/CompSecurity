// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;

public final class ipl
    implements Interpolator
{

    private final float a[];

    public ipl(float af[])
    {
        a = af;
    }

    public final float getInterpolation(float f)
    {
        if (f == 1.0F)
        {
            return a[a.length - 1];
        } else
        {
            f = (float)(a.length - 1) * f;
            int i = (int)Math.floor(f);
            return (f % 1.0F) * (a[i + 1] - a[i]) + a[i];
        }
    }
}
