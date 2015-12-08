// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.data.StringValidators;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.validation.ValidatedEditText;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            OrderPlasticCardUiModel, ConfirmPlasticCardOrderFragment

public class EnterPlasticCardShippingAddressFragment extends WalletFragment
{

    Provider confirmOrderFragmentProvider;
    private OrderPlasticCardUiModel uiModel;
    UserEventLogger userEventLogger;
    ValidationGroup validationGroup;

    public EnterPlasticCardShippingAddressFragment()
    {
        setArguments(new Bundle());
    }

    private void addValidator(ValidatedEditText validatededittext, StringValidators stringvalidators)
    {
        validatededittext.setValidator(stringvalidators);
        validationGroup.addInput(validatededittext);
    }

    private com.google.wallet.proto.NanoWalletEntities.Address getAddress()
    {
        com.google.wallet.proto.NanoWalletEntities.Address address = new com.google.wallet.proto.NanoWalletEntities.Address();
        Object obj = (TextView)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.ShippingAddressRecipientName);
        if (((TextView) (obj)).getText() != null)
        {
            obj = ((TextView) (obj)).getText().toString();
        } else
        {
            obj = "";
        }
        address.recipientName = ((String) (obj));
        address.line1 = ((ValidatedEditText)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.ShippingAddressStreetAddress)).getValue();
        address.line2 = ((ValidatedEditText)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.ShippingAddressStreetAddress2)).getValue();
        address.city = ((ValidatedEditText)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.ShippingAddressCity)).getValue();
        address.state = ((ValidatedEditText)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.ShippingAddressState)).getValue();
        address.postalCode = ((ValidatedEditText)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.ShippingAddressZipCode)).getValue();
        return address;
    }

    private boolean isAddingAddress()
    {
        return getArguments().getBoolean("ARG_ADD_ADDRESS");
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.plastic_card_shipping_address_activity_title);
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.enter_plastic_card_shipping_address, null);
        viewgroup = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ShippingAddressCity);
        addValidator(viewgroup, OrderPlasticCardUiModel.CITY_VALIDATOR);
        viewgroup.setInputType(8193);
        viewgroup = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ShippingAddressStreetAddress);
        addValidator(viewgroup, OrderPlasticCardUiModel.ADDRESS_LINE1_VALIDATOR);
        viewgroup.setInputType(8305);
        viewgroup = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ShippingAddressStreetAddress2);
        addValidator(viewgroup, OrderPlasticCardUiModel.ADDRESS_LINE2_VALIDATOR);
        viewgroup.setInputType(8305);
        addValidator((ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ShippingAddressState), OrderPlasticCardUiModel.STATE_VALIDATOR);
        viewgroup = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ShippingAddressZipCode);
        addValidator(viewgroup, OrderPlasticCardUiModel.ZIP_CODE_VALIDATOR);
        viewgroup.setMaxLength(5);
        viewgroup.setInputType(2);
        layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressDoneButton).setOnClickListener(new android.view.View.OnClickListener() {

            final EnterPlasticCardShippingAddressFragment this$0;

            public final void onClick(View view)
            {
                if (!validationGroup.checkForErrors())
                {
                    Views.hideSoftKeyboard(getActivity(), getView());
                    if (isAddingAddress())
                    {
                        uiModel.addAndSelectAddress(getAddress());
                    } else
                    {
                        uiModel.updateSelectedAddress(getAddress());
                    }
                    getFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, (Fragment)confirmOrderFragmentProvider.get(), Fragments.getTransactionTag(com/google/android/apps/wallet/plastic/ConfirmPlasticCardOrderFragment)).addToBackStack(null).commit();
                    return;
                } else
                {
                    validationGroup.focusOnFirstError();
                    return;
                }
            }

            
            {
                this$0 = EnterPlasticCardShippingAddressFragment.this;
                super();
            }
        });
        bundle = uiModel.getSelectedAddress();
        viewgroup = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ShippingAddressRecipientName);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        if (isAddingAddress()) goto _L4; else goto _L3
_L3:
        if (((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).recipientName != null)
        {
            ((TextView)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressRecipientName)).setText(((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).recipientName);
        }
        if (((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).line1 != null)
        {
            ((ValidatedEditText)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressStreetAddress)).setValue(((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).line1);
        }
        if (((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).line2 != null)
        {
            ((ValidatedEditText)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressStreetAddress2)).setValue(((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).line2);
        }
        if (((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).city != null)
        {
            ((ValidatedEditText)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressCity)).setValue(((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).city);
        }
        if (((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).state != null)
        {
            ((ValidatedEditText)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressState)).setValue(((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).state);
        }
        if (((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).postalCode != null)
        {
            ((ValidatedEditText)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressZipCode)).setValue(((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).postalCode);
        }
        if (validationGroup.checkForErrors())
        {
            validationGroup.focusOnFirstError();
        }
_L6:
        return layoutinflater;
_L4:
        viewgroup.setText(((com.google.wallet.proto.NanoWalletEntities.Address) (bundle)).recipientName);
        return layoutinflater;
_L2:
        bundle = uiModel.getAddresses();
        if (!bundle.isEmpty())
        {
            viewgroup.setText(((com.google.wallet.proto.NanoWalletEntities.Address)bundle.get(0)).recipientName);
            return layoutinflater;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onStart()
    {
        super.onStart();
        userEventLogger.log(21, 92);
    }

    public final void setModel(OrderPlasticCardUiModel orderplasticcarduimodel)
    {
        uiModel = orderplasticcarduimodel;
    }



}
