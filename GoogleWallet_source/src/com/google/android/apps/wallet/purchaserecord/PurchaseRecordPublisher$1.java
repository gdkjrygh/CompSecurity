// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.common.cache.Cache;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordPublisher, PurchaseRecordEvent

final class this._cls0
    implements RegistrationCallback
{

    final PurchaseRecordPublisher this$0;

    public final void handleRegistration(Object obj)
    {
        PurchaseRecordEvent purchaserecordevent = (PurchaseRecordEvent)PurchaseRecordPublisher.access$000(PurchaseRecordPublisher.this).getIfPresent(obj);
        if (purchaserecordevent != null)
        {
            PurchaseRecordPublisher.access$100(PurchaseRecordPublisher.this).post(obj, purchaserecordevent);
        } else
        {
            if (PurchaseRecordPublisher.ALL_PURCHASE_RECORDS.equals(obj))
            {
                resetAndFetchFirstPage();
                return;
            }
            if (obj instanceof String)
            {
                fetchPurchaseRecord((String)obj);
                return;
            }
        }
    }

    ()
    {
        this$0 = PurchaseRecordPublisher.this;
        super();
    }
}
