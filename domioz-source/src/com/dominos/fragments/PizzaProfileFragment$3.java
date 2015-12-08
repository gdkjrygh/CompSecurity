// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import com.dominos.activities.LandingActivity_;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.fragments:
//            PizzaProfileFragment

class ctionCallback extends com.dominos.utils.ertActionCallback
{

    final PizzaProfileFragment this$0;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        mProfileManager.clearCurrentUser();
        mOrderManager.getOrder().clearPersonalInfo();
        mOrderManager.getOrder().clearPrices();
        ((com.dominos.activities.Builder_)LandingActivity_.intent(PizzaProfileFragment.this).flags(0x4000000)).start();
    }

    tBuilder_()
    {
        this$0 = PizzaProfileFragment.this;
        super();
    }
}
