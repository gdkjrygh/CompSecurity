// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IDriverStatsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.errorhandling.IDefaultErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.achievements:
//            DriverStatsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding defaultErrorHandler;
    private Binding driverStatsProvider;
    private Binding userSession;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/achievements/DriverStatsView, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/driver/achievements/DriverStatsView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/achievements/DriverStatsView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/driver/achievements/DriverStatsView, getClass().getClassLoader());
        driverStatsProvider = linker.requestBinding("me.lyft.android.application.driver.IDriverStatsProvider", me/lyft/android/ui/driver/achievements/DriverStatsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(defaultErrorHandler);
        set1.add(constantsProvider);
        set1.add(userSession);
        set1.add(driverStatsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverStatsView)obj);
    }

    public void injectMembers(DriverStatsView driverstatsview)
    {
        driverstatsview.appFlow = (AppFlow)appFlow.get();
        driverstatsview.defaultErrorHandler = (IDefaultErrorHandler)defaultErrorHandler.get();
        driverstatsview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        driverstatsview.userSession = (IUserSession)userSession.get();
        driverstatsview.driverStatsProvider = (IDriverStatsProvider)driverStatsProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.achievements.DriverStatsView", false, me/lyft/android/ui/driver/achievements/DriverStatsView);
    }
}
