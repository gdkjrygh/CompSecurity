// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.activity.commerce.event.PaymentMethodDeletedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressDeletedEvent;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSettingsFragment

class this._cls0
    implements com.pinterest.base.gsFragment._cls1
{

    final CommerceSettingsFragment this$0;

    public void onEventMainThread(PaymentMethodDeletedEvent paymentmethoddeletedevent)
    {
        CommerceSettingsFragment.access$000(CommerceSettingsFragment.this);
    }

    public void onEventMainThread(ShippingAddressDeletedEvent shippingaddressdeletedevent)
    {
        CommerceSettingsFragment.access$000(CommerceSettingsFragment.this);
    }

    dEvent()
    {
        this$0 = CommerceSettingsFragment.this;
        super();
    }
}
