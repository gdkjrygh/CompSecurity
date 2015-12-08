// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class val.view
    implements android.animation.eListener
{

    final LyftDriverToggleService this$0;
    final View val$view;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        valueanimator = ((ValueAnimator) (valueanimator.getAnimatedValue()));
        if (valueanimator != null)
        {
            LyftDriverToggleService.access$602(LyftDriverToggleService.this, ((Integer)valueanimator).intValue());
            val$view.getBackground().setAlpha(LyftDriverToggleService.access$600(LyftDriverToggleService.this));
        }
    }

    er()
    {
        this$0 = final_lyftdrivertoggleservice;
        val$view = View.this;
        super();
    }
}
