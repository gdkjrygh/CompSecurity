// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.dto;


// Referenced classes of package com.dominos.android.sdk.core.models.dto:
//            HistoricalOrder

public class EasyOrder extends HistoricalOrder
{

    private boolean easyOrder;
    private String easyOrderNickName;

    public EasyOrder()
    {
    }

    public String getEasyOrderNickName()
    {
        return easyOrderNickName;
    }

    public boolean isEasyOrder()
    {
        return easyOrder;
    }

    public void setEasyOrder(boolean flag)
    {
        easyOrder = flag;
    }

    public void setEasyOrderNickName(String s)
    {
        easyOrderNickName = s;
    }
}
