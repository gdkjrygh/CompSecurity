// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.DialogInterface;
import com.jcp.productlistentity.ProductListFilterEntity;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class av
    implements android.content.DialogInterface.OnCancelListener
{

    final ProductListFilterEntity a;
    final ProductFilterSortActivity b;

    av(ProductFilterSortActivity productfiltersortactivity, ProductListFilterEntity productlistfilterentity)
    {
        b = productfiltersortactivity;
        a = productlistfilterentity;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ProductFilterSortActivity.a(b, a);
    }
}
