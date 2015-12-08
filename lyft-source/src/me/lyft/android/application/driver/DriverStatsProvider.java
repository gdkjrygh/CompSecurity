// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver;

import me.lyft.android.domain.driver.DriverAchievements;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.driver.DriverAchievementsDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.driver:
//            IDriverStatsProvider

public class DriverStatsProvider
    implements IDriverStatsProvider
{

    private ILyftApi lyftApi;

    public DriverStatsProvider(ILyftApi ilyftapi)
    {
        lyftApi = ilyftapi;
    }

    public Observable getDriverAchievements(String s)
    {
        return lyftApi.getDriverStats(s).map(new Func1() {

            final DriverStatsProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((DriverAchievementsDTO)obj);
            }

            public DriverAchievements call(DriverAchievementsDTO driverachievementsdto)
            {
                return DriverAchievements.fromDto(driverachievementsdto);
            }

            
            {
                this$0 = DriverStatsProvider.this;
                super();
            }
        });
    }
}
