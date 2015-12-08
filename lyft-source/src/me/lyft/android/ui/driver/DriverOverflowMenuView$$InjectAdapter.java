// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverOverflowMenuView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding destinyService;
    private Binding destinySession;
    private Binding dialogFlow;
    private Binding routeProvider;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverOverflowMenuView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/DriverOverflowMenuView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/DriverOverflowMenuView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/DriverOverflowMenuView, getClass().getClassLoader());
        destinySession = linker.requestBinding("me.lyft.android.application.ride.IDestinySession", me/lyft/android/ui/driver/DriverOverflowMenuView, getClass().getClassLoader());
        destinyService = linker.requestBinding("me.lyft.android.application.ride.IDestinyService", me/lyft/android/ui/driver/DriverOverflowMenuView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(appFlow);
        set1.add(bus);
        set1.add(routeProvider);
        set1.add(destinySession);
        set1.add(destinyService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverOverflowMenuView)obj);
    }

    public void injectMembers(DriverOverflowMenuView driveroverflowmenuview)
    {
        driveroverflowmenuview.dialogFlow = (DialogFlow)dialogFlow.get();
        driveroverflowmenuview.appFlow = (AppFlow)appFlow.get();
        driveroverflowmenuview.bus = (MessageBus)bus.get();
        driveroverflowmenuview.routeProvider = (IDriverRideProvider)routeProvider.get();
        driveroverflowmenuview.destinySession = (IDestinySession)destinySession.get();
        driveroverflowmenuview.destinyService = (IDestinyService)destinyService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverOverflowMenuView", false, me/lyft/android/ui/driver/DriverOverflowMenuView);
    }
}
