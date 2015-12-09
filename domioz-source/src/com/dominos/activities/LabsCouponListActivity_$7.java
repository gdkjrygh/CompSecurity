// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;

// Referenced classes of package com.dominos.activities:
//            LabsCouponListActivity_

class anager.CouponErrorType
    implements Runnable
{

    final LabsCouponListActivity_ this$0;
    final com.dominos.android.sdk.core.coupon.ErrorType val$couponErrorType;
    final LabsCouponLine val$couponLine;

    public void run()
    {
        LabsCouponListActivity_.access$501(LabsCouponListActivity_.this, val$couponLine, val$couponErrorType);
    }

    anager.CouponErrorType()
    {
        this$0 = final_labscouponlistactivity_;
        val$couponLine = labscouponline;
        val$couponErrorType = com.dominos.android.sdk.core.coupon.ErrorType.this;
        super();
    }
}
