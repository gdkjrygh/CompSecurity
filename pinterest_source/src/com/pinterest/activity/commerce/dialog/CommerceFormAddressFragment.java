// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.os.Bundle;
import android.view.View;
import com.pinterest.activity.commerce.logic.AddressFormFragmentController;
import com.pinterest.activity.commerce.logic.CommerceFormBaseFragmentController;
import com.pinterest.di.components.FragmentComponent;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.DetailedShipping;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceFormBaseFragment

public class CommerceFormAddressFragment extends CommerceFormBaseFragment
{

    private static final String EXTRA_SHIPPING = "shipping";
    AddressFormFragmentController addressFormController;
    private String merchantName;
    private DetailedShipping shipping;

    public CommerceFormAddressFragment()
    {
    }

    public static CommerceFormAddressFragment newInstance()
    {
        return newInstance(null);
    }

    public static CommerceFormAddressFragment newInstance(String s)
    {
        CommerceFormAddressFragment commerceformaddressfragment = new CommerceFormAddressFragment();
        Bundle bundle = new Bundle();
        if (s != null)
        {
            bundle.putString("merchant_name", s);
        }
        commerceformaddressfragment.setArguments(bundle);
        return commerceformaddressfragment;
    }

    public static CommerceFormAddressFragment newInstanceForEdit(DetailedShipping detailedshipping)
    {
        CommerceFormAddressFragment commerceformaddressfragment = new CommerceFormAddressFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shipping", detailedshipping);
        commerceformaddressfragment.setArguments(bundle);
        return commerceformaddressfragment;
    }

    protected int getContainerResourceId()
    {
        return 0x7f030065;
    }

    protected CommerceFormBaseFragmentController getController()
    {
        return addressFormController;
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f070128);
    }

    public void onActivityCreated(Bundle bundle)
    {
        getComponent().inject(this);
        addressFormController.init(merchantName, shipping, true);
        super.onActivityCreated(bundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getArguments();
        merchantName = view.getString("merchant_name");
        shipping = (DetailedShipping)view.getParcelable("shipping");
    }
}
