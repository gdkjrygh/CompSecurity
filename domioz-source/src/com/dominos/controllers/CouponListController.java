// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.MobileSession;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.controllers.interfaces.IDominosCouponList;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;
import com.dominos.utils.AnalyticsUtil;
import java.util.Iterator;
import java.util.List;

public class CouponListController
    implements IDominosViewController
{

    private static final String TAG = com/dominos/controllers/CouponListController.getName();
    AnalyticsUtil mAnalyticsUtil;
    private CartManager mCartManager;
    private IDominosCouponList mIDominosView;
    private LoyaltyManager mLoyaltyManager;
    private MenuManager mMenuManager;
    MobileSession mMobileSession;
    private OrderManager mOrderManager;
    private StoreManager mStoreManager;

    public CouponListController()
    {
    }

    public void addCouponToOrder(final String couponCode)
    {
        mCartManager.loadCoupon(couponCode, new _cls1());
    }

    public void dispose()
    {
    }

    public List getCategoryList()
    {
        List list;
        Iterator iterator;
        list = mMenuManager.getCouponWithinCategory("Coupons").getCategoryList();
        iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        LabsCategory labscategory = (LabsCategory)iterator.next();
        if (!labscategory.getCode().equals("AllStoreCoupons")) goto _L4; else goto _L3
_L3:
        list.remove(labscategory);
        return list;
_L2:
        labscategory = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void handleLoadedCoupon(final String couponCode)
    {
        mCartManager.addCouponToOrder(mOrderManager.getOrder(), couponCode, new _cls2());
    }

    public void onAfterInject()
    {
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        mCartManager = (CartManager)mMobileSession.getManager("cart_manager");
        mLoyaltyManager = (LoyaltyManager)mMobileSession.getManager("loyalty_manager");
        mStoreManager = (StoreManager)mMobileSession.getManager("store_manager");
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        mIDominosView = (IDominosCouponList)idominosview;
        return this;
    }






    private class _cls1 extends com.dominos.android.sdk.core.cart.CartManager.LoadCouponCallback
    {

        final CouponListController this$0;
        final String val$couponCode;

        public void onCouponLoaded(Coupon coupon)
        {
            if (LoyaltyUtil.isLoyaltyCoupon(coupon))
            {
                class _cls1 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.ValidateRedemptionCallback
                {

                    final _cls1 this$1;

                    public void onInvalidRedemption(com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause invalidredemptioncause)
                    {
                        mIDominosView.onLoyaltyRedemptionValidationFailed(invalidredemptioncause, couponCode);
                    }

                    public void onValidRedemption()
                    {
                        handleLoadedCoupon(couponCode);
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
                }

                mLoyaltyManager.validateRedemption(mStoreManager.getStoreProfile(), mOrderManager.getOrder(), new _cls1());
                return;
            } else
            {
                handleLoadedCoupon(couponCode);
                return;
            }
        }

        public void onLoadCouponFailed()
        {
            mIDominosView.onCouponDetailsError();
        }

        _cls1()
        {
            this$0 = CouponListController.this;
            couponCode = s;
            super();
        }
    }


    private class _cls2 extends com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback
    {

        final CouponListController this$0;
        final String val$couponCode;

        public void onCouponAdded(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype)
        {
            mIDominosView.onCouponDetailsSuccess(labscouponline, couponerrortype);
            mAnalyticsUtil.postCouponAdded(couponCode);
        }

        public void onCouponFailed(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype)
        {
            if (couponerrortype != null)
            {
                mIDominosView.showCouponErrorAlert(labscouponline, couponerrortype);
                return;
            } else
            {
                mIDominosView.onCouponDetailsError();
                return;
            }
        }

        _cls2()
        {
            this$0 = CouponListController.this;
            couponCode = s;
            super();
        }
    }

}
