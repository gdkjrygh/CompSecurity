// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.infrastructure.lyft.driver.AchievementCardDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.driver:
//            DriverAchievements, CardMapper, Card

final class entCardDTO
    implements Func1
{

    public volatile Object call(Object obj)
    {
        return call((AchievementCardDTO)obj);
    }

    public Card call(AchievementCardDTO achievementcarddto)
    {
        return CardMapper.fromDto(achievementcarddto);
    }

    entCardDTO()
    {
    }
}
