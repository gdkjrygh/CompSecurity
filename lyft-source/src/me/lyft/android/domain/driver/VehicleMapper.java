// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.profile.VehicleDTO;

// Referenced classes of package me.lyft.android.domain.driver:
//            Vehicle

public class VehicleMapper
{

    public VehicleMapper()
    {
    }

    public static Vehicle fromVehicleDTO(VehicleDTO vehicledto)
    {
        if (vehicledto == null)
        {
            return Vehicle.empty();
        } else
        {
            return new Vehicle(vehicledto.getPhoto(), (String)Objects.firstNonNull(vehicledto.getColor(), ""), (String)Objects.firstNonNull(vehicledto.getMake(), ""), (String)Objects.firstNonNull(vehicledto.getModel(), ""), (Integer)Objects.firstNonNull(vehicledto.getYear(), Integer.valueOf(0)), (String)Objects.firstNonNull(vehicledto.getState(), ""), (String)Objects.firstNonNull(vehicledto.getLicensePlate(), ""));
        }
    }
}
