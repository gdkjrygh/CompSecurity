// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;


// Referenced classes of package com.dominos.android.sdk.core.models:
//            ProductPrompter

public class ProductCategoryPromptModel
{

    ProductPrompter pr_flavor;
    ProductPrompter pr_options;
    ProductPrompter pr_productcode;
    ProductPrompter pr_size;
    ProductPrompter pr_subcategory;

    public ProductCategoryPromptModel()
    {
    }

    public ProductPrompter getFlavorPrompter()
    {
        return pr_flavor;
    }

    public ProductPrompter getOptionsPrompter()
    {
        return pr_options;
    }

    public ProductPrompter getProductCodePrompter()
    {
        return pr_productcode;
    }

    public ProductPrompter getSizePrompter()
    {
        return pr_size;
    }

    public ProductPrompter getSubcategoryPrompter()
    {
        return pr_subcategory;
    }
}
