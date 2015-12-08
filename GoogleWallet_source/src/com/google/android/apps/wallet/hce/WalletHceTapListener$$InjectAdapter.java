// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.app.Application;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.log.WalletEventLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            WalletHceTapListener

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;
    private Binding application;
    private Binding eventLogger;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/hce/WalletHceTapListener, getClass().getClassLoader());
        eventLogger = linker.requestBinding("com.google.android.apps.wallet.log.WalletEventLogger", com/google/android/apps/wallet/hce/WalletHceTapListener, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/hce/WalletHceTapListener, getClass().getClassLoader());
    }

    public final WalletHceTapListener get()
    {
        return new WalletHceTapListener((Application)application.get(), (WalletEventLogger)eventLogger.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(eventLogger);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.WalletHceTapListener", "members/com.google.android.apps.wallet.hce.WalletHceTapListener", false, com/google/android/apps/wallet/hce/WalletHceTapListener);
    }
}
