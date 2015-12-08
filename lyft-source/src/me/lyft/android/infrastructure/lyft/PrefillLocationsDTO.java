// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;

import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class PrefillLocationsDTO
{

    public final LocationDTO dropoffLocation;
    public final LocationDTO pickupLocation;

    public PrefillLocationsDTO(LocationDTO locationdto, LocationDTO locationdto1)
    {
        pickupLocation = locationdto;
        dropoffLocation = locationdto1;
    }
}
