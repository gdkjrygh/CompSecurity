// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class r.PlaceOrderCallback extends com.dominos.android.sdk.core.order.Callback
{

    final LabsCheckoutActivity this$0;

    public void onBegin()
    {
        showLoading();
    }

    public void onFinish()
    {
        hideLoading();
    }

    public void onPlaceOrderFailure(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
    {
        onOrderPlacementError(labsorder, placeordererrorcode);
    }

    public void onPlaceOrderRequestFailed()
    {
        onPlaceOrderRequestFail();
    }

    public void onPlaceOrderSuccess(LabsOrder labsorder)
    {
        onOrderSuccess(labsorder, PlaceOrderErrorCode.NO_FAILURE);
    }

    public void onPlaceOrderWarning(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
    {
        onOrderSuccess(labsorder, placeordererrorcode);
    }

    rrorCode()
    {
        this$0 = LabsCheckoutActivity.this;
        super();
    }
}
