// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.DecelerateInterpolator;

final class cbn extends DecelerateInterpolator
{

    private final float a = 0.15F;

    public cbn(float f, float f1)
    {
        super(4F);
    }

    public final float getInterpolation(float f)
    {
        if (f >= a)
        {
            float f1 = super.getInterpolation(a);
            return f1 + (1.0F - f1) * (f - a);
        } else
        {
            return super.getInterpolation(f);
        }
    }
}
