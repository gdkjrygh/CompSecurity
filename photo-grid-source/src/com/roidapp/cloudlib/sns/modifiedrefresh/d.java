// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            c, g

final class d extends Animation
{

    final g a;
    final c b;

    d(c c1, g g1)
    {
        b = c1;
        a = g1;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        if (b.a)
        {
            c.a(f, a);
            return;
        }
        float f1 = c.a(a);
        float f2 = a.h();
        float f4 = a.g();
        float f3 = a.l();
        c.b(f, a);
        if (f <= 0.5F)
        {
            float f6 = f / 0.5F;
            f6 = c.c().getInterpolation(f6);
            a.b(f4 + f6 * (0.8F - f1));
        }
        if (f > 0.5F)
        {
            float f5 = (f - 0.5F) / 0.5F;
            f5 = c.c().getInterpolation(f5);
            a.c((0.8F - f1) * f5 + f2);
        }
        a.d(0.25F * f + f3);
        f1 = c.a(b) / 5F;
        b.d(216F * f + 1080F * f1);
    }
}
