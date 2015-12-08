// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import com.jcp.productlistentity.ProductListSortOptionEntity;
import java.util.Comparator;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class be
    implements Comparator
{

    final ProductFilterSortActivity a;

    be(ProductFilterSortActivity productfiltersortactivity)
    {
        a = productfiltersortactivity;
        super();
    }

    public int a(ProductListSortOptionEntity productlistsortoptionentity, ProductListSortOptionEntity productlistsortoptionentity1)
    {
        return productlistsortoptionentity.getName().compareTo(productlistsortoptionentity1.getName());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ProductListSortOptionEntity)obj, (ProductListSortOptionEntity)obj1);
    }
}
