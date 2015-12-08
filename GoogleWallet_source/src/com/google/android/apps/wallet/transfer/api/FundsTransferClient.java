// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class FundsTransferClient
{

    private RpcCaller rpcCaller;

    FundsTransferClient(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersResponse acceptAllMoney(com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersRequest acceptallmoneytransfersrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersResponse)rpcCaller.call("b/fundstransfer/acceptAllMoneyTransfers", acceptallmoneytransfersrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueResponse addToStoredValue(com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueRequest addtostoredvaluerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueResponse)rpcCaller.call("b/fundstransfer/addToStoredValue", addtostoredvaluerequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeResponse calculateFee(com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeRequest calculatefeerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeResponse)rpcCaller.call("b/fundstransfer/calculateFee", calculatefeerequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestResponse cancelMoneyRequest(com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestRequest cancelmoneyrequestrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestResponse)rpcCaller.call("b/fundstransfer/cancelMoneyRequest", cancelmoneyrequestrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestResponse declineMoneyRequest(com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestRequest declinemoneyrequestrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestResponse)rpcCaller.call("b/fundstransfer/declineMoneyRequest", declinemoneyrequestrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.GetAcceptanceOptionsResponse getAcceptanceOptions(com.google.wallet.proto.api.NanoWalletFundsTransfer.GetAcceptanceOptionsRequest getacceptanceoptionsrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.GetAcceptanceOptionsResponse)rpcCaller.call("b/fundstransfer/getAcceptanceOptions", getacceptanceoptionsrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.GetAcceptanceOptionsResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse getFundsTransferAvailability(com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityRequest getfundstransferavailabilityrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse)rpcCaller.call("b/fundstransfer/getFundsTransferAvailability", getfundstransferavailabilityrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse getFundsTransferInfo(com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoRequest getfundstransferinforequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse)rpcCaller.call("b/fundstransfer/getFundsTransferInfo", getfundstransferinforequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferInfoResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyResponse rejectMoney(com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyRequest rejectmoneyrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyResponse)rpcCaller.call("b/fundstransfer/rejectMoney", rejectmoneyrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyResponse requestMoney(com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyRequest requestmoneyrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyResponse)rpcCaller.call("b/fundstransfer/requestMoney", requestmoneyrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyResponse sendMoney(com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyRequest sendmoneyrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyResponse)rpcCaller.call("b/fundstransfer/sendMoney", sendmoneyrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderResponse sendMoneyRequestReminder(com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderRequest sendreminderrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderResponse)rpcCaller.call("b/fundstransfer/sendReminder", sendreminderrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsResponse withdraw(com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsRequest withdrawfundsrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsResponse)rpcCaller.call("b/fundstransfer/withdraw", withdrawfundsrequest, new com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsResponse());
    }
}
