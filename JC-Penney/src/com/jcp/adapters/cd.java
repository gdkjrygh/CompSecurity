// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import com.jcp.productlistentity.ProductListProductEntity;

// Referenced classes of package com.jcp.adapters:
//            ProductListAdapter

final class cd
    implements android.view.View.OnClickListener
{

    final ProductListProductEntity a;
    final String b;
    final View c;
    final int d;
    final ProductListAdapter.ViewHolder e;

    cd(ProductListProductEntity productlistproductentity, String s, View view, int i, ProductListAdapter.ViewHolder viewholder)
    {
        a = productlistproductentity;
        b = s;
        c = view;
        d = i;
        e = viewholder;
        super();
    }

    public void onClick(View view)
    {
        if (ProductListAdapter.i() != -1)
        {
            ProductListAdapter.c();
        }
        ProductListAdapter.a(a.getName());
        ProductListAdapter.a(b, c, d, e.btnvideoplay, e.productImage, e);
    }
}
