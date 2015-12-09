// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            RpcModule, RpcCallerImpl, RpcCaller

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final RpcModule module;
    private Binding rpcCallerImpl;

    public final void attach(Linker linker)
    {
        rpcCallerImpl = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCallerImpl", com/google/android/apps/wallet/rpc/RpcModule, getClass().getClassLoader());
    }

    public final RpcCaller get()
    {
        RpcModule rpcmodule = module;
        return RpcModule.getRpcCaller((RpcCallerImpl)rpcCallerImpl.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCallerImpl);
    }

    public (RpcModule rpcmodule)
    {
        super("com.google.android.apps.wallet.rpc.RpcCaller", true, "com.google.android.apps.wallet.rpc.RpcModule", "getRpcCaller");
        module = rpcmodule;
        setLibrary(true);
    }
}
