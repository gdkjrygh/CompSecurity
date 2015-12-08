// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.content.Context;
import android.widget.Toast;
import com.pinterest.activity.commerce.CommerceAddressManager;
import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.commerce.dialog.CommerceFormBaseFragment;
import com.pinterest.activity.commerce.event.SecureDialogActivityEvent;
import com.pinterest.activity.commerce.view.AddressFormView;
import com.pinterest.activity.commerce.view.CommerceFormView;
import com.pinterest.activity.commerce.viewmodel.AddressFormViewModel;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.model.api.RequestAddressParameter;
import com.pinterest.model.commerce.Address;
import com.pinterest.model.commerce.DetailedShipping;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            AddressFormController, CommerceFormBaseFragmentController

public class AddressFormFragmentController extends AddressFormController
    implements CommerceFormBaseFragmentController
{

    private CommerceApiManager _commerceApiManager;
    private CommerceFormBaseFragment _commerceFormBaseFragment;

    public AddressFormFragmentController(Context context, CommerceApiManager commerceapimanager, CommerceAddressManager commerceaddressmanager)
    {
        super(context, commerceaddressmanager);
        _commerceApiManager = commerceapimanager;
    }

    private PinterestCallbackWithDefaultFailure getCallback()
    {
        return new _cls2();
    }

    public void handleSaveClicked()
    {
        AddressFormViewModel addressformviewmodel = getData();
        if (addressformviewmodel == null)
        {
            Toast.makeText(_context, 0x7f070122, 0).show();
            return;
        }
        if (_originalDetailedShipping != null)
        {
            DetailedShipping detailedshipping = _originalDetailedShipping;
            if (addressformviewmodel.getFirstName().equals(detailedshipping.getFirstName()) && addressformviewmodel.getLastName().equals(detailedshipping.getLastName()) && addressformviewmodel.getCity().equals(detailedshipping.getAddress().getLocality()) && addressformviewmodel.getState().equals(detailedshipping.getAddress().getRegion()) && addressformviewmodel.getStreetLine1().equals(detailedshipping.getAddress().getStreet()) && addressformviewmodel.getStreetLine2().equals(detailedshipping.getAddress().getExtraStreet()) && addressformviewmodel.getZip().equals(detailedshipping.getAddress().getPostalCode()) && addressformviewmodel.getEmail().equals(detailedshipping.getEmail()) && addressformviewmodel.getPhoneNumber().equals(detailedshipping.getPhone()))
            {
                Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.SecureDialogActivityEvent.Type.Close));
                return;
            }
        }
        Events.post(new DialogEvent(new LoadingDialog(0x7f0704c5)));
        CommerceApiManager commerceapimanager = _commerceApiManager;
        String s;
        if (_originalDetailedShipping == null)
        {
            s = null;
        } else
        {
            s = _originalDetailedShipping.getId();
        }
        commerceapimanager.a(s, addressformviewmodel.getFirstName(), addressformviewmodel.getLastName(), new RequestAddressParameter(addressformviewmodel.getCity(), addressformviewmodel.getState(), addressformviewmodel.getStreetLine1(), addressformviewmodel.getZip(), addressformviewmodel.getStreetLine2()), addressformviewmodel.getEmail(), addressformviewmodel.getPhoneNumber(), getCallback());
    }

    public void onDestroyView()
    {
        _addressFormView.setOnAddressFormSubmitListener(null);
        super.onDestroyView();
        _commerceFormBaseFragment = null;
    }

    public void onViewCreated(CommerceFormView commerceformview)
    {
        super.onViewCreated(commerceformview);
        _addressFormView.setOnAddressFormSubmitListener(new _cls1());
    }

    public void setFragment(CommerceFormBaseFragment commerceformbasefragment)
    {
        _commerceFormBaseFragment = commerceformbasefragment;
    }

    private class _cls2 extends PinterestCallbackWithDefaultFailure
    {

        final AddressFormFragmentController this$0;

        public void failure(PinterestError pinteresterror)
        {
            Events.post(new DialogEvent(null));
            super.failure(pinteresterror);
        }

        public void success(ApiResponse apiresponse, Response response)
        {
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SETTINGS_ADDRESS_SAVE_BUTTON, null, null);
            Events.postSticky(new ShippingAddressSelectedEvent((DetailedShipping)apiresponse.getData(), true));
            Events.post(new DialogEvent(null));
            Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.SecureDialogActivityEvent.Type.Close));
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls2()
        {
            this$0 = AddressFormFragmentController.this;
            super();
        }
    }


    private class _cls1
        implements com.pinterest.activity.commerce.view.AddressFormView.OnAddressFormSubmitListener
    {

        final AddressFormFragmentController this$0;

        public void onAddressFormSubmit()
        {
            handleSaveClicked();
        }

        _cls1()
        {
            this$0 = AddressFormFragmentController.this;
            super();
        }
    }

}
