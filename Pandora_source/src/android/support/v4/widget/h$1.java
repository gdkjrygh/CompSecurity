// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            h

class on extends Animation
{

    final b a;
    final h b;

    public void applyTransformation(float f, Transformation transformation)
    {
        if (b.a)
        {
            h.a(b, f, a);
            return;
        } else
        {
            float f3 = (float)Math.toRadians((double)a.c() / (6.2831853071795862D * a.h()));
            float f4 = a.f();
            float f1 = a.e();
            float f2 = a.i();
            float f5 = h.a().getInterpolation(f);
            a.c((0.8F - f3) * f5 + f4);
            f3 = h.b().getInterpolation(f);
            a.b(f3 * 0.8F + f1);
            a.d(0.25F * f + f2);
            f1 = h.a(b) / 5F;
            b.c(144F * f + 720F * f1);
            return;
        }
    }

    rmation(h h1, rmation rmation)
    {
        b = h1;
        a = rmation;
        super();
    }
}
