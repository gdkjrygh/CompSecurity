// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import android.view.View;
import com.tinder.views.CustomTextView;

// Referenced classes of package com.tinder.fragments:
//            bd

final class c
    implements android.animation.nimator.AnimatorUpdateListener
{

    boolean a;
    final View b;
    final String c;
    final bd d;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        b.setRotationY(f * 180F);
        if (!a && f >= 0.5F)
        {
            bd.x(d).setRotationY(180F);
            bd.x(d).setText(c);
            a = true;
        }
    }

    ator(bd bd1, View view, String s)
    {
        d = bd1;
        b = view;
        c = s;
        super();
    }
}
