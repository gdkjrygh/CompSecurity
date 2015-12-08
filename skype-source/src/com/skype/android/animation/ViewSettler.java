// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.animation;

import android.animation.ValueAnimator;
import android.view.View;

public class ViewSettler
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    protected android.support.v4.widget.s.a a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected View f;
    private long g;

    public ViewSettler()
    {
        g = 300L;
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f1 = ((Float)valueanimator.getAnimatedValue()).floatValue();
        int i = b;
        int k = (int)((float)c * f1);
        int l = f.getLeft();
        f.offsetLeftAndRight((i + k) - l);
        i = d;
        k = (int)((float)e * f1);
        l = f.getTop();
        f.offsetTopAndBottom((i + k) - l);
        if (a != null)
        {
            valueanimator = a;
            View view = f;
            int j = f.getLeft();
            f.getTop();
            valueanimator.b(view, j);
        }
    }
}
