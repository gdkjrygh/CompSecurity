// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.device.DeviceInfoManager;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            HceTapProcessorService

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding analyticsUtil;
    private Binding deviceInfoManager;
    private Binding system;
    private Binding userEventLogger;

    public final void attach(Linker linker)
    {
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/hce/HceTapProcessorService, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/hce/HceTapProcessorService, getClass().getClassLoader());
        deviceInfoManager = linker.requestBinding("com.google.android.apps.wallet.device.DeviceInfoManager", com/google/android/apps/wallet/hce/HceTapProcessorService, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/hce/HceTapProcessorService, getClass().getClassLoader());
    }

    public final HceTapProcessorService get()
    {
        HceTapProcessorService hcetapprocessorservice = new HceTapProcessorService();
        injectMembers(hcetapprocessorservice);
        return hcetapprocessorservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(system);
        set1.add(userEventLogger);
        set1.add(deviceInfoManager);
        set1.add(analyticsUtil);
    }

    public final void injectMembers(HceTapProcessorService hcetapprocessorservice)
    {
        hcetapprocessorservice.system = (System)system.get();
        hcetapprocessorservice.userEventLogger = (UserEventLogger)userEventLogger.get();
        hcetapprocessorservice.deviceInfoManager = (DeviceInfoManager)deviceInfoManager.get();
        hcetapprocessorservice.analyticsUtil = (AnalyticsUtil)analyticsUtil.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((HceTapProcessorService)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.HceTapProcessorService", "members/com.google.android.apps.wallet.hce.HceTapProcessorService", false, com/google/android/apps/wallet/hce/HceTapProcessorService);
    }
}
