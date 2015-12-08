// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            WeightLogEntryDao, BodyFatLogEntryDao, WaterLogEntryDao, SleepLogEntryDao, 
//            WeightLogEntry, BodyFatLogEntry, WaterLogEntry, SleepLogEntry

public class DaoSession extends AbstractDaoSession
{

    private final BodyFatLogEntryDao bodyFatLogEntryDao;
    private final DaoConfig bodyFatLogEntryDaoConfig;
    private final SleepLogEntryDao sleepLogEntryDao;
    private final DaoConfig sleepLogEntryDaoConfig;
    private final WaterLogEntryDao waterLogEntryDao;
    private final DaoConfig waterLogEntryDaoConfig;
    private final WeightLogEntryDao weightLogEntryDao;
    private final DaoConfig weightLogEntryDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        weightLogEntryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/logging/WeightLogEntryDao)).clone();
        weightLogEntryDaoConfig.initIdentityScope(identityscopetype);
        bodyFatLogEntryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/logging/BodyFatLogEntryDao)).clone();
        bodyFatLogEntryDaoConfig.initIdentityScope(identityscopetype);
        waterLogEntryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/logging/WaterLogEntryDao)).clone();
        waterLogEntryDaoConfig.initIdentityScope(identityscopetype);
        sleepLogEntryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/logging/SleepLogEntryDao)).clone();
        sleepLogEntryDaoConfig.initIdentityScope(identityscopetype);
        weightLogEntryDao = new WeightLogEntryDao(weightLogEntryDaoConfig, this);
        bodyFatLogEntryDao = new BodyFatLogEntryDao(bodyFatLogEntryDaoConfig, this);
        waterLogEntryDao = new WaterLogEntryDao(waterLogEntryDaoConfig, this);
        sleepLogEntryDao = new SleepLogEntryDao(sleepLogEntryDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/logging/WeightLogEntry, weightLogEntryDao);
        registerDao(com/fitbit/data/repo/greendao/logging/BodyFatLogEntry, bodyFatLogEntryDao);
        registerDao(com/fitbit/data/repo/greendao/logging/WaterLogEntry, waterLogEntryDao);
        registerDao(com/fitbit/data/repo/greendao/logging/SleepLogEntry, sleepLogEntryDao);
    }

    public void clear()
    {
        weightLogEntryDaoConfig.getIdentityScope().clear();
        bodyFatLogEntryDaoConfig.getIdentityScope().clear();
        waterLogEntryDaoConfig.getIdentityScope().clear();
        sleepLogEntryDaoConfig.getIdentityScope().clear();
    }

    public BodyFatLogEntryDao getBodyFatLogEntryDao()
    {
        return bodyFatLogEntryDao;
    }

    public SleepLogEntryDao getSleepLogEntryDao()
    {
        return sleepLogEntryDao;
    }

    public WaterLogEntryDao getWaterLogEntryDao()
    {
        return waterLogEntryDao;
    }

    public WeightLogEntryDao getWeightLogEntryDao()
    {
        return weightLogEntryDao;
    }
}
