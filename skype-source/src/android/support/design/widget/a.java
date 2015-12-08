// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.animation.b;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

final class android.support.design.widget.a
{
    static class a
        implements android.view.animation.Animation.AnimationListener
    {

        public void onAnimationEnd(Animation animation)
        {
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        a()
        {
        }
    }


    static final Interpolator a = new LinearInterpolator();
    static final Interpolator b = new b();
    static final Interpolator c = new DecelerateInterpolator();

    static float a(float f, float f1, float f2)
    {
        return (f1 - f) * f2 + f;
    }

    static int a(int i, int j, float f)
    {
        return Math.round((float)(j - i) * f) + i;
    }

}
