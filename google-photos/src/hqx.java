// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.view.View;

final class hqx
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private hqv a;

    hqx(hqv hqv1)
    {
        a = hqv1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            View view = hqv.a(a);
            float f = hqv.b(a);
            mk.d(view, ((Float)valueanimator.getAnimatedValue()).floatValue() * f);
            if (hqv.c(a) != null)
            {
                View view1 = hqv.c(a);
                float f1 = hqv.b(a);
                mk.d(view1, ((Float)valueanimator.getAnimatedValue()).floatValue() * f1);
            }
            return;
        }
        View view2 = hqv.d(a);
        if (hqv.c(a) != null)
        {
            View view3;
            if (-hqv.c(a).getTranslationY() - (float)hqv.c(a).getHeight() < -hqv.a(a).getTranslationY() - (float)hqv.a(a).getHeight())
            {
                view2 = hqv.e(a);
            } else
            {
                view2 = hqv.d(a);
            }
            if (view2 == hqv.d(a))
            {
                view3 = hqv.e(a);
            } else
            {
                view3 = hqv.d(a);
            }
            view3.setAlpha(0.0F);
        }
        view2.setAlpha(((Float)valueanimator.getAnimatedValue()).floatValue());
    }
}
