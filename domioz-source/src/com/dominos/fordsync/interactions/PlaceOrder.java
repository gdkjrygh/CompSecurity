// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.utils.AnalyticsUtil;
import java.text.NumberFormat;

// Referenced classes of package com.dominos.fordsync.interactions:
//            YesNoInteraction, AnnoyUser_, PlaceOrder_, ErrorHandler_, 
//            ErrorHandler

public class PlaceOrder extends YesNoInteraction
{

    protected LabsOrder currentOrder;
    AnalyticsUtil mAnalyticsUtil;
    OrderUtil mOrderUtil;
    private UserProfileManager mUserProfileManager;
    PowerRestClient powerService;

    public PlaceOrder()
    {
    }

    protected void no()
    {
        mAnalyticsUtil.postFordSyncPlaceOrderNo();
        super.no();
        AnnoyUser_.getInstance_(app).start();
    }

    public void onAfterInject()
    {
        mUserProfileManager = (UserProfileManager)mFordSyncSession.getManager("user_manager");
    }

    public PlaceOrder_ setOrder(LabsOrder labsorder)
    {
        currentOrder = labsorder;
        return (PlaceOrder_)this;
    }

    public void start()
    {
        if (currentOrder == null)
        {
            ErrorHandler_.getInstance_(app).reason("store_or_order_errors").start();
            return;
        } else
        {
            mAnalyticsUtil.postFordSyncPlaceOrderPrompt(currency.format(currentOrder.getPrice()));
            super.start();
            return;
        }
    }

    protected void yes()
    {
        mAnalyticsUtil.postFordSyncPlaceOrderYes();
        super.yes();
        if (currentOrder.isEasyOrder())
        {
            currentOrder.setEasyOrder(false);
        }
        currentOrder.setId("");
        mOrderUtil.addChannelToOrder(currentOrder);
        powerService.placeOrder(currentOrder, new _cls1());
    }


    private class _cls1 extends PowerRestCallback
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
                s = mUserProfileManager.getCurrentUser();
                if (s != null && StringHelper.isNotEmpty(s.getCustomerId()))
                {
                    mUserProfileManager.loadAndWaitForOrderHistoryAndCards(s.getCustomerId());
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

        _cls1()
        {
            this$0 = PlaceOrder.this;
            super();
        }
    }

}
