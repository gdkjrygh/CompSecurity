// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.location;

import android.app.Application;
import android.location.LocationManager;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.location.api.LocationSettings;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.location:
//            LocationFetcher, LocationHelper

public final class Q extends Binding
    implements Provider
{

    private Binding application;
    private Binding featureManager;
    private Binding locationHelper;
    private Binding locationManager;
    private Binding locationSettings;
    private Binding synchronizedLocationClient;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/util/location/LocationFetcher, getClass().getClassLoader());
        locationManager = linker.requestBinding("android.location.LocationManager", com/google/android/apps/wallet/util/location/LocationFetcher, getClass().getClassLoader());
        locationHelper = linker.requestBinding("com.google.android.apps.wallet.util.location.LocationHelper", com/google/android/apps/wallet/util/location/LocationFetcher, getClass().getClassLoader());
        locationSettings = linker.requestBinding("com.google.android.apps.wallet.location.api.LocationSettings", com/google/android/apps/wallet/util/location/LocationFetcher, getClass().getClassLoader());
        synchronizedLocationClient = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.util.location.SynchronizedLocationClient>", com/google/android/apps/wallet/util/location/LocationFetcher, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/util/location/LocationFetcher, getClass().getClassLoader());
    }

    public final LocationFetcher get()
    {
        return new LocationFetcher((Application)application.get(), (LocationManager)locationManager.get(), (LocationHelper)locationHelper.get(), (LocationSettings)locationSettings.get(), (Provider)synchronizedLocationClient.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(locationManager);
        set.add(locationHelper);
        set.add(locationSettings);
        set.add(synchronizedLocationClient);
        set.add(featureManager);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.util.location.LocationFetcher", "members/com.google.android.apps.wallet.util.location.LocationFetcher", false, com/google/android/apps/wallet/util/location/LocationFetcher);
    }
}
