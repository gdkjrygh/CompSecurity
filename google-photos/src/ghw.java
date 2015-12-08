// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;

final class ghw
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private ArgbEvaluator a;
    private int b;
    private ghs c;

    ghw(ghs ghs1, ArgbEvaluator argbevaluator, int i)
    {
        c = ghs1;
        a = argbevaluator;
        b = i;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        ghs.e(c).getRootView().setBackgroundColor(((Integer)a.evaluate(valueanimator.getAnimatedFraction(), Integer.valueOf(-1), Integer.valueOf(b))).intValue());
    }
}
