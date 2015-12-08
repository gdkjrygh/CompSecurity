// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import com.jcp.e.v;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment, s, MultipleVideosGridFragment, t

class cn
    implements v
{

    final ProductDetailFragment a;

    cn(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void a(List list)
    {
        t t1 = s.a(a.i());
        if (t1 != null)
        {
            t1.c(MultipleVideosGridFragment.a(ProductDetailFragment.g(a), list), "MultipleVideosGridFragment");
        }
    }
}
