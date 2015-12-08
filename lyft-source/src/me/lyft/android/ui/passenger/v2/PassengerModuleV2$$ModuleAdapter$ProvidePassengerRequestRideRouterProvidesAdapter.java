// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import android.content.res.Resources;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.landing.LandingFlow;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerModuleV2, PassengerRequestRideRouter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding landingFlow;
    private final PassengerModuleV2 module;
    private Binding resources;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        resources = linker.requestBinding("android.content.res.Resources", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public PassengerRequestRideRouter get()
    {
        return module.providePassengerRequestRideRouter((AppFlow)appFlow.get(), (DialogFlow)dialogFlow.get(), (LandingFlow)landingFlow.get(), (Resources)resources.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(appFlow);
        set.add(dialogFlow);
        set.add(landingFlow);
        set.add(resources);
    }

    public (PassengerModuleV2 passengermodulev2)
    {
        super("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", true, "me.lyft.android.ui.passenger.v2.PassengerModuleV2", "providePassengerRequestRideRouter");
        module = passengermodulev2;
        setLibrary(true);
    }
}
