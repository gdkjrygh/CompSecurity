// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.driver:
//            NavigationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;
    private Binding imageLoader;
    private Binding lyftPreferences;
    private Binding navigator;
    private Binding routeProvider;
    private Binding supertype;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader());
        navigator = linker.requestBinding("me.lyft.android.utils.Navigator", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/NavigationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(navigator);
        set1.add(lyftPreferences);
        set1.add(imageLoader);
        set1.add(bus);
        set1.add(routeProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((NavigationDialogView)obj);
    }

    public void injectMembers(NavigationDialogView navigationdialogview)
    {
        navigationdialogview.appFlow = (AppFlow)appFlow.get();
        navigationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        navigationdialogview.navigator = (Navigator)navigator.get();
        navigationdialogview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        navigationdialogview.imageLoader = (ImageLoader)imageLoader.get();
        navigationdialogview.bus = (MessageBus)bus.get();
        navigationdialogview.routeProvider = (IDriverRideProvider)routeProvider.get();
        supertype.injectMembers(navigationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.NavigationDialogView", false, me/lyft/android/ui/driver/NavigationDialogView);
    }
}
