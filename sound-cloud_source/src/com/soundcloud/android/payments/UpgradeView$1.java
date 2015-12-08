// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.view.View;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradeView

class stener
    implements android.view.stener
{

    final UpgradeView this$0;
    final stener val$listener;

    public void onClick(View view)
    {
        val$listener.startPurchase();
    }

    stener()
    {
        this$0 = final_upgradeview;
        val$listener = stener.this;
        super();
    }
}
