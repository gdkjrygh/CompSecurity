// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;

// Referenced classes of package com.dominos.fragments:
//            LoyaltyWidgetFragment

class demptionSource
    implements com.dominos.dialogs.tionListener
{

    final LoyaltyWidgetFragment this$0;
    final demptionSource val$source;

    public void onCanceled()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.tClose(LoyaltyWidgetFragment.access$000(LoyaltyWidgetFragment.this)));
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        LoyaltyWidgetFragment.access$200(LoyaltyWidgetFragment.this, val$source);
    }

    public void onSignOut()
    {
    }

    demptionSource()
    {
        this$0 = final_loyaltywidgetfragment;
        val$source = demptionSource.this;
        super();
    }
}
