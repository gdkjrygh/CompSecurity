// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.AbsListView;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordListActivity, PurchaseRecordPublisher

final class this._cls0
    implements android.widget.d.PurchaseRecordListActivity._cls3
{

    final PurchaseRecordListActivity this$0;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        while (PurchaseRecordListActivity.access$200(PurchaseRecordListActivity.this).isRefreshing() || j <= 0 || i + j != k) 
        {
            return;
        }
        itemIndexToDisplayOnListDataChange = null;
        purchaseRecordPublisher.fetchNextPage();
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    ()
    {
        this$0 = PurchaseRecordListActivity.this;
        super();
    }
}
