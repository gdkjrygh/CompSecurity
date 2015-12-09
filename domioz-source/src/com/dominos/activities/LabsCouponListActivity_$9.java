// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.coupon.Coupon;

// Referenced classes of package com.dominos.activities:
//            LabsCouponListActivity_

class 
    implements Runnable
{

    final LabsCouponListActivity_ this$0;
    final Coupon val$selectedCoupon;

    public void run()
    {
        LabsCouponListActivity_.access$701(LabsCouponListActivity_.this, val$selectedCoupon);
    }

    ()
    {
        this$0 = final_labscouponlistactivity_;
        val$selectedCoupon = Coupon.this;
        super();
    }
}
