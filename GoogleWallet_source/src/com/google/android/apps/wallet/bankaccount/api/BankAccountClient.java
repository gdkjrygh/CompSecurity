// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class BankAccountClient
{

    private final RpcCaller rpcCaller;

    BankAccountClient(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountResponse addBankAccount(com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountRequest addbankaccountrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountResponse)rpcCaller.call("b/instrument/addBankAccount", addbankaccountrequest, new com.google.wallet.proto.api.NanoWalletInstrument.AddBankAccountResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentResponse delete(com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentRequest deletepaymentinstrumentrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentResponse)rpcCaller.call("b/instrument/delete", deletepaymentinstrumentrequest, new com.google.wallet.proto.api.NanoWalletInstrument.DeletePaymentInstrumentResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.GetBankAccountsResponse getBankAccounts()
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.GetBankAccountsResponse)rpcCaller.call("b/instrument/getBankAccounts", new com.google.wallet.proto.api.NanoWalletInstrument.GetBankAccountsRequest(), new com.google.wallet.proto.api.NanoWalletInstrument.GetBankAccountsResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositResponse initiateChallengeDeposit(com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositRequest initiatechallengedepositrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositResponse)rpcCaller.call("b/instrument/initiateChallengeDeposit", initiatechallengedepositrequest, new com.google.wallet.proto.api.NanoWalletInstrument.InitiateChallengeDepositResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositResponse verifyChallengeDeposit(com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositRequest verifychallengedepositrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositResponse)rpcCaller.call("b/instrument/verifyChallengeDeposit", verifychallengedepositrequest, new com.google.wallet.proto.api.NanoWalletInstrument.VerifyChallengeDepositResponse());
    }
}
