// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.repo.au;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.TrackerSettingsMapper;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, DaoSession, TrackerSettingsDao, TrackerSettings

public class TrackerSettingsGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements au
{

    public TrackerSettingsGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new TrackerSettingsMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getTrackerSettingsDao();
    }

    protected Long getPkFrom(TrackerSettings trackersettings)
    {
        return ((TrackerSettingsDao)getEntityDao()).getKey(trackersettings);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((TrackerSettings)obj);
    }
}
