// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            TimeSeriesObjectDao, DietPlanDao, ProfileDao, TimeZoneDao, 
//            PendingPlanDao, DeviceDao, TrackerSettingsDao, AlarmDao, 
//            GoalDao, OperationsQueueDao, NotificationDao, LocaleInfoDao, 
//            DaoSession

public class DaoMaster extends AbstractDaoMaster
{
    public static class DevOpenHelper extends OpenHelper
    {

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            Log.i("greenDAO", (new StringBuilder()).append("Upgrading schema from version ").append(i).append(" to ").append(j).append(" by dropping all tables").toString());
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
        }

        public DevOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory);
        }
    }

    public static abstract class OpenHelper extends SQLiteOpenHelper
    {

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            Log.i("greenDAO", "Creating tables for schema version 153");
            DaoMaster.createAllTables(sqlitedatabase, false);
        }

        public OpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory, 153);
        }
    }


    public static final int SCHEMA_VERSION = 153;

    public DaoMaster(SQLiteDatabase sqlitedatabase)
    {
        super(sqlitedatabase, 153);
        registerDaoClass(com/fitbit/data/repo/greendao/TimeSeriesObjectDao);
        registerDaoClass(com/fitbit/data/repo/greendao/DietPlanDao);
        registerDaoClass(com/fitbit/data/repo/greendao/ProfileDao);
        registerDaoClass(com/fitbit/data/repo/greendao/TimeZoneDao);
        registerDaoClass(com/fitbit/data/repo/greendao/PendingPlanDao);
        registerDaoClass(com/fitbit/data/repo/greendao/DeviceDao);
        registerDaoClass(com/fitbit/data/repo/greendao/TrackerSettingsDao);
        registerDaoClass(com/fitbit/data/repo/greendao/AlarmDao);
        registerDaoClass(com/fitbit/data/repo/greendao/GoalDao);
        registerDaoClass(com/fitbit/data/repo/greendao/OperationsQueueDao);
        registerDaoClass(com/fitbit/data/repo/greendao/NotificationDao);
        registerDaoClass(com/fitbit/data/repo/greendao/LocaleInfoDao);
    }

    public static void createAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        TimeSeriesObjectDao.createTable(sqlitedatabase, flag);
        DietPlanDao.createTable(sqlitedatabase, flag);
        ProfileDao.createTable(sqlitedatabase, flag);
        TimeZoneDao.createTable(sqlitedatabase, flag);
        PendingPlanDao.createTable(sqlitedatabase, flag);
        DeviceDao.createTable(sqlitedatabase, flag);
        TrackerSettingsDao.createTable(sqlitedatabase, flag);
        AlarmDao.createTable(sqlitedatabase, flag);
        GoalDao.createTable(sqlitedatabase, flag);
        OperationsQueueDao.createTable(sqlitedatabase, flag);
        NotificationDao.createTable(sqlitedatabase, flag);
        LocaleInfoDao.createTable(sqlitedatabase, flag);
    }

    public static void dropAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        TimeSeriesObjectDao.dropTable(sqlitedatabase, flag);
        DietPlanDao.dropTable(sqlitedatabase, flag);
        ProfileDao.dropTable(sqlitedatabase, flag);
        TimeZoneDao.dropTable(sqlitedatabase, flag);
        PendingPlanDao.dropTable(sqlitedatabase, flag);
        DeviceDao.dropTable(sqlitedatabase, flag);
        TrackerSettingsDao.dropTable(sqlitedatabase, flag);
        AlarmDao.dropTable(sqlitedatabase, flag);
        GoalDao.dropTable(sqlitedatabase, flag);
        OperationsQueueDao.dropTable(sqlitedatabase, flag);
        NotificationDao.dropTable(sqlitedatabase, flag);
        LocaleInfoDao.dropTable(sqlitedatabase, flag);
    }

    public DaoSession newSession()
    {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType identityscopetype)
    {
        return new DaoSession(db, identityscopetype, daoConfigMap);
    }

    public volatile AbstractDaoSession newSession()
    {
        return newSession();
    }

    public volatile AbstractDaoSession newSession(IdentityScopeType identityscopetype)
    {
        return newSession(identityscopetype);
    }
}
