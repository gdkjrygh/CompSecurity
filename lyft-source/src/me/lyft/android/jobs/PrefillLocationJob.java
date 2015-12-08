// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.infrastructure.lyft.PrefillLocationsDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class PrefillLocationJob
    implements Job
{

    private final Location dropoffLocation;
    private final Location pickupLocation;
    IRideRequestSession rideRequestSession;
    IUserProvider userProvider;

    public PrefillLocationJob(PrefillLocationsDTO prefilllocationsdto)
    {
        if (prefilllocationsdto == null)
        {
            pickupLocation = NullLocation.getInstance();
            dropoffLocation = NullLocation.getInstance();
            return;
        } else
        {
            pickupLocation = LocationMapper.fromLocationDTO(prefilllocationsdto.pickupLocation);
            dropoffLocation = LocationMapper.fromLocationDTO(prefilllocationsdto.dropoffLocation);
            return;
        }
    }

    public void execute()
    {
        if (!userProvider.getUser().isInDriverMode())
        {
            if (rideRequestSession.getPickupLocation().isNull() && !pickupLocation.isNull())
            {
                rideRequestSession.setPickupLocation(pickupLocation);
            }
            if (rideRequestSession.getDropoffLocation().isNull() && !dropoffLocation.isNull())
            {
                rideRequestSession.setDropoffLocation(dropoffLocation);
                return;
            }
        }
    }
}
