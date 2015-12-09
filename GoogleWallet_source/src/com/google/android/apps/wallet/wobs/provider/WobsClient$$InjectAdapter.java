// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            WobsClient

public final class  extends Binding
    implements Provider
{

    private Binding appControl;
    private Binding contextParameters;
    private Binding featureManager;
    private Binding rpcCaller;
    private Binding userEventLogger;

    public final void attach(Linker linker)
    {
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/wobs/provider/WobsClient, getClass().getClassLoader());
        contextParameters = linker.requestBinding("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", com/google/android/apps/wallet/wobs/provider/WobsClient, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/wobs/provider/WobsClient, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/wobs/provider/WobsClient, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/wobs/provider/WobsClient, getClass().getClassLoader());
    }

    public final WobsClient get()
    {
        return new WobsClient((RpcCaller)rpcCaller.get(), (com.google.wallet.proto.xtParameters)contextParameters.get(), (AppControl)appControl.get(), (FeatureManager)featureManager.get(), (UserEventLogger)userEventLogger.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCaller);
        set.add(contextParameters);
        set.add(appControl);
        set.add(featureManager);
        set.add(userEventLogger);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.provider.WobsClient", "members/com.google.android.apps.wallet.wobs.provider.WobsClient", false, com/google/android/apps/wallet/wobs/provider/WobsClient);
    }
}
