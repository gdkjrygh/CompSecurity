// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import android.accounts.AccountManager;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding accountManager;
    private Binding app;
    private Binding connectivityManager;
    private final InfrastructureServicesModule module;
    private Binding packageManager;
    private Binding telephonyManager;
    private Binding windowManager;

    public void attach(Linker linker)
    {
        app = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        windowManager = linker.requestBinding("android.view.WindowManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        telephonyManager = linker.requestBinding("android.telephony.TelephonyManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        connectivityManager = linker.requestBinding("android.net.ConnectivityManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        accountManager = linker.requestBinding("android.accounts.AccountManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        packageManager = linker.requestBinding("android.content.pm.PackageManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDevice get()
    {
        return module.provideDevice((LyftApplication)app.get(), (WindowManager)windowManager.get(), (TelephonyManager)telephonyManager.get(), (ConnectivityManager)connectivityManager.get(), (AccountManager)accountManager.get(), (PackageManager)packageManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(app);
        set.add(windowManager);
        set.add(telephonyManager);
        set.add(connectivityManager);
        set.add(accountManager);
        set.add(packageManager);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.device.IDevice", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideDevice");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
