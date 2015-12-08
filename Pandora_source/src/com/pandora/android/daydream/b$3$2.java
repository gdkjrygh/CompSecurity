// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Referenced classes of package com.pandora.android.daydream:
//            b, a

class dapter extends AnimatorListenerAdapter
{

    final a a;

    public void onAnimationEnd(Animator animator)
    {
        b.b(a.a, true);
        b.a(a.a, false);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/pandora/android/daydream/b$3

/* anonymous class */
    class b._cls3
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final b a;

        public void onGlobalLayout()
        {
            long l2 = 400L;
            long l1 = 700L;
            ObjectAnimator objectanimator;
            ObjectAnimator objectanimator1;
            ObjectAnimator objectanimator2;
            ObjectAnimator objectanimator3;
            ValueAnimator valueanimator;
            AnimatorSet animatorset;
            boolean flag;
            int i;
            long l;
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                b.d(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else
            {
                b.d(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            b.a(a, true);
            b.d(a).setVisibility(0);
            if (b.e(a).getResources().getConfiguration().orientation == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = b.a(a).getBottom();
            objectanimator = com.pandora.android.daydream.a.a(b.f(a), -b.f(a).getHeight(), b.f(a).getTop());
            if (flag)
            {
                l = 700L;
            } else
            {
                l = 500L;
            }
            objectanimator = objectanimator.setDuration(l);
            objectanimator1 = com.pandora.android.daydream.a.a(b.g(a), i, b.g(a).getTop());
            if (flag)
            {
                l = 500L;
            } else
            {
                l = 400L;
            }
            objectanimator1 = objectanimator1.setDuration(l);
            objectanimator2 = com.pandora.android.daydream.a.a(b.h(a), i, b.h(a).getTop());
            l = l2;
            if (flag)
            {
                l = 600L;
            }
            objectanimator2 = objectanimator2.setDuration(l);
            objectanimator3 = com.pandora.android.daydream.a.a(b.i(a), i, b.i(a).getTop());
            if (flag)
            {
                l = 700L;
            } else
            {
                l = 500L;
            }
            objectanimator3 = objectanimator3.setDuration(l);
            valueanimator = com.pandora.android.daydream.a.a(0, 0x99000000);
            if (flag)
            {
                l = l1;
            } else
            {
                l = 500L;
            }
            valueanimator = valueanimator.setDuration(l);
            valueanimator.setEvaluator(new ArgbEvaluator());
            valueanimator.addUpdateListener(new b._cls3._cls1());
            animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                objectanimator, objectanimator1, objectanimator2, objectanimator3, valueanimator
            });
            animatorset.setInterpolator(new DecelerateInterpolator(1.7F));
            animatorset.addListener(new b._cls3._cls2(this));
            animatorset.start();
        }

            
            {
                a = b1;
                super();
            }

        // Unreferenced inner class com/pandora/android/daydream/b$3$1

/* anonymous class */
        class b._cls3._cls1
            implements android.animation.ValueAnimator.AnimatorUpdateListener
        {

            final b._cls3 a;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                b.a(a.a).setColorFilter(((Integer)valueanimator.getAnimatedValue()).intValue());
                b.b(a.a).setColorFilter(((Integer)valueanimator.getAnimatedValue()).intValue());
            }

                    
                    {
                        a = b._cls3.this;
                        super();
                    }
        }

    }

}
