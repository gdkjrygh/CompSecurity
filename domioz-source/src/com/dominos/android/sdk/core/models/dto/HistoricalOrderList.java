// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.dto;

import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.dto:
//            EasyOrder

public class HistoricalOrderList
{

    private List customerOrders;
    private EasyOrder easyOrder;

    public HistoricalOrderList()
    {
    }

    public List getCustomerOrders()
    {
        return customerOrders;
    }

    public EasyOrder getEasyOrder()
    {
        return easyOrder;
    }

    public void setCustomerOrders(List list)
    {
        customerOrders = list;
    }

    public void setEasyOrder(EasyOrder easyorder)
    {
        easyOrder = easyorder;
    }
}
