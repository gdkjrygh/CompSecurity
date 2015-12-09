// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient;
import com.google.android.apps.wallet.rpc.RpcCaller;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyApiClient

public final class ent extends Binding
    implements Provider
{

    private Binding contextParameters;
    private Binding discoveryApiClient;
    private Binding rpcCaller;

    public final void attach(Linker linker)
    {
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/loyalty/LoyaltyApiClient, getClass().getClassLoader());
        contextParameters = linker.requestBinding("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", com/google/android/apps/wallet/loyalty/LoyaltyApiClient, getClass().getClassLoader());
        discoveryApiClient = linker.requestBinding("com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient", com/google/android/apps/wallet/loyalty/LoyaltyApiClient, getClass().getClassLoader());
    }

    public final LoyaltyApiClient get()
    {
        return new LoyaltyApiClient((RpcCaller)rpcCaller.get(), (com.google.wallet.proto.meters)contextParameters.get(), (LoyaltyDiscoveryApiClient)discoveryApiClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCaller);
        set.add(contextParameters);
        set.add(discoveryApiClient);
    }

    public ent()
    {
        super("com.google.android.apps.wallet.loyalty.LoyaltyApiClient", "members/com.google.android.apps.wallet.loyalty.LoyaltyApiClient", true, com/google/android/apps/wallet/loyalty/LoyaltyApiClient);
    }
}
