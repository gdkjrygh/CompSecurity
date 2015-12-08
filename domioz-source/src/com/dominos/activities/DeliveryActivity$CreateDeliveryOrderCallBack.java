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
//            DeliveryActivity

class isNewAddressDefault extends com.dominos.android.sdk.core.order.Default
{

    private boolean isGoToCart;
    private boolean isNewAddressDefault;
    private LabsAddress mOriginalAddress;
    private boolean saveNewAddressToProfile;
    final DeliveryActivity this$0;

    public void onAddressInvalid(com.dominos.android.sdk.core.storelocator. )
    {
        mActivityHelper.showAlert(AlertType.ADDRESS_MISSING_STREET_NUMBER);
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
        if (saveNewAddressToProfile)
        {
            isGoToCart = true;
            DeliveryActivity.access$200(DeliveryActivity.this, labsorder.getAddress(), mOriginalAddress, isNewAddressDefault, isGoToCart);
            return;
        } else
        {
            navigateToCart();
            return;
        }
    }

    public void onStoreClosed(LabsAddress labsaddress)
    {
        if (saveNewAddressToProfile)
        {
            DeliveryActivity.access$200(DeliveryActivity.this, labsaddress, mOriginalAddress, isNewAddressDefault, isGoToCart);
        }
        mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED);
    }

    public void onStoreDeliveryUnavailable(LabsAddress labsaddress, String s)
    {
        if (saveNewAddressToProfile)
        {
            DeliveryActivity.access$200(DeliveryActivity.this, labsaddress, mOriginalAddress, isNewAddressDefault, isGoToCart);
        }
        mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null);
    }

    public void onStoreOffline(LabsAddress labsaddress, String s)
    {
        if (saveNewAddressToProfile)
        {
            DeliveryActivity.access$200(DeliveryActivity.this, labsaddress, mOriginalAddress, isNewAddressDefault, isGoToCart);
        }
        mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null);
    }

    public StoreError(LabsAddress labsaddress, boolean flag, boolean flag1)
    {
        this$0 = DeliveryActivity.this;
        super();
        mOriginalAddress = labsaddress;
        saveNewAddressToProfile = flag;
        isNewAddressDefault = flag1;
    }
}
