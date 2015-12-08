// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.List;
import me.lyft.android.domain.ride.RequestRideType;
import rx.Observable;

public interface IRequestRideTypeProvider
{

    public abstract void clearDrivers();

    public abstract RequestRideType findRideTypeById(String s);

    public abstract RequestRideType getDefaultRideType();

    public abstract List getRequestRideTypes();

    public abstract RequestRideType getRideTypeById(String s);

    public abstract Observable observeRideTypes();

    public abstract void updateRideTypes(List list);
}
