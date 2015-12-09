// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.rpc.RpcCaller;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycClient

public final class  extends Binding
    implements Provider
{

    private Binding rpcCaller;

    public final void attach(Linker linker)
    {
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/kyc/api/KycClient, getClass().getClassLoader());
    }

    public final KycClient get()
    {
        return new KycClient((RpcCaller)rpcCaller.get());
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
        super("com.google.android.apps.wallet.kyc.api.KycClient", "members/com.google.android.apps.wallet.kyc.api.KycClient", true, com/google/android/apps/wallet/kyc/api/KycClient);
    }
}
