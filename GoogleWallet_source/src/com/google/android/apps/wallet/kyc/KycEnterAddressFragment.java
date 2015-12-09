// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.address.AddressView;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFragmentInterface, KycUiModel, KycNavListener

public class KycEnterAddressFragment extends WalletFragment
    implements KycFragmentInterface
{

    KycUiModel model;
    KycNavListener navListener;
    ValidationGroup validationGroup;

    public KycEnterAddressFragment()
    {
        setArguments(new Bundle());
    }

    public final View onCreateView(LayoutInflater layoutinflater, final ViewGroup addressView, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_enter_address_fragment, null);
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.kyc_enter_address_title);
        addressView = (AddressView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.KycAddressView);
        addressView.addValidator(validationGroup);
        layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.KycEnterAddressNextButton).setOnClickListener(new android.view.View.OnClickListener() {

            final KycEnterAddressFragment this$0;
            final AddressView val$addressView;

            public final void onClick(View view)
            {
                if (validationGroup.checkForErrors())
                {
                    validationGroup.focusOnFirstError();
                    return;
                } else
                {
                    model.addAddressToList(addressView.getAddress());
                    model.setSelectedAddressIndex(model.getAddressList().size() - 1);
                    navListener.onRequestNav(model.getPreviousNavState());
                    return;
                }
            }

            
            {
                this$0 = KycEnterAddressFragment.this;
                addressView = addressview;
                super();
            }
        });
        bundle = new com.google.wallet.proto.NanoWalletEntities.Address();
        bundle.countryCode = getArguments().getString("KYC_COUNTRY");
        addressView.setAddress(bundle);
        return layoutinflater;
    }

    public final void setKycNavListener(KycNavListener kycnavlistener)
    {
        navListener = kycnavlistener;
    }

    public final void setKycUiModel(KycUiModel kycuimodel)
    {
        model = kycuimodel;
    }
}
