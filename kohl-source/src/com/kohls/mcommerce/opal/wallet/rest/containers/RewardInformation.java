// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            KohlsCash

public class RewardInformation
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String date;
    private String description;
    private String eventType;
    private KohlsCash kohlsCash;
    private String pointsEarned;
    private String rewardId;

    public RewardInformation()
    {
    }

    public String getDate()
    {
        return date;
    }

    public String getDescription()
    {
        return description;
    }

    public String getEventType()
    {
        return eventType;
    }

    public KohlsCash getKohlsCash()
    {
        return kohlsCash;
    }

    public String getPointsEarned()
    {
        return pointsEarned;
    }

    public String getRewardId()
    {
        return rewardId;
    }

    public void setDate(String s)
    {
        date = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEventType(String s)
    {
        eventType = s;
    }

    public void setKohlsCash(KohlsCash kohlscash)
    {
        kohlsCash = kohlscash;
    }

    public void setPointsEarned(String s)
    {
        pointsEarned = s;
    }

    public void setRewardId(String s)
    {
        rewardId = s;
    }
}
