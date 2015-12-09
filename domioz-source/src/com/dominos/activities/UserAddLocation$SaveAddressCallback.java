// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation

class <init> extends com.dominos.android.sdk.core.user.ck
{

    LabsAddress addressToSave;
    final UserAddLocation this$0;

    public void onAddressDuplicated()
    {
        mActivityHelper.showAlert(AlertType.ADDRESS_SAVE_TO_PROFILE_DUPLICATE, addressToSave.getName(), null);
    }

    public void onAddressSaveFailure()
    {
        mActivityHelper.showAlert(AlertType.ADDRESS_SAVE_TO_PROFILE_ERROR);
    }

    public void onAddressSaved()
    {
        hideLoading();
        int i;
        if (addressToSave.getName().length() > 0)
        {
            i = 0x7f080193;
        } else
        {
            i = 0x7f080396;
        }
        showLongToast(String.format(getString(i), new Object[] {
            addressToSave.getName()
        }));
        setResult(2);
        finish();
    }

    public void onBegin()
    {
        super.onBegin();
        showLoading();
    }

    public void onFinish()
    {
        super.onFinish();
        hideLoading();
    }

    private dressCallback(LabsAddress labsaddress)
    {
        this$0 = UserAddLocation.this;
        super();
        addressToSave = labsaddress;
    }

    addressToSave(LabsAddress labsaddress, addressToSave addresstosave)
    {
        this(labsaddress);
    }
}
