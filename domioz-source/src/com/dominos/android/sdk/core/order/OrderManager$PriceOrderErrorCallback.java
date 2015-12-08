// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;

// Referenced classes of package com.dominos.android.sdk.core.order:
//            PriceOrderErrorCode

public abstract class 
{

    public abstract void onCouponFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsCouponLine labscouponline);

    public abstract void onProductFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsProductLine labsproductline);

    public abstract void onUnknownPriceError(LabsOrder labsorder);

    public ()
    {
    }
}
