// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.widget.TextView;
import com.jcp.e.ab;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class eg
    implements ab
{

    final ProductDetailFragment a;

    eg(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void a(int i)
    {
        ProductDetailFragment.a(a, i);
        a.mQuantityItem.setText(String.valueOf(ProductDetailFragment.d(a)));
    }
}
