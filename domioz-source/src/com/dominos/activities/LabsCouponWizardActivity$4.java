// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.adapters.LabsCouponWizardListAdapter;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.CouponWizardLineHolder;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.order.OrderManager;

// Referenced classes of package com.dominos.activities:
//            LabsCouponWizardActivity

class Callback extends com.dominos.utils.ctionCallback
{

    final LabsCouponWizardActivity this$0;
    final int val$id;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        LabsProductLine labsproductline = (LabsProductLine)((CouponWizardLineHolder)((LabsCouponWizardListAdapter)getListAdapter()).getItem(val$id)).getLine();
        mCartManager.removeCouponProductLine(labsorder, labsproductline);
        labsorder.clearPrices();
        LabsCouponWizardActivity.access$400(LabsCouponWizardActivity.this);
    }

    e()
    {
        this$0 = final_labscouponwizardactivity;
        val$id = I.this;
        super();
    }
}
