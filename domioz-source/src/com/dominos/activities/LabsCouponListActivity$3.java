// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.controllers.CouponListController;

// Referenced classes of package com.dominos.activities:
//            LabsCouponListActivity

class val.couponCode
    implements com.dominos.dialogs.ionListener
{

    final LabsCouponListActivity this$0;
    final String val$couponCode;

    public void onCanceled()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.Close(new String[0]));
    }

    public void onContinueAsGuest()
    {
    }

    public void onLoginSuccess()
    {
        LabsCouponListActivity.access$100(LabsCouponListActivity.this).handleLoadedCoupon(val$couponCode);
    }

    public void onSignOut()
    {
    }

    Close()
    {
        this$0 = final_labscouponlistactivity;
        val$couponCode = String.this;
        super();
    }
}
