// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.RequestErrorCode;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation

class <init> extends com.dominos.android.sdk.core.order.ck
{

    final UserAddLocation this$0;

    public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.t> t>)
    {
        mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
    }

    public void onBegin()
    {
        showLoading();
    }

    public void onCreateOrderError(RequestErrorCode requesterrorcode)
    {
        mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR);
    }

    public void onFinish()
    {
        hideLoading();
    }

    public void onNoStoreFoundForDelivery()
    {
        mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
    }

    public void onOrderCreated(LabsOrder labsorder)
    {
        navigateToCart();
    }

    public void onStoreClosed(LabsAddress labsaddress)
    {
        mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED);
    }

    public void onStoreDeliveryUnavailable(LabsAddress labsaddress, String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null);
    }

    public void onStoreOffline(LabsAddress labsaddress, String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null);
    }

    private .LocateStoreError()
    {
        this$0 = UserAddLocation.this;
        super();
    }

    yOrderCallback(yOrderCallback yordercallback)
    {
        this();
    }
}
