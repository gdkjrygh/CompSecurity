// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.location.LocationFetcher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletManager, MyWalletStorageManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding contextParameters;
    private Binding eventBus;
    private Binding locationFetcher;
    private Binding networkConnectivityReturnChecker;
    private Binding rpcCaller;
    private Binding storageManager;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/mywallet/MyWalletManager, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/mywallet/MyWalletManager, getClass().getClassLoader());
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/mywallet/MyWalletManager, getClass().getClassLoader());
        storageManager = linker.requestBinding("com.google.android.apps.wallet.mywallet.MyWalletStorageManager", com/google/android/apps/wallet/mywallet/MyWalletManager, getClass().getClassLoader());
        contextParameters = linker.requestBinding("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", com/google/android/apps/wallet/mywallet/MyWalletManager, getClass().getClassLoader());
        locationFetcher = linker.requestBinding("com.google.android.apps.wallet.util.location.LocationFetcher", com/google/android/apps/wallet/mywallet/MyWalletManager, getClass().getClassLoader());
        networkConnectivityReturnChecker = linker.requestBinding("com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker", com/google/android/apps/wallet/mywallet/MyWalletManager, getClass().getClassLoader());
    }

    public final MyWalletManager get()
    {
        return new MyWalletManager((EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (RpcCaller)rpcCaller.get(), (MyWalletStorageManager)storageManager.get(), (com.google.wallet.proto.ameters)contextParameters.get(), (LocationFetcher)locationFetcher.get(), (NetworkConnectivityReturnChecker)networkConnectivityReturnChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(rpcCaller);
        set.add(storageManager);
        set.add(contextParameters);
        set.add(locationFetcher);
        set.add(networkConnectivityReturnChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.mywallet.MyWalletManager", "members/com.google.android.apps.wallet.mywallet.MyWalletManager", false, com/google/android/apps/wallet/mywallet/MyWalletManager);
    }
}
