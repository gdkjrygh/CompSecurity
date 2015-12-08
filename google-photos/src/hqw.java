// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.view.View;

final class hqw
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private hqv a;

    hqw(hqv hqv1)
    {
        a = hqv1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        hqv.a(a).setTranslationY(((Float)valueanimator.getAnimatedValue()).floatValue());
    }
}
