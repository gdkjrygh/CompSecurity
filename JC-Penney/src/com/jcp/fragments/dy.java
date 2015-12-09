// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.views.ScrollViewWithStopMonitor;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment, dz, cf

class dy
    implements android.view.View.OnClickListener
{

    final ProductEntityContainer a;
    final ProductDetailFragment b;

    dy(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        b = productdetailfragment;
        a = productentitycontainer;
        super();
    }

    public void onClick(View view)
    {
        if (!ProductDetailFragment.U(b))
        {
            b.mSelectOptionsButtons.setVisibility(8);
            b.mProductDetailsScrollView.smoothScrollTo(0, 0);
            ProductDetailFragment.g(b, true);
            b.a(a, true);
            (new Handler()).postDelayed(new dz(this), 1000L);
            b.mSelectColorSection.post(new cf(b.mSelectColorSection, ProductDetailFragment.z(b), ProductDetailFragment.A(b)));
        }
    }
}
