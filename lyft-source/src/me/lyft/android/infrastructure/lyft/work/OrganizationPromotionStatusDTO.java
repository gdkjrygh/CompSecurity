// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class OrganizationPromotionStatusDTO
{

    public final Integer needed;
    public final String pendingApprovalText;
    public final String promotionDescription;
    public final String promotionHeader;
    public final Integer registered;

    public OrganizationPromotionStatusDTO(Integer integer, Integer integer1, String s, String s1, String s2)
    {
        needed = integer;
        registered = integer1;
        promotionHeader = s;
        promotionDescription = s1;
        pendingApprovalText = s2;
    }

    public Integer getNeeded()
    {
        return needed;
    }

    public String getPendingApprovalText()
    {
        return pendingApprovalText;
    }

    public String getPromotionDescription()
    {
        return promotionDescription;
    }

    public String getPromotionHeader()
    {
        return promotionHeader;
    }

    public Integer getRegistered()
    {
        return registered;
    }
}
