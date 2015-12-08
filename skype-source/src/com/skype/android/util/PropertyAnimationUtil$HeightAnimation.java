// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.animation.ValueAnimator;
import android.support.v4.view.animation.a;
import android.support.v4.view.animation.c;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package com.skype.android.util:
//            PropertyAnimationUtil

public static class c
{

    private final View a;
    private final int b;
    private int c;
    private final Interpolator d = new a();
    private final Interpolator e = new c();

    static View a(c c1)
    {
        return c1.a;
    }

    private void a(ValueAnimator valueanimator)
    {
        valueanimator.setDuration(c);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PropertyAnimationUtil.HeightAnimation a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                valueanimator1 = (Integer)valueanimator1.getAnimatedValue();
                com.skype.android.util.PropertyAnimationUtil.HeightAnimation.a(a).getLayoutParams().height = valueanimator1.intValue();
                com.skype.android.util.PropertyAnimationUtil.HeightAnimation.a(a).requestLayout();
            }

            
            {
                a = PropertyAnimationUtil.HeightAnimation.this;
                super();
            }
        });
        valueanimator.start();
    }

    public final void a()
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            0, b
        });
        valueanimator.setInterpolator(d);
        a(valueanimator);
    }

    public final void a(int i)
    {
        c = i;
    }

    public final void b()
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            b, 0
        });
        valueanimator.setInterpolator(e);
        a(valueanimator);
    }

    public _cls1.a(View view)
    {
        a = view;
        b = view.getLayoutParams().b;
        c = 160;
    }
}
