// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.MobileSession;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;

// Referenced classes of package com.dominos.activities:
//            LabsProductDetailListActivity

class nit> extends com.dominos.utils.ck
{

    final LabsProductDetailListActivity this$0;

    public void onAlertDismissed()
    {
        NinaPartialProduct ninapartialproduct = ((DomProductManager)mMobileSession.getManager("dom_product_manager")).getCurrentPartialProduct();
        if (ninapartialproduct != null)
        {
            ninapartialproduct.setToppingsErrorCode(null);
        }
    }

    lProduct()
    {
        this$0 = LabsProductDetailListActivity.this;
        super();
    }
}
