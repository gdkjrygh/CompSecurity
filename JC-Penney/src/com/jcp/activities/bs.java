// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            SlyceScanActivity

class bs extends DebouncingOnClickListener
{

    final SlyceScanActivity a;
    final SlyceScanActivity..ViewInjector b;

    bs(SlyceScanActivity..ViewInjector viewinjector, SlyceScanActivity slycescanactivity)
    {
        b = viewinjector;
        a = slycescanactivity;
        super();
    }

    public void doClick(View view)
    {
        a.onClearScannedItemsClick();
    }
}
