// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue.api;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class StoredValueClient
{

    private final RpcCaller rpcCaller;

    StoredValueClient(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueResponse getStoredValue(com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueRequest getstoredvaluerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueResponse)rpcCaller.call("b/instrument/getStoredValue", getstoredvaluerequest, new com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueResponse());
    }
}
