// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.device.DeviceClient;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            GcmRegistrar

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding deviceClient;
    private Binding gcm;
    private Binding sharedPreferences;
    private Binding versionName;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/notifications/GcmRegistrar, getClass().getClassLoader());
        gcm = linker.requestBinding("com.google.android.gms.gcm.GoogleCloudMessaging", com/google/android/apps/wallet/notifications/GcmRegistrar, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/notifications/GcmRegistrar, getClass().getClassLoader());
        deviceClient = linker.requestBinding("com.google.android.apps.wallet.device.DeviceClient", com/google/android/apps/wallet/notifications/GcmRegistrar, getClass().getClassLoader());
        versionName = linker.requestBinding("@com.google.android.apps.wallet.util.version.BindingAnnotations$VersionName()/java.lang.String", com/google/android/apps/wallet/notifications/GcmRegistrar, getClass().getClassLoader());
    }

    public final GcmRegistrar get()
    {
        return new GcmRegistrar((Application)application.get(), (GoogleCloudMessaging)gcm.get(), (SharedPreferences)sharedPreferences.get(), (DeviceClient)deviceClient.get(), (String)versionName.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(gcm);
        set.add(sharedPreferences);
        set.add(deviceClient);
        set.add(versionName);
    }

    public ()
    {
        super("com.google.android.apps.wallet.notifications.GcmRegistrar", "members/com.google.android.apps.wallet.notifications.GcmRegistrar", false, com/google/android/apps/wallet/notifications/GcmRegistrar);
    }
}
