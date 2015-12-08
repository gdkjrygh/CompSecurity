// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper

public class a
{

    final CartSummaryHelper a;
    protected Button applyRewardBtn;
    protected TextView rewardsExpDate;
    protected TextView rewardsTitle;

    protected (CartSummaryHelper cartsummaryhelper, View view)
    {
        a = cartsummaryhelper;
        super();
        ButterKnife.inject(this, view);
    }
}
