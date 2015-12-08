// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.PopupWindow;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productentity.Restrictions;
import com.jcp.util.ae;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class cv
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    cv(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        ProductDetailFragment.o(a).clear();
        if (ProductDetailFragment.j(a) != null)
        {
            Restrictions restrictions = ProductDetailFragment.j(a).getRestrictions();
            if (restrictions != null)
            {
                int i;
                int j;
                try
                {
                    i = Integer.parseInt(restrictions.getMaxQuantity());
                }
                catch (NumberFormatException numberformatexception)
                {
                    ae.d(getClass().getSimpleName(), "while parsing max count got exception");
                    i = 99;
                }
                for (j = 0; j <= i; j++)
                {
                    ProductDetailFragment.o(a).add(Integer.valueOf(j + 1));
                }

                ProductDetailFragment.p(a).showAsDropDown(view);
            }
        }
    }
}
