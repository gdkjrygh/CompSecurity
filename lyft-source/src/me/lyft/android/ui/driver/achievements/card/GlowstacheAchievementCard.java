// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            DarkAchievementCardView

public class GlowstacheAchievementCard extends DarkAchievementCardView
{

    private static final long ANIMATION_DURATION_MILLS = 2000L;
    private static final int FULL_OPACITY = 255;
    private final ValueAnimator animator = ValueAnimator.ofInt(new int[] {
        0, 255, 0
    });
    ImageView imageView;

    public GlowstacheAchievementCard(Context context)
    {
        super(context);
    }

    protected int getLayout()
    {
        return 0x7f030081;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        imageView.setImageResource(0x7f0200f6);
        imageView.getDrawable().setAlpha(0);
        animator.setDuration(2000L);
        animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final GlowstacheAchievementCard this$0;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                imageView.getDrawable().setAlpha(((Integer)valueanimator.getAnimatedValue()).intValue());
            }

            
            {
                this$0 = GlowstacheAchievementCard.this;
                super();
            }
        });
        animator.setRepeatCount(-1);
        animator.setRepeatMode(-1);
        animator.start();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        animator.cancel();
    }
}
