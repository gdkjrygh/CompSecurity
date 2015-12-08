// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            LoyaltyFAQActivity

class k extends com.dominos.android.sdk.core.loyalty.Callback
{

    final LoyaltyFAQActivity this$0;

    public void onBegin()
    {
        super.onBegin();
        showLoading();
    }

    public void onLoyaltyOptOutFail()
    {
        hideLoading();
        mActivityHelper.showAlert(AlertType.LOYALTY_OPT_OUT_ERROR);
    }

    public void onLoyaltyOptOutSuccess()
    {
        hideLoading();
        onHomeButtonClick();
    }

    Manager.OptOutCallback()
    {
        this$0 = LoyaltyFAQActivity.this;
        super();
    }
}
