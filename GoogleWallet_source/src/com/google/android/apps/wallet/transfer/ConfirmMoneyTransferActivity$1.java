// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ConfirmMoneyTransferActivity

final class this._cls0
    implements EventHandler
{

    final ConfirmMoneyTransferActivity this$0;

    private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
    {
        if (ConfirmMoneyTransferActivity.access$000(ConfirmMoneyTransferActivity.this, fundstransferinfoevent.getFailureCause()))
        {
            return;
        } else
        {
            ConfirmMoneyTransferActivity.access$102(ConfirmMoneyTransferActivity.this, Optional.of(fundstransferinfoevent));
            ConfirmMoneyTransferActivity.access$200(ConfirmMoneyTransferActivity.this);
            return;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((FundsTransferInfoEvent)obj);
    }

    ()
    {
        this$0 = ConfirmMoneyTransferActivity.this;
        super();
    }
}
