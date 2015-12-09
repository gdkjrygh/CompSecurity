// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.HorizontalScrollView;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment, cf

class dk
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    dk(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        a.W();
        ProductDetailFragment.g(a, false);
        a.mColorHorizontalSection.post(new cf(a.mColorHorizontalSection, ProductDetailFragment.z(a), ProductDetailFragment.A(a)));
    }
}
