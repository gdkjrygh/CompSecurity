// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.SharedPreferences;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            GeofencingSettingsChecker

public final class Y extends Binding
    implements Provider
{

    private Binding googleLocationSettingHelper;
    private Binding locationManager;
    private Binding sharedPreferences;
    private Binding wifiManager;

    public final void attach(Linker linker)
    {
        googleLocationSettingHelper = linker.requestBinding("com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper", com/google/android/apps/wallet/settings/ui/GeofencingSettingsChecker, getClass().getClassLoader());
        locationManager = linker.requestBinding("android.location.LocationManager", com/google/android/apps/wallet/settings/ui/GeofencingSettingsChecker, getClass().getClassLoader());
        wifiManager = linker.requestBinding("android.net.wifi.WifiManager", com/google/android/apps/wallet/settings/ui/GeofencingSettingsChecker, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/settings/ui/GeofencingSettingsChecker, getClass().getClassLoader());
    }

    public final GeofencingSettingsChecker get()
    {
        return new GeofencingSettingsChecker((GoogleLocationSettingHelper)googleLocationSettingHelper.get(), (LocationManager)locationManager.get(), (WifiManager)wifiManager.get(), (SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(googleLocationSettingHelper);
        set.add(locationManager);
        set.add(wifiManager);
        set.add(sharedPreferences);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.settings.ui.GeofencingSettingsChecker", "members/com.google.android.apps.wallet.settings.ui.GeofencingSettingsChecker", true, com/google/android/apps/wallet/settings/ui/GeofencingSettingsChecker);
    }
}
