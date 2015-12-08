// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import com.jcp.productlistentity.ProductListProductEntity;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            ProductListAdapter

class ca
    implements android.view.View.OnClickListener
{

    final int a;
    final ProductListAdapter b;

    ca(ProductListAdapter productlistadapter, int i)
    {
        b = productlistadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        ProductListAdapter.a(b, a);
        ProductListAdapter.a(b, "unchecked".equalsIgnoreCase(view.getTag().toString()), ((ProductListProductEntity)ProductListAdapter.a(b).get(a)).getId(), 1);
    }
}
