// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.dogfood;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.dogfood:
//            ConfidentialFilter

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding featureManager;
    private Binding sharedPreferences;
    private Binding versionName;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/dogfood/ConfidentialFilter, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/dogfood/ConfidentialFilter, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/dogfood/ConfidentialFilter, getClass().getClassLoader());
        versionName = linker.requestBinding("@com.google.android.apps.wallet.util.version.BindingAnnotations$VersionName()/java.lang.String", com/google/android/apps/wallet/dogfood/ConfidentialFilter, getClass().getClassLoader());
    }

    public final ConfidentialFilter get()
    {
        return new ConfidentialFilter((FragmentActivity)activity.get(), (FeatureManager)featureManager.get(), (SharedPreferences)sharedPreferences.get(), (String)versionName.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(featureManager);
        set.add(sharedPreferences);
        set.add(versionName);
    }

    public ()
    {
        super("com.google.android.apps.wallet.dogfood.ConfidentialFilter", "members/com.google.android.apps.wallet.dogfood.ConfidentialFilter", false, com/google/android/apps/wallet/dogfood/ConfidentialFilter);
    }
}
