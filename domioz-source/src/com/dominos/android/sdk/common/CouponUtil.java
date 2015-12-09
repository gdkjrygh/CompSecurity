// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.CouponTags;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public class CouponUtil
{

    public CouponUtil()
    {
    }

    public static String getMinimumOrderAmount(Coupon coupon)
    {
        if (coupon != null && coupon.getTags() != null)
        {
            coupon.getTags().getMinimumOrderAmount();
        }
        return "0.00";
    }

    public static boolean isCouponHidden(Coupon coupon)
    {
        if (coupon != null && coupon.getTags() != null)
        {
            return coupon.getTags().isHidden();
        } else
        {
            return false;
        }
    }

    public static boolean isPromotional(Coupon coupon)
    {
        if (coupon != null && coupon.getTags() != null)
        {
            StringHelper.isNotEmpty(coupon.getTags().getPromotion());
        }
        return false;
    }
}
