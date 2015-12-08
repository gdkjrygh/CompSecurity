// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dh
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    dh(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        ProductDetailFragment.b(a, "JCPenney", a.j().getString(0x7f0700af));
    }
}
