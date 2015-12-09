// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;


// Referenced classes of package com.dominos.fragments:
//            PizzaProfileFragment

class llback extends com.dominos.android.sdk.core.loyalty.istoryCallback
{

    final PizzaProfileFragment this$0;

    public void onBegin()
    {
        super.onBegin();
        showLoading();
    }

    public void onFinish()
    {
        super.onFinish();
        hideLoading();
    }

    public void onLoyaltyHistoryFail()
    {
        navigateToLoyaltyDetails(true);
    }

    public void onLoyaltyHistorySuccess()
    {
        navigateToLoyaltyDetails(false);
    }

    anager.LoyaltyHistoryCallback()
    {
        this$0 = PizzaProfileFragment.this;
        super();
    }
}
