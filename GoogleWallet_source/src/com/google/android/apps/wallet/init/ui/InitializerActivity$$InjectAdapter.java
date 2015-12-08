// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init.ui;

import com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init.ui:
//            InitializerActivity

public final class cutor extends Binding
    implements MembersInjector, Provider
{

    private Binding activityActionExecutor;
    private Binding appStartTimeLogger;
    private Binding taskManager;

    public final void attach(Linker linker)
    {
        taskManager = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.init.InitializerTaskManager>", com/google/android/apps/wallet/init/ui/InitializerActivity, getClass().getClassLoader());
        activityActionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor", com/google/android/apps/wallet/init/ui/InitializerActivity, getClass().getClassLoader());
        appStartTimeLogger = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.analytics.AppStartTimeLogger>", com/google/android/apps/wallet/init/ui/InitializerActivity, getClass().getClassLoader());
    }

    public final InitializerActivity get()
    {
        InitializerActivity initializeractivity = new InitializerActivity();
        injectMembers(initializeractivity);
        return initializeractivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(taskManager);
        set1.add(activityActionExecutor);
        set1.add(appStartTimeLogger);
    }

    public final void injectMembers(InitializerActivity initializeractivity)
    {
        initializeractivity.taskManager = (Lazy)taskManager.get();
        initializeractivity.activityActionExecutor = (WalletActivityActionExecutor)activityActionExecutor.get();
        initializeractivity.appStartTimeLogger = (Lazy)appStartTimeLogger.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((InitializerActivity)obj);
    }

    public cutor()
    {
        super("com.google.android.apps.wallet.init.ui.InitializerActivity", "members/com.google.android.apps.wallet.init.ui.InitializerActivity", false, com/google/android/apps/wallet/init/ui/InitializerActivity);
    }
}
