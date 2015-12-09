// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

class gd extends DebouncingOnClickListener
{

    final ShoppingBagFragment.HeaderViewHolder a;
    final ShoppingBagFragment.HeaderViewHolder..ViewInjector b;

    gd(ShoppingBagFragment.HeaderViewHolder..ViewInjector viewinjector, ShoppingBagFragment.HeaderViewHolder headerviewholder)
    {
        b = viewinjector;
        a = headerviewholder;
        super();
    }

    public void doClick(View view)
    {
        a.onClick(view);
    }
}
