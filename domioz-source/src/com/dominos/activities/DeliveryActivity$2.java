// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsAddress;

// Referenced classes of package com.dominos.activities:
//            DeliveryActivity

class dress
    implements com.dominos.dialogs..OnActionListener
{

    final DeliveryActivity this$0;
    final LabsAddress val$address;

    public void onCanceled()
    {
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        DeliveryActivity.access$000(DeliveryActivity.this, val$address);
    }

    public void onSignOut()
    {
    }

    dress()
    {
        this$0 = final_deliveryactivity;
        val$address = LabsAddress.this;
        super();
    }
}
