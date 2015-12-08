// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            AddressTypeActivity

class this._cls0
    implements com.dominos.fragments.lickListener
{

    final AddressTypeActivity this$0;

    public void onSignInClicked()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.equest());
        mAnalyticsUtil.postDeliveryAddressSignInButtonClicked();
        AddressTypeActivity.access$000(AddressTypeActivity.this);
    }

    us()
    {
        this$0 = AddressTypeActivity.this;
        super();
    }
}
