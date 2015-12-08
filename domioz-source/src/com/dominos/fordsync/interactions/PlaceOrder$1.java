// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fordsync.interactions:
//            PlaceOrder, ErrorHandler_, ErrorHandler, TrackOrder_

class stCallback extends PowerRestCallback
{

    final PlaceOrder this$0;

    public void onError(Exception exception, String s)
    {
        ErrorHandler_.getInstance_(app).reason("store_or_order_errors").start();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        LabsOrder labsorder = mOrderUtil.fromJson(s);
        LogUtil.v("SyncInteraction", "placeOrder:onSuccess: %s", new Object[] {
            labsorder
        });
        if (labsorder != null && (labsorder.getStatus() == 0 || labsorder.isDuplicateOrder()))
        {
            s = PlaceOrder.access$000(PlaceOrder.this).getCurrentUser();
            if (s != null && StringHelper.isNotEmpty(s.getCustomerId()))
            {
                PlaceOrder.access$000(PlaceOrder.this).loadAndWaitForOrderHistoryAndCards(s.getCustomerId());
                LogUtil.d("SyncInteraction", "Refreshing historical order..", new Object[0]);
            }
            mAnalyticsUtil.postFordSyncPlaceOrderSuccess(mFordSyncSession, labsorder, Boolean.valueOf(false));
            String s1;
            if (labsorder.isDelivery())
            {
                s = "delivered";
            } else
            {
                s = "ready for pickup";
            }
            s1 = labsorder.getEstimatedWaitMinutes().replace("-", " to ");
            mAppLinkManager.prompt(prompts.getPrompter("order_placed"), new Object[] {
                s, s1
            });
            TrackOrder_.getInstance_(app).setOrderToTrack(labsorder.getStoreId(), labsorder.getStoreOrderId()).start();
            return;
        } else
        {
            ErrorHandler_.getInstance_(app).reason("store_or_order_errors").start();
            return;
        }
    }

    oryModel()
    {
        this$0 = PlaceOrder.this;
        super();
    }
}
