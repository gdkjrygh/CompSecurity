// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.bl.ft;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.domain.TimeZone;
import com.fitbit.data.repo.greendao.social.Badge;
import com.fitbit.data.repo.greendao.social.BadgeDao;
import com.fitbit.data.repo.greendao.social.DaoSession;
import com.fitbit.util.w;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, BadgeMapper

public class RankedUserMapper
    implements EntityMapper
{

    private final BadgeDao badgeDao;
    private final BadgeMapper badgeMapper = new BadgeMapper();
    private final DaoSession daoSession;

    public RankedUserMapper(DaoSession daosession, BadgeDao badgedao)
    {
        daoSession = daosession;
        badgeDao = badgedao;
    }

    public RankedUser fromDbEntity(com.fitbit.data.repo.greendao.social.RankedUser rankeduser)
    {
        if (rankeduser == null)
        {
            return null;
        }
        RankedUser rankeduser1 = new RankedUser();
        rankeduser1.e(rankeduser.getFullName());
        rankeduser1.f(rankeduser.getEncodedId());
        if (rankeduser.getGender() != null && rankeduser.getGender().length() > 0)
        {
            rankeduser1.a(Gender.valueOf(rankeduser.getGender()));
        }
        rankeduser1.g(rankeduser.getAvatar());
        rankeduser1.h(rankeduser.getNickname());
        if (rankeduser.getTimezone() != null && rankeduser.getTimezone().length() > 0)
        {
            rankeduser1.a(ft.a().a(rankeduser.getTimezone()));
        }
        rankeduser1.i(rankeduser.getAboutMe());
        rankeduser1.d(rankeduser.getCity());
        rankeduser1.j(rankeduser.getCountry());
        rankeduser1.k(rankeduser.getDisplayName());
        rankeduser1.a(rankeduser.getStepsSummary().longValue());
        rankeduser1.setEntityId(rankeduser.getId());
        rankeduser1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(rankeduser.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
        rankeduser1.b(rankeduser.getStepsAverage().longValue());
        rankeduser1.a(rankeduser.getState());
        rankeduser1.b(rankeduser.getEmail());
        rankeduser1.c(rankeduser.getPostal());
        rankeduser1.c(rankeduser.getContactId());
        rankeduser1.d(rankeduser.getInviteId().longValue());
        int i = rankeduser.getFriendshipStatus().intValue();
        Object obj;
        boolean flag;
        if (i < com.fitbit.data.domain.RankedUser.Relation.values().length)
        {
            obj = com.fitbit.data.domain.RankedUser.Relation.values()[i];
        } else
        {
            obj = com.fitbit.data.domain.RankedUser.Relation.STRANGER;
        }
        rankeduser1.a(((com.fitbit.data.domain.RankedUser.Relation) (obj)));
        i = rankeduser.getFriendshipOldStatus().intValue();
        if (i < com.fitbit.data.domain.RankedUser.Relation.values().length)
        {
            obj = com.fitbit.data.domain.RankedUser.Relation.values()[i];
        } else
        {
            obj = com.fitbit.data.domain.RankedUser.Relation.STRANGER;
        }
        rankeduser1.b(((com.fitbit.data.domain.RankedUser.Relation) (obj)));
        rankeduser1.setTimeCreated(rankeduser.getTimeCreated());
        rankeduser1.a(rankeduser.getIsNewInvite().booleanValue());
        rankeduser1.a(rankeduser.getJoinedDate());
        rankeduser1.b(rankeduser.getInviteDate());
        rankeduser1.b(rankeduser.getIsFromContactBook().booleanValue());
        rankeduser1.c(rankeduser.getChallengesBeta().booleanValue());
        if (rankeduser.getIsFromFacebook() == null)
        {
            flag = false;
        } else
        {
            flag = rankeduser.getIsFromFacebook().booleanValue();
        }
        rankeduser1.d(flag);
        obj = rankeduser.getActive();
        if (obj == null)
        {
            rankeduser1.a(com.fitbit.data.domain.RankedUser.ActiveState.UNKNOWN);
        } else
        {
            if (((Boolean) (obj)).booleanValue())
            {
                obj = com.fitbit.data.domain.RankedUser.ActiveState.ACTIVE;
            } else
            {
                obj = com.fitbit.data.domain.RankedUser.ActiveState.INACTIVE;
            }
            rankeduser1.a(((com.fitbit.data.domain.RankedUser.ActiveState) (obj)));
        }
        rankeduser1.a(rankeduser.getAreFriendshipsPublic());
        rankeduser = new ArrayList();
        Badge badge;
        for (obj = badgeDao.queryBuilder().where(com.fitbit.data.repo.greendao.social.BadgeDao.Properties.UserId.eq(Long.valueOf(rankeduser1.I())), new WhereCondition[0]).list().iterator(); ((Iterator) (obj)).hasNext(); rankeduser.add(badgeMapper.fromDbEntity(badge)))
        {
            badge = (Badge)((Iterator) (obj)).next();
        }

        rankeduser1.b(rankeduser);
        return rankeduser1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.social.RankedUser)obj);
    }

    public com.fitbit.data.repo.greendao.social.RankedUser toDbEntity(RankedUser rankeduser)
    {
        return toDbEntity(rankeduser, ((com.fitbit.data.repo.greendao.social.RankedUser) (null)));
    }

    public com.fitbit.data.repo.greendao.social.RankedUser toDbEntity(RankedUser rankeduser, com.fitbit.data.repo.greendao.social.RankedUser rankeduser1)
    {
        com.fitbit.data.repo.greendao.social.RankedUser rankeduser2 = rankeduser1;
        if (rankeduser1 == null)
        {
            rankeduser2 = new com.fitbit.data.repo.greendao.social.RankedUser();
        }
        if (rankeduser2.getId() == null)
        {
            rankeduser2.setId(rankeduser.getEntityId());
        }
        rankeduser2.setFullName(rankeduser.E());
        rankeduser2.setEncodedId(rankeduser.F());
        if (rankeduser.J() != null)
        {
            rankeduser2.setGender(rankeduser.J().name());
        }
        rankeduser2.setAvatar(rankeduser.G());
        rankeduser2.setNickname(rankeduser.K());
        if (rankeduser.L() != null)
        {
            rankeduser2.setTimezone(rankeduser.L().c());
        }
        rankeduser2.setTimezoneOffset(Long.valueOf(rankeduser.M()));
        rankeduser2.setAboutMe(rankeduser.N());
        rankeduser2.setCity(rankeduser.o());
        rankeduser2.setCountry(rankeduser.O());
        rankeduser2.setDisplayName(rankeduser.P());
        rankeduser2.setStepsSummary(Long.valueOf(rankeduser.a()));
        rankeduser2.setEntityStatus(Integer.valueOf(rankeduser.getEntityStatus().getCode()));
        rankeduser2.setStepsAverage(Long.valueOf(rankeduser.b()));
        rankeduser2.setState(rankeduser.e());
        rankeduser2.setEmail(rankeduser.f());
        rankeduser2.setPostal(rankeduser.g());
        rankeduser2.setContactId(rankeduser.h());
        rankeduser2.setInviteId(Long.valueOf(rankeduser.i()));
        rankeduser2.setFriendshipStatus(Integer.valueOf(rankeduser.c().ordinal()));
        rankeduser2.setFriendshipOldStatus(Integer.valueOf(rankeduser.d().ordinal()));
        rankeduser2.setTimeCreated(rankeduser.getTimeCreated());
        rankeduser2.setIsNewInvite(Boolean.valueOf(rankeduser.j()));
        rankeduser2.setJoinedDate(rankeduser.k());
        rankeduser2.setInviteDate(rankeduser.l());
        rankeduser2.setIsFromContactBook(Boolean.valueOf(rankeduser.p()));
        rankeduser2.setChallengesBeta(Boolean.valueOf(rankeduser.q()));
        rankeduser2.setIsFromFacebook(Boolean.valueOf(rankeduser.r()));
        rankeduser1 = rankeduser.t();
        if (rankeduser1 == com.fitbit.data.domain.RankedUser.ActiveState.UNKNOWN)
        {
            rankeduser2.setActive(null);
        } else
        {
            boolean flag;
            if (rankeduser1 == com.fitbit.data.domain.RankedUser.ActiveState.ACTIVE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            rankeduser2.setActive(Boolean.valueOf(flag));
        }
        rankeduser2.setAreFriendshipsPublic(rankeduser.u());
        return rankeduser2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((RankedUser)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((RankedUser)obj, (com.fitbit.data.repo.greendao.social.RankedUser)obj1);
    }
}
