// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.tinder.e.au;
import com.tinder.views.LikeMeter;

// Referenced classes of package com.tinder.c:
//            x

final class nit>
    implements android.animation.nimator.AnimatorUpdateListener
{

    final atValue a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        x.c(a.a).setPercentFull(((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    it>(it> it>)
    {
        a = it>;
        super();
    }

    // Unreferenced inner class com/tinder/c/x$3

/* anonymous class */
    final class x._cls3 extends au
    {

        final x a;

        public final void onAnimationEnd(Animator animator)
        {
            animator = new ValueAnimator();
            animator.setRepeatMode(2);
            animator.setRepeatCount(-1);
            animator.setInterpolator(new DecelerateInterpolator());
            animator.setDuration(510L);
            animator.addUpdateListener(new x._cls3._cls1(this));
            animator.setFloatValues(new float[] {
                0.15F, 0.2F
            });
            animator.start();
        }

            
            {
                a = x1;
                super();
            }
    }

}
