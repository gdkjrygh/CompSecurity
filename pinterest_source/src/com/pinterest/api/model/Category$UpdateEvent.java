// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


// Referenced classes of package com.pinterest.api.model:
//            Category

public final class _category
{

    private Category _category;

    public final Category getCategory()
    {
        return _category;
    }

    public final void setCategory(Category category)
    {
        _category = category;
    }

    public (Category category)
    {
        if (category == null)
        {
            category = new Category();
        }
        _category = category;
    }
}
