// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            CartActivity

class OrderErrorCallback extends com.dominos.android.sdk.core.order.iceOrderErrorCallback
{

    final CartActivity this$0;

    public void onCouponFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsCouponLine labscouponline)
    {
        handleCouponError(priceordererrorcode, labscouponline);
    }

    public void onProductFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsProductLine labsproductline)
    {
        showProductErrorAlert(priceordererrorcode, labsproductline);
    }

    public void onUnknownPriceError(LabsOrder labsorder)
    {
        mActivityHelper.showAlert(AlertType.STORE_ONLINE_ISSUE, mStoreManager.getStoreProfile().getPhone(), null);
    }

    bsOrder()
    {
        this$0 = CartActivity.this;
        super();
    }
}
