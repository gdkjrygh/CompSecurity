// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.dto;

import com.dominos.android.sdk.core.models.LabsOrder;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.dto:
//            Store

public class HistoricalOrder
{

    private List cards;
    private String id;
    private LabsOrder order;
    private Store store;

    public HistoricalOrder()
    {
    }

    public List getCards()
    {
        return cards;
    }

    public String getId()
    {
        return id;
    }

    public LabsOrder getOrder()
    {
        return order;
    }

    public Store getStore()
    {
        return store;
    }

    public void setCards(List list)
    {
        cards = list;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setOrder(LabsOrder labsorder)
    {
        order = labsorder;
    }

    public void setStore(Store store1)
    {
        store = store1;
    }
}
