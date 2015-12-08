// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;

// Referenced classes of package com.dominos.activities:
//            CartActivity

class tionCallback extends com.dominos.utils.ertActionCallback
{

    final l.canAutoCheckout this$1;
    final LabsOrder val$order;

    public void onAlertDismissed()
    {
        CartActivity.access$000(_fld0, val$order, canAutoCheckout);
    }

    Order()
    {
        this$1 = final_order1;
        val$order = LabsOrder.this;
        super();
    }
}
