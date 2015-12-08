// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.dominos.activities:
//            SavedAddressActivity

class <init>
{

    final SavedAddressActivity this$0;

    public void onDeliveryAddressSelected(com.dominos.bus.events.sSelected sselected)
    {
        SavedAddressActivity.access$100(SavedAddressActivity.this, sselected.getSelection());
    }

    public void onDeliveryPrimaryAddressSelected(com.dominos.bus.events.yAddressSelected yaddressselected)
    {
        yaddressselected = mProfileManager.getCurrentUser().getAddressList().iterator();
        do
        {
            if (!yaddressselected.hasNext())
            {
                break;
            }
            LabsAddress labsaddress = (LabsAddress)yaddressselected.next();
            if (!labsaddress.isDefault())
            {
                continue;
            }
            mOrderManager.createOrderForDelivery(labsaddress, new OrderCallBack(SavedAddressActivity.this, null));
            break;
        } while (true);
    }

    public void onNewAddressRequested(com.dominos.bus.events.ested ested)
    {
        navigateToNewAddress();
    }

    private ested()
    {
        this$0 = SavedAddressActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
