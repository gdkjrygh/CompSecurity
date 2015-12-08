// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import android.view.View;
import com.tinder.utils.ad;
import com.tinder.views.CustomTextView;

// Referenced classes of package com.tinder.fragments:
//            bd

final class d
    implements android.animation.nimator.AnimatorUpdateListener
{

    boolean a;
    final View b;
    final float c;
    final ValueAnimator d;
    final bd e;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        b.setTranslationY(c - c * f);
        bd.x(e).setAlpha(1.0F - f);
        ad.c(b, (1.0F - f) * 0.4F + 1.0F);
        if (!a && f >= 0.9F)
        {
            a = true;
            d.start();
        }
    }

    ator(bd bd1, View view, float f, ValueAnimator valueanimator)
    {
        e = bd1;
        b = view;
        c = f;
        d = valueanimator;
        super();
    }
}
