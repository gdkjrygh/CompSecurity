// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.topup;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;

// Referenced classes of package com.google.android.apps.wallet.topup:
//            FeeInfoActivity

final class this._cls0
    implements EventHandler
{

    final FeeInfoActivity this$0;

    private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
    {
        handleTransferFeeEvent(fundstransferinfoevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((FundsTransferInfoEvent)obj);
    }

    erInfoEvent()
    {
        this$0 = FeeInfoActivity.this;
        super();
    }
}
