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
import me.lyft.android.common.DialogFlow;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding navigator;
    private Binding routeProvider;

    public void attach(Linker linker)
    {
        navigator = linker.requestBinding("me.lyft.android.utils.Navigator", me/lyft/android/ui/driver/RideOverviewView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/RideOverviewView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/RideOverviewView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/RideOverviewView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(navigator);
        set1.add(appFlow);
        set1.add(routeProvider);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideOverviewView)obj);
    }

    public void injectMembers(RideOverviewView rideoverviewview)
    {
        rideoverviewview.navigator = (Navigator)navigator.get();
        rideoverviewview.appFlow = (AppFlow)appFlow.get();
        rideoverviewview.routeProvider = (IDriverRideProvider)routeProvider.get();
        rideoverviewview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.RideOverviewView", false, me/lyft/android/ui/driver/RideOverviewView);
    }
}
