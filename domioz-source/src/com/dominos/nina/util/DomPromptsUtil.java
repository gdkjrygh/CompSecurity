// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.util;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;

public class DomPromptsUtil
{

    public DomPromptsUtil()
    {
    }

    public static String getLoyaltyPrompt(Session session, String s)
    {
        String s1 = s;
        if (((CouponWizardManager)session.getManager("coupon_wizard_manager")).isLoyaltyCoupon())
        {
            if (StringHelper.equals(s, "wizard_intro"))
            {
                s1 = "loyalty_wizard_intro";
            } else
            {
                if (StringHelper.equals(s, "product_not_valid"))
                {
                    return "loyalty_product_not_valid";
                }
                if (StringHelper.equals(s, "product_added"))
                {
                    return "loyalty_product_added";
                }
                if (StringHelper.equals(s, "added_to_cart"))
                {
                    return "loyalty_added_to_cart";
                }
                s1 = s;
                if (StringHelper.equals(s, "removed_from_wizard"))
                {
                    return "loyalty_removed_from_wizard";
                }
            }
        }
        return s1;
    }
}
