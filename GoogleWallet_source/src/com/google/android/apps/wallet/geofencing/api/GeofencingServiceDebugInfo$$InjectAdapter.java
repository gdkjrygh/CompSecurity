// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.util.location.SynchronizedLocationClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing.api:
//            GeofencingServiceDebugInfo

public final class  extends Binding
    implements Provider
{

    private Binding featureManager;
    private Binding synchronizedLocationClient;

    public final void attach(Linker linker)
    {
        synchronizedLocationClient = linker.requestBinding("com.google.android.apps.wallet.util.location.SynchronizedLocationClient", com/google/android/apps/wallet/geofencing/api/GeofencingServiceDebugInfo, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/geofencing/api/GeofencingServiceDebugInfo, getClass().getClassLoader());
    }

    public final GeofencingServiceDebugInfo get()
    {
        return new GeofencingServiceDebugInfo((SynchronizedLocationClient)synchronizedLocationClient.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(synchronizedLocationClient);
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo", "members/com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo", true, com/google/android/apps/wallet/geofencing/api/GeofencingServiceDebugInfo);
    }
}
