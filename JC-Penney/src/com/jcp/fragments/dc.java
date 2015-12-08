// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.jcp.productentity.ProductEntityContainer;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dc
    implements android.view.View.OnClickListener
{

    final ProductEntityContainer a;
    final ProductDetailFragment b;

    dc(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        b = productdetailfragment;
        a = productentitycontainer;
        super();
    }

    public void onClick(View view)
    {
        if (ProductDetailFragment.f(b, true))
        {
            b.a(a);
            return;
        } else
        {
            b.findInStoreErrorText.setVisibility(0);
            b.mSelectOptionsScroll.fullScroll(33);
            return;
        }
    }
}
