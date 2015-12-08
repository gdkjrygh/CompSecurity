// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ridehistory;

import me.lyft.android.domain.ridehistory.PassengerRideHistory;
import rx.Observable;

public interface IPassengerRideHistoryService
{

    public abstract void clearCachedRideHistory();

    public abstract PassengerRideHistory getCachedRideHistory();

    public abstract Observable getPassengerHistory(int i);

    public abstract Observable getPassengerHistoryDetails(String s);
}
