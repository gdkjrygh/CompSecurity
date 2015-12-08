// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

final class i extends g.e
{

    final ValueAnimator a = new ValueAnimator();

    i()
    {
    }

    public final void a()
    {
        a.start();
    }

    public final void a(int j, int k)
    {
        a.setIntValues(new int[] {
            j, k
        });
    }

    public final void a(g.e.a a1)
    {
        a.addListener(new AnimatorListenerAdapter(a1) {

            final g.e.a a;
            final i b;

            public final void onAnimationCancel(Animator animator)
            {
                a.b();
            }

            public final void onAnimationEnd(Animator animator)
            {
                a.a();
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                b = i.this;
                a = a1;
                super();
            }
        });
    }

    public final void a(g.e.b b1)
    {
        a.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(b1) {

            final g.e.b a;
            final i b;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                a.a();
            }

            
            {
                b = i.this;
                a = b1;
                super();
            }
        });
    }

    public final void a(Interpolator interpolator)
    {
        a.setInterpolator(interpolator);
    }

    public final boolean b()
    {
        return a.isRunning();
    }

    public final int c()
    {
        return ((Integer)a.getAnimatedValue()).intValue();
    }

    public final void d()
    {
        a.setFloatValues(new float[] {
            0.0F, 1.0F
        });
    }

    public final void e()
    {
        a.setDuration(300L);
    }

    public final void f()
    {
        a.cancel();
    }

    public final float g()
    {
        return a.getAnimatedFraction();
    }
}
