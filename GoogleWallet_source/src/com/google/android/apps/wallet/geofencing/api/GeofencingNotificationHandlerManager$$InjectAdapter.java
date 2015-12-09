// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;

import com.google.android.apps.wallet.location.api.LocationSettings;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing.api:
//            GeofencingNotificationHandlerManager, GeofencingNotificationHandler, GeofencingServiceDebugInfo

public final class  extends Binding
    implements Provider
{

    private Binding geofencingServiceDebugInfo;
    private Binding locationSettings;
    private Binding savedWobNotificationHandler;
    private Binding userSettingsPublisher;

    public final void attach(Linker linker)
    {
        userSettingsPublisher = linker.requestBinding("com.google.android.apps.wallet.settings.UserSettingsPublisher", com/google/android/apps/wallet/geofencing/api/GeofencingNotificationHandlerManager, getClass().getClassLoader());
        savedWobNotificationHandler = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandler", com/google/android/apps/wallet/geofencing/api/GeofencingNotificationHandlerManager, getClass().getClassLoader());
        locationSettings = linker.requestBinding("com.google.android.apps.wallet.location.api.LocationSettings", com/google/android/apps/wallet/geofencing/api/GeofencingNotificationHandlerManager, getClass().getClassLoader());
        geofencingServiceDebugInfo = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo", com/google/android/apps/wallet/geofencing/api/GeofencingNotificationHandlerManager, getClass().getClassLoader());
    }

    public final GeofencingNotificationHandlerManager get()
    {
        return new GeofencingNotificationHandlerManager((UserSettingsPublisher)userSettingsPublisher.get(), (GeofencingNotificationHandler)savedWobNotificationHandler.get(), (LocationSettings)locationSettings.get(), (GeofencingServiceDebugInfo)geofencingServiceDebugInfo.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userSettingsPublisher);
        set.add(savedWobNotificationHandler);
        set.add(locationSettings);
        set.add(geofencingServiceDebugInfo);
    }

    public ()
    {
        super("com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandlerManager", "members/com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandlerManager", false, com/google/android/apps/wallet/geofencing/api/GeofencingNotificationHandlerManager);
    }
}
