// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsAddress;

// Referenced classes of package com.dominos.activities:
//            DeliveryActivity_

class ress
    implements Runnable
{

    final DeliveryActivity_ this$0;
    final LabsAddress val$address;

    public void run()
    {
        DeliveryActivity_.access$401(DeliveryActivity_.this, val$address);
    }

    ress()
    {
        this$0 = final_deliveryactivity_;
        val$address = LabsAddress.this;
        super();
    }
}
