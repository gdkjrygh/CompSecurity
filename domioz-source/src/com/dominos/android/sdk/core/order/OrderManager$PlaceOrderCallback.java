// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.core.models.LabsOrder;

// Referenced classes of package com.dominos.android.sdk.core.order:
//            PlaceOrderErrorCode

public abstract class  extends BaseCallback
{

    public abstract void onPlaceOrderFailure(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode);

    public abstract void onPlaceOrderRequestFailed();

    public abstract void onPlaceOrderSuccess(LabsOrder labsorder);

    public abstract void onPlaceOrderWarning(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode);

    public ()
    {
    }
}
