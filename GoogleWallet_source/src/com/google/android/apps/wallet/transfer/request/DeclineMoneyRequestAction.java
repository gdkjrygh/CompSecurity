// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.request;

import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.util.concurrent.Callable;

public final class DeclineMoneyRequestAction
    implements Callable
{

    private final FundsTransferClient fundsTransferClient;
    private final com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestRequest request;

    public DeclineMoneyRequestAction(FundsTransferClient fundstransferclient, com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestRequest declinemoneyrequestrequest)
    {
        fundsTransferClient = fundstransferclient;
        request = declinemoneyrequestrequest;
    }

    private com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestResponse call()
        throws RpcException
    {
        return fundsTransferClient.declineMoneyRequest(request);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
