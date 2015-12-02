// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.common.pojo;

import com.alibaba.api.base.pojo.Amount;

public class SellerCouponViewDTO
{

    public Boolean acquirable;
    public Long activityId;
    public Amount couponAmount;
    public String expireTime;
    public String expireTimeStr;
    public Amount minOrderAmount;
    public Long sellerAdminSeq;

    public SellerCouponViewDTO()
    {
    }
}
