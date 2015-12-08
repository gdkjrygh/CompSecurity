// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.bus.events;

import com.dominos.android.sdk.core.models.LabsProductLine;

public class addedProductLine
{

    private LabsProductLine addedProductLine;
    private int numberOfUnfulfilledCoupon;

    public LabsProductLine getAddedProductLine()
    {
        return addedProductLine;
    }

    public int getNumberOfUnfulfilledCoupon()
    {
        return numberOfUnfulfilledCoupon;
    }

    public A(LabsProductLine labsproductline, int i)
    {
        numberOfUnfulfilledCoupon = i;
        addedProductLine = labsproductline;
    }
}
