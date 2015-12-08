// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.event.ContactAddressSelectedEvent;
import com.pinterest.activity.commerce.model.ContactAddressItem;
import com.pinterest.activity.commerce.view.AddressFormView;
import com.pinterest.activity.commerce.viewmodel.AddressFormViewModel;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            AddressFormController

class this._cls0
    implements com.pinterest.base.ssFormController._cls2
{

    final AddressFormController this$0;

    public void onEventMainThread(ContactAddressSelectedEvent contactaddressselectedevent)
    {
        contactaddressselectedevent = contactaddressselectedevent.getContactAddressItem();
        _addressFormViewModel.setFirstName(contactaddressselectedevent.getFirstName());
        _addressFormViewModel.setLastName(contactaddressselectedevent.getLastName());
        _addressFormViewModel.setStreetLine1(contactaddressselectedevent.getStreetAddress1());
        _addressFormViewModel.setCity(contactaddressselectedevent.getCity());
        _addressFormViewModel.setState(contactaddressselectedevent.getState());
        _addressFormViewModel.setZip(contactaddressselectedevent.getZipCode());
        _addressFormViewModel.setEmail(contactaddressselectedevent.getEmail());
        _addressFormViewModel.setPhoneNumber(contactaddressselectedevent.getPhoneNumber());
        _addressFormView.setData(_addressFormViewModel);
    }

    ent()
    {
        this$0 = AddressFormController.this;
        super();
    }
}
