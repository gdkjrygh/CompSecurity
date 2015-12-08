// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinFlashlightCropView

class val.animatorSet extends AnimatorListenerAdapter
{

    private boolean _canceled;
    final PinFlashlightCropView this$0;
    final AnimatorSet val$animatorSet;
    final RectF val$originalFrameRect;
    final float val$pulsarSize;

    public void onAnimationCancel(Animator animator)
    {
        _canceled = true;
    }

    public void onAnimationEnd(Animator animator)
    {
        if (!_canceled)
        {
            _canceled = true;
            PinFlashlightCropView.access$202(PinFlashlightCropView.this, new AnimatorSet());
            PinFlashlightCropView.access$200(PinFlashlightCropView.this).setInterpolator(new LinearInterpolator());
            PinFlashlightCropView.access$200(PinFlashlightCropView.this).setDuration(Constants.ANIM_SPEED_SLOW);
            android.animation.ValueAnimator valueanimator = PinFlashlightCropView.access$300(PinFlashlightCropView.this, val$originalFrameRect, 1.2F, 1.0F);
            ObjectAnimator objectanimator1 = new ObjectAnimator();
            ObjectAnimator objectanimator2 = new ObjectAnimator();
            ObjectAnimator objectanimator = objectanimator2;
            animator = objectanimator1;
            if (PinFlashlightCropView.access$400(PinFlashlightCropView.this) != null)
            {
                objectanimator = objectanimator2;
                animator = objectanimator1;
                if (PinFlashlightCropView.access$500(PinFlashlightCropView.this) != null)
                {
                    animator = PinFlashlightCropView.access$600(PinFlashlightCropView.this, PinFlashlightCropView.access$400(PinFlashlightCropView.this), val$pulsarSize, -1);
                    objectanimator = PinFlashlightCropView.access$600(PinFlashlightCropView.this, PinFlashlightCropView.access$500(PinFlashlightCropView.this), val$pulsarSize, 1);
                }
            }
            PinFlashlightCropView.access$200(PinFlashlightCropView.this).playTogether(new Animator[] {
                valueanimator, animator, objectanimator
            });
            PinFlashlightCropView.access$200(PinFlashlightCropView.this).start();
            class _cls1 extends AnimatorListenerAdapter
            {

                private boolean _reverseCanceled;
                final PinFlashlightCropView._cls4 this$1;

                public void onAnimationCancel(Animator animator1)
                {
                    _reverseCanceled = true;
                }

                public void onAnimationEnd(Animator animator1)
                {
                    PinFlashlightCropView.access$200(this$0).removeAllListeners();
                    if (_reverseCanceled)
                    {
                        removeCallbacks(PinFlashlightCropView.access$700(this$0));
                        return;
                    } else
                    {
                        postDelayed(PinFlashlightCropView.access$700(this$0), 4000L);
                        return;
                    }
                }

                public void onAnimationStart(Animator animator1)
                {
                    _reverseCanceled = false;
                }

            _cls1()
            {
                this$1 = PinFlashlightCropView._cls4.this;
                super();
            }
            }

            PinFlashlightCropView.access$200(PinFlashlightCropView.this).addListener(new _cls1());
        } else
        {
            removeCallbacks(PinFlashlightCropView.access$700(PinFlashlightCropView.this));
        }
        val$animatorSet.removeAllListeners();
    }

    public void onAnimationStart(Animator animator)
    {
        _canceled = false;
    }

    _cls1()
    {
        this$0 = final_pinflashlightcropview;
        val$originalFrameRect = rectf;
        val$pulsarSize = f;
        val$animatorSet = AnimatorSet.this;
        super();
    }
}
