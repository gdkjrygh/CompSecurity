// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.request;

import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.util.concurrent.Callable;

public final class SendMoneyRequestReminderAction
    implements Callable
{

    private final FundsTransferClient fundsTransferClient;
    private final com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderRequest request;

    public SendMoneyRequestReminderAction(FundsTransferClient fundstransferclient, com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderRequest sendreminderrequest)
    {
        fundsTransferClient = fundstransferclient;
        request = sendreminderrequest;
    }

    private com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderResponse call()
        throws Exception
    {
        return fundsTransferClient.sendMoneyRequestReminder(request);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
