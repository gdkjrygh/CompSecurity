// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.RequestErrorCode;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            StoreListActivity

class rderCallback extends com.dominos.android.sdk.core.order.arryoutOrderCallback
{

    final StoreListActivity this$0;

    public void onBegin()
    {
        showLoading();
    }

    public void onCreateOrderError(RequestErrorCode requesterrorcode)
    {
        mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR, StoreListActivity.access$300(StoreListActivity.this));
    }

    public void onFinish()
    {
        hideLoading();
    }

    public void onOrderCreated(LabsOrder labsorder)
    {
        StoreListActivity.access$400(StoreListActivity.this);
    }

    public void onStoreCarryoutUnavailable(String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null, StoreListActivity.access$300(StoreListActivity.this), null);
    }

    public void onStoreClosed()
    {
        mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED, StoreListActivity.access$300(StoreListActivity.this));
    }

    public void onStoreOffline(String s)
    {
        mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null, StoreListActivity.access$300(StoreListActivity.this), null);
    }

    er()
    {
        this$0 = StoreListActivity.this;
        super();
    }
}
