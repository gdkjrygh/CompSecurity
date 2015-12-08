// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.utils.GooglePlayServicesWrapper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmManager, GcmStorage

public final class r extends b
    implements a, Provider
{

    private b featureFlags;
    private b gcmStorage;
    private b googlePlayServices;
    private b serviceInitiator;
    private b supertype;

    public final void attach(l l1)
    {
        gcmStorage = l1.a("com.soundcloud.android.gcm.GcmStorage", com/soundcloud/android/gcm/GcmManager, getClass().getClassLoader());
        googlePlayServices = l1.a("com.soundcloud.android.utils.GooglePlayServicesWrapper", com/soundcloud/android/gcm/GcmManager, getClass().getClassLoader());
        serviceInitiator = l1.a("com.soundcloud.android.ServiceInitiator", com/soundcloud/android/gcm/GcmManager, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/gcm/GcmManager, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/gcm/GcmManager, getClass().getClassLoader(), false);
    }

    public final GcmManager get()
    {
        GcmManager gcmmanager = new GcmManager((GcmStorage)gcmStorage.get(), (GooglePlayServicesWrapper)googlePlayServices.get(), (ServiceInitiator)serviceInitiator.get(), (FeatureFlags)featureFlags.get());
        injectMembers(gcmmanager);
        return gcmmanager;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(gcmStorage);
        set.add(googlePlayServices);
        set.add(serviceInitiator);
        set.add(featureFlags);
        set1.add(supertype);
    }

    public final void injectMembers(GcmManager gcmmanager)
    {
        supertype.injectMembers(gcmmanager);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((GcmManager)obj);
    }

    public r()
    {
        super("com.soundcloud.android.gcm.GcmManager", "members/com.soundcloud.android.gcm.GcmManager", false, com/soundcloud/android/gcm/GcmManager);
    }
}
