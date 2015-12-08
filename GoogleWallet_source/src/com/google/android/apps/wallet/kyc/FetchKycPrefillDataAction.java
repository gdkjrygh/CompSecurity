// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.address.FetchAddressAction;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.util.async.CompositeAction;
import java.util.concurrent.Callable;

public final class FetchKycPrefillDataAction extends CompositeAction
{

    private final KycClient kycClient;
    private final int kycStatus;
    private final RpcCaller rpcCaller;

    public FetchKycPrefillDataAction(KycClient kycclient, RpcCaller rpccaller, int i)
    {
        kycClient = kycclient;
        rpcCaller = rpccaller;
        kycStatus = i;
    }

    public final Callable[] getActions()
    {
        return (new Callable[] {
            new Callable() {

                final FetchKycPrefillDataAction this$0;

                private com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse call()
                    throws Exception
                {
                    return kycClient.getKycData();
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = FetchKycPrefillDataAction.this;
                super();
            }
            }, new FetchAddressAction(rpcCaller)
        });
    }

    public final int getKycStatus()
    {
        return kycStatus;
    }

}
