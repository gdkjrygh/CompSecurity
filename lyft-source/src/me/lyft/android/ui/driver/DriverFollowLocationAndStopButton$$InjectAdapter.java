// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverFollowLocationAndStopButton

public final class  extends Binding
    implements MembersInjector
{

    private Binding rideMap;

    public void attach(Linker linker)
    {
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/driver/DriverFollowLocationAndStopButton, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(rideMap);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverFollowLocationAndStopButton)obj);
    }

    public void injectMembers(DriverFollowLocationAndStopButton driverfollowlocationandstopbutton)
    {
        driverfollowlocationandstopbutton.rideMap = (RideMap)rideMap.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverFollowLocationAndStopButton", false, me/lyft/android/ui/driver/DriverFollowLocationAndStopButton);
    }
}
