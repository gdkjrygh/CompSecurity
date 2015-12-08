// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver;

import me.lyft.android.domain.driver.Vehicle;

public interface IVehicleProvider
{

    public abstract Vehicle getVehicle();

    public abstract void updateVehicle(Vehicle vehicle);
}
