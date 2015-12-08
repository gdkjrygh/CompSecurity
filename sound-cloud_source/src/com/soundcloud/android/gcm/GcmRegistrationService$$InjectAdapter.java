// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmRegistrationService, GcmStorage, InstanceIdWrapper

public final class  extends b
    implements a, Provider
{

    private b appboyWrapperProvider;
    private b featureFlags;
    private b gcmStorage;
    private b instanceId;

    public final void attach(l l1)
    {
        gcmStorage = l1.a("com.soundcloud.android.gcm.GcmStorage", com/soundcloud/android/gcm/GcmRegistrationService, getClass().getClassLoader());
        instanceId = l1.a("com.soundcloud.android.gcm.InstanceIdWrapper", com/soundcloud/android/gcm/GcmRegistrationService, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/gcm/GcmRegistrationService, getClass().getClassLoader());
        appboyWrapperProvider = l1.a("javax.inject.Provider<com.soundcloud.android.analytics.appboy.AppboyWrapper>", com/soundcloud/android/gcm/GcmRegistrationService, getClass().getClassLoader());
    }

    public final GcmRegistrationService get()
    {
        GcmRegistrationService gcmregistrationservice = new GcmRegistrationService();
        injectMembers(gcmregistrationservice);
        return gcmregistrationservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(gcmStorage);
        set1.add(instanceId);
        set1.add(featureFlags);
        set1.add(appboyWrapperProvider);
    }

    public final void injectMembers(GcmRegistrationService gcmregistrationservice)
    {
        gcmregistrationservice.gcmStorage = (GcmStorage)gcmStorage.get();
        gcmregistrationservice.instanceId = (InstanceIdWrapper)instanceId.get();
        gcmregistrationservice.featureFlags = (FeatureFlags)featureFlags.get();
        gcmregistrationservice.appboyWrapperProvider = (Provider)appboyWrapperProvider.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((GcmRegistrationService)obj);
    }

    public ()
    {
        super("com.soundcloud.android.gcm.GcmRegistrationService", "members/com.soundcloud.android.gcm.GcmRegistrationService", false, com/soundcloud/android/gcm/GcmRegistrationService);
    }
}
