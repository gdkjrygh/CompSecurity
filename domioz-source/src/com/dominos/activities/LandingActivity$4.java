// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LandingActivity

class ionCallback extends com.dominos.utils.rtActionCallback
{

    final LandingActivity this$0;

    public void onAlertDismissed()
    {
        LandingActivity.access$300(LandingActivity.this);
        updateLoyaltyDisplay();
    }

    ionCallback()
    {
        this$0 = LandingActivity.this;
        super();
    }
}
