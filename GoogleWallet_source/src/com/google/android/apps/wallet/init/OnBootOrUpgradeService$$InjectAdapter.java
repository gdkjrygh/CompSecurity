// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            OnBootOrUpgradeService, InitializerTaskManager

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding initializerTaskManager;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/init/OnBootOrUpgradeService, getClass().getClassLoader());
        initializerTaskManager = linker.requestBinding("com.google.android.apps.wallet.init.InitializerTaskManager", com/google/android/apps/wallet/init/OnBootOrUpgradeService, getClass().getClassLoader());
    }

    public final OnBootOrUpgradeService get()
    {
        OnBootOrUpgradeService onbootorupgradeservice = new OnBootOrUpgradeService();
        injectMembers(onbootorupgradeservice);
        return onbootorupgradeservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(sharedPreferences);
        set1.add(initializerTaskManager);
    }

    public final void injectMembers(OnBootOrUpgradeService onbootorupgradeservice)
    {
        onbootorupgradeservice.sharedPreferences = (SharedPreferences)sharedPreferences.get();
        onbootorupgradeservice.initializerTaskManager = (InitializerTaskManager)initializerTaskManager.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OnBootOrUpgradeService)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.OnBootOrUpgradeService", "members/com.google.android.apps.wallet.init.OnBootOrUpgradeService", false, com/google/android/apps/wallet/init/OnBootOrUpgradeService);
    }
}
