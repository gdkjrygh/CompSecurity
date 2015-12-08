// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.globalresources.GlobalResourceManager;
import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            LoadGlobalResourcesTask

public final class  extends Binding
    implements Provider
{

    private Binding globalResourceManager;
    private Binding globalResourcesSyncManager;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/init/LoadGlobalResourcesTask, getClass().getClassLoader());
        globalResourceManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.GlobalResourceManager", com/google/android/apps/wallet/init/LoadGlobalResourcesTask, getClass().getClassLoader());
        globalResourcesSyncManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager", com/google/android/apps/wallet/init/LoadGlobalResourcesTask, getClass().getClassLoader());
    }

    public final LoadGlobalResourcesTask get()
    {
        return new LoadGlobalResourcesTask((SharedPreferences)userPrefs.get(), (GlobalResourceManager)globalResourceManager.get(), (GlobalResourcesSyncManager)globalResourcesSyncManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userPrefs);
        set.add(globalResourceManager);
        set.add(globalResourcesSyncManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.LoadGlobalResourcesTask", "members/com.google.android.apps.wallet.init.LoadGlobalResourcesTask", false, com/google/android/apps/wallet/init/LoadGlobalResourcesTask);
    }
}
