// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class ionCallback extends com.dominos.utils.rtActionCallback
{

    final LabsCheckoutActivity this$0;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
        onPlaceOrderClick();
    }

    public void onPositiveButtonClicked()
    {
        LabsCheckoutActivity.access$1300(LabsCheckoutActivity.this);
    }

    ionCallback()
    {
        this$0 = LabsCheckoutActivity.this;
        super();
    }
}
