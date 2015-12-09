// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventHandler;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordListActivity, PurchaseRecordEvent, DividedPurchaseRecordAdapterWrapper, PurchaseRecordPublisher

final class this._cls0
    implements EventHandler
{

    final PurchaseRecordListActivity this$0;

    private void handleEvent(PurchaseRecordEvent purchaserecordevent)
    {
        .SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 45
    //                   2 132
    //                   3 373
    //                   4 392
    //                   5 500;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        ate.checkTransition(PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this), ate.LOADING_FIRST_PAGE);
        if (PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this) != ate.LOADING_FIRST_PAGE)
        {
            PurchaseRecordListActivity.access$500(PurchaseRecordListActivity.this).setVisibility(8);
            listView.setEmptyView(PurchaseRecordListActivity.access$600(PurchaseRecordListActivity.this));
        }
        PurchaseRecordListActivity.access$402(PurchaseRecordListActivity.this, ate.LOADING_FIRST_PAGE);
        itemIndexToDisplayOnListDataChange = Integer.valueOf(listView.getFirstVisiblePosition());
        return;
_L3:
        if (viewResumed)
        {
            itemIndexToDisplayOnListDataChange = Integer.valueOf(listView.getFirstVisiblePosition());
            viewResumed = false;
        }
        PurchaseRecordListActivity.access$200(PurchaseRecordListActivity.this).setRefreshing(false);
        PurchaseRecordListActivity.access$700(PurchaseRecordListActivity.this, purchaserecordevent);
        DividedPurchaseRecordAdapterWrapper dividedpurchaserecordadapterwrapper = purchaseRecordAdapterWrapper;
        purchaserecordevent = purchaserecordevent.getPurchaseRecords();
        PurchaseRecordListActivity purchaserecordlistactivity = PurchaseRecordListActivity.this;
        dividedpurchaserecordadapterwrapper.onReloadAllPurchaseRecords(purchaserecordevent, PurchaseRecordListActivity.shouldSeparatePendingTransactions());
        if (itemIndexToDisplayOnListDataChange != null)
        {
            if (listView.getCount() < itemIndexToDisplayOnListDataChange.intValue())
            {
                listView.setSelection(0);
                purchaseRecordPublisher.fetchNextPage();
            } else
            {
                listView.setSelection(itemIndexToDisplayOnListDataChange.intValue());
            }
        }
        ate.checkTransition(PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this), ate.LOADED);
        if (PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this) != ate.LOADED)
        {
            PurchaseRecordListActivity.access$500(PurchaseRecordListActivity.this).setVisibility(8);
            listView.setEmptyView(PurchaseRecordListActivity.access$600(PurchaseRecordListActivity.this));
        }
        PurchaseRecordListActivity.access$402(PurchaseRecordListActivity.this, ate.LOADED);
        analyticsUtil.endTiming("OpenTransactions", "user_open_transactions");
        return;
_L4:
        PurchaseRecordListActivity.access$200(PurchaseRecordListActivity.this).setRefreshing(false);
        PurchaseRecordListActivity.access$800(PurchaseRecordListActivity.this);
        return;
_L5:
        PurchaseRecordListActivity.access$200(PurchaseRecordListActivity.this).setRefreshing(true);
        ate.checkTransition(PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this), ate.LOADING_ADDITIONAL_PAGE);
        if (PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this) != ate.LOADING_ADDITIONAL_PAGE)
        {
            PurchaseRecordListActivity.access$500(PurchaseRecordListActivity.this).setVisibility(8);
            listView.setEmptyView(PurchaseRecordListActivity.access$600(PurchaseRecordListActivity.this));
        }
        PurchaseRecordListActivity.access$402(PurchaseRecordListActivity.this, ate.LOADING_ADDITIONAL_PAGE);
        if (itemIndexToDisplayOnListDataChange == null)
        {
            itemIndexToDisplayOnListDataChange = Integer.valueOf(listView.getFirstVisiblePosition());
            return;
        }
          goto _L1
_L6:
        PurchaseRecordListActivity.access$200(PurchaseRecordListActivity.this).setRefreshing(false);
        ate.checkTransition(PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this), ate.LOADED);
        if (PurchaseRecordListActivity.access$400(PurchaseRecordListActivity.this) != ate.LOADED)
        {
            PurchaseRecordListActivity.access$500(PurchaseRecordListActivity.this).setVisibility(8);
            listView.setEmptyView(PurchaseRecordListActivity.access$600(PurchaseRecordListActivity.this));
        }
        PurchaseRecordListActivity.access$402(PurchaseRecordListActivity.this, ate.LOADED);
        return;
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((PurchaseRecordEvent)obj);
    }

    rapper()
    {
        this$0 = PurchaseRecordListActivity.this;
        super();
    }
}
