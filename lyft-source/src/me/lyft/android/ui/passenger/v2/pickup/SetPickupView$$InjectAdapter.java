// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            SetPickupView, RideTypeSwitcherPresenter, SetPickupPresenter

public final class I extends Binding
    implements MembersInjector
{

    private Binding rideTypeSwitcherController;
    private Binding setPickupPresenter;

    public void attach(Linker linker)
    {
        rideTypeSwitcherController = linker.requestBinding("me.lyft.android.ui.passenger.v2.pickup.RideTypeSwitcherPresenter", me/lyft/android/ui/passenger/v2/pickup/SetPickupView, getClass().getClassLoader());
        setPickupPresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.pickup.SetPickupPresenter", me/lyft/android/ui/passenger/v2/pickup/SetPickupView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(rideTypeSwitcherController);
        set1.add(setPickupPresenter);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SetPickupView)obj);
    }

    public void injectMembers(SetPickupView setpickupview)
    {
        setpickupview.rideTypeSwitcherController = (RideTypeSwitcherPresenter)rideTypeSwitcherController.get();
        setpickupview.setPickupPresenter = (SetPickupPresenter)setPickupPresenter.get();
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.passenger.v2.pickup.SetPickupView", false, me/lyft/android/ui/passenger/v2/pickup/SetPickupView);
    }
}
