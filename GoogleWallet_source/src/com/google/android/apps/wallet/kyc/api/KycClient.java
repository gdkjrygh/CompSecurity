// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.common.base.Preconditions;

public class KycClient
{

    private static final String TAG = com/google/android/apps/wallet/kyc/api/KycClient.getSimpleName();
    private final RpcCaller rpcCaller;

    KycClient(RpcCaller rpccaller)
    {
        rpcCaller = (RpcCaller)Preconditions.checkNotNull(rpccaller);
    }

    public static int getKycStatus(com.google.wallet.proto.NanoWalletEntities.KycStatus kycstatus)
    {
        if (kycstatus != null && kycstatus.status != null)
        {
            return kycstatus.status.intValue();
        } else
        {
            return 0;
        }
    }

    public final com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse acceptKycTos(com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosRequest acceptkyctosrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse)rpcCaller.call("b/kyc/acceptKycTos", acceptkyctosrequest, new com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse getGetKycStatusResponse()
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse getkycstatusresponse = (com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse)rpcCaller.call("b/kyc/getKycStatus", new com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusRequest(), new com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse());
        if (getkycstatusresponse.callError != null)
        {
            throw new CallErrorException(getkycstatusresponse.callError);
        }
        boolean flag;
        if (getkycstatusresponse.kycStatus != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "GetKycStatusResponse is missing KycStatus");
        WLog.dfmt(TAG, "KycStatus: %s", new Object[] {
            getkycstatusresponse.kycStatus
        });
        return getkycstatusresponse;
    }

    public final com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse getKycData()
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse getkycdataresponse = (com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse)rpcCaller.call("b/kyc/getKycData", new com.google.wallet.proto.api.NanoWalletKyc.GetKycDataRequest(), new com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse());
        if (getkycdataresponse.callError != null)
        {
            throw new CallErrorException(getkycdataresponse.callError);
        } else
        {
            return getkycdataresponse;
        }
    }

    public final int getKycStatus()
        throws RpcException, CallErrorException
    {
        return getKycStatus(getGetKycStatusResponse().kycStatus);
    }

    public final com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersResponse submitAnswers(com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersRequest submitanswersrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersResponse)rpcCaller.call("b/kyc/submitOowAnswers", submitanswersrequest, new com.google.wallet.proto.api.NanoWalletKyc.SubmitAnswersResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletKyc.SubmitFullSsnResponse submitFullSsn(com.google.wallet.proto.api.NanoWalletKyc.SubmitFullSsnRequest submitfullssnrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletKyc.SubmitFullSsnResponse)rpcCaller.call("b/kyc/submitFullSsn", submitfullssnrequest, new com.google.wallet.proto.api.NanoWalletKyc.SubmitFullSsnResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentResponse submitVerificationDocument(com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentRequest submitverificationdocumentrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentResponse)rpcCaller.call("b/kyc/submitVerificationDocument", submitverificationdocumentrequest, new com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityResponse verifyIdentity(com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityRequest verifyidentityrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityResponse)rpcCaller.call("b/kyc/verifyIdentity", verifyidentityrequest, new com.google.wallet.proto.api.NanoWalletKyc.VerifyIdentityResponse());
    }

}
