// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;

// Referenced classes of package com.dominos.activities:
//            CartActivity_

class ProductLine
    implements Runnable
{

    final CartActivity_ this$0;
    final PriceOrderErrorCode val$errorType;
    final LabsProductLine val$productLine;

    public void run()
    {
        CartActivity_.access$2201(CartActivity_.this, val$errorType, val$productLine);
    }

    ProductLine()
    {
        this$0 = final_cartactivity_;
        val$errorType = priceordererrorcode;
        val$productLine = LabsProductLine.this;
        super();
    }
}
