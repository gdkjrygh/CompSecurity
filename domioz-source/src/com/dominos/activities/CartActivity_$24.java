// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;

// Referenced classes of package com.dominos.activities:
//            CartActivity_

class on.LabsCouponLine
    implements Runnable
{

    final CartActivity_ this$0;
    final LabsCouponLine val$couponLine;

    public void run()
    {
        CartActivity_.access$1901(CartActivity_.this, val$couponLine);
    }

    on.LabsCouponLine()
    {
        this$0 = final_cartactivity_;
        val$couponLine = LabsCouponLine.this;
        super();
    }
}
