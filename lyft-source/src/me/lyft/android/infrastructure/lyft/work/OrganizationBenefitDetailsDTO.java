// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class OrganizationBenefitDetailsDTO
{

    public final String benefitCredit;
    public final String benefitDescription;
    public final String benefitRestriction;

    public OrganizationBenefitDetailsDTO(String s, String s1, String s2)
    {
        benefitDescription = s;
        benefitCredit = s1;
        benefitRestriction = s2;
    }

    public String getBenefitCredit()
    {
        return benefitCredit;
    }

    public String getBenefitDescription()
    {
        return benefitDescription;
    }

    public String getBenefitRestriction()
    {
        return benefitRestriction;
    }
}
