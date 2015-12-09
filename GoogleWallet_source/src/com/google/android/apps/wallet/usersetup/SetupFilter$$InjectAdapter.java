// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SetupFilter

public final class I extends Binding
    implements Provider
{

    private Binding activity;
    private Binding featureManager;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/usersetup/SetupFilter, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/usersetup/SetupFilter, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/usersetup/SetupFilter, getClass().getClassLoader());
    }

    public final SetupFilter get()
    {
        return new SetupFilter((Activity)activity.get(), (SharedPreferences)sharedPreferences.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(sharedPreferences);
        set.add(featureManager);
    }

    public I()
    {
        super("com.google.android.apps.wallet.usersetup.SetupFilter", "members/com.google.android.apps.wallet.usersetup.SetupFilter", false, com/google/android/apps/wallet/usersetup/SetupFilter);
    }
}
