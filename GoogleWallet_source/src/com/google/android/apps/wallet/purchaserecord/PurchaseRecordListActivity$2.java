// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.wallet.api.UriRegistry;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordListActivity, DividedPurchaseRecordAdapterWrapper, PurchaseRecord

final class this._cls0
    implements android.widget.er
{

    final PurchaseRecordListActivity this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (purchaseRecordAdapterWrapper.getAdapter().getItem(i)));
        if (PurchaseRecordListActivity.access$100(PurchaseRecordListActivity.this))
        {
            if (adapterview instanceof com.google.android.apps.wallet.wobs.list.ty)
            {
                adapterview = ((com.google.android.apps.wallet.wobs.list.ty)adapterview).getEntityId();
                startActivity(uriRegistry.createIntent(8001, new Object[] {
                    adapterview
                }));
            }
            return;
        } else
        {
            adapterview = (PurchaseRecord)adapterview;
            startActivity(uriRegistry.createIntent(8001, new Object[] {
                adapterview.getId()
            }));
            return;
        }
    }

    rapper()
    {
        this$0 = PurchaseRecordListActivity.this;
        super();
    }
}
