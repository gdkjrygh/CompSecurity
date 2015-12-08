// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.a:
//            c, g, b, d

final class f
    implements c
{
    static final class a
        implements android.animation.Animator.AnimatorListener
    {

        final android.support.v4.a.b a;
        final g b;

        public final void onAnimationCancel(Animator animator)
        {
            a.onAnimationCancel(b);
        }

        public final void onAnimationEnd(Animator animator)
        {
            a.onAnimationEnd(b);
        }

        public final void onAnimationRepeat(Animator animator)
        {
            a.onAnimationRepeat(b);
        }

        public final void onAnimationStart(Animator animator)
        {
            a.onAnimationStart(b);
        }

        public a(android.support.v4.a.b b1, g g)
        {
            a = b1;
            b = g;
        }
    }

    static final class b
        implements g
    {

        final Animator a;

        public final void a()
        {
            a.start();
        }

        public final void a(long l)
        {
            a.setDuration(l);
        }

        public final void a(android.support.v4.a.b b1)
        {
            a.addListener(new a(b1, this));
        }

        public final void a(d d1)
        {
            if (a instanceof ValueAnimator)
            {
                ((ValueAnimator)a).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this, d1) {

                    final d a;
                    final b b;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        a.onAnimationUpdate(b);
                    }

            
            {
                b = b1;
                a = d1;
                super();
            }
                });
            }
        }

        public final void a(View view)
        {
            a.setTarget(view);
        }

        public final void c()
        {
            a.cancel();
        }

        public final float d()
        {
            return ((ValueAnimator)a).getAnimatedFraction();
        }

        public b(Animator animator)
        {
            a = animator;
        }
    }


    private TimeInterpolator a;

    f()
    {
    }

    public final g a()
    {
        return new b(ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        }));
    }

    public final void a(View view)
    {
        if (a == null)
        {
            a = (new ValueAnimator()).getInterpolator();
        }
        view.animate().setInterpolator(a);
    }
}
