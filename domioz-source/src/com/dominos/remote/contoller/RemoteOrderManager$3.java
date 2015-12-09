// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.remote.client.RemoteOrderClient;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager

class eateReOrderCallback extends com.dominos.android.sdk.core.order.OrderCallback
{

    final RemoteOrderManager this$0;
    final RemoteOrderClient val$listener;

    public void onFailure()
    {
        RemoteOrderManager.access$400(RemoteOrderManager.this, val$listener);
    }

    public void onNewOrder(LabsOrder labsorder)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Created order from historical order", new Object[0]);
        if (labsorder.getLineCount() > 0)
        {
            class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.PriceOrderCallback
            {

                final RemoteOrderManager._cls3 this$1;

                public void onPriceOrderRequestFailed()
                {
                    RemoteOrderManager.access$400(this$0, listener);
                }

                public void onPriceSuccess(LabsOrder labsorder1)
                {
                    if (labsorder1.needsCustomization())
                    {
                        LogUtil.d(RemoteOrderManager.access$000(), "Order need customization.", new Object[0]);
                        RemoteOrderManager.access$500(this$0, listener, ResponseErrorCode.UNKNOWN_PRICING_FAILURE);
                        return;
                    }
                    if (!RemoteOrderManager.access$600(this$0).isHistoricalOrderPaymentValid(labsorder1))
                    {
                        LogUtil.d(RemoteOrderManager.access$000(), "Historical order payment not valid!", new Object[0]);
                        RemoteOrderManager.access$800(this$0, listener, labsorder1, ResponseErrorCode.HISTORICAL_PAYMENT_NOT_SUPPORTED);
                        return;
                    }
                    if (!RemoteOrderManager.access$600(this$0).isAuthorizedToPlaceOrder(labsorder1))
                    {
                        LogUtil.d(RemoteOrderManager.access$000(), "User not authorized to place order!", new Object[0]);
                        RemoteOrderManager.access$800(this$0, listener, labsorder1, ResponseErrorCode.UNAUTHORIZED_TO_PLACE_ORDER);
                        return;
                    }
                    if (labsorder1.isCouponRemoved())
                    {
                        LogUtil.d(RemoteOrderManager.access$000(), "Coupon removed from historical order!", new Object[0]);
                        RemoteOrderManager.access$800(this$0, listener, labsorder1, ResponseErrorCode.COUPON_REMOVED);
                        return;
                    } else
                    {
                        RemoteOrderManager.access$900(this$0, listener, labsorder1);
                        return;
                    }
                }

                public void onPricingFailure(LabsOrder labsorder1)
                {
                    LogUtil.d(RemoteOrderManager.access$000(), "Historical order pricing failed", new Object[0]);
                    RemoteOrderManager.access$500(this$0, listener, ResponseErrorCode.UNKNOWN_PRICING_FAILURE);
                }

                public void onPricingWarning(LabsOrder labsorder1, PriceOrderErrorCode priceordererrorcode)
                {
                }

            _cls1()
            {
                this$1 = RemoteOrderManager._cls3.this;
                super();
            }
            }

            RemoteOrderManager.access$1000(RemoteOrderManager.this).priceOrder(labsorder, new _cls1());
            return;
        } else
        {
            LogUtil.d(RemoteOrderManager.access$000(), "All the products are removed", new Object[0]);
            RemoteOrderManager.access$500(RemoteOrderManager.this, val$listener, ResponseErrorCode.ALL_ITEMS_UNAVAILABLE);
            return;
        }
    }

    public void onNoStoreFoundForDelivery()
    {
        LogUtil.d(RemoteOrderManager.access$000(), "No Store found to deliver to this address", new Object[0]);
        RemoteOrderManager.access$500(RemoteOrderManager.this, val$listener, ResponseErrorCode.NO_STORE_DELIVERY_ADDRESS);
    }

    public void onStoreCarryoutUnavailable(String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Store currently doesn't do carryout", new Object[0]);
        RemoteOrderManager.access$500(RemoteOrderManager.this, val$listener, ResponseErrorCode.CARRYOUT_NOT_AVAILABLE);
    }

    public void onStoreClosed()
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Store Currently Closed", new Object[0]);
        RemoteOrderManager.access$500(RemoteOrderManager.this, val$listener, ResponseErrorCode.STORE_CLOSED);
    }

    public void onStoreDeliveryUnavailable(String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Delivery not available currently", new Object[0]);
        RemoteOrderManager.access$500(RemoteOrderManager.this, val$listener, ResponseErrorCode.DELIVERY_NOT_AVAILABLE);
    }

    public void onStoreOffline(String s)
    {
        LogUtil.d(RemoteOrderManager.access$000(), "Store Currently offline", new Object[0]);
        RemoteOrderManager.access$500(RemoteOrderManager.this, val$listener, ResponseErrorCode.STORE_CLOSED);
    }

    ()
    {
        this$0 = final_remoteordermanager;
        val$listener = RemoteOrderClient.this;
        super();
    }
}
