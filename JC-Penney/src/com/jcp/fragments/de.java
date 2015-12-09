// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.text.Html;
import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class de
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    de(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        view = Html.fromHtml(a.j().getString(0x7f070244)).toString();
        ProductDetailFragment.a(a, ProductDetailFragment.x(a), view);
    }
}
