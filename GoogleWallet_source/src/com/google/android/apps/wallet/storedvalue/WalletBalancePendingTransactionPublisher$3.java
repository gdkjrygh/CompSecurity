// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionPublisher, WalletBalancePendingTransactionEvent

final class this._cls0
    implements Callable
{

    final WalletBalancePendingTransactionPublisher this$0;

    private Void call()
    {
        WalletBalancePendingTransactionEvent walletbalancependingtransactionevent;
        try
        {
            walletbalancependingtransactionevent = new WalletBalancePendingTransactionEvent(WalletBalancePendingTransactionPublisher.access$100(WalletBalancePendingTransactionPublisher.this).getPendingStoredValueTransactions(), null);
        }
        catch (RpcException rpcexception)
        {
            rpcexception = new WalletBalancePendingTransactionEvent(null, rpcexception);
        }
        WalletBalancePendingTransactionPublisher.access$200(WalletBalancePendingTransactionPublisher.this).post(walletbalancependingtransactionevent);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = WalletBalancePendingTransactionPublisher.this;
        super();
    }
}
