// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.app.Application;
import android.telephony.TelephonyManager;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            DeviceContextFactory

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding gservicesWrapper;
    private Binding networkInformationProvider;
    private Binding telephonyManager;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/log/DeviceContextFactory, getClass().getClassLoader());
        telephonyManager = linker.requestBinding("android.telephony.TelephonyManager", com/google/android/apps/wallet/log/DeviceContextFactory, getClass().getClassLoader());
        networkInformationProvider = linker.requestBinding("com.google.android.apps.wallet.network.NetworkInformationProvider", com/google/android/apps/wallet/log/DeviceContextFactory, getClass().getClassLoader());
        gservicesWrapper = linker.requestBinding("com.google.android.apps.wallet.config.gservices.GservicesWrapper", com/google/android/apps/wallet/log/DeviceContextFactory, getClass().getClassLoader());
    }

    public final DeviceContextFactory get()
    {
        return new DeviceContextFactory((Application)application.get(), (TelephonyManager)telephonyManager.get(), (NetworkInformationProvider)networkInformationProvider.get(), (GservicesWrapper)gservicesWrapper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(telephonyManager);
        set.add(networkInformationProvider);
        set.add(gservicesWrapper);
    }

    public ()
    {
        super("com.google.android.apps.wallet.log.DeviceContextFactory", "members/com.google.android.apps.wallet.log.DeviceContextFactory", true, com/google/android/apps/wallet/log/DeviceContextFactory);
    }
}
