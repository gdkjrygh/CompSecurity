// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.activities;

import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.beacon.activities:
//            BeaconCheckInActivity

class back extends com.dominos.utils.rtActionCallback
{

    final BeaconCheckInActivity this$0;
    final com.dominos.beacon.model.ty val$order;

    public void onNegativeButtonClicked()
    {
        BeaconCheckInActivity.access$200(BeaconCheckInActivity.this).postOnEventCheckinOrderListSelectCancel();
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        BeaconCheckInActivity.access$000(BeaconCheckInActivity.this).postOnEventCheckinOrderListSelectConfirm();
        BeaconCheckInActivity.access$100(BeaconCheckInActivity.this, val$order);
    }

    back()
    {
        this$0 = final_beaconcheckinactivity;
        val$order = com.dominos.beacon.model.ty._cls1.val.order.this;
        super();
    }
}
