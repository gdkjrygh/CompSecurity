// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import javax.inject.Provider;

public class MultiSyncClient
{

    private final Provider rpcCaller;

    MultiSyncClient(Provider provider)
    {
        rpcCaller = provider;
    }

    public final com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse multiSync(com.google.wallet.proto.NanoWalletTransport.MultiSyncRequest multisyncrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse)((RpcCaller)rpcCaller.get()).call("b/transport/multiSync", multisyncrequest, new com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse());
    }
}
