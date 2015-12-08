// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.view.View;
import com.jcp.b.b;
import com.jcp.c.ab;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productentity.ServiceAgreementEntity;
import com.jcp.util.ae;
import com.jcp.views.CarouselPageIndicator;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class cx
    implements android.view.View.OnClickListener
{

    final ProductEntityContainer a;
    final ProductDetailFragment b;

    cx(ProductDetailFragment productdetailfragment, ProductEntityContainer productentitycontainer)
    {
        b = productdetailfragment;
        a = productentitycontainer;
        super();
    }

    public void onClick(View view)
    {
        if (com.jcp.b.b.a(b.i()))
        {
            b.mCarouselIndicator.setVisibility(0);
            ProductDetailFragment.q(b);
            ProductDetailFragment.c(b, false);
            view = ProductDetailFragment.r(b);
            if (((ServiceAgreementEntity)a.getServiceAgreements().get(0)).getSelected().booleanValue())
            {
                view = view.replace("SERVICE_AGREEMENT=true", "SERVICE_AGREEMENT=false");
            }
            ProductDetailFragment.t(b).a("", view, ProductDetailFragment.s(b), b.i);
            return;
        }
        try
        {
            ProductDetailFragment.a(b, b.j().getString(0x7f0702a6), b.j().getString(0x7f0702b7), false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            ae.a(com/jcp/fragments/ProductDetailFragment.getName(), "Exception:", view);
        }
        return;
    }
}
