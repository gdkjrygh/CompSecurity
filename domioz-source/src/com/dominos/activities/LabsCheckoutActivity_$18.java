// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity_

class orCode
    implements Runnable
{

    final LabsCheckoutActivity_ this$0;
    final PlaceOrderErrorCode val$errorCode;
    final LabsOrder val$order;

    public void run()
    {
        LabsCheckoutActivity_.access$1301(LabsCheckoutActivity_.this, val$order, val$errorCode);
    }

    orCode()
    {
        this$0 = final_labscheckoutactivity_;
        val$order = labsorder;
        val$errorCode = PlaceOrderErrorCode.this;
        super();
    }
}
