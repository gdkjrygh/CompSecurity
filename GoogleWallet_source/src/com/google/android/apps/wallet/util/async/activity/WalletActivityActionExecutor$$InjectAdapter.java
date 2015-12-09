// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async.activity;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.async.activity:
//            WalletActivityActionExecutor

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding actionExecutor;

    public final void attach(Linker linker)
    {
        actionExecutor = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.util.async.ActionExecutor>", com/google/android/apps/wallet/util/async/activity/WalletActivityActionExecutor, getClass().getClassLoader());
    }

    public final WalletActivityActionExecutor get()
    {
        WalletActivityActionExecutor walletactivityactionexecutor = new WalletActivityActionExecutor();
        injectMembers(walletactivityactionexecutor);
        return walletactivityactionexecutor;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(actionExecutor);
    }

    public final void injectMembers(WalletActivityActionExecutor walletactivityactionexecutor)
    {
        walletactivityactionexecutor.actionExecutor = (Lazy)actionExecutor.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WalletActivityActionExecutor)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor", "members/com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor", true, com/google/android/apps/wallet/util/async/activity/WalletActivityActionExecutor);
    }
}
