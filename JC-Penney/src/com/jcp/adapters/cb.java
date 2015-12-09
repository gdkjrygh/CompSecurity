// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import com.jcp.productlistentity.ProductListProductEntity;

// Referenced classes of package com.jcp.adapters:
//            ProductListAdapter

class cb
    implements android.view.View.OnClickListener
{

    final ProductListProductEntity a;
    final ProductListAdapter b;

    cb(ProductListAdapter productlistadapter, ProductListProductEntity productlistproductentity)
    {
        b = productlistadapter;
        a = productlistproductentity;
        super();
    }

    public void onClick(View view)
    {
        ProductListAdapter.a(b, a);
    }
}
