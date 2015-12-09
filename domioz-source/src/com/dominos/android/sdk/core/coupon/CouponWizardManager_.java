// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.coupon;

import android.content.Context;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.coupon:
//            CouponWizardManager

public final class CouponWizardManager_ extends CouponWizardManager
{

    private Context context_;

    private CouponWizardManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static CouponWizardManager_ getInstance_(Context context)
    {
        return new CouponWizardManager_(context);
    }

    private void init_()
    {
        mOrderUtil = OrderUtil_.getInstance_(context_);
        powerRestClient = PowerRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
