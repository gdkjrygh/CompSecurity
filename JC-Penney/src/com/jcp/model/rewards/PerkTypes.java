// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.rewards;


// Referenced classes of package com.jcp.model.rewards:
//            Category, Punches

public class PerkTypes
{

    private Category category;
    private String name;
    private Punches punches;

    public PerkTypes()
    {
    }

    public Category getCategory()
    {
        return category;
    }

    public String getName()
    {
        return name;
    }

    public Punches getPunches()
    {
        return punches;
    }

    public void setCategory(Category category1)
    {
        category = category1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPunches(Punches punches1)
    {
        punches = punches1;
    }
}
