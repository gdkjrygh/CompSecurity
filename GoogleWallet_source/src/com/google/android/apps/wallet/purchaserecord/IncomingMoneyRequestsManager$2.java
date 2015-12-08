// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            IncomingMoneyRequestsManager

final class this._cls0
    implements EventHandler
{

    final IncomingMoneyRequestsManager this$0;

    private void handleEvent(NewPurchaseRecordReceiptEvent newpurchaserecordreceiptevent)
    {
        IncomingMoneyRequestsManager.access$100(IncomingMoneyRequestsManager.this);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((NewPurchaseRecordReceiptEvent)obj);
    }

    nt()
    {
        this$0 = IncomingMoneyRequestsManager.this;
        super();
    }
}
