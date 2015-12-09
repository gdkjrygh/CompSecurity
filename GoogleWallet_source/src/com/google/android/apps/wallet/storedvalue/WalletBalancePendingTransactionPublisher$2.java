// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.util.proto.Protos;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionPublisher

final class this._cls0
    implements EventHandler
{

    final WalletBalancePendingTransactionPublisher this$0;

    private void handleEvent(com.google.wallet.proto.e.SystemNotification systemnotification)
    {
        if (Protos.valuesEqual(systemnotification.type, 4))
        {
            WalletBalancePendingTransactionPublisher.access$000(WalletBalancePendingTransactionPublisher.this);
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((com.google.wallet.proto.e.SystemNotification)obj);
    }

    n()
    {
        this$0 = WalletBalancePendingTransactionPublisher.this;
        super();
    }
}
