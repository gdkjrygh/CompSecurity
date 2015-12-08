// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            DeliveryActivity

class <init> extends com.dominos.android.sdk.core.user.k
{

    private boolean isGoToCart;
    private LabsAddress mSavedAddress;
    final DeliveryActivity this$0;

    public void onAddressDuplicated()
    {
        mActivityHelper.showAlert(AlertType.DUPLICATE_ADDRESS_SAVE_ERROR, mSavedAddress.getName(), null);
    }

    public void onAddressSaveFailure()
    {
        mActivityHelper.showAlert(AlertType.ADDRESS_SAVE_ERROR);
    }

    public void onAddressSaved()
    {
        mAnalyticsUtil.postAddressSaved();
        int i;
        if (mSavedAddress.getName().length() > 0)
        {
            i = 0x7f080193;
        } else
        {
            i = 0x7f080396;
        }
        showLongToast(String.format(getString(i), new Object[] {
            mSavedAddress.getName()
        }));
        if (isGoToCart)
        {
            navigateToCart();
            return;
        } else
        {
            clearAddressFrom();
            return;
        }
    }

    public void onBegin()
    {
        showLoading();
    }

    public void onFinish()
    {
        hideLoading();
    }

    private ressCallback(LabsAddress labsaddress, boolean flag)
    {
        this$0 = DeliveryActivity.this;
        super();
        mSavedAddress = labsaddress;
        isGoToCart = flag;
    }

    isGoToCart(LabsAddress labsaddress, boolean flag, isGoToCart isgotocart)
    {
        this(labsaddress, flag);
    }
}
