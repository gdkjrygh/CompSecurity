// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.animation.ValueAnimator;
import android.view.View;

final class cx
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final View a;
    final android.animation.ValueAnimator.AnimatorUpdateListener b;

    cx(View view, android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
    {
        a = view;
        b = animatorupdatelistener;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        Integer integer = (Integer)valueanimator.getAnimatedValue();
        a.getLayoutParams().height = integer.intValue();
        a.requestLayout();
        if (b != null)
        {
            b.onAnimationUpdate(valueanimator);
        }
    }
}
