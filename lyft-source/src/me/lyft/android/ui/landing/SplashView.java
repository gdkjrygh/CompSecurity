// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

public class SplashView extends FrameLayout
{

    private static final int FADE_FRAMES = 8;
    private static final Interpolator FADE_OUT_INTERPOLATOR = new AccelerateInterpolator(0.5F);
    private Action1 animationEndAction;
    ImageView logoView;

    public SplashView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBackgroundColor(getResources().getColor(0x7f0c0075));
        LayoutInflater.from(context).inflate(0x7f030130, this, true);
        ButterKnife.a(this);
    }

    public void setOnAnimationEndAction(Action1 action1)
    {
        animationEndAction = action1;
    }

    public void startFadeAnimation()
    {
        logoView.setBackgroundResource(0x7f020226);
        logoView.setImageDrawable(null);
        AnimationDrawable animationdrawable = (AnimationDrawable)logoView.getBackground();
        int j = animationdrawable.getDuration(0);
        int i = animationdrawable.getNumberOfFrames() * j;
        j *= 8;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "alpha", new float[] {
            0.0F
        });
        objectanimator.setStartDelay(i - j / 2);
        objectanimator.setDuration(j);
        objectanimator.setInterpolator(FADE_OUT_INTERPOLATOR);
        animationdrawable.start();
        objectanimator.start();
        postDelayed(new Runnable() {

            final SplashView this$0;

            public void run()
            {
                if (animationEndAction != null)
                {
                    animationEndAction.call(Unit.create());
                }
            }

            
            {
                this$0 = SplashView.this;
                super();
            }
        }, j / 2 + i);
    }


}
