// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.photos:
//            Category

public class Tags
    implements Serializable
{

    private static final long serialVersionUID = 0xd638b54fa999721bL;
    private String Description;
    private String Id;
    private Category category;

    public Tags()
    {
    }

    public Category getCategory()
    {
        return category;
    }

    public String getDescription()
    {
        return Description;
    }

    public String getId()
    {
        return Id;
    }

    public void setCategory(Category category1)
    {
        category = category1;
    }

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setId(String s)
    {
        Id = s;
    }
}
