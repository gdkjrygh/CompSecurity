// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.infrastructure.lyft.driver.DriverActivitiesDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.driver:
//            DriverAchievements, DriverActivities

final class tivitiesDTO
    implements Func1
{

    public volatile Object call(Object obj)
    {
        return call((DriverActivitiesDTO)obj);
    }

    public DriverActivities call(DriverActivitiesDTO driveractivitiesdto)
    {
        return DriverActivities.fromDTO(driveractivitiesdto);
    }

    tivitiesDTO()
    {
    }
}
