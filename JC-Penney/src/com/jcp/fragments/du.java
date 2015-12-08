// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.jcp.b.b;
import com.jcp.c.ab;
import com.jcp.util.k;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class du
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    du(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            view = (String)view.getTag();
            if (!TextUtils.isEmpty(view))
            {
                if (a.mSelectionOptionsLayout.getVisibility() == 0)
                {
                    a.mSelectionLoader.setVisibility(0);
                    a.mSelectSectionTitle.setVisibility(8);
                } else
                {
                    ProductDetailFragment.q(a);
                }
                ProductDetailFragment.i(a, true);
                if (!b.a(a.i()))
                {
                    break label0;
                }
                ProductDetailFragment.h(a).clear();
                ProductDetailFragment.c(a, false);
                ProductDetailFragment.t(a).b(ProductDetailFragment.c(a), view, ProductDetailFragment.s(a));
            }
            return;
        }
        k.a(a.j().getString(0x7f0702b9), a.j().getString(0x7f0702b7), a.i());
    }
}
