// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.fragments.landing:
//            ReOrderFragment

class ack extends com.dominos.android.sdk.core.order.eReOrderCallback
{

    final ReOrderFragment this$0;
    final LabsOrder val$order;

    public void onBegin()
    {
        ReOrderFragment.access$000(ReOrderFragment.this);
    }

    public void onFailure()
    {
        ReOrderFragment.access$300(ReOrderFragment.this).showAlert(AlertType.STORE_CONNECTION_ERROR, ReOrderFragment.access$200(ReOrderFragment.this));
    }

    public void onFinish()
    {
        ReOrderFragment.access$100(ReOrderFragment.this);
    }

    public void onNewOrder(LabsOrder labsorder)
    {
        ReOrderFragment.access$900(ReOrderFragment.this, labsorder);
    }

    public void onNoStoreFoundForDelivery()
    {
        ReOrderFragment.access$1000(ReOrderFragment.this).showAlert(AlertType.NO_LONGER_DELIVERY_AREA, ReOrderFragment.access$200(ReOrderFragment.this));
    }

    public void onStoreCarryoutUnavailable(String s)
    {
        ReOrderFragment.access$1100(ReOrderFragment.this).showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, ReOrderFragment.access$200(ReOrderFragment.this));
    }

    public void onStoreClosed()
    {
        if (val$order.isDelivery())
        {
            ReOrderFragment.access$600(ReOrderFragment.this).showAlert(AlertType.STORE_DELIVERY_CLOSED, ReOrderFragment.access$200(ReOrderFragment.this));
            return;
        } else
        {
            ReOrderFragment.access$700(ReOrderFragment.this).showAlert(AlertType.STORE_CARRYOUT_CLOSED, ReOrderFragment.access$200(ReOrderFragment.this));
            return;
        }
    }

    public void onStoreDeliveryUnavailable(String s)
    {
        ReOrderFragment.access$800(ReOrderFragment.this).showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, ReOrderFragment.access$200(ReOrderFragment.this));
    }

    public void onStoreOffline(String s)
    {
        if (val$order.isDelivery())
        {
            ReOrderFragment.access$400(ReOrderFragment.this).showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, ReOrderFragment.access$200(ReOrderFragment.this));
            return;
        } else
        {
            ReOrderFragment.access$500(ReOrderFragment.this).showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, ReOrderFragment.access$200(ReOrderFragment.this));
            return;
        }
    }

    CreateReOrderCallback()
    {
        this$0 = final_reorderfragment;
        val$order = LabsOrder.this;
        super();
    }
}
