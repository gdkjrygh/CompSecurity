// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager

class eOrderCallback extends com.dominos.android.sdk.core.order.Callback
{

    final de this$1;

    public void onPriceOrderRequestFailed()
    {
        RemoteOrderManager.access$400(_fld0, listener);
    }

    public void onPriceSuccess(LabsOrder labsorder)
    {
        if (labsorder.needsCustomization())
        {
            LogUtil.d(RemoteOrderManager.access$000(), "Order need customization.", new Object[0]);
            RemoteOrderManager.access$500(_fld0, listener, ResponseErrorCode.UNKNOWN_PRICING_FAILURE);
            return;
        }
        if (!RemoteOrderManager.access$600(_fld0).isHistoricalOrderPaymentValid(labsorder))
        {
            LogUtil.d(RemoteOrderManager.access$000(), "Historical order payment not valid!", new Object[0]);
            RemoteOrderManager.access$800(_fld0, listener, labsorder, ResponseErrorCode.HISTORICAL_PAYMENT_NOT_SUPPORTED);
            return;
        }
        if (!RemoteOrderManager.access$600(_fld0).isAuthorizedToPlaceOrder(labsorder))
        {
            LogUtil.d(RemoteOrderManager.access$000(), "User not authorized to place order!", new Object[0]);
            RemoteOrderManager.access$800(_fld0, listener, labsorder, ResponseErrorCode.UNAUTHORIZED_TO_PLACE_ORDER);
            return;
        }
        if (labsorder.isCouponRemoved())
        {
            LogUtil.d(RemoteOrderManager.access$000(), "Coupon removed from historical order!", new Object[0]);
            RemoteOrderManager.access$800(_fld0, listener, labsorder, ResponseErrorCode.COUPON_REMOVED);
            return;
        } else
        {
            RemoteOrderManager.access$900(_fld0, listener, labsorder);
            return;
        }
    }

    public void onPricingFailure(LabsOrder labsorder)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Historical order pricing failed", new Object[0]);
        RemoteOrderManager.access$500(_fld0, listener, ResponseErrorCode.UNKNOWN_PRICING_FAILURE);
    }

    public void onPricingWarning(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode)
    {
    }

    de()
    {
        this$1 = this._cls1.this;
        super();
    }
}
