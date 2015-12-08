// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;

// Referenced classes of package com.dominos.activities:
//            CartActivity_

class val.canAutoCheckout
    implements Runnable
{

    final CartActivity_ this$0;
    final boolean val$canAutoCheckout;
    final LabsOrder val$order;

    public void run()
    {
        CartActivity_.access$501(CartActivity_.this, val$order, val$canAutoCheckout);
    }

    Order()
    {
        this$0 = final_cartactivity_;
        val$order = labsorder;
        val$canAutoCheckout = Z.this;
        super();
    }
}
