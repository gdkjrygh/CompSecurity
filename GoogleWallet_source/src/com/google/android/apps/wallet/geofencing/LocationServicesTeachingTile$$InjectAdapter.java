// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.location.api.LocationSettings;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing:
//            LocationServicesTeachingTile

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding featureManager;
    private Binding locationSettings;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/geofencing/LocationServicesTeachingTile, getClass().getClassLoader());
        locationSettings = linker.requestBinding("com.google.android.apps.wallet.location.api.LocationSettings", com/google/android/apps/wallet/geofencing/LocationServicesTeachingTile, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/geofencing/LocationServicesTeachingTile, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/geofencing/LocationServicesTeachingTile, getClass().getClassLoader());
    }

    public final LocationServicesTeachingTile get()
    {
        return new LocationServicesTeachingTile((Activity)activity.get(), (LocationSettings)locationSettings.get(), (FeatureManager)featureManager.get(), (SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(locationSettings);
        set.add(featureManager);
        set.add(sharedPreferences);
    }

    public ()
    {
        super("com.google.android.apps.wallet.geofencing.LocationServicesTeachingTile", "members/com.google.android.apps.wallet.geofencing.LocationServicesTeachingTile", false, com/google/android/apps/wallet/geofencing/LocationServicesTeachingTile);
    }
}
