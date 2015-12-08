// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

final class r extends p.e
{

    final ValueAnimator a = new ValueAnimator();

    r()
    {
    }

    public final void a()
    {
        a.start();
    }

    public final void a(float f1, float f2)
    {
        a.setFloatValues(new float[] {
            f1, f2
        });
    }

    public final void a(int i)
    {
        a.setDuration(i);
    }

    public final void a(int i, int j)
    {
        a.setIntValues(new int[] {
            i, j
        });
    }

    public final void a(p.e.a a1)
    {
        a.addListener(new AnimatorListenerAdapter(a1) {

            final p.e.a a;
            final r b;

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
                b = r.this;
                a = a1;
                super();
            }
        });
    }

    public final void a(p.e.b b1)
    {
        a.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(b1) {

            final p.e.b a;
            final r b;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                a.a();
            }

            
            {
                b = r.this;
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

    public final float d()
    {
        return ((Float)a.getAnimatedValue()).floatValue();
    }

    public final void e()
    {
        a.cancel();
    }

    public final float f()
    {
        return a.getAnimatedFraction();
    }
}
