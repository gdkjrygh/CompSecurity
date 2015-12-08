// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            CartActivity

class <init>
{

    final CartActivity this$0;

    public void onAddCouponRequested(com.dominos.bus.events.d d)
    {
        CartActivity.access$1100(CartActivity.this, d.getCouponCode());
    }

    public void onGoogleWalletSelected(com.dominos.bus.events.ted ted)
    {
        onGoogleWalletClick();
    }

    public void onProductAdded(com.dominos.bus.events.ted ted)
    {
        mOrderManager.getOrder().clearPrices();
        CartActivity.access$000(CartActivity.this, mOrderManager.getOrder(), false);
    }

    public void onProductReplaced(com.dominos.bus.events.ed ed)
    {
        showProductReplacedAlert(ed.getProductCode());
    }

    public void openCategory(com.dominos.bus.events.ed.getProductCode getproductcode)
    {
        if (!mMenuManager.isMenuLoaded())
        {
            LogUtil.d(CartActivity.access$900(), "openCategory , Menu not loaded", new Object[0]);
            return;
        } else
        {
            CartActivity.access$1000(CartActivity.this);
            return;
        }
    }

    public void openCoupons(com.dominos.bus.events.ed ed)
    {
        if (mMenuManager.hasCoupons())
        {
            goToCouponActivity();
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.STORE_NO_COUPONS);
            return;
        }
    }

    public void orderDoneByVoice(com.dominos.bus.events.ed ed)
    {
        LogUtil.d("NinaX", "EventBus triggered the main activity", new Object[0]);
        if (CartActivity.access$800(CartActivity.this) == LET)
        {
            displayUpSellAfterGoogleWallet();
            return;
        } else
        {
            commonCheckoutClick();
            return;
        }
    }

    public void storeClosedOnCheckout(com.dominos.bus.events.allet allet)
    {
        LogUtil.d("NinaX", "EventBus triggered the main activity", new Object[0]);
        commonCheckoutClick();
    }

    private ed()
    {
        this$0 = CartActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
