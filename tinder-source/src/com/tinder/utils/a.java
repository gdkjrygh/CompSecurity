// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.facebook.a.e;
import com.facebook.a.i;

public final class a
{

    private static i a = i.b();

    static AnimatorSet a(View view, float f, float f1, long l, android.animation.Animator.AnimatorListener animatorlistener)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "scaleX", new float[] {
            f, f1
        });
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
            f, f1
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, view
        });
        animatorset.setDuration(l);
        if (animatorlistener != null)
        {
            animatorset.addListener(animatorlistener);
        }
        return animatorset;
    }

    public static e a()
    {
        return a.a();
    }

    public static void a(View view, float f, long l, long l1)
    {
        b(view, f, l, l1);
    }

    public static transient void a(View aview[])
    {
        for (int j = 0; j < 2; j++)
        {
            b(aview[j], 0.7F, 200L, 200L);
        }

    }

    static AnimatorSet b(View view, float f, float f1, long l, android.animation.Animator.AnimatorListener animatorlistener)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "scaleX", new float[] {
            f1, f
        });
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
            f1, f
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, view
        });
        animatorset.setDuration(l);
        animatorset.setInterpolator(new OvershootInterpolator(4F));
        if (animatorlistener != null)
        {
            animatorset.addListener(animatorlistener);
        }
        return animatorset;
    }

    private static void b(View view, float f, long l, long l1)
    {
        view.setOnTouchListener(new android.view.View.OnTouchListener(view, f, l, l1) {

            final View a;
            final float b = 1.0F;
            final float c;
            final long d;
            final android.animation.Animator.AnimatorListener e = null;
            final long f;

            public final boolean onTouch(View view1, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 3: default 36
            //                           0 38
            //                           1 67
            //                           2 36
            //                           3 67;
                   goto _L1 _L2 _L3 _L1 _L3
_L1:
                return false;
_L2:
                a.a(a, b, c, d, e).start();
                continue; /* Loop/switch isn't completed */
_L3:
                a.b(a, b, c, f, e).start();
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = view;
                c = f1;
                d = l;
                f = l1;
                super();
            }
        });
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

}
