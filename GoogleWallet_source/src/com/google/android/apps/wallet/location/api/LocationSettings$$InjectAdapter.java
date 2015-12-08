// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.api;

import android.location.LocationManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.location.api:
//            LocationSettings, GoogleLocationSettingHelper

public final class Q extends Binding
    implements Provider
{

    private Binding googleLocationSettingHelper;
    private Binding locationManager;

    public final void attach(Linker linker)
    {
        googleLocationSettingHelper = linker.requestBinding("com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper", com/google/android/apps/wallet/location/api/LocationSettings, getClass().getClassLoader());
        locationManager = linker.requestBinding("android.location.LocationManager", com/google/android/apps/wallet/location/api/LocationSettings, getClass().getClassLoader());
    }

    public final LocationSettings get()
    {
        return new LocationSettings((GoogleLocationSettingHelper)googleLocationSettingHelper.get(), (LocationManager)locationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(googleLocationSettingHelper);
        set.add(locationManager);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.location.api.LocationSettings", "members/com.google.android.apps.wallet.location.api.LocationSettings", false, com/google/android/apps/wallet/location/api/LocationSettings);
    }
}
