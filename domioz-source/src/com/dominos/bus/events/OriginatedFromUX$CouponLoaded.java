// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.bus.events;

import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;

public class couponLine
{

    private LabsCouponLine couponLine;
    private com.dominos.android.sdk.core.coupon.rType couponStatusType;
    private boolean loadedSuccessful;

    public LabsCouponLine getCouponLine()
    {
        return couponLine;
    }

    public com.dominos.android.sdk.core.coupon.rType getCouponStatusType()
    {
        return couponStatusType;
    }

    public boolean isSuccessfullyLoaded()
    {
        return loadedSuccessful;
    }

    public er.CouponErrorType(boolean flag, LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.rType rtype)
    {
        loadedSuccessful = flag;
        couponStatusType = rtype;
        couponLine = labscouponline;
    }
}
