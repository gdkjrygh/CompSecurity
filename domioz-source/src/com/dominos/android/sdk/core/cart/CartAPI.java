// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.data.http.power.PowerRestClient;

public class CartAPI
{

    PowerRestClient mPowerRestClient;

    public CartAPI()
    {
    }

    public Coupon getStoreCoupon(String s, String s1, String s2)
    {
        return mPowerRestClient.getStoreCoupon(s, s1, s2);
    }
}
