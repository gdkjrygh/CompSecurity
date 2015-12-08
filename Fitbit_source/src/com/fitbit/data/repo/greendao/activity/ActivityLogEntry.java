// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import de.greenrobot.dao.DaoException;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            DaoSession, ActivityLogEntryDao, ActivityItemDao, ActivityItem

public class ActivityLogEntry
{

    private ActivityItem activityItem;
    private Long activityItemId;
    private Long activityItemServerId;
    private Long activityItem__resolvedKey;
    private Integer averageHeartRate;
    private Integer calories;
    private String caloriesLink;
    private Integer caloriesOnServer;
    private Integer cardioHeartRateZoneMinutes;
    private transient DaoSession daoSession;
    private String detailsId;
    private String detailsType;
    private Double distance;
    private Integer duration;
    private Integer entityStatus;
    private Integer fatBurnHeartRateZoneMinutes;
    private Boolean hasDetails;
    private String heartRateLink;
    private Long id;
    private Date lastModified;
    private Date logDate;
    private Boolean manualCaloriesPopulated;
    private Integer moderatelyActiveMinutes;
    private transient ActivityLogEntryDao myDao;
    private String name;
    private Integer peakHeartRateZoneMinutes;
    private Long serverId;
    private Date startTime;
    private Integer steps;
    private Date timeCreated;
    private Date timeUpdated;
    private String trackerType;
    private String uuid;
    private Double value;
    private Integer veryActiveMinutes;

    public ActivityLogEntry()
    {
    }

    public ActivityLogEntry(Long long1)
    {
        id = long1;
    }

