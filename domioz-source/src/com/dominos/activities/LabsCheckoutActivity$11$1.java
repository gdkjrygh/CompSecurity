// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class riceOrderCallback extends com.dominos.android.sdk.core.order.lback
{

    final onPriceSuccess this$1;

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

    public void onPriceOrderRequestFailed()
    {
        onPlaceOrderRequestFail();
    }

    public void onPriceSuccess(LabsOrder labsorder)
    {
        initCheckout();
        displayMethodsOfPayment();
    }

    public void onPricingFailure(LabsOrder labsorder)
    {
        onPlaceOrderRequestFail();
    }

    public void onPricingWarning(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode)
    {
        onPriceSuccess(labsorder);
    }

    rCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
