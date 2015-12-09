// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup.service;

import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;

public class SetupWalletServiceClient
{

    private final RpcCaller rpcCaller;

    SetupWalletServiceClient(RpcCaller rpccaller)
    {
        rpcCaller = rpccaller;
    }

    public final com.google.wallet.proto.api.NanoWalletSetup.AcceptTosResponse acceptTos(com.google.wallet.proto.api.NanoWalletSetup.AcceptTosRequest accepttosrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletSetup.AcceptTosResponse)rpcCaller.call("b/setup/acceptTos", accepttosrequest, new com.google.wallet.proto.api.NanoWalletSetup.AcceptTosResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletSetup.SetupWalletResponse finishSetUp(com.google.wallet.proto.api.NanoWalletSetup.SetupWalletRequest setupwalletrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletSetup.SetupWalletResponse)rpcCaller.call("b/setup/finishSetUp", setupwalletrequest, new com.google.wallet.proto.api.NanoWalletSetup.SetupWalletResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationResponse getSetupConfiguration(com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationRequest getsetupconfigurationrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationResponse)rpcCaller.call("b/setup/getSetupConfiguration", getsetupconfigurationrequest, new com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletSetup.LoadUserInfoResponse loadUserInfo(com.google.wallet.proto.api.NanoWalletSetup.LoadUserInfoRequest loaduserinforequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletSetup.LoadUserInfoResponse)rpcCaller.call("b/setup/loadUserInfo", loaduserinforequest, new com.google.wallet.proto.api.NanoWalletSetup.LoadUserInfoResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletSetup.PreSetupWalletResponse preSetup(com.google.wallet.proto.api.NanoWalletSetup.PreSetupWalletRequest presetupwalletrequest)
        throws RpcException
    {
        return (com.google.wallet.proto.api.NanoWalletSetup.PreSetupWalletResponse)rpcCaller.call("b/setup/preSetUp", presetupwalletrequest, new com.google.wallet.proto.api.NanoWalletSetup.PreSetupWalletResponse());
    }
}
