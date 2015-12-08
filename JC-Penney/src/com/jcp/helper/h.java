// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper

class h extends DebouncingOnClickListener
{

    final CartSummaryHelper a;
    final CartSummaryHelper..ViewInjector b;

    h(CartSummaryHelper..ViewInjector viewinjector, CartSummaryHelper cartsummaryhelper)
    {
        b = viewinjector;
        a = cartsummaryhelper;
        super();
    }

    public void doClick(View view)
    {
        a.applySerialReward();
    }
}
