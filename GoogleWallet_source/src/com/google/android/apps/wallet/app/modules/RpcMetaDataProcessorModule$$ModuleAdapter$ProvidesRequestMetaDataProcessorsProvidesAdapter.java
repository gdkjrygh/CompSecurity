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
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            RpcMetaDataProcessorModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding clientCapabilitiesRequestProcessor;
    private Binding deviceContextFactory;
    private final RpcMetaDataProcessorModule module;
    private Binding pinTokenRequestProcessor;
    private Binding profileTokenRequestProcessor;
    private Binding walletContextFactory;

    public final void attach(Linker linker)
    {
        deviceContextFactory = linker.requestBinding("com.google.android.apps.wallet.log.DeviceContextFactory", com/google/android/apps/wallet/app/modules/RpcMetaDataProcessorModule, getClass().getClassLoader());
        walletContextFactory = linker.requestBinding("com.google.android.apps.wallet.log.WalletContextFactory", com/google/android/apps/wallet/app/modules/RpcMetaDataProcessorModule, getClass().getClassLoader());
        pinTokenRequestProcessor = linker.requestBinding("com.google.android.apps.wallet.pin.PinTokenRequestProcessor", com/google/android/apps/wallet/app/modules/RpcMetaDataProcessorModule, getClass().getClassLoader());
        clientCapabilitiesRequestProcessor = linker.requestBinding("com.google.android.apps.wallet.device.ClientCapabilitiesRequestProcessor", com/google/android/apps/wallet/app/modules/RpcMetaDataProcessorModule, getClass().getClassLoader());
        profileTokenRequestProcessor = linker.requestBinding("com.google.android.apps.wallet.device.ProfileTokenRequestProcessor", com/google/android/apps/wallet/app/modules/RpcMetaDataProcessorModule, getClass().getClassLoader());
    }

    public final ImmutableList get()
    {
        RpcMetaDataProcessorModule rpcmetadataprocessormodule = module;
        return RpcMetaDataProcessorModule.providesRequestMetaDataProcessors((DeviceContextFactory)deviceContextFactory.get(), (WalletContextFactory)walletContextFactory.get(), (PinTokenRequestProcessor)pinTokenRequestProcessor.get(), (ClientCapabilitiesRequestProcessor)clientCapabilitiesRequestProcessor.get(), (ProfileTokenRequestProcessor)profileTokenRequestProcessor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(deviceContextFactory);
        set.add(walletContextFactory);
        set.add(pinTokenRequestProcessor);
        set.add(clientCapabilitiesRequestProcessor);
        set.add(profileTokenRequestProcessor);
    }

    public (RpcMetaDataProcessorModule rpcmetadataprocessormodule)
    {
        super("com.google.common.collect.ImmutableList<com.google.android.apps.wallet.rpc.RpcRequestMetadataProcessor>", false, "com.google.android.apps.wallet.app.modules.RpcMetaDataProcessorModule", "providesRequestMetaDataProcessors");
        module = rpcmetadataprocessormodule;
        setLibrary(true);
    }
}
