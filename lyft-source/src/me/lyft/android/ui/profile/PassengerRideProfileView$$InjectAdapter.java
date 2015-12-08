// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerRideProfileView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding passengerRideProvider;
    private Binding profileProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/profile/PassengerRideProfileView, getClass().getClassLoader());
        profileProvider = linker.requestBinding("me.lyft.android.application.profile.IProfileProvider", me/lyft/android/ui/profile/PassengerRideProfileView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/profile/PassengerRideProfileView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(profileProvider);
        set1.add(passengerRideProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRideProfileView)obj);
    }

    public void injectMembers(PassengerRideProfileView passengerrideprofileview)
    {
        passengerrideprofileview.appFlow = (AppFlow)appFlow.get();
        passengerrideprofileview.profileProvider = (IProfileProvider)profileProvider.get();
        passengerrideprofileview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.PassengerRideProfileView", false, me/lyft/android/ui/profile/PassengerRideProfileView);
    }
}
