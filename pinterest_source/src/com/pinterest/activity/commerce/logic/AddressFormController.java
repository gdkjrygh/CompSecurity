// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.content.Context;
import com.pinterest.activity.commerce.CommerceAddressManager;
import com.pinterest.activity.commerce.event.ContactAddressSelectedEvent;
import com.pinterest.activity.commerce.view.AddressFormView;
import com.pinterest.activity.commerce.view.CommerceFormView;
import com.pinterest.activity.commerce.viewmodel.AddressFormViewModel;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.model.commerce.DetailedShipping;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CommerceFormBaseController

public class AddressFormController
    implements CommerceFormBaseController
{

    protected AddressFormView _addressFormView;
    protected AddressFormViewModel _addressFormViewModel;
    protected final Context _context;
    protected DetailedShipping _originalDetailedShipping;
    protected final CommerceAddressManager commerceAddressManager;
    private com.pinterest.base.Events.EventsSubscriber eventsSubscriber;

    public AddressFormController(Context context, CommerceAddressManager commerceaddressmanager)
    {
        eventsSubscriber = new _cls2();
        _context = context;
        commerceAddressManager = commerceaddressmanager;
    }

    private void asyncFetchAddressItems()
    {
        Events.post(new DialogEvent(new LoadingDialog("")));
        commerceAddressManager.asyncFetchAddressItems(new _cls4());
    }

    private void handleAddressBookButtonClicked()
    {
        if (commerceAddressManager.hasAddressBookPermission())
        {
            asyncFetchAddressItems();
            return;
        } else
        {
            commerceAddressManager.acquireAddressBookPermission(new _cls3());
            return;
        }
    }

    public AddressFormViewModel getData()
    {
        return _addressFormView.getData();
    }

    public void init(String s, DetailedShipping detailedshipping, boolean flag)
    {
        _originalDetailedShipping = detailedshipping;
        AddressFormViewModel addressformviewmodel;
        if (_originalDetailedShipping == null)
        {
            addressformviewmodel = new AddressFormViewModel();
        } else
        {
            addressformviewmodel = new AddressFormViewModel(detailedshipping);
        }
        _addressFormViewModel = addressformviewmodel;
        _addressFormViewModel.setMerchantName(s);
        _addressFormViewModel.setShowDisclaimer(flag);
        s = MyUser.get();
        if (s != null && detailedshipping == null)
        {
            _addressFormViewModel.setFirstName(s.getFirstName());
            _addressFormViewModel.setLastName(s.getLastName());
            _addressFormViewModel.setEmail(s.getEmail());
        }
        if (_addressFormView != null)
        {
            _addressFormView.setData(_addressFormViewModel);
        }
    }

    public void onDestroyView()
    {
        Events.unregister(eventsSubscriber);
        _addressFormView = null;
    }

    public void onViewCreated(CommerceFormView commerceformview)
    {
        _addressFormView = (AddressFormView)commerceformview;
        if (_addressFormViewModel != null)
        {
            _addressFormView.setData(_addressFormViewModel);
        }
        _addressFormView.setAddressBookButtonClickListener(new _cls1());
        Events.register(eventsSubscriber, com/pinterest/activity/commerce/event/ContactAddressSelectedEvent, new Class[0]);
    }



    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
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

        _cls2()
        {
            this$0 = AddressFormController.this;
            super();
        }
    }


    private class _cls4
        implements com.pinterest.activity.commerce.CommerceAddressManager.AddressItemsFetchedListener
    {

        final AddressFormController this$0;

        public void onAddressItemsFetched(ArrayList arraylist)
        {
            Events.post(new DialogEvent(null));
            if (arraylist == null || arraylist.isEmpty())
            {
                Toast.makeText(_context, 0x7f07011d, 0).show();
                return;
            } else
            {
                Events.post(new DialogEvent(CommerceListDialog.newIntanceForContactAddresses(arraylist)));
                return;
            }
        }

        _cls4()
        {
            this$0 = AddressFormController.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.activity.commerce.CommerceAddressManager.ContactPermissionChangedListener
    {

        final AddressFormController this$0;

        public void onContactPermissionChanged(boolean flag)
        {
            if (flag)
            {
                asyncFetchAddressItems();
                return;
            } else
            {
                Toast.makeText(_context, 0x7f07011e, 0).show();
                return;
            }
        }

        _cls3()
        {
            this$0 = AddressFormController.this;
            super();
        }
    }


    private class _cls1
        implements com.pinterest.activity.commerce.view.AddressFormView.AddressBookButtonClickListener
    {

        final AddressFormController this$0;

        public void onAddressBookButtonClicked()
        {
            handleAddressBookButtonClicked();
        }

        _cls1()
        {
            this$0 = AddressFormController.this;
            super();
        }
    }

}
