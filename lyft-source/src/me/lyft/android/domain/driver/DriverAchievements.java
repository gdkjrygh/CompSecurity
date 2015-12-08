// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.driver.AchievementCardDTO;
import me.lyft.android.infrastructure.lyft.driver.DriverAchievementsDTO;
import me.lyft.android.infrastructure.lyft.driver.DriverActivitiesDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.driver:
//            DriverActivities, CardMapper, Card

public class DriverAchievements
    implements INullable
{

    List activities;
    List cards;

    public DriverAchievements(List list, List list1)
    {
        activities = list;
        cards = list1;
    }

    public static DriverAchievements empty()
    {
        return NullDriverAchievements.getInstance();
    }

    public static DriverAchievements fromDto(DriverAchievementsDTO driverachievementsdto)
    {
        return new DriverAchievements(Iterables.select((List)Objects.firstNonNull(driverachievementsdto.activities, Collections.emptyList()), new Func1() {

            public volatile Object call(Object obj)
            {
                return call((DriverActivitiesDTO)obj);
            }

            public DriverActivities call(DriverActivitiesDTO driveractivitiesdto)
            {
                return DriverActivities.fromDTO(driveractivitiesdto);
            }

        }), Iterables.select((List)Objects.firstNonNull(driverachievementsdto.cards, Collections.emptyList()), new Func1() {

            public volatile Object call(Object obj)
            {
                return call((AchievementCardDTO)obj);
            }

            public Card call(AchievementCardDTO achievementcarddto)
            {
                return CardMapper.fromDto(achievementcarddto);
            }

        }));
    }

    public List getActivities()
    {
        return activities;
    }

    public List getCards()
    {
        return cards;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullDriverAchievements extends DriverAchievements
    {

        private static final DriverAchievements INSTANCE = new NullDriverAchievements();

        static DriverAchievements getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullDriverAchievements()
        {
            super(Collections.emptyList(), Collections.emptyList());
        }
    }

}
