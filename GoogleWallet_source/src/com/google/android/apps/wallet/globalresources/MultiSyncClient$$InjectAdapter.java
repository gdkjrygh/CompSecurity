// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            MultiSyncClient

public final class  extends Binding
    implements Provider
{

    private Binding rpcCaller;

    public final void attach(Linker linker)
    {
        rpcCaller = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.rpc.RpcCaller>", com/google/android/apps/wallet/globalresources/MultiSyncClient, getClass().getClassLoader());
    }

    public final MultiSyncClient get()
    {
        return new MultiSyncClient((Provider)rpcCaller.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCaller);
    }

    public ()
    {
        super("com.google.android.apps.wallet.globalresources.MultiSyncClient", "members/com.google.android.apps.wallet.globalresources.MultiSyncClient", false, com/google/android/apps/wallet/globalresources/MultiSyncClient);
    }
}
