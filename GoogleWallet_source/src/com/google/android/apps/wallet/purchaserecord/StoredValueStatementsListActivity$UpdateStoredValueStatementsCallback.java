// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.view.View;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            StoredValueStatementsListActivity

final class listAdapter
    implements AsyncCallback
{

    private final SimpleListAdapter listAdapter;
    final StoredValueStatementsListActivity this$0;

    private void onSuccess(List list)
    {
        listAdapter.setItems(list);
        fullScreenProgressSpinnerManager.hide();
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(StoredValueStatementsListActivity.access$100(), "Error fetching monthly statements", exception);
        fullScreenProgressSpinnerManager.hide();
        StoredValueStatementsListActivity.access$400(StoredValueStatementsListActivity.this).setVisibility(8);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public y(SimpleListAdapter simplelistadapter)
    {
        this$0 = StoredValueStatementsListActivity.this;
        super();
        listAdapter = simplelistadapter;
    }
}
