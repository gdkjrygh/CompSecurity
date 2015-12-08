// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Profile;
import com.fitbit.data.repo.am;
import com.fitbit.data.repo.greendao.mapping.DietPlanMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.ProfileMapper;
import com.fitbit.data.repo.greendao.social.DaoSession;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.WhereCondition;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            EntityWithDietPlanGreenDaoRepository, DaoSession, DaoFactory, Profile

public class ProfileGreenDaoRepository extends EntityWithDietPlanGreenDaoRepository
    implements am
{

    public ProfileGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        setDietPlanMapper(new DietPlanMapper());
        return new ProfileMapper((com.fitbit.data.repo.greendao.DaoSession)abstractdaosession, DaoFactory.getInstance().getSocialSession().getBadgeDao());
    }

    public Profile getByEncodedId(String s)
    {
        return (Profile)getDistinctEntityWhere(ProfileDao.Properties.EncodedId.eq(s), new WhereCondition[0]);
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        abstractdaosession = (com.fitbit.data.repo.greendao.DaoSession)abstractdaosession;
        setDietPlanDao(abstractdaosession.getDietPlanDao());
        return abstractdaosession.getProfileDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.Profile profile)
    {
        return profile.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.Profile)obj);
    }
}
