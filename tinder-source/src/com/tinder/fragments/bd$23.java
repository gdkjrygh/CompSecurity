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

final class b
    implements android.animation.nimator.AnimatorUpdateListener
{

    final View a;
    final float b;
    final bd c;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        a.setTranslationY(b * f);
        ad.c(a, 1.0F + 0.4F * f);
        bd.x(c).setAlpha(f);
    }

    ator(bd bd1, View view, float f)
    {
        c = bd1;
        a = view;
        b = f;
        super();
    }
}
