// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import com.dominos.android.sdk.common.ValidatableForm;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.fragments.BaseFragment;
import java.util.List;

public abstract class AddressBaseFragment extends BaseFragment
    implements ValidatableForm
{

    public AddressBaseFragment()
    {
    }

    public abstract void clearAddressForm();

    public abstract void fillAddressFrom(LabsAddress labsaddress);

    public void validate(FormValidationListener formvalidationlistener)
    {
        List list = validate();
        if (list.isEmpty())
        {
            formvalidationlistener.onFormValidationSuccess((LabsAddress)getFormObject());
            return;
        } else
        {
            formvalidationlistener.onFormValidationFailure(list);
            return;
        }
    }

    private class FormValidationListener
    {

        public abstract void onFormValidationFailure(List list);

        public abstract void onFormValidationSuccess(LabsAddress labsaddress);
    }

}
