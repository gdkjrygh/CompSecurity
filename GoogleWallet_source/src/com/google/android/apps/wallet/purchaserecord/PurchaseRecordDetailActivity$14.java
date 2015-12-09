// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.support.v4.view.ViewPager;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.collect.Lists;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, PurchaseRecordEvent, PurchaseRecord

final class this._cls0
    implements EventHandler
{

    final PurchaseRecordDetailActivity this$0;

    private void handleEvent(PurchaseRecordEvent purchaserecordevent)
    {
        if (!PurchaseRecordDetailActivity.access$1000(PurchaseRecordDetailActivity.this)) goto _L2; else goto _L1
_L1:
        .SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
        JVM INSTR tableswitch 6 9: default 52
    //                   6 52
    //                   7 53
    //                   8 72
    //                   9 103;
           goto _L2 _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        finish();
        Toasts.show(PurchaseRecordDetailActivity.this, com.google.android.apps.walletnfcrel._deleted_toast);
        return;
_L4:
        PurchaseRecordDetailActivity.access$1200(PurchaseRecordDetailActivity.this);
        PurchaseRecordDetailActivity.access$900(PurchaseRecordDetailActivity.this).setPurchaseRecords(Lists.newArrayList());
        fullScreenProgressSpinnerManager.hide();
        return;
_L5:
        PurchaseRecordDetailActivity.access$900(PurchaseRecordDetailActivity.this).setPurchaseRecords(Lists.newArrayList(new PurchaseRecord[] {
            purchaserecordevent.getPurchaseRecord()
        }));
        PurchaseRecordDetailActivity.access$600(PurchaseRecordDetailActivity.this).setCurrentItem(0);
        PurchaseRecordDetailActivity.access$700(PurchaseRecordDetailActivity.this);
        fullScreenProgressSpinnerManager.hide();
        doFirstLoadActions();
        return;
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
