// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.facades.UserModeSwitchFacade;

// Referenced classes of package me.lyft.android.ui:
//            DriverModeToggleView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding routeProvider;
    private Binding userModeSwitchFacade;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/DriverModeToggleView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/DriverModeToggleView, getClass().getClassLoader());
        userModeSwitchFacade = linker.requestBinding("me.lyft.android.facades.UserModeSwitchFacade", me/lyft/android/ui/DriverModeToggleView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/DriverModeToggleView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userProvider);
        set1.add(routeProvider);
        set1.add(userModeSwitchFacade);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverModeToggleView)obj);
    }

    public void injectMembers(DriverModeToggleView drivermodetoggleview)
    {
        drivermodetoggleview.userProvider = (IUserProvider)userProvider.get();
        drivermodetoggleview.routeProvider = (IDriverRideProvider)routeProvider.get();
        drivermodetoggleview.userModeSwitchFacade = (UserModeSwitchFacade)userModeSwitchFacade.get();
        drivermodetoggleview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.DriverModeToggleView", false, me/lyft/android/ui/DriverModeToggleView);
    }
}
