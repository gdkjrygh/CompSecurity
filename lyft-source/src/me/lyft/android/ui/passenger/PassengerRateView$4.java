// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.animation.Animator;
import android.widget.TextView;
import me.lyft.android.controls.SimpleAnimationListener;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRateView

class <init> extends SimpleAnimationListener
{

    final PassengerRateView this$0;

    public void onAnimationEnd(Animator animator)
    {
        ratingSubtitle.setVisibility(8);
    }

    ()
    {
        this$0 = PassengerRateView.this;
        super();
    }
}
