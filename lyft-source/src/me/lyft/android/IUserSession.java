// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import me.lyft.android.infrastructure.ats.DriverApplicationDTO;
import me.lyft.android.infrastructure.ats.DriverApplicationDataDTO;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;

public interface IUserSession
{

    public abstract AppStateDTO getAppState();

    public abstract DriverApplicationDTO getDriverApplication();

    public abstract DriverApplicationDataDTO getDriverApplicationData();

    public abstract RideDTO getRide();

    public abstract UserDTO getUser();

    public abstract void resetAppState();

    public abstract void setDriverApplication(DriverApplicationDTO driverapplicationdto);

    public abstract void setDriverApplicationData(DriverApplicationDataDTO driverapplicationdatadto);
}
