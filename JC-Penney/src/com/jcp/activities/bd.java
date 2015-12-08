// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import com.jcp.productlistentity.ProductListValueEntity;
import java.util.Comparator;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class bd
    implements Comparator
{

    final ProductFilterSortActivity a;

    bd(ProductFilterSortActivity productfiltersortactivity)
    {
        a = productfiltersortactivity;
        super();
    }

    public int a(ProductListValueEntity productlistvalueentity, ProductListValueEntity productlistvalueentity1)
    {
        return productlistvalueentity.getId().compareTo(productlistvalueentity1.getId());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ProductListValueEntity)obj, (ProductListValueEntity)obj1);
    }
}
