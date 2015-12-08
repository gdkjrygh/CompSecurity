// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.CheckBox;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.c.aa;
import com.jcp.c.ah;
import com.jcp.h.a;
import com.jcp.productentity.ProductEntityContainer;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class ct
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    ct(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        if (((CheckBox)view).isChecked())
        {
            ah ah1 = new ah(a.i());
            ah1.a(a);
            boolean flag = "GIFTCARD".equalsIgnoreCase(ProductDetailFragment.j(a).getType());
            com.jcp.h.a.a(true, ProductDetailFragment.j(a));
            String s = ProductDetailFragment.c(a);
            int i = ProductDetailFragment.d(a);
            if (flag)
            {
                view = ProductDetailFragment.l(a);
            } else
            {
                view = "";
            }
            ah1.a(s, i, view);
        } else
        {
            com.jcp.fragments.ProductDetailFragment.a(a, JCP.e().a(ProductDetailFragment.c(a)));
            if (!"null".equals(ProductDetailFragment.m(a)))
            {
                ProductDetailFragment.n(a).b(b.l(ProductDetailFragment.m(a)));
                return;
            }
        }
    }
}
