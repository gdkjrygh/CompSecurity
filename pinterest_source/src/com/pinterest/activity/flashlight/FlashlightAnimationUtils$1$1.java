// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.base.Constants;

class this._cls0
    implements Runnable
{

    final _cls1 this$0;

    public void run()
    {
        closeupImageView.setVisibility(4);
        final ViewPropertyAnimator viewPropertyAnimator = flashlightImageContainer.animate().setDuration(Constants.ANIM_SPEED_NORMAL).y(0.0F);
        class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
        {

            final FlashlightAnimationUtils._cls1._cls1 this$1;
            final ViewPropertyAnimator val$viewPropertyAnimator;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                flashlightImageContainer.setBackgroundColor(-1);
                closeupImageView.setVisibility(0);
                animator = (ScrollView)flashlightImageContainer.findViewById(0x7f0f01d8);
                animator.getLayoutParams().height = scrollViewDesiredHeight;
                ((PinFlashlightCropView)animator.getChildAt(0)).setShowCropWindow(true);
                viewPropertyAnimator.setListener(null);
            }

            _cls1()
            {
                this$1 = FlashlightAnimationUtils._cls1._cls1.this;
                viewPropertyAnimator = viewpropertyanimator;
                super();
            }
        }

        viewPropertyAnimator.setListener(new _cls1());
    }

    _cls1()
    {
        this$0 = this._cls0.this;
        super();
    }
}
