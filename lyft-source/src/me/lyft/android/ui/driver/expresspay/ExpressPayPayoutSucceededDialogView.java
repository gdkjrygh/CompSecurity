// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.ViewExtensions;
import rx.functions.Action1;

public class ExpressPayPayoutSucceededDialogView extends LinearLayout
{

    private static final int ALPHA_IN_DURATION = 300;
    private static final int ANIM_OUT_DURATION = 300;
    private static final int ANIM_OUT_START_DELAY_DURATION = 0;
    private static final Interpolator BOUNCE_IN_INTERPOLATOR = new AnticipateOvershootInterpolator(1.4F);
    private static final int SCALE_RATIO = 80;
    private static final int SLIDE_ANIM_IN_DURATION = 300;
    private static final Interpolator SLIDE_OUT_INTERPOLATOR = new AccelerateInterpolator();
    final android.animation.Animator.AnimatorListener animatorEndListener = new AnimatorListenerAdapter() {

        final ExpressPayPayoutSucceededDialogView this$0;

        public void onAnimationEnd(Animator animator)
        {
            dialogFlow.show(new Toast(getResources().getString(0x7f070173)));
        }

            
            {
                this$0 = ExpressPayPayoutSucceededDialogView.this;
                super();
            }
    };
    AppFlow appFlow;
    ImageView bolt;
    DialogFlow dialogFlow;
    final Action1 readyToAnimateAction = new Action1() {

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
            animatorset.setInterpolator(ExpressPayPayoutSucceededDialogView.BOUNCE_IN_INTERPOLATOR);
            animatorset.play(ObjectAnimator.ofFloat(bolt, "translationY", new float[] {
                0.0F, 0.0F
            }));
            AnimatorSet animatorset1 = new AnimatorSet();
            animatorset1.setStartDelay(0L);
            animatorset1.setDuration(300L);
            animatorset1.setInterpolator(ExpressPayPayoutSucceededDialogView.SLIDE_OUT_INTERPOLATOR);
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

            
            {
                this$0 = ExpressPayPayoutSucceededDialogView.this;
                super();
            }
    };
    final android.animation.Animator.AnimatorListener removeScreenAnimationListener = new AnimatorListenerAdapter() {

        final ExpressPayPayoutSucceededDialogView this$0;

        public void onAnimationStart(Animator animator)
        {
            appFlow.resetTo(new me.lyft.android.ui.driver.DriverScreens.DriverStatsScreen());
        }

            
            {
                this$0 = ExpressPayPayoutSucceededDialogView.this;
                super();
            }
    };

    public ExpressPayPayoutSucceededDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Binder.attach(this).bind(ViewExtensions.onLoadedObservable(this), readyToAnimateAction);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }



}
