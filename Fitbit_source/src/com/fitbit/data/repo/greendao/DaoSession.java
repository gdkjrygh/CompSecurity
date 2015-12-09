// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            TimeSeriesObjectDao, DietPlanDao, ProfileDao, TimeZoneDao, 
//            PendingPlanDao, DeviceDao, TrackerSettingsDao, AlarmDao, 
//            GoalDao, OperationsQueueDao, NotificationDao, LocaleInfoDao, 
//            TimeSeriesObject, DietPlan, Profile, TimeZone, 
//            PendingPlan, Device, TrackerSettings, Alarm, 
//            Goal, OperationsQueue, Notification, LocaleInfo

public class DaoSession extends AbstractDaoSession
{

    private final AlarmDao alarmDao;
    private final DaoConfig alarmDaoConfig;
    private final DeviceDao deviceDao;
    private final DaoConfig deviceDaoConfig;
    private final DietPlanDao dietPlanDao;
    private final DaoConfig dietPlanDaoConfig;
    private final GoalDao goalDao;
    private final DaoConfig goalDaoConfig;
    private final LocaleInfoDao localeInfoDao;
    private final DaoConfig localeInfoDaoConfig;
    private final NotificationDao notificationDao;
    private final DaoConfig notificationDaoConfig;
    private final OperationsQueueDao operationsQueueDao;
    private final DaoConfig operationsQueueDaoConfig;
    private final PendingPlanDao pendingPlanDao;
    private final DaoConfig pendingPlanDaoConfig;
    private final ProfileDao profileDao;
    private final DaoConfig profileDaoConfig;
    private final TimeSeriesObjectDao timeSeriesObjectDao;
    private final DaoConfig timeSeriesObjectDaoConfig;
    private final TimeZoneDao timeZoneDao;
    private final DaoConfig timeZoneDaoConfig;
    private final TrackerSettingsDao trackerSettingsDao;
    private final DaoConfig trackerSettingsDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        timeSeriesObjectDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/TimeSeriesObjectDao)).clone();
        timeSeriesObjectDaoConfig.initIdentityScope(identityscopetype);
        dietPlanDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/DietPlanDao)).clone();
        dietPlanDaoConfig.initIdentityScope(identityscopetype);
        profileDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/ProfileDao)).clone();
        profileDaoConfig.initIdentityScope(identityscopetype);
        timeZoneDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/TimeZoneDao)).clone();
        timeZoneDaoConfig.initIdentityScope(identityscopetype);
        pendingPlanDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/PendingPlanDao)).clone();
        pendingPlanDaoConfig.initIdentityScope(identityscopetype);
        deviceDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/DeviceDao)).clone();
        deviceDaoConfig.initIdentityScope(identityscopetype);
        trackerSettingsDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/TrackerSettingsDao)).clone();
        trackerSettingsDaoConfig.initIdentityScope(identityscopetype);
        alarmDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/AlarmDao)).clone();
        alarmDaoConfig.initIdentityScope(identityscopetype);
        goalDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/GoalDao)).clone();
        goalDaoConfig.initIdentityScope(identityscopetype);
        operationsQueueDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/OperationsQueueDao)).clone();
        operationsQueueDaoConfig.initIdentityScope(identityscopetype);
        notificationDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/NotificationDao)).clone();
        notificationDaoConfig.initIdentityScope(identityscopetype);
        localeInfoDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/LocaleInfoDao)).clone();
        localeInfoDaoConfig.initIdentityScope(identityscopetype);
        timeSeriesObjectDao = new TimeSeriesObjectDao(timeSeriesObjectDaoConfig, this);
        dietPlanDao = new DietPlanDao(dietPlanDaoConfig, this);
        profileDao = new ProfileDao(profileDaoConfig, this);
        timeZoneDao = new TimeZoneDao(timeZoneDaoConfig, this);
        pendingPlanDao = new PendingPlanDao(pendingPlanDaoConfig, this);
        deviceDao = new DeviceDao(deviceDaoConfig, this);
        trackerSettingsDao = new TrackerSettingsDao(trackerSettingsDaoConfig, this);
        alarmDao = new AlarmDao(alarmDaoConfig, this);
        goalDao = new GoalDao(goalDaoConfig, this);
        operationsQueueDao = new OperationsQueueDao(operationsQueueDaoConfig, this);
        notificationDao = new NotificationDao(notificationDaoConfig, this);
        localeInfoDao = new LocaleInfoDao(localeInfoDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/TimeSeriesObject, timeSeriesObjectDao);
        registerDao(com/fitbit/data/repo/greendao/DietPlan, dietPlanDao);
        registerDao(com/fitbit/data/repo/greendao/Profile, profileDao);
        registerDao(com/fitbit/data/repo/greendao/TimeZone, timeZoneDao);
        registerDao(com/fitbit/data/repo/greendao/PendingPlan, pendingPlanDao);
        registerDao(com/fitbit/data/repo/greendao/Device, deviceDao);
        registerDao(com/fitbit/data/repo/greendao/TrackerSettings, trackerSettingsDao);
        registerDao(com/fitbit/data/repo/greendao/Alarm, alarmDao);
        registerDao(com/fitbit/data/repo/greendao/Goal, goalDao);
        registerDao(com/fitbit/data/repo/greendao/OperationsQueue, operationsQueueDao);
        registerDao(com/fitbit/data/repo/greendao/Notification, notificationDao);
        registerDao(com/fitbit/data/repo/greendao/LocaleInfo, localeInfoDao);
    }

    public void clear()
    {
        timeSeriesObjectDaoConfig.getIdentityScope().clear();
        dietPlanDaoConfig.getIdentityScope().clear();
        profileDaoConfig.getIdentityScope().clear();
        timeZoneDaoConfig.getIdentityScope().clear();
        pendingPlanDaoConfig.getIdentityScope().clear();
        deviceDaoConfig.getIdentityScope().clear();
        trackerSettingsDaoConfig.getIdentityScope().clear();
        alarmDaoConfig.getIdentityScope().clear();
        goalDaoConfig.getIdentityScope().clear();
        operationsQueueDaoConfig.getIdentityScope().clear();
        notificationDaoConfig.getIdentityScope().clear();
        localeInfoDaoConfig.getIdentityScope().clear();
    }

    public AlarmDao getAlarmDao()
    {
        return alarmDao;
    }

    public DeviceDao getDeviceDao()
    {
        return deviceDao;
    }

    public DietPlanDao getDietPlanDao()
    {
        return dietPlanDao;
    }

    public GoalDao getGoalDao()
    {
        return goalDao;
    }

    public LocaleInfoDao getLocaleInfoDao()
    {
        return localeInfoDao;
    }

    public NotificationDao getNotificationDao()
    {
        return notificationDao;
    }

    public OperationsQueueDao getOperationsQueueDao()
    {
        return operationsQueueDao;
    }

    public PendingPlanDao getPendingPlanDao()
    {
        return pendingPlanDao;
    }

    public ProfileDao getProfileDao()
    {
        return profileDao;
    }

    public TimeSeriesObjectDao getTimeSeriesObjectDao()
    {
        return timeSeriesObjectDao;
    }

    public TimeZoneDao getTimeZoneDao()
    {
        return timeZoneDao;
    }

    public TrackerSettingsDao getTrackerSettingsDao()
    {
        return trackerSettingsDao;
    }
}
