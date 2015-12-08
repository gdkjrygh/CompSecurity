// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.view.View;
import com.google.android.apps.wallet.widgets.address.AddressView;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterAddressFragment, KycUiModel, KycNavListener

final class val.addressView
    implements android.view.nterAddressFragment._cls1
{

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
            model.addAddressToList(val$addressView.getAddress());
            model.setSelectedAddressIndex(model.getAddressList().size() - 1);
            navListener.onRequestNav(model.getPreviousNavState());
            return;
        }
    }

    roup()
    {
        this$0 = final_kycenteraddressfragment;
        val$addressView = AddressView.this;
        super();
    }
}
