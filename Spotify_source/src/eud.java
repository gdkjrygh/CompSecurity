// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;

public final class eud extends AnimatorListenerAdapter
{

    private boolean a;

    public eud(boolean flag)
    {
        a = flag;
    }

    public final void onAnimationStart(Animator animator)
    {
        float f3 = 1.0F;
        animator = (ObjectAnimator)animator;
        View view = (View)animator.getTarget();
        if (view != null)
        {
            Integer integer = (Integer)view.getTag(0x7f1100b5);
            float f;
            float f1;
            float f2;
            byte byte0;
            if (integer != null && integer.intValue() == -1)
            {
                byte0 = -1;
            } else
            {
                byte0 = 1;
            }
            if (a)
            {
                f = view.getMeasuredHeight() * byte0;
            } else
            {
                f = 0.0F;
            }
            if (a)
            {
                f1 = 0.0F;
            } else
            {
                f1 = view.getMeasuredHeight() * byte0;
            }
            if (a)
            {
                f2 = 0.0F;
            } else
            {
                f2 = 1.0F;
            }
            if (!a)
            {
                f3 = 0.0F;
            }
            animator.setValues(new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] {
                    f, f1
                }), PropertyValuesHolder.ofFloat(View.ALPHA, new float[] {
                    f2, f3
                })
            });
        }
    }
}
