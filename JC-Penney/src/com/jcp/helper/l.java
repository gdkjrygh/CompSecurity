// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper

class l extends DebouncingOnClickListener
{

    final CartSummaryHelper a;
    final butterknife.ButterKnife.Finder b;
    final CartSummaryHelper..ViewInjector c;

    l(CartSummaryHelper..ViewInjector viewinjector, CartSummaryHelper cartsummaryhelper, butterknife.ButterKnife.Finder finder)
    {
        c = viewinjector;
        a = cartsummaryhelper;
        b = finder;
        super();
    }

    public void doClick(View view)
    {
        a.onAvailableRewardsClicked((ImageView)b.castParam(view, "doClick", 0, "onAvailableRewardsClicked", 0));
    }
}
