// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;

final class hjb
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private afn a;
    private hiy b;

    hjb(hiy hiy1, afn afn1)
    {
        b = hiy1;
        a = afn1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = ((Float)valueanimator.getAnimatedValue("animation_position")).floatValue();
        if (hiy.c(b) == hjc.a)
        {
            ((hiw)a.a).a(f);
        } else
        if (hiy.c(b) == hjc.b)
        {
            ((hiw)a.a).b(f);
            return;
        }
    }
}
