// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.request;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;

// Referenced classes of package com.google.android.apps.wallet.transfer.request:
//            RequestMoneyActivity

final class this._cls0
    implements EventHandler
{

    final RequestMoneyActivity this$0;

    private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
    {
        RequestMoneyActivity.access$202(RequestMoneyActivity.this, fundstransferinfoevent.getMaxTransferAmount());
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((FundsTransferInfoEvent)obj);
    }

    ()
    {
        this$0 = RequestMoneyActivity.this;
        super();
    }
}