    public ActivityLogEntry(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Double double1, 
            String s1, Date date2, Integer integer1, Double double2, Integer integer2, Date date3, Integer integer3, 
            Integer integer4, Boolean boolean1, Long long3, String s2, String s3, Boolean boolean2, String s4, 
            String s5, Integer integer5, Integer integer6, Integer integer7, Date date4, Integer integer8, Integer integer9, 
            Integer integer10, String s6, Long long4)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        value = double1;
        trackerType = s1;
        logDate = date2;
        calories = integer1;
        distance = double2;
        duration = integer2;
        startTime = date3;
        steps = integer3;
        caloriesOnServer = integer4;
        manualCaloriesPopulated = boolean1;
        activityItemServerId = long3;
        detailsId = s2;
        detailsType = s3;
        hasDetails = boolean2;
        heartRateLink = s4;
        caloriesLink = s5;
        fatBurnHeartRateZoneMinutes = integer5;
        cardioHeartRateZoneMinutes = integer6;
        peakHeartRateZoneMinutes = integer7;
        lastModified = date4;
        veryActiveMinutes = integer8;
        moderatelyActiveMinutes = integer9;
        averageHeartRate = integer10;
        name = s6;
        activityItemId = long4;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getActivityLogEntryDao();
        } else
        {
            daosession = null;
        }
        myDao = daosession;
    }

    public void delete()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.delete(this);
            return;
        }
    }

    public ActivityItem getActivityItem()
    {
        Long long1 = activityItemId;
        if (activityItem__resolvedKey != null && activityItem__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        ActivityItem activityitem = (ActivityItem)daoSession.getActivityItemDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        activityItem = activityitem;
        activityItem__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return activityItem;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getActivityItemId()
    {
        return activityItemId;
    }

    public Long getActivityItemServerId()
    {
        return activityItemServerId;
    }

    public Integer getAverageHeartRate()
    {
        return averageHeartRate;
    }

    public Integer getCalories()
    {
        return calories;
    }

    public String getCaloriesLink()
    {
        return caloriesLink;
    }

    public Integer getCaloriesOnServer()
    {
        return caloriesOnServer;
    }

    public Integer getCardioHeartRateZoneMinutes()
    {
        return cardioHeartRateZoneMinutes;
    }

    public String getDetailsId()
    {
        return detailsId;
    }

    public String getDetailsType()
    {
        return detailsType;
    }

    public Double getDistance()
    {
        return distance;
    }

    public Integer getDuration()
    {
        return duration;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Integer getFatBurnHeartRateZoneMinutes()
    {
        return fatBurnHeartRateZoneMinutes;
    }

    public Boolean getHasDetails()
    {
        return hasDetails;
    }

    public String getHeartRateLink()
    {
        return heartRateLink;
    }

    public Long getId()
    {
        return id;
    }

    public Date getLastModified()
    {
        return lastModified;
    }

    public Date getLogDate()
    {
        return logDate;
    }

    public Boolean getManualCaloriesPopulated()
    {
        return manualCaloriesPopulated;
    }

    public Integer getModeratelyActiveMinutes()
    {
        return moderatelyActiveMinutes;
    }

    public String getName()
    {
        return name;
    }

    public Integer getPeakHeartRateZoneMinutes()
    {
        return peakHeartRateZoneMinutes;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public Integer getSteps()
    {
        return steps;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public String getTrackerType()
    {
        return trackerType;
    }

    public String getUuid()
    {
        return uuid;
    }

    public Double getValue()
    {
        return value;
    }

    public Integer getVeryActiveMinutes()
    {
        return veryActiveMinutes;
    }

    public void refresh()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.refresh(this);
            return;
        }
    }

    public void setActivityItem(ActivityItem activityitem)
    {
        this;
        JVM INSTR monitorenter ;
        activityItem = activityitem;
        if (activityitem != null) goto _L2; else goto _L1
_L1:
        activityitem = null;
_L4:
        activityItemId = activityitem;
        activityItem__resolvedKey = activityItemId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        activityitem = activityitem.getId();
        if (true) goto _L4; else goto _L3
_L3:
        activityitem;
        this;
        JVM INSTR monitorexit ;
        throw activityitem;
    }

    public void setActivityItemId(Long long1)
    {
        activityItemId = long1;
    }

    public void setActivityItemServerId(Long long1)
    {
        activityItemServerId = long1;
    }

    public void setAverageHeartRate(Integer integer)
    {
        averageHeartRate = integer;
    }

    public void setCalories(Integer integer)
    {
        calories = integer;
    }

    public void setCaloriesLink(String s)
    {
        caloriesLink = s;
    }

    public void setCaloriesOnServer(Integer integer)
    {
        caloriesOnServer = integer;
    }

    public void setCardioHeartRateZoneMinutes(Integer integer)
    {
        cardioHeartRateZoneMinutes = integer;
    }

    public void setDetailsId(String s)
    {
        detailsId = s;
    }

    public void setDetailsType(String s)
    {
        detailsType = s;
    }

    public void setDistance(Double double1)
    {
        distance = double1;
    }

    public void setDuration(Integer integer)
    {
        duration = integer;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setFatBurnHeartRateZoneMinutes(Integer integer)
    {
        fatBurnHeartRateZoneMinutes = integer;
    }

    public void setHasDetails(Boolean boolean1)
    {
        hasDetails = boolean1;
    }

    public void setHeartRateLink(String s)
    {
        heartRateLink = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLastModified(Date date)
    {
        lastModified = date;
    }

    public void setLogDate(Date date)
    {
        logDate = date;
    }

    public void setManualCaloriesPopulated(Boolean boolean1)
    {
        manualCaloriesPopulated = boolean1;
    }

    public void setModeratelyActiveMinutes(Integer integer)
    {
        moderatelyActiveMinutes = integer;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPeakHeartRateZoneMinutes(Integer integer)
    {
        peakHeartRateZoneMinutes = integer;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setStartTime(Date date)
    {
        startTime = date;
    }

    public void setSteps(Integer integer)
    {
        steps = integer;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeUpdated(Date date)
    {
        timeUpdated = date;
    }

    public void setTrackerType(String s)
    {
        trackerType = s;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }

    public void setValue(Double double1)
    {
        value = double1;
    }

    public void setVeryActiveMinutes(Integer integer)
    {
        veryActiveMinutes = integer;
    }

    public void update()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.update(this);
            return;
        }
    }
}
