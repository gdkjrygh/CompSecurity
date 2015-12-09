// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.support.v4.view.ViewPager;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.collect.Iterables;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, PurchaseRecordEvent

final class this._cls0
    implements EventHandler
{

    final PurchaseRecordDetailActivity this$0;

    private int getPurchaseRecordIndex(List list)
    {
        return Iterables.indexOf(list, PurchaseRecordDetailActivity.access$1300(purchaseRecordId));
    }

    private void handleEvent(PurchaseRecordEvent purchaserecordevent)
    {
        .SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 129;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        purchaserecordevent = purchaserecordevent.getPurchaseRecords();
        int i = getPurchaseRecordIndex(purchaserecordevent);
        if (i >= 0)
        {
            PurchaseRecordDetailActivity.access$900(PurchaseRecordDetailActivity.this).setPurchaseRecords(purchaserecordevent);
            PurchaseRecordDetailActivity.access$600(PurchaseRecordDetailActivity.this).setCurrentItem(i, false);
            fullScreenProgressSpinnerManager.hide();
            if (PurchaseRecordDetailActivity.access$1000(PurchaseRecordDetailActivity.this))
            {
                doFirstLoadActions();
                return;
            }
        } else
        {
            WLog.wfmt(PurchaseRecordDetailActivity.access$800(), "Could not find previously selected PurchaseRecord in new list; fetching it individually: %s", new Object[] {
                purchaseRecordId
            });
            PurchaseRecordDetailActivity.access$1100(PurchaseRecordDetailActivity.this);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (PurchaseRecordDetailActivity.access$1000(PurchaseRecordDetailActivity.this))
        {
            PurchaseRecordDetailActivity.access$1200(PurchaseRecordDetailActivity.this);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((PurchaseRecordEvent)obj);
    }

    erManager()
    {
        this$0 = PurchaseRecordDetailActivity.this;
        super();
    }
}
