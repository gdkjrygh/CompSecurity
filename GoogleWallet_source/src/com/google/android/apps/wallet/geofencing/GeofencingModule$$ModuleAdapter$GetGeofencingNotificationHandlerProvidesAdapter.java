// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing;

import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandler;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing:
//            GeofencingModule, GeofencingNotificationSavedWobHandler

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final GeofencingModule module;
    private Binding savedOfferProximityAlertHandler;

    public final void attach(Linker linker)
    {
        savedOfferProximityAlertHandler = linker.requestBinding("com.google.android.apps.wallet.geofencing.GeofencingNotificationSavedWobHandler", com/google/android/apps/wallet/geofencing/GeofencingModule, getClass().getClassLoader());
    }

    public final GeofencingNotificationHandler get()
    {
        GeofencingModule geofencingmodule = module;
        return GeofencingModule.getGeofencingNotificationHandler((GeofencingNotificationSavedWobHandler)savedOfferProximityAlertHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(savedOfferProximityAlertHandler);
    }

    public (GeofencingModule geofencingmodule)
    {
        super("com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandler", false, "com.google.android.apps.wallet.geofencing.GeofencingModule", "getGeofencingNotificationHandler");
        module = geofencingmodule;
        setLibrary(true);
    }
}
