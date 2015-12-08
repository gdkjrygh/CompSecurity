// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OptionEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String displayText;
    private String name;
    private List optionValues;
    private String type;

    public OptionEntity()
    {
        optionValues = new ArrayList();
    }

    public String getDisplayText()
    {
        return displayText;
    }

    public String getName()
    {
        return name;
    }

    public List getOptionValues()
    {
        return optionValues;
    }

    public String getType()
    {
        return type;
    }

    public void setDisplayText(String s)
    {
        displayText = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOptionValues(List list)
    {
        optionValues = list;
    }

    public void setType(String s)
    {
        type = s;
    }
}
