// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.withdraw;

import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.money.MoneyConverter;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.math.BigDecimal;
import java.util.concurrent.Callable;

public final class WithdrawAction
    implements Callable
{

    final BankAccount bankAccount;
    final FundsTransferClient client;
    final com.google.wallet.proto.NanoWalletEntities.MoneyProto withdrawAmount;
    final String withdrawId;

    public WithdrawAction(FundsTransferClient fundstransferclient, BankAccount bankaccount, com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto, String s)
    {
        client = fundstransferclient;
        bankAccount = bankaccount;
        withdrawAmount = moneyproto;
        withdrawId = s;
    }

    private com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsRequest withdrawfundsrequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsRequest();
        withdrawfundsrequest.destinationInstrumentSubId = bankAccount.getCdpId().subId;
        withdrawfundsrequest.withdrawalAmount = withdrawAmount;
        withdrawfundsrequest.fees = MoneyConverter.toMoneyProto(BigDecimal.ZERO);
        withdrawfundsrequest.withdrawalId = withdrawId;
        return client.withdraw(withdrawfundsrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
