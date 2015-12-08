// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.ride.DriverRide;
import rx.Observable;

public interface IDriverRideProvider
{

    public abstract void clearRoute();

    public abstract DriverRide getDriverRide();

    public abstract String getIgnoreRideId();

    public abstract Observable observeRide();

    public abstract void setIgnoreRideId(String s);

    public abstract void updateRide(DriverRide driverride);
}
