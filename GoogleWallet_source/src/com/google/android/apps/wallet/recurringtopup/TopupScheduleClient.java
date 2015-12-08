// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class TopupScheduleClient
{

    private RpcCaller rpcCaller;

    TopupScheduleClient(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse cancelTopupSchedule(com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleRequest canceltopupschedulerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse)rpcCaller.call("b/scheduletopups/cancelTopupSchedule", canceltopupschedulerequest, new com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse checkEligibility(com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityRequest checkscheduledtopupeligibilityrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse)rpcCaller.call("b/scheduletopups/checkEligibility", checkscheduledtopupeligibilityrequest, new com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.GetTopupScheduleResponse getTopupSchedule(com.google.wallet.proto.api.NanoWalletScheduleTopups.GetTopupScheduleRequest gettopupschedulerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletScheduleTopups.GetTopupScheduleResponse)rpcCaller.call("b/scheduletopups/getTopupSchedule", gettopupschedulerequest, new com.google.wallet.proto.api.NanoWalletScheduleTopups.GetTopupScheduleResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse previewTopupSchedule(com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleRequest previewtopupschedulerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse)rpcCaller.call("b/scheduletopups/previewTopupSchedule", previewtopupschedulerequest, new com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse scheduleTopup(com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupRequest scheduletopuprequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse)rpcCaller.call("b/scheduletopups/scheduleTopup", scheduletopuprequest, new com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionResponse skipNextTopupTransaction(com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionRequest skipnexttopuptransactionrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionResponse)rpcCaller.call("b/scheduletopups/skipNextTopupTransaction", skipnexttopuptransactionrequest, new com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionResponse());
    }
}
