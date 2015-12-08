// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRateView

class this._cls0
    implements android.animation.orUpdateListener
{

    final PassengerRateView this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (ratingPhotoContainer != null)
        {
            android.widget.arams arams = (android.widget.arams)ratingPhotoContainer.getLayoutParams();
            arams.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
            ratingPhotoContainer.setLayoutParams(arams);
        }
    }

    tener()
    {
        this$0 = PassengerRateView.this;
        super();
    }
}
