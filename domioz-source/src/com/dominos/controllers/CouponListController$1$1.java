// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.controllers.interfaces.IDominosCouponList;

// Referenced classes of package com.dominos.controllers:
//            CouponListController

class back extends com.dominos.android.sdk.core.loyalty.demptionCallback
{

    final l.couponCode this$1;

    public void onInvalidRedemption(com.dominos.android.sdk.core.loyalty.emptionCause emptioncause)
    {
        CouponListController.access$000(_fld0).onLoyaltyRedemptionValidationFailed(emptioncause, couponCode);
    }

    public void onValidRedemption()
    {
        handleLoadedCoupon(couponCode);
    }

    er.InvalidRedemptionCause()
    {
        this$1 = this._cls1.this;
        super();
    }
}
