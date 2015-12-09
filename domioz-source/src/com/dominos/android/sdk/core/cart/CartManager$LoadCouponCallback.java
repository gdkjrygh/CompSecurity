// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.core.models.coupon.Coupon;

public abstract class  extends BaseCallback
{

    public abstract void onCouponLoaded(Coupon coupon);

    public abstract void onLoadCouponFailed();

    public ()
    {
    }
}
