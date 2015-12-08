// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.rewards;

import java.util.List;

// Referenced classes of package com.jcp.model.rewards:
//            Balance, RewardsTier

public class RewardsProfile
{

    private Balance balance;
    private String barcode;
    private List perkTypes;
    private List rewards;
    private String status;
    private RewardsTier tier;

    public RewardsProfile()
    {
    }

    public Balance getBalance()
    {
        return balance;
    }

    public String getBarcode()
    {
        return barcode;
    }

    public List getPerkTypes()
    {
        return perkTypes;
    }

    public List getRewards()
    {
        return rewards;
    }

    public String getStatus()
    {
        return status;
    }

    public RewardsTier getTier()
    {
        return tier;
    }

    public void setBalance(Balance balance1)
    {
        balance = balance1;
    }

    public void setBarcode(String s)
    {
        barcode = s;
    }

    public void setPerkTypes(List list)
    {
        perkTypes = list;
    }

    public void setRewards(List list)
    {
        rewards = list;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setTier(RewardsTier rewardstier)
    {
        tier = rewardstier;
    }
}
