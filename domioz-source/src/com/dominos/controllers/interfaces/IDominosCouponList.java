// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;

import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;

// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IDominosCouponList
    extends IDominosView
{

    public abstract void onCouponDetailsError();

    public abstract void onCouponDetailsSuccess(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype);

    public abstract void onLoyaltyRedemptionValidationFailed(com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause invalidredemptioncause, String s);

    public abstract void showCouponErrorAlert(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype);
}
