// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.controllers.interfaces.IDominosCouponList;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.controllers:
//            CouponListController

class erCallback extends com.dominos.android.sdk.core.coupon.CouponToOrderCallback
{

    final CouponListController this$0;
    final String val$couponCode;

    public void onCouponAdded(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.ponErrorType ponerrortype)
    {
        CouponListController.access$000(CouponListController.this).onCouponDetailsSuccess(labscouponline, ponerrortype);
        mAnalyticsUtil.postCouponAdded(val$couponCode);
    }

    public void onCouponFailed(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.ponErrorType ponerrortype)
    {
        if (ponerrortype != null)
        {
            CouponListController.access$000(CouponListController.this).showCouponErrorAlert(labscouponline, ponerrortype);
            return;
        } else
        {
            CouponListController.access$000(CouponListController.this).onCouponDetailsError();
            return;
        }
    }

    dManager.CouponErrorType()
    {
        this$0 = final_couponlistcontroller;
        val$couponCode = String.this;
        super();
    }
}
