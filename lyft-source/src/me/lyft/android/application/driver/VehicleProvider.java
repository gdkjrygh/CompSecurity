// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver;

import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.persistence.ISimpleStorage;

// Referenced classes of package me.lyft.android.application.driver:
//            IVehicleProvider

public class VehicleProvider
    implements IVehicleProvider
{

    public static final String VEHICLE_KEY = "vehicle";
    private ISimpleStorage storage;
    private Vehicle vehicle;

    public VehicleProvider(ISimpleStorage isimplestorage)
    {
        storage = isimplestorage;
        vehicle = (Vehicle)isimplestorage.getOrDefault("vehicle", me/lyft/android/domain/driver/Vehicle, Vehicle.empty());
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void updateVehicle(Vehicle vehicle1)
    {
        vehicle = vehicle1;
        storage.put("vehicle", vehicle1);
    }
}
