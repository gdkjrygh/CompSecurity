// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;

import java.util.List;

public class CreditDTO
{

    public final Boolean commuteCredits;
    public final List creditRestrictions;
    public final String description;
    public final String id;
    public final List invalidRestrictions;
    public final String invalidTitle;
    public final String label;
    public final String title;

    public CreditDTO(String s, String s1, String s2, String s3, List list, String s4, List list1, 
            Boolean boolean1)
    {
        id = s;
        title = s1;
        description = s2;
        label = s3;
        creditRestrictions = list;
        invalidTitle = s4;
        invalidRestrictions = list1;
        commuteCredits = boolean1;
    }

    public List getCreditRestrictions()
    {
        return creditRestrictions;
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public List getInvalidRestrictions()
    {
        return invalidRestrictions;
    }

    public String getInvalidTitle()
    {
        return invalidTitle;
    }

    public String getLabel()
    {
        return label;
    }

    public String getTitle()
    {
        return title;
    }

    public Boolean isCommuteCredits()
    {
        return commuteCredits;
    }
}
