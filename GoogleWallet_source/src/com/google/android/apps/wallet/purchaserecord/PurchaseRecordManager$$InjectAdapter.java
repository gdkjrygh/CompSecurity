// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.rpc.RpcCaller;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordManager

public final class  extends Binding
    implements Provider
{

    private Binding contextParameters;
    private Binding featureManager;
    private Binding rpcCaller;

    public final void attach(Linker linker)
    {
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/purchaserecord/PurchaseRecordManager, getClass().getClassLoader());
        contextParameters = linker.requestBinding("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", com/google/android/apps/wallet/purchaserecord/PurchaseRecordManager, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/purchaserecord/PurchaseRecordManager, getClass().getClassLoader());
    }

    public final PurchaseRecordManager get()
    {
        return new PurchaseRecordManager((RpcCaller)rpcCaller.get(), (com.google.wallet.proto.s)contextParameters.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCaller);
        set.add(contextParameters);
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager", "members/com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager", false, com/google/android/apps/wallet/purchaserecord/PurchaseRecordManager);
    }
}
