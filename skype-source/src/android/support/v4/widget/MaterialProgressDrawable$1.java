// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

final class a extends Animation
{

    final b a;
    final MaterialProgressDrawable b;

    public final void applyTransformation(float f, Transformation transformation)
    {
        if (b.a)
        {
            MaterialProgressDrawable.a(f, a);
            return;
        }
        float f1 = MaterialProgressDrawable.a(a);
        float f2 = a.g();
        float f4 = a.f();
        float f3 = a.k();
        MaterialProgressDrawable.b(f, a);
        if (f <= 0.5F)
        {
            float f6 = f / 0.5F;
            f6 = MaterialProgressDrawable.a().getInterpolation(f6);
            a.b(f4 + (0.8F - f1) * f6);
        }
        if (f > 0.5F)
        {
            float f5 = (f - 0.5F) / 0.5F;
            f5 = MaterialProgressDrawable.a().getInterpolation(f5);
            a.c(f2 + f5 * (0.8F - f1));
        }
        a.d(f3 + 0.25F * f);
        f1 = MaterialProgressDrawable.a(b) / 5F;
        b.d(216F * f + 1080F * f1);
    }

    (MaterialProgressDrawable materialprogressdrawable,  )
    {
        b = materialprogressdrawable;
        a = ;
        super();
    }
}
