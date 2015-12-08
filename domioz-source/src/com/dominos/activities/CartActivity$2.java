// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v4.widget.aw;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;

// Referenced classes of package com.dominos.activities:
//            CartActivity

class this._cls0
    implements aw
{

    final CartActivity this$0;

    public void onRefresh()
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        labsorder.clearPrices();
        CartActivity.access$100(CartActivity.this, labsorder);
        CartActivity.access$000(CartActivity.this, labsorder, false);
    }

    bsOrder()
    {
        this$0 = CartActivity.this;
        super();
    }
}
