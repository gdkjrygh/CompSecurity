// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            GiftCardActivity

class q extends DebouncingOnClickListener
{

    final GiftCardActivity a;
    final GiftCardActivity..ViewInjector b;

    q(GiftCardActivity..ViewInjector viewinjector, GiftCardActivity giftcardactivity)
    {
        b = viewinjector;
        a = giftcardactivity;
        super();
    }

    public void doClick(View view)
    {
        a.closeGiftCardActivity();
    }
}
