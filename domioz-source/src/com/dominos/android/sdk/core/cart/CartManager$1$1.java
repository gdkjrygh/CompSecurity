// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.cart:
//            CartManager

class  extends com.dominos.android.sdk.core.order.ceOrderCallback
{

    final Code this$1;
    final Coupon val$couponBeforePriceOrder;
    final LabsCouponLine val$couponLine;
    final List val$originalCouponIds;

    public void onPriceOrderRequestFailed()
    {
        callback.onCouponFailed(val$couponLine, com.dominos.android.sdk.core.coupon.ger.CouponErrorType.UnKnown);
    }

    public void onPriceSuccess(LabsOrder labsorder)
    {
        handleNewCouponOnPricedOrder(labsorder, val$couponBeforePriceOrder, val$couponLine, val$originalCouponIds, callback);
    }

    public void onPricingFailure(LabsOrder labsorder)
    {
        handleNewCouponOnPricedOrder(labsorder, val$couponBeforePriceOrder, val$couponLine, val$originalCouponIds, callback);
    }

    public void onPricingWarning(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode)
    {
    }

    ponLine()
    {
        this$1 = final_ponline;
        val$couponLine = labscouponline;
        val$couponBeforePriceOrder = coupon;
        val$originalCouponIds = List.this;
        super();
    }
}
