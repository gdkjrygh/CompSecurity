// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;

// Referenced classes of package com.tinder.views:
//            RecCard

class this._cls0
    implements android.view.animation.AnimationListener
{

    final RecCard this$0;

    public void onAnimationEnd(Animation animation)
    {
        RecCard.access$1000(RecCard.this).animate().scaleX(0.0F).scaleY(0.0F).setStartDelay(128L).setDuration(128L).setInterpolator(new AccelerateInterpolator());
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ation()
    {
        this$0 = RecCard.this;
        super();
    }
}
