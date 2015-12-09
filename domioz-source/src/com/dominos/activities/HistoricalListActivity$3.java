// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            HistoricalListActivity

class CreateReOrderCallback extends com.dominos.android.sdk.core.order.rCallback
{

    final HistoricalListActivity this$0;
    final LabsOrder val$order;

    public void onBegin()
    {
        showLoading();
    }

    public void onFailure()
    {
        mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR, HistoricalListActivity.access$100(HistoricalListActivity.this));
    }

    public void onFinish()
    {
        hideLoading();
    }

    public void onNewOrder(LabsOrder labsorder)
    {
        mOrderManager.clearHistoricalPaymentIfExpired(val$order);
        navigateToCart(labsorder);
    }

    public void onNoStoreFoundForDelivery()
    {
        mActivityHelper.showAlert(AlertType.NO_LONGER_DELIVERY_AREA, HistoricalListActivity.access$100(HistoricalListActivity.this));
    }

    public void onStoreCarryoutUnavailable(String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null, HistoricalListActivity.access$100(HistoricalListActivity.this), null);
    }

    public void onStoreClosed()
    {
        if (val$order.isDelivery())
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED, HistoricalListActivity.access$100(HistoricalListActivity.this));
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED, HistoricalListActivity.access$100(HistoricalListActivity.this));
            return;
        }
    }

    public void onStoreDeliveryUnavailable(String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null, HistoricalListActivity.access$100(HistoricalListActivity.this), null);
    }

    public void onStoreOffline(String s)
    {
        if (val$order.isDelivery())
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null, HistoricalListActivity.access$100(HistoricalListActivity.this), null);
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null, HistoricalListActivity.access$100(HistoricalListActivity.this), null);
            return;
        }
    }

    CreateReOrderCallback()
    {
        this$0 = final_historicallistactivity;
        val$order = LabsOrder.this;
        super();
    }
}
