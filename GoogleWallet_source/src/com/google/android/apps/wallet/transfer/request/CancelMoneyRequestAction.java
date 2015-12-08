// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.request;

import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.util.concurrent.Callable;

public final class CancelMoneyRequestAction
    implements Callable
{

    private final FundsTransferClient fundsTransferClient;
    private final com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestRequest request;

    public CancelMoneyRequestAction(FundsTransferClient fundstransferclient, com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestRequest cancelmoneyrequestrequest)
    {
        fundsTransferClient = fundstransferclient;
        request = cancelmoneyrequestrequest;
    }

    private com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestResponse call()
        throws Exception
    {
        return fundsTransferClient.cancelMoneyRequest(request);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
