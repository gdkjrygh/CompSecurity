// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper

class n extends AnimatorListenerAdapter
{

    final ImageView a;
    final CartSummaryHelper b;

    n(CartSummaryHelper cartsummaryhelper, ImageView imageview)
    {
        b = cartsummaryhelper;
        a = imageview;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        a.setImageResource(0x7f02018f);
        b.availableRewardsLayout.setVisibility(8);
    }
}
