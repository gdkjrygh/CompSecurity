// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class OrganizationBenefitStatusDTO
{

    public final String benefitDescription;
    public final String benefitHeader;

    public OrganizationBenefitStatusDTO(String s, String s1)
    {
        benefitHeader = s;
        benefitDescription = s1;
    }

    public String getBenefitDescription()
    {
        return benefitDescription;
    }

    public String getBenefitHeader()
    {
        return benefitHeader;
    }
}
