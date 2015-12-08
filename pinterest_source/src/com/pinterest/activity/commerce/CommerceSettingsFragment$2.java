// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.activity.commerce.event.PaymentSelectedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressSelectedEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSettingsFragment

class this._cls0
    implements com.pinterest.base.gsFragment._cls2
{

    final CommerceSettingsFragment this$0;

    public void onEventMainThread(PaymentSelectedEvent paymentselectedevent)
    {
        Events.removeStickyEvent(paymentselectedevent);
        CommerceSettingsFragment.access$000(CommerceSettingsFragment.this);
    }

    public void onEventMainThread(ShippingAddressSelectedEvent shippingaddressselectedevent)
    {
        Events.removeStickyEvent(shippingaddressselectedevent);
        CommerceSettingsFragment.access$000(CommerceSettingsFragment.this);
    }

    edEvent()
    {
        this$0 = CommerceSettingsFragment.this;
        super();
    }
}
