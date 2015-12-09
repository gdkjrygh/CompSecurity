// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import com.google.android.apps.wallet.device.ClientCapabilitiesRequestProcessor;
import com.google.android.apps.wallet.device.ProfileTokenRequestProcessor;
import com.google.android.apps.wallet.log.DeviceContextFactory;
import com.google.android.apps.wallet.log.WalletContextFactory;
import com.google.android.apps.wallet.pin.PinTokenRequestProcessor;
import com.google.common.collect.ImmutableList;

public class RpcMetaDataProcessorModule
{

    public RpcMetaDataProcessorModule()
    {
    }

    static ImmutableList providesRequestMetaDataProcessors(DeviceContextFactory devicecontextfactory, WalletContextFactory walletcontextfactory, PinTokenRequestProcessor pintokenrequestprocessor, ClientCapabilitiesRequestProcessor clientcapabilitiesrequestprocessor, ProfileTokenRequestProcessor profiletokenrequestprocessor)
    {
        return ImmutableList.of(devicecontextfactory, walletcontextfactory, pintokenrequestprocessor, clientcapabilitiesrequestprocessor, profiletokenrequestprocessor);
    }
}
