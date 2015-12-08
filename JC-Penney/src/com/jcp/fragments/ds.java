// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.productentity.ProductEntityContainer;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class ds
    implements android.view.View.OnClickListener
{

    final ProductEntityContainer a;
    final ProductDetailFragment b;

    ds(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        b = productdetailfragment;
        a = productentitycontainer;
        super();
    }

    public void onClick(View view)
    {
        ProductDetailFragment.b(b, a);
    }
}
