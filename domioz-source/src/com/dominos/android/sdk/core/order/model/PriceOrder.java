// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order.model;

import com.dominos.android.sdk.core.models.LabsOrder;
import java.util.List;

public class PriceOrder
{

    private LabsOrder order;
    private int status;
    private List statusItems;

    public PriceOrder()
    {
    }

    public LabsOrder getOrder()
    {
        return order;
    }

    public int getStatus()
    {
        return status;
    }

    public List getStatusItems()
    {
        return statusItems;
    }

    public void setOrder(LabsOrder labsorder)
    {
        order = labsorder;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setStatusItems(List list)
    {
        statusItems = list;
    }
}
