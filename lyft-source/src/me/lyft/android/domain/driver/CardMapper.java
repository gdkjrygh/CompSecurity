// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Enums;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.driver.AchievementCardDTO;
import me.lyft.android.infrastructure.lyft.driver.DialDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.driver:
//            ExpressPayCard, Card, Dial

public class CardMapper
{

    public CardMapper()
    {
    }

    public static Card fromDto(AchievementCardDTO achievementcarddto)
    {
        List list = Iterables.select((List)Objects.firstNonNull(achievementcarddto.dials, Collections.emptyList()), new Func1() {

            public volatile Object call(Object obj)
            {
                return call((DialDTO)obj);
            }

            public Dial call(DialDTO dialdto)
            {
                return Dial.fromDto(dialdto);
            }

        });
        Card.Style style = (Card.Style)Enums.valueOf(me/lyft/android/domain/driver/Card$Style, achievementcarddto.style, Card.Style.LIGHT);
        if (Card.Style.EXPRESSPAY.equals(style))
        {
            return new ExpressPayCard(style, (String)Objects.firstNonNull(achievementcarddto.title, ""), (String)Objects.firstNonNull(achievementcarddto.subtitle, ""), (String)Objects.firstNonNull(achievementcarddto.infoUrl, ""), list, (String)Objects.firstNonNull(achievementcarddto.buttonText, ""), (String)Objects.firstNonNull(achievementcarddto.footer, ""));
        } else
        {
            return new Card(style, (String)Objects.firstNonNull(achievementcarddto.title, ""), (String)Objects.firstNonNull(achievementcarddto.subtitle, ""), (String)Objects.firstNonNull(achievementcarddto.infoUrl, ""), list, (String)Objects.firstNonNull(achievementcarddto.footer, ""));
        }
    }
}
