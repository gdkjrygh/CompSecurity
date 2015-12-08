// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class InferredMerchantFeedbackManager
{

    private final RpcCaller rpcCaller;

    public InferredMerchantFeedbackManager(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackResponse sendFeedback(com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackRequest transactiongeomerchantfeedbackrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackResponse)rpcCaller.call("b/transaction/geoMerchantFeedback", transactiongeomerchantfeedbackrequest, new com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackResponse());
    }
}
