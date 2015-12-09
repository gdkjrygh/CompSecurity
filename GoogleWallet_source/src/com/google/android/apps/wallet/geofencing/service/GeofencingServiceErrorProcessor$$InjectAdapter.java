// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import android.app.AlarmManager;
import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing.service:
//            GeofencingServiceErrorProcessor

public final class  extends Binding
    implements Provider
{

    private Binding alarmManager;
    private Binding appControl;
    private Binding application;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/geofencing/service/GeofencingServiceErrorProcessor, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/geofencing/service/GeofencingServiceErrorProcessor, getClass().getClassLoader());
        alarmManager = linker.requestBinding("android.app.AlarmManager", com/google/android/apps/wallet/geofencing/service/GeofencingServiceErrorProcessor, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/geofencing/service/GeofencingServiceErrorProcessor, getClass().getClassLoader());
    }

    public final GeofencingServiceErrorProcessor get()
    {
        return new GeofencingServiceErrorProcessor((Application)application.get(), (AppControl)appControl.get(), (AlarmManager)alarmManager.get(), (SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(appControl);
        set.add(alarmManager);
        set.add(sharedPreferences);
    }

    public ()
    {
        super("com.google.android.apps.wallet.geofencing.service.GeofencingServiceErrorProcessor", "members/com.google.android.apps.wallet.geofencing.service.GeofencingServiceErrorProcessor", false, com/google/android/apps/wallet/geofencing/service/GeofencingServiceErrorProcessor);
    }
}
