// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            RideHistoryModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.ridehistory.PassengerRideHistoryListView", "members/me.lyft.android.ui.ridehistory.PassengerRideHistoryDetailedView", "members/me.lyft.android.ui.ridehistory.PassengerRideHistoryItemView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public RideHistoryModule newModule()
    {
        return new RideHistoryModule();
    }


    public ()
    {
        super(me/lyft/android/ui/ridehistory/RideHistoryModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}
