// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;
import com.google.android.apps.wallet.rpc.RpcCaller;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            WobsOcrClientImpl

public final class  extends Binding
    implements Provider
{

    private Binding featureSet;
    private Binding rpcCaller;

    public final void attach(Linker linker)
    {
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/wobs/add/WobsOcrClientImpl, getClass().getClassLoader());
        featureSet = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureSet", com/google/android/apps/wallet/wobs/add/WobsOcrClientImpl, getClass().getClassLoader());
    }

    public final WobsOcrClientImpl get()
    {
        return new WobsOcrClientImpl((RpcCaller)rpcCaller.get(), (FeatureSet)featureSet.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCaller);
        set.add(featureSet);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.add.WobsOcrClientImpl", "members/com.google.android.apps.wallet.wobs.add.WobsOcrClientImpl", false, com/google/android/apps/wallet/wobs/add/WobsOcrClientImpl);
    }
}
