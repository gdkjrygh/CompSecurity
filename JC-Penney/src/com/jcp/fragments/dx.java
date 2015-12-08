// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.jcp.b.b;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dx
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    dx(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(b.B(ProductDetailFragment.c(a))));
        a.a(view);
    }
}
