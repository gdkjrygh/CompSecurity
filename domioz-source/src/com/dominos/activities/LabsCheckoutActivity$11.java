// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class lback extends com.dominos.utils.onCallback
{

    final LabsCheckoutActivity this$0;
    final LabsOrder val$order;

    public void onAlertDismissed()
    {
        class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.PriceOrderCallback
        {

            final LabsCheckoutActivity._cls11 this$1;

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

            _cls1()
            {
                this$1 = LabsCheckoutActivity._cls11.this;
                super();
            }
        }

        mOrderManager.priceOrder(val$order, new _cls1());
    }

    ()
    {
        this$0 = final_labscheckoutactivity;
        val$order = LabsOrder.this;
        super();
    }
}
