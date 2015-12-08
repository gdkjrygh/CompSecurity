// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.passenger;

import me.lyft.android.domain.passenger.PassengerRide;
import rx.Observable;

public interface IPassengerRideProvider
{

    public abstract PassengerRide getPassengerRide();

    public abstract Observable observeRideUpdateEvent();

    public abstract Observable observeStopsChange();

    public abstract void updatePassengerRide(PassengerRide passengerride);
}
