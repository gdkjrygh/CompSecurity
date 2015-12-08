// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            AppStartTimeLogger

public final class  extends Binding
    implements Provider
{

    private Binding csi;
    private Binding globalPrefs;

    public final void attach(Linker linker)
    {
        csi = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.analytics.CsiManager>", com/google/android/apps/wallet/analytics/AppStartTimeLogger, getClass().getClassLoader());
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/analytics/AppStartTimeLogger, getClass().getClassLoader());
    }

    public final AppStartTimeLogger get()
    {
        return new AppStartTimeLogger((Lazy)csi.get(), (SharedPreferences)globalPrefs.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(csi);
        set.add(globalPrefs);
    }

    public ()
    {
        super("com.google.android.apps.wallet.analytics.AppStartTimeLogger", "members/com.google.android.apps.wallet.analytics.AppStartTimeLogger", true, com/google/android/apps/wallet/analytics/AppStartTimeLogger);
    }
}
