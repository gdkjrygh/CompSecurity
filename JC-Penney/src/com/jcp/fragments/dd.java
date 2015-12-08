// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.TextView;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dd
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    dd(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        view = ((TextView)view).getText().toString();
        au.c(a.i(), view);
    }
}
