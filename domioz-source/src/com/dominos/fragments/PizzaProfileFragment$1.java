// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import com.dominos.activities.LoyaltyInfoFragment;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fragments:
//            PizzaProfileFragment

class this._cls0
    implements com.dominos.views.ltyProfileViewListener
{

    final PizzaProfileFragment this$0;

    public void onLoyaltyActivateClick()
    {
        mAnalyticsUtil.postPizzaProfileActivateRewardsClick();
        enrollCustomerInLoyalty();
    }

    public void onLoyaltyLearnMoreClick()
    {
        mAnalyticsUtil.postPizzaProfileLearnMoreRewardsClick();
        LoyaltyInfoFragment.newInstance(com.dominos.activities.oType.ACTIVATE).show(getChildFragmentManager(), LoyaltyInfoFragment.TAG);
    }

    foType()
    {
        this$0 = PizzaProfileFragment.this;
        super();
    }
}
