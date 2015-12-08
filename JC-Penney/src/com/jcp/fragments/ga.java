// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments:
//            ShoppingBagFragment

class ga extends DebouncingOnClickListener
{

    final ShoppingBagFragment a;
    final ShoppingBagFragment..ViewInjector b;

    ga(ShoppingBagFragment..ViewInjector viewinjector, ShoppingBagFragment shoppingbagfragment)
    {
        b = viewinjector;
        a = shoppingbagfragment;
        super();
    }

    public void doClick(View view)
    {
        a.startShoppingButtonClick();
    }
}
