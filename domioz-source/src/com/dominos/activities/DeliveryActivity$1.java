// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LandingActivity_, DeliveryActivity

class onCallback extends com.dominos.utils.tActionCallback
{

    final DeliveryActivity this$0;

    public void onAlertDismissed()
    {
        ((tentBuilder_)LandingActivity_.intent(DeliveryActivity.this).flags(0x4000000)).start();
    }

    tentBuilder_()
    {
        this$0 = DeliveryActivity.this;
        super();
    }
}
