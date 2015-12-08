// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import android.app.Application;
import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;
import com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing.service:
//            GeofencingServiceDebugMonitor

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding featureSet;
    private Binding geofencingServiceDebugInfo;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/geofencing/service/GeofencingServiceDebugMonitor, getClass().getClassLoader());
        featureSet = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureSet", com/google/android/apps/wallet/geofencing/service/GeofencingServiceDebugMonitor, getClass().getClassLoader());
        geofencingServiceDebugInfo = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo", com/google/android/apps/wallet/geofencing/service/GeofencingServiceDebugMonitor, getClass().getClassLoader());
    }

    public final GeofencingServiceDebugMonitor get()
    {
        return new GeofencingServiceDebugMonitor((Application)application.get(), (FeatureSet)featureSet.get(), (GeofencingServiceDebugInfo)geofencingServiceDebugInfo.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(featureSet);
        set.add(geofencingServiceDebugInfo);
    }

    public ()
    {
        super("com.google.android.apps.wallet.geofencing.service.GeofencingServiceDebugMonitor", "members/com.google.android.apps.wallet.geofencing.service.GeofencingServiceDebugMonitor", false, com/google/android/apps/wallet/geofencing/service/GeofencingServiceDebugMonitor);
    }
}
