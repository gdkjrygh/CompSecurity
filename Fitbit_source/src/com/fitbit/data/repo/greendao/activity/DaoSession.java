// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            ActivityLevelDao, ActivityItemDao, ActivityLogEntryDao, MostRecentActivityDao, 
//            ActivityLevel, ActivityItem, ActivityLogEntry, MostRecentActivity

public class DaoSession extends AbstractDaoSession
{

    private final ActivityItemDao activityItemDao;
    private final DaoConfig activityItemDaoConfig;
    private final ActivityLevelDao activityLevelDao;
    private final DaoConfig activityLevelDaoConfig;
    private final ActivityLogEntryDao activityLogEntryDao;
    private final DaoConfig activityLogEntryDaoConfig;
    private final MostRecentActivityDao mostRecentActivityDao;
    private final DaoConfig mostRecentActivityDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        activityLevelDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/activity/ActivityLevelDao)).clone();
        activityLevelDaoConfig.initIdentityScope(identityscopetype);
        activityItemDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/activity/ActivityItemDao)).clone();
        activityItemDaoConfig.initIdentityScope(identityscopetype);
        activityLogEntryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/activity/ActivityLogEntryDao)).clone();
        activityLogEntryDaoConfig.initIdentityScope(identityscopetype);
        mostRecentActivityDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/activity/MostRecentActivityDao)).clone();
        mostRecentActivityDaoConfig.initIdentityScope(identityscopetype);
        activityLevelDao = new ActivityLevelDao(activityLevelDaoConfig, this);
        activityItemDao = new ActivityItemDao(activityItemDaoConfig, this);
        activityLogEntryDao = new ActivityLogEntryDao(activityLogEntryDaoConfig, this);
        mostRecentActivityDao = new MostRecentActivityDao(mostRecentActivityDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/activity/ActivityLevel, activityLevelDao);
        registerDao(com/fitbit/data/repo/greendao/activity/ActivityItem, activityItemDao);
        registerDao(com/fitbit/data/repo/greendao/activity/ActivityLogEntry, activityLogEntryDao);
        registerDao(com/fitbit/data/repo/greendao/activity/MostRecentActivity, mostRecentActivityDao);
    }

    public void clear()
    {
        activityLevelDaoConfig.getIdentityScope().clear();
        activityItemDaoConfig.getIdentityScope().clear();
        activityLogEntryDaoConfig.getIdentityScope().clear();
        mostRecentActivityDaoConfig.getIdentityScope().clear();
    }

    public ActivityItemDao getActivityItemDao()
    {
        return activityItemDao;
    }

    public ActivityLevelDao getActivityLevelDao()
    {
        return activityLevelDao;
    }

    public ActivityLogEntryDao getActivityLogEntryDao()
    {
        return activityLogEntryDao;
    }

    public MostRecentActivityDao getMostRecentActivityDao()
    {
        return mostRecentActivityDao;
    }
}
