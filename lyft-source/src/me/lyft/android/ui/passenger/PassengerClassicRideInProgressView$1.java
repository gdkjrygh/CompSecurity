// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.SphericalUtils;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView

class this._cls0
    implements me.lyft.android.rx.essView._cls1
{

    final PassengerClassicRideInProgressView this$0;

    public volatile boolean equals(Object obj, Object obj1)
    {
        return equals((Location)obj, (Location)obj1);
    }

    public boolean equals(Location location, Location location1)
    {
        return location != null && location1 != null && SphericalUtils.latLngApproximateEquals(location, location1);
    }

    ()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
