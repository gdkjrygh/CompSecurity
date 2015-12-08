// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing.api:
//            GeofencingClient, GeofencingNotificationHandlerManager

public final class ager extends Binding
    implements Provider
{

    private Binding application;
    private Binding featureManager;
    private Binding handlerManager;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/geofencing/api/GeofencingClient, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/geofencing/api/GeofencingClient, getClass().getClassLoader());
        handlerManager = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandlerManager", com/google/android/apps/wallet/geofencing/api/GeofencingClient, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/geofencing/api/GeofencingClient, getClass().getClassLoader());
    }

    public final GeofencingClient get()
    {
        return new GeofencingClient((Application)application.get(), (SharedPreferences)sharedPreferences.get(), (GeofencingNotificationHandlerManager)handlerManager.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(sharedPreferences);
        set.add(handlerManager);
        set.add(featureManager);
    }

    public ager()
    {
        super("com.google.android.apps.wallet.geofencing.api.GeofencingClient", "members/com.google.android.apps.wallet.geofencing.api.GeofencingClient", false, com/google/android/apps/wallet/geofencing/api/GeofencingClient);
    }
}
