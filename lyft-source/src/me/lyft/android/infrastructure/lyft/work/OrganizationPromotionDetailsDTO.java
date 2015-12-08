// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class OrganizationPromotionDetailsDTO
{

    public final String promotionDescription;
    public final String promotionHeader;
    public final String promotionPeriod;

    public OrganizationPromotionDetailsDTO(String s, String s1, String s2)
    {
        promotionHeader = s;
        promotionPeriod = s1;
        promotionDescription = s2;
    }

    public String getPromotionDescription()
    {
        return promotionDescription;
    }

    public String getPromotionHeader()
    {
        return promotionHeader;
    }

    public String getPromotionPeriod()
    {
        return promotionPeriod;
    }
}
