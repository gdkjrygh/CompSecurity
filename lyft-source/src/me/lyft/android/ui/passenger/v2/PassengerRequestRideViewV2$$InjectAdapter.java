// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerRequestRideViewV2, PassengerRequestRidePresenterV2

public final class  extends Binding
    implements MembersInjector
{

    private Binding passengerRequestRidePresenter;

    public void attach(Linker linker)
    {
        passengerRequestRidePresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", me/lyft/android/ui/passenger/v2/PassengerRequestRideViewV2, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(passengerRequestRidePresenter);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRequestRideViewV2)obj);
    }

    public void injectMembers(PassengerRequestRideViewV2 passengerrequestrideviewv2)
    {
        passengerrequestrideviewv2.passengerRequestRidePresenter = (PassengerRequestRidePresenterV2)passengerRequestRidePresenter.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.v2.PassengerRequestRideViewV2", false, me/lyft/android/ui/passenger/v2/PassengerRequestRideViewV2);
    }
}
