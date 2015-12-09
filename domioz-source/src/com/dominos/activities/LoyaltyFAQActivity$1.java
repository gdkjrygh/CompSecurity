// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            LoyaltyFAQActivity

class ActionCallback extends com.dominos.utils.AlertActionCallback
{

    final LoyaltyFAQActivity this$0;

    public void onNegativeButtonClicked()
    {
        mAnalyticsUtil.postRewardsOptOutCancel();
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        mAnalyticsUtil.postRewardsOptOutConfirm();
        LoyaltyFAQActivity.access$000(LoyaltyFAQActivity.this);
    }

    ActionCallback()
    {
        this$0 = LoyaltyFAQActivity.this;
        super();
    }
}
