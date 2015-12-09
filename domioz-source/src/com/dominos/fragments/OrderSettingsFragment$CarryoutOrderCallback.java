// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import com.dominos.android.sdk.common.RequestErrorCode;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.fragments:
//            OrderSettingsFragment

class <init> extends com.dominos.android.sdk.core.order.it>
{

    final OrderSettingsFragment this$0;

    public void onBegin()
    {
        showLoading();
    }

    public void onCreateOrderError(RequestErrorCode requesterrorcode)
    {
        mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR);
    }

    public void onFinish()
    {
        hideLoading();
    }

    public void onOrderCreated(LabsOrder labsorder)
    {
        navigateToCart();
    }

    public void onStoreCarryoutUnavailable(String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null);
    }

    public void onStoreClosed()
    {
        mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED);
    }

    public void onStoreOffline(String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null);
    }

    private rCallback()
    {
        this$0 = OrderSettingsFragment.this;
        super();
    }

    rCallback(rCallback rcallback)
    {
        this();
    }
}
