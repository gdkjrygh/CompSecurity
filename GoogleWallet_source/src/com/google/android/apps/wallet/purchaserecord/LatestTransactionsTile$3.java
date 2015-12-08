// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.EventHandler;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            LatestTransactionsTile, PurchaseRecordEvent

final class this._cls0
    implements EventHandler
{

    final LatestTransactionsTile this$0;

    private void handleEvent(PurchaseRecordEvent purchaserecordevent)
    {
        .SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 48
    //                   3 72;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        LatestTransactionsTile.access$400(LatestTransactionsTile.this, ate.ERROR);
        return;
_L3:
        if (LatestTransactionsTile.access$500(LatestTransactionsTile.this) == ate.ERROR)
        {
            LatestTransactionsTile.access$400(LatestTransactionsTile.this, ate.LOADING);
            return;
        }
          goto _L1
_L4:
        LatestTransactionsTile.access$602(LatestTransactionsTile.this, purchaserecordevent.getPurchaseRecords());
        LatestTransactionsTile latesttransactionstile = LatestTransactionsTile.this;
        if (LatestTransactionsTile.access$600(LatestTransactionsTile.this).isEmpty())
        {
            purchaserecordevent = ate.NO_TRANSACTIONS;
        } else
        {
            purchaserecordevent = ate.LATEST_TRANSACTIONS;
        }
        LatestTransactionsTile.access$400(latesttransactionstile, purchaserecordevent);
        return;
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((PurchaseRecordEvent)obj);
    }

    ate()
    {
        this$0 = LatestTransactionsTile.this;
        super();
    }
}
