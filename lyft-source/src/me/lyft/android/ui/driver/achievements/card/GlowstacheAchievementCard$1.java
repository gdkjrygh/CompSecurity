// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            GlowstacheAchievementCard

class this._cls0
    implements android.animation.Listener
{

    final GlowstacheAchievementCard this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        imageView.getDrawable().setAlpha(((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    ()
    {
        this$0 = GlowstacheAchievementCard.this;
        super();
    }
}
