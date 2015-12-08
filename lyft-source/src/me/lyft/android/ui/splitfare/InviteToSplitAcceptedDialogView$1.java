// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitAcceptedDialogView

class this._cls0
    implements Action1
{

    final InviteToSplitAcceptedDialogView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        leftIcon.setTranslationY(getHeight() - leftIcon.getHeight());
        rightIcon.setTranslationY(getHeight() - rightIcon.getHeight());
        setAlpha(0.0F);
        setVisibility(0);
        unit = ObjectAnimator.ofFloat(InviteToSplitAcceptedDialogView.this, "alpha", new float[] {
            1.0F
        });
        unit.setDuration(300L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(1500L);
        animatorset.setInterpolator(InviteToSplitAcceptedDialogView.access$000());
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(leftIcon, "translationY", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(rightIcon, "translationY", new float[] {
                0.0F
            })
        });
        AnimatorSet animatorset1 = new AnimatorSet();
        animatorset1.setStartDelay(175L);
        animatorset1.setDuration(1000L);
        animatorset1.setInterpolator(InviteToSplitAcceptedDialogView.access$100());
        animatorset1.addListener(removeScreenAnimationListener);
        animatorset1.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(leftIcon, "translationX", new float[] {
                (float)(-(getWidth() + leftIcon.getWidth()))
            }), ObjectAnimator.ofFloat(rightIcon, "translationX", new float[] {
                (float)(getWidth() + rightIcon.getWidth())
            }), ObjectAnimator.ofFloat(InviteToSplitAcceptedDialogView.this, "alpha", new float[] {
                0.0F
            })
        });
        AnimatorSet animatorset2 = new AnimatorSet();
        animatorset2.playSequentially(new Animator[] {
            unit, animatorset, animatorset1
        });
        animatorset2.addListener(animatorEndListener);
        animatorset2.start();
    }

    ()
    {
        this$0 = InviteToSplitAcceptedDialogView.this;
        super();
    }
}
