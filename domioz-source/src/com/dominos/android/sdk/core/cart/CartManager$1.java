// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.OrderManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.cart:
//            CartManager

class adCouponCallback extends adCouponCallback
{

    final CartManager this$0;
    final com.dominos.android.sdk.core.coupon.nager.AddCouponToOrderCallback val$callback;
    final Coupon val$menuCoupon;
    final LabsOrder val$order;

    public void onCouponLoaded(Coupon coupon)
    {
        CartManager.access$000(CartManager.this).putCoupon(coupon);
        final LabsCouponLine couponLine = new LabsCouponLine();
        LabsOrder labsorder;
        final ArrayList originalCouponIds;
        final Coupon couponBeforePriceOrder;
        if (val$menuCoupon == null)
        {
            couponLine.setCoupon(coupon);
        } else
        {
            couponLine.setCoupon(val$menuCoupon);
        }
        labsorder = new LabsOrder(val$order);
        labsorder.addCouponLine(couponLine);
        originalCouponIds = new ArrayList();
        couponBeforePriceOrder = val$order.getCouponLineList().iterator();
        do
        {
            if (!couponBeforePriceOrder.hasNext())
            {
                break;
            }
            LabsCouponLine labscouponline = (LabsCouponLine)couponBeforePriceOrder.next();
            if (labscouponline.getId() != 0)
            {
                originalCouponIds.add(Integer.valueOf(labscouponline.getId()));
            }
        } while (true);
        couponBeforePriceOrder = couponLine.getCoupon();
        if (LoyaltyUtil.isLoyaltyCoupon(coupon))
        {
            CartManager.access$100(CartManager.this).setOrder(labsorder);
            val$callback.onCouponAdded(couponLine, com.dominos.android.sdk.core.coupon.nager.CouponErrorType.ValidCoupon);
            val$callback.onFinish();
            return;
        } else
        {
            class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.PriceOrderCallback
            {

                final CartManager._cls1 this$1;
                final Coupon val$couponBeforePriceOrder;
                final LabsCouponLine val$couponLine;
                final List val$originalCouponIds;

                public void onPriceOrderRequestFailed()
                {
                    callback.onCouponFailed(couponLine, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.UnKnown);
                }

                public void onPriceSuccess(LabsOrder labsorder1)
                {
                    handleNewCouponOnPricedOrder(labsorder1, couponBeforePriceOrder, couponLine, originalCouponIds, callback);
                }

                public void onPricingFailure(LabsOrder labsorder1)
                {
                    handleNewCouponOnPricedOrder(labsorder1, couponBeforePriceOrder, couponLine, originalCouponIds, callback);
                }

                public void onPricingWarning(LabsOrder labsorder1, PriceOrderErrorCode priceordererrorcode)
                {
                }

            _cls1()
            {
                this$1 = CartManager._cls1.this;
                couponLine = labscouponline;
                couponBeforePriceOrder = coupon;
                originalCouponIds = list;
                super();
            }
            }

            CartManager.access$100(CartManager.this).priceOrder(labsorder, new _cls1());
            return;
        }
    }

    public void onLoadCouponFailed()
    {
        val$callback.onCouponFailed(null, com.dominos.android.sdk.core.coupon.nager.CouponErrorType.CouponNotInStore);
        val$callback.onFinish();
    }

    n()
    {
        this$0 = final_cartmanager;
        val$callback = addcoupontoordercallback;
        val$menuCoupon = coupon;
        val$order = LabsOrder.this;
        super();
    }
}
