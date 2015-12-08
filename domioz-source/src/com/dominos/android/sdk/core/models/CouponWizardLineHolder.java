// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;

public class CouponWizardLineHolder
{

    private final LabsCouponProductGroup mGroup;
    private final Object mLine;

    public CouponWizardLineHolder(Object obj, LabsCouponProductGroup labscouponproductgroup)
    {
        mLine = obj;
        mGroup = labscouponproductgroup;
    }

    public LabsCouponProductGroup getGroup()
    {
        return mGroup;
    }

    public Object getLine()
    {
        return mLine;
    }
}
