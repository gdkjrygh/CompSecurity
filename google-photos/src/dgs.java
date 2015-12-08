// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;

final class dgs
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private dge a;
    private dgk b;

    dgs(dgk dgk1, dge dge)
    {
        b = dgk1;
        a = dge;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        dgk.a(b, a, f);
    }
}
