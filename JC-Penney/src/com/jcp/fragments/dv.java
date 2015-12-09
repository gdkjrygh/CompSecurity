// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.support.v4.view.ViewPager;
import com.jcp.adapters.s;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.ah;
import com.jcp.views.CarouselPageIndicator;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dv
    implements Runnable
{

    final ProductEntityContainer a;
    final ProductDetailFragment b;

    dv(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        b = productdetailfragment;
        a = productentitycontainer;
        super();
    }

    public void run()
    {
        byte byte0 = 0;
        Object obj = null;
        if (!ProductDetailFragment.a(b, a.getTags()))
        {
            obj = a.getLinks();
        }
        ProductDetailFragment.e(b).a(0, ProductDetailFragment.h(b), ProductDetailFragment.A(b), ProductDetailFragment.Q(b), a.getOptions(), ProductDetailFragment.c(b), ((java.util.List) (obj)));
        if (a.getVideos() != null)
        {
            ProductDetailFragment.e(b).a(ProductDetailFragment.a(b, a.getVideos()), ProductDetailFragment.R(b), ProductDetailFragment.S(b));
        }
        b.mPager.setAdapter(ProductDetailFragment.e(b));
        b.mCarouselIndicator.setViewPager(b.mPager);
        b.mCarouselIndicator.setVisibility(0);
        b.mCarouselIndicator.setOnPageChangeListener(ProductDetailFragment.T(b));
        b.mCarouselIndicator.setSnap(false);
        ProductDetailFragment.e(b).c();
        obj = b.mCarouselIndicator;
        if (ah.a(ProductDetailFragment.h(b)))
        {
            byte0 = 8;
        }
        ((CarouselPageIndicator) (obj)).setVisibility(byte0);
    }
}
