// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import com.dominos.android.sdk.core.loyalty.LoyaltyManager;

// Referenced classes of package com.dominos.fragments:
//            LoyaltyWidgetFragment

class <init>
{

    final LoyaltyWidgetFragment this$0;

    public void onSpeechRedeem(com.dominos.bus.events.init> init>)
    {
        if (mLoyaltyManger.isLoyaltyAvailable() && mLoyaltyManger.isCustomerEnrolledInLoyalty())
        {
            onRedeemButtonClick();
        }
    }

    private ()
    {
        this$0 = LoyaltyWidgetFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
