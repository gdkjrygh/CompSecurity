// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.view.View;
import com.jcp.b.b;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.k;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dr
    implements android.view.View.OnClickListener
{

    final ProductEntityContainer a;
    final ProductDetailFragment b;

    dr(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        b = productdetailfragment;
        a = productentitycontainer;
        super();
    }

    public void onClick(View view)
    {
        if (com.jcp.b.b.a(b.i()))
        {
            com.jcp.fragments.ProductDetailFragment.b(b, a);
            return;
        } else
        {
            k.a(b.j().getString(0x7f0702b9), b.j().getString(0x7f0702b7), b.i());
            return;
        }
    }
}
