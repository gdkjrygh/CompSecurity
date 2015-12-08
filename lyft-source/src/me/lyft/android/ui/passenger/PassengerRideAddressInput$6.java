// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideAddressInput

class val.view
    implements android.animation.Listener
{

    final PassengerRideAddressInput this$0;
    final View val$view;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PassengerRideAddressInput.access$600(PassengerRideAddressInput.this, val$view, (Float)valueanimator.getAnimatedValue());
    }

    ()
    {
        this$0 = final_passengerrideaddressinput;
        val$view = View.this;
        super();
    }
}
