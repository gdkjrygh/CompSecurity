// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.model;

import com.pinterest.network.json.PinterestJsonObject;

public class StatementCreditExtraData
{

    private float amount;
    private String displayAmount;
    private String incentiveId;
    private String incentiveName;

    public StatementCreditExtraData(PinterestJsonObject pinterestjsonobject)
    {
        pinterestjsonobject = pinterestjsonobject.c("display_data");
        if (pinterestjsonobject != null)
        {
            incentiveId = pinterestjsonobject.a("incentive_id", "");
            amount = (float)pinterestjsonobject.b("amount");
            displayAmount = pinterestjsonobject.a("display_amount", "");
            incentiveName = pinterestjsonobject.a("card", "");
        }
    }

    public float getAmount()
    {
        return amount;
    }

    public String getDisplayAmount()
    {
        return displayAmount;
    }

    public String getIncentiveId()
    {
        return incentiveId;
    }

    public String getIncentiveName()
    {
        return incentiveName;
    }
}
