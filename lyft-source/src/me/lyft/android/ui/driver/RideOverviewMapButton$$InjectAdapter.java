// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewMapButton

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding routeProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/RideOverviewMapButton, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/RideOverviewMapButton, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(routeProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideOverviewMapButton)obj);
    }

    public void injectMembers(RideOverviewMapButton rideoverviewmapbutton)
    {
        rideoverviewmapbutton.appFlow = (AppFlow)appFlow.get();
        rideoverviewmapbutton.routeProvider = (IDriverRideProvider)routeProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.RideOverviewMapButton", false, me/lyft/android/ui/driver/RideOverviewMapButton);
    }
}
