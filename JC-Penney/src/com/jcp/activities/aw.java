// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import com.jcp.productlistentity.ProductListFilterEntity;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class aw
    implements android.view.View.OnClickListener
{

    final ProductListFilterEntity a;
    final ProductFilterSortActivity b;

    aw(ProductFilterSortActivity productfiltersortactivity, ProductListFilterEntity productlistfilterentity)
    {
        b = productfiltersortactivity;
        a = productlistfilterentity;
        super();
    }

    public void onClick(View view)
    {
        ProductFilterSortActivity.a(b, a);
    }
}
