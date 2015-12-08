// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.h.c;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.k;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class cu
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    cu(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        k.a(a.i(), ProductDetailFragment.j(a).getLinks());
        c.a(ProductDetailFragment.j(a).getId());
    }
}
