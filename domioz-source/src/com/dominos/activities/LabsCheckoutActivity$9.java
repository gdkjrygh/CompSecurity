// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class nager.LoyaltyCallback extends com.dominos.android.sdk.core.loyalty.allback
{

    final LabsCheckoutActivity this$0;
    final PlaceOrderErrorCode val$errorCode;
    final LabsOrder val$order;

    public void onBegin()
    {
        super.onBegin();
        showLoading();
    }

    public void onFinish()
    {
        super.onFinish();
        hideLoading();
        startPizzaTrackerActivity(val$order, val$errorCode);
    }

    public void onLoyaltyFail()
    {
    }

    public void onLoyaltySuccess()
    {
    }

    rrorCode()
    {
        this$0 = final_labscheckoutactivity;
        val$order = labsorder;
        val$errorCode = PlaceOrderErrorCode.this;
        super();
    }
}
