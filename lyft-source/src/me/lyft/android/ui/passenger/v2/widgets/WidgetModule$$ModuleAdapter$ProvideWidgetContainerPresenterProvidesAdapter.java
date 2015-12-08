// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetModule, WidgetContainerPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final WidgetModule module;
    private Binding preRideInfoRepository;
    private Binding requestRideTypeProvider;
    private Binding rideRequestSession;

    public void attach(Linker linker)
    {
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public WidgetContainerPresenter get()
    {
        return module.provideWidgetContainerPresenter((IRideRequestSession)rideRequestSession.get(), (IRequestRideTypeProvider)requestRideTypeProvider.get(), (IPreRideInfoRepository)preRideInfoRepository.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(rideRequestSession);
        set.add(requestRideTypeProvider);
        set.add(preRideInfoRepository);
    }

    public (WidgetModule widgetmodule)
    {
        super("me.lyft.android.ui.passenger.v2.widgets.WidgetContainerPresenter", true, "me.lyft.android.ui.passenger.v2.widgets.WidgetModule", "provideWidgetContainerPresenter");
        module = widgetmodule;
        setLibrary(false);
    }
}
