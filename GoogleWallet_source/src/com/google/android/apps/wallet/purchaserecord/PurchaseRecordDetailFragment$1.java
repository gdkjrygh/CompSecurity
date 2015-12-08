// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.ui.toast.Toasts;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailFragment, PurchaseRecordEvent

final class this._cls0
    implements EventHandler
{

    final PurchaseRecordDetailFragment this$0;

    private void handleEvent(PurchaseRecordEvent purchaserecordevent)
    {
        switch (.SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Toasts.show(getActivity(), com.google.android.apps.walletnfcrel._error_loading);
            return;

        case 2: // '\002'
            PurchaseRecordDetailFragment.access$002(PurchaseRecordDetailFragment.this, purchaserecordevent.getPurchaseRecord());
            break;
        }
        PurchaseRecordDetailFragment.access$100(PurchaseRecordDetailFragment.this);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((PurchaseRecordEvent)obj);
    }

    ordEventType()
    {
        this$0 = PurchaseRecordDetailFragment.this;
        super();
    }
}
