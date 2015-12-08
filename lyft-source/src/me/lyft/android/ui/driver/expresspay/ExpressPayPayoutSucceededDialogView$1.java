// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayPayoutSucceededDialogView

class this._cls0
    implements Action1
{

    final ExpressPayPayoutSucceededDialogView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        bolt.setTranslationY(getHeight() - bolt.getHeight());
        setAlpha(0.0F);
        setVisibility(0);
        unit = ObjectAnimator.ofFloat(ExpressPayPayoutSucceededDialogView.this, "alpha", new float[] {
            1.0F
        });
        unit.setDuration(300L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(300L);
        animatorset.setInterpolator(ExpressPayPayoutSucceededDialogView.access$000());
        animatorset.play(ObjectAnimator.ofFloat(bolt, "translationY", new float[] {
            0.0F, 0.0F
        }));
        AnimatorSet animatorset1 = new AnimatorSet();
        animatorset1.setStartDelay(0L);
        animatorset1.setDuration(300L);
        animatorset1.setInterpolator(ExpressPayPayoutSucceededDialogView.access$100());
        animatorset1.addListener(removeScreenAnimationListener);
        animatorset1.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(bolt, "scaleX", new float[] {
                80F
            }), ObjectAnimator.ofFloat(bolt, "scaleY", new float[] {
                80F
            }), ObjectAnimator.ofFloat(ExpressPayPayoutSucceededDialogView.this, "alpha", new float[] {
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
        this$0 = ExpressPayPayoutSucceededDialogView.this;
        super();
    }
}
