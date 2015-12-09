// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.activity;

import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.base.activity:
//            WalletActivity

public final class _A1_
    implements MembersInjector
{

    private Binding activityActionExecutor;
    private Binding activityFilterPipeline;
    private Binding appStartTimeLogger;

    public final void attach(Linker linker)
    {
        activityFilterPipeline = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.filter.ActivityFilterPipeline>", com/google/android/apps/wallet/base/activity/WalletActivity, getClass().getClassLoader());
        activityActionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor", com/google/android/apps/wallet/base/activity/WalletActivity, getClass().getClassLoader());
        appStartTimeLogger = linker.requestBinding("com.google.android.apps.wallet.analytics.AppStartTimeLogger", com/google/android/apps/wallet/base/activity/WalletActivity, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(activityFilterPipeline);
        set1.add(activityActionExecutor);
        set1.add(appStartTimeLogger);
    }

    public final void injectMembers(WalletActivity walletactivity)
    {
        walletactivity.activityFilterPipeline = (Lazy)activityFilterPipeline.get();
        walletactivity.activityActionExecutor = (WalletActivityActionExecutor)activityActionExecutor.get();
        walletactivity.appStartTimeLogger = (AppStartTimeLogger)appStartTimeLogger.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WalletActivity)obj);
    }

    public _A1_()
    {
    }
}
