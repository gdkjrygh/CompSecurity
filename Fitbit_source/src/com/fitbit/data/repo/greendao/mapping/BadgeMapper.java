// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.badges.Badge;
import com.fitbit.data.domain.badges.BadgeMetric;
import com.fitbit.data.domain.badges.BadgeType;
import com.fitbit.util.w;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class BadgeMapper
    implements EntityMapper
{

    public BadgeMapper()
    {
    }

    public Badge fromDbEntity(com.fitbit.data.repo.greendao.social.Badge badge)
    {
        if (badge == null)
        {
            return null;
        } else
        {
            Badge badge1 = new Badge();
            badge1.setEntityId(badge.getId());
            badge1.a(badge.getEncodedId());
            badge1.a(badge.getUserId());
            badge1.c(badge.getGradientStart().intValue());
            badge1.d(badge.getGradientEnd().intValue());
            badge1.f(badge.getEarnedMessage());
            badge1.d(badge.getDescription());
            badge1.c(badge.getShortName());
            badge1.b(badge.getImage());
            badge1.a(new Date(badge.getDateTime().longValue()));
            badge1.b(badge.getValue().intValue());
            badge1.a(badge.getTimesAchieved().intValue());
            badge1.a((BadgeType)w.a(badge.getType(), com/fitbit/data/domain/badges/BadgeType, BadgeType.UNKNOWN));
            badge1.a((BadgeMetric)w.a(badge.getUnit(), com/fitbit/data/domain/badges/BadgeMetric, BadgeMetric.BOOLEAN));
            badge1.g(badge.getCategory());
            badge1.h(badge.getMobileDescription());
            badge1.e(badge.getShortDescription());
            badge1.i(badge.getShareImageUrl());
            badge1.j(badge.getShareText());
            return badge1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.social.Badge)obj);
    }

    public com.fitbit.data.repo.greendao.social.Badge toDbEntity(Badge badge)
    {
        return toDbEntity(badge, new com.fitbit.data.repo.greendao.social.Badge());
    }

    public com.fitbit.data.repo.greendao.social.Badge toDbEntity(Badge badge, com.fitbit.data.repo.greendao.social.Badge badge1)
    {
        if (badge == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.social.Badge badge2 = badge1;
        if (badge1 == null)
        {
            badge2 = new com.fitbit.data.repo.greendao.social.Badge();
        }
        badge2.setEncodedId(badge.c());
        badge2.setUserId(badge.t());
        badge2.setGradientStart(Integer.valueOf(badge.n()));
        badge2.setGradientEnd(Integer.valueOf(badge.o()));
        badge2.setEarnedMessage(badge.m());
        badge2.setDescription(badge.k());
        badge2.setShortName(badge.j());
        badge2.setImage(badge.i());
        badge2.setDateTime(Long.valueOf(badge.e().getTime()));
        badge2.setValue(Integer.valueOf(badge.g()));
        badge2.setTimesAchieved(Integer.valueOf(badge.f()));
        if (badge.d() != null)
        {
            badge1 = badge.d().name();
        } else
        {
            badge1 = BadgeType.UNKNOWN.name();
        }
        badge2.setType(badge1);
        if (badge.h() != null)
        {
            badge1 = badge.h().name();
        } else
        {
            badge1 = BadgeMetric.BOOLEAN.name();
        }
        badge2.setUnit(badge1);
        badge2.setCategory(badge.p());
        badge2.setMobileDescription(badge.q());
        badge2.setShortDescription(badge.l());
        badge2.setShareImageUrl(badge.r());
        badge2.setShareText(badge.s());
        return badge2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((Badge)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((Badge)obj, (com.fitbit.data.repo.greendao.social.Badge)obj1);
    }
}
