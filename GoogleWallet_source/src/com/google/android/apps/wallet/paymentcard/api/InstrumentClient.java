// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class InstrumentClient
{

    private final RpcCaller rpcCaller;

    InstrumentClient(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.DeleteInstrumentResponse delete(com.google.wallet.proto.api.NanoWalletInstrument.DeleteInstrumentRequest deleteinstrumentrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.DeleteInstrumentResponse)rpcCaller.call("b/instrument/deleteInstrument", deleteinstrumentrequest, new com.google.wallet.proto.api.NanoWalletInstrument.DeleteInstrumentResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.FetchInstrumentsResponse fetch()
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.FetchInstrumentsResponse)rpcCaller.call("b/instrument/fetch", new com.google.wallet.proto.api.NanoWalletInstrument.FetchInstrumentsRequest(), new com.google.wallet.proto.api.NanoWalletInstrument.FetchInstrumentsResponse());
    }
}
