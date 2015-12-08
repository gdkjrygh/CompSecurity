// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

public class Credit
{

    boolean commuteCredits;
    List creditRestrictions;
    String description;
    String id;
    List invalidRestrictions;
    String invalidTitle;
    String label;
    String title;

    public Credit()
    {
    }

    public List getCreditRestrictions()
    {
        return (List)Objects.firstNonNull(creditRestrictions, new ArrayList());
    }

    public String getDescription()
    {
        return (String)Objects.firstNonNull(description, "");
    }

    public String getId()
    {
        return (String)Objects.firstNonNull(id, "");
    }

    public List getInvalidRestrictions()
    {
        return (List)Objects.firstNonNull(invalidRestrictions, new ArrayList());
    }

    public String getInvalidTitle()
    {
        return (String)Objects.firstNonNull(invalidTitle, "");
    }

    public String getLabel()
    {
        return (String)Objects.firstNonNull(label, "");
    }

    public String getTitle()
    {
        return (String)Objects.firstNonNull(title, "");
    }

    public boolean isCommuteCredits()
    {
        return commuteCredits;
    }

    public boolean isValid()
    {
        return Strings.isNullOrEmpty(getInvalidTitle());
    }

    public void setCommuteCredits(boolean flag)
    {
        commuteCredits = flag;
    }

    public void setCreditRestrictions(List list)
    {
        creditRestrictions = list;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setInvalidRestrictions(List list)
    {
        invalidRestrictions = list;
    }

    public void setInvalidTitle(String s)
    {
        invalidTitle = s;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
