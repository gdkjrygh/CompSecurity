// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import org.a.a.a.a.f;
import org.a.a.a.a.g;

public class LabsPromotionRedeemable
{

    private String code;
    private String couponCode;
    private String message;
    private String status;

    public LabsPromotionRedeemable()
    {
    }

    public String getCode()
    {
        return code;
    }

    public String getCouponCode()
    {
        return couponCode;
    }

    public String getMessage()
    {
        return message;
    }

    public String getStatus()
    {
        return status;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setCouponCode(String s)
    {
        couponCode = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }
}
