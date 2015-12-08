// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonEclairMr1, AnimationUtils, ShadowViewDelegate

class FloatingActionButtonHoneycombMr1 extends FloatingActionButtonEclairMr1
{

    private boolean mIsHiding;

    FloatingActionButtonHoneycombMr1(View view, ShadowViewDelegate shadowviewdelegate)
    {
        super(view, shadowviewdelegate);
    }

    void hide()
    {
        if (mIsHiding)
        {
            return;
        } else
        {
            mView.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {

                final FloatingActionButtonHoneycombMr1 this$0;

                public void onAnimationCancel(Animator animator)
                {
                    mIsHiding = false;
                }

                public void onAnimationEnd(Animator animator)
                {
                    mIsHiding = false;
                    mView.setVisibility(8);
                }

                public void onAnimationStart(Animator animator)
                {
                    mIsHiding = true;
                }

            
            {
                this$0 = FloatingActionButtonHoneycombMr1.this;
                super();
            }
            });
            return;
        }
    }

    void show()
    {
        mView.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(null);
    }


/*
    static boolean access$002(FloatingActionButtonHoneycombMr1 floatingactionbuttonhoneycombmr1, boolean flag)
    {
        floatingactionbuttonhoneycombmr1.mIsHiding = flag;
        return flag;
    }

*/
}
