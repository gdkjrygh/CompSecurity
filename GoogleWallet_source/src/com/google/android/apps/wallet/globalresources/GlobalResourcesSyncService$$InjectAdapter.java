// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            GlobalResourcesSyncService, GlobalResourcesSyncManager

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding globalResourcesSyncManager;

    public final void attach(Linker linker)
    {
        globalResourcesSyncManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncService, getClass().getClassLoader());
    }

    public final GlobalResourcesSyncService get()
    {
        GlobalResourcesSyncService globalresourcessyncservice = new GlobalResourcesSyncService();
        injectMembers(globalresourcessyncservice);
        return globalresourcessyncservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(globalResourcesSyncManager);
    }

    public final void injectMembers(GlobalResourcesSyncService globalresourcessyncservice)
    {
        globalresourcessyncservice.globalResourcesSyncManager = (GlobalResourcesSyncManager)globalResourcesSyncManager.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((GlobalResourcesSyncService)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.globalresources.GlobalResourcesSyncService", "members/com.google.android.apps.wallet.globalresources.GlobalResourcesSyncService", false, com/google/android/apps/wallet/globalresources/GlobalResourcesSyncService);
    }
}
