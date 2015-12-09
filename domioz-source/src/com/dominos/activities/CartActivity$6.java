// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            CartActivity

class lback extends com.dominos.utils.OptionAlertActionCallback
{

    final CartActivity this$0;
    final int val$id;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        mAnalyticsUtil.postCartDeleteClicked();
        showShortToast(getString(0x7f0800f2));
        LabsOrder labsorder = mOrderManager.getOrder();
        mCartManager.removeLineItem(mOrderManager.getOrder(), mOrderManager.getOrder().getLineById(val$id));
        if (!mCartManager.isCartWithProducts())
        {
            CartActivity.access$500(CartActivity.this);
        }
        CartActivity.access$100(CartActivity.this, labsorder);
        if (mCartManager.isCartWithProducts())
        {
            CartActivity.access$000(CartActivity.this, labsorder, false);
        }
    }

    Manager()
    {
        this$0 = final_cartactivity;
        val$id = I.this;
        super();
    }
}
