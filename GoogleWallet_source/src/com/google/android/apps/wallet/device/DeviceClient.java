// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.device;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class DeviceClient
{

    private final RpcCaller mRpcCaller;

    DeviceClient(RpcCaller rpccaller)
    {
        mRpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceResponse register(com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest registerdevicerequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceResponse)mRpcCaller.call("b/device/register", registerdevicerequest, new com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceResponse());
    }
}
