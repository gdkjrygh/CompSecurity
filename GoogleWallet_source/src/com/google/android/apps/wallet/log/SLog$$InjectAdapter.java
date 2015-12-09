// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            SLog, LogMessageBouncer, WalletEventLogger

public final class atureManager extends Binding
    implements Provider
{

    private Binding bouncer;
    private Binding featureManager;
    private Binding walletEventLogger;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/log/SLog, getClass().getClassLoader());
        bouncer = linker.requestBinding("com.google.android.apps.wallet.log.LogMessageBouncer", com/google/android/apps/wallet/log/SLog, getClass().getClassLoader());
        walletEventLogger = linker.requestBinding("com.google.android.apps.wallet.log.WalletEventLogger", com/google/android/apps/wallet/log/SLog, getClass().getClassLoader());
    }

    public final SLog get()
    {
        return new SLog((FeatureManager)featureManager.get(), (LogMessageBouncer)bouncer.get(), (WalletEventLogger)walletEventLogger.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureManager);
        set.add(bouncer);
        set.add(walletEventLogger);
    }

    public atureManager()
    {
        super("com.google.android.apps.wallet.log.SLog", "members/com.google.android.apps.wallet.log.SLog", true, com/google/android/apps/wallet/log/SLog);
    }
}
