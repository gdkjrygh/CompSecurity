// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            m

final class on extends Animation
{

    final b a;
    final m b;

    public final void applyTransformation(float f, Transformation transformation)
    {
        if (b.b)
        {
            m.a(f, a);
            return;
        }
        float f1 = m.a(a);
        float f2 = a.l;
        float f4 = a.k;
        float f3 = a.m;
        m.b(f, a);
        if (f <= 0.5F)
        {
            float f6 = f / 0.5F;
            f6 = m.a().getInterpolation(f6);
            a.a(f4 + f6 * (0.8F - f1));
        }
        if (f > 0.5F)
        {
            float f5 = (f - 0.5F) / 0.5F;
            f5 = m.a().getInterpolation(f5);
            a.b((0.8F - f1) * f5 + f2);
        }
        a.c(0.25F * f + f3);
        f1 = m.a(b) / 5F;
        b.c(216F * f + 1080F * f1);
    }

    rmation(m m1, rmation rmation)
    {
        b = m1;
        a = rmation;
        super();
    }
}
