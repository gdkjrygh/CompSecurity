// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.offline.model;

import java.io.Serializable;
import java.util.HashMap;

public class AdMarvelLinkedAD
    implements Serializable
{

    private static final long serialVersionUID = 0x1d5a9949f67bb98L;
    int adId;
    HashMap adTargetingOption;
    int adWeight;
    int campaignPriority;
    float deliveryPriority;
    HashMap deliveryPriorityBySite;
    int deliveryWeight;
    long endDate;
    long startDate;

    public AdMarvelLinkedAD()
    {
    }

    public int getAdId()
    {
        return adId;
    }

    public HashMap getAdTargetingOption()
    {
        return adTargetingOption;
    }

    public int getAdWeight()
    {
        return adWeight;
    }

    public int getCampaignPriority()
    {
        return campaignPriority;
    }

    public float getDeliveryPriority()
    {
        return deliveryPriority;
    }

    public HashMap getDeliveryPriorityBySite()
    {
        return deliveryPriorityBySite;
    }

    public int getDeliveryWeight()
    {
        return deliveryWeight;
    }

    public long getEndDate()
    {
        return endDate;
    }

    public long getStartDate()
    {
        return startDate;
    }

    public void setAdId(int i)
    {
        adId = i;
    }

    public void setAdTargetingOption(HashMap hashmap)
    {
        adTargetingOption = hashmap;
    }

    public void setAdWeight(int i)
    {
        adWeight = i;
    }

    public void setCampaignPriority(int i)
    {
        campaignPriority = i;
    }

    public void setDeliveryPriority(float f)
    {
        deliveryPriority = f;
    }

    public void setDeliveryPriorityBySite(HashMap hashmap)
    {
        deliveryPriorityBySite = hashmap;
    }

    public void setDeliveryWeight(int i)
    {
        deliveryWeight = i;
    }

    public void setEndDate(long l)
    {
        endDate = l;
    }

    public void setStartDate(long l)
    {
        startDate = l;
    }
}
