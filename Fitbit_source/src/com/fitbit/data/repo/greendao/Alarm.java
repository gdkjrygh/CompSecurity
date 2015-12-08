// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.DaoException;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoSession, AlarmDao, DeviceDao, Device

public class Alarm
{

    private transient DaoSession daoSession;
    private Integer daysOfWeek;
    private Boolean deleted;
    private Device device;
    private Long deviceId;
    private Long device__resolvedKey;
    private Boolean enabled;
    private Integer entityStatus;
    private Long id;
    private String label;
    private transient AlarmDao myDao;
    private Boolean recurring;
    private Long serverId;
    private Integer snoozeCount;
    private Long snoozeLength;
    private Boolean stayVisible;
    private Boolean syncedToDevice;
    private Date time;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;
    private String vibePattern;

    public Alarm()
    {
    }

    public Alarm(Long long1)
    {
        id = long1;
    }

    public Alarm(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Boolean boolean1, 
            Boolean boolean2, String s1, Integer integer1, Long long3, Boolean boolean3, Boolean boolean4, Date date2, 
            String s2, Integer integer2, Boolean boolean5, Long long4)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        enabled = boolean1;
        recurring = boolean2;
        label = s1;
        snoozeCount = integer1;
        snoozeLength = long3;
        stayVisible = boolean3;
        syncedToDevice = boolean4;
        time = date2;
        vibePattern = s2;
        daysOfWeek = integer2;
        deleted = boolean5;
        deviceId = long4;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getAlarmDao();
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

    public Integer getDaysOfWeek()
    {
        return daysOfWeek;
    }

    public Boolean getDeleted()
    {
        return deleted;
    }

    public Device getDevice()
    {
        Long long1 = deviceId;
        if (device__resolvedKey != null && device__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        Device device1 = (Device)daoSession.getDeviceDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        device = device1;
        device__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return device;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getDeviceId()
    {
        return deviceId;
    }

    public Boolean getEnabled()
    {
        return enabled;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public Boolean getRecurring()
    {
        return recurring;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public Integer getSnoozeCount()
    {
        return snoozeCount;
    }

    public Long getSnoozeLength()
    {
        return snoozeLength;
    }

    public Boolean getStayVisible()
    {
        return stayVisible;
    }

    public Boolean getSyncedToDevice()
    {
        return syncedToDevice;
    }

    public Date getTime()
    {
        return time;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public String getUuid()
    {
        return uuid;
    }

    public String getVibePattern()
    {
        return vibePattern;
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

    public void setDaysOfWeek(Integer integer)
    {
        daysOfWeek = integer;
    }

    public void setDeleted(Boolean boolean1)
    {
        deleted = boolean1;
    }

    public void setDevice(Device device1)
    {
        this;
        JVM INSTR monitorenter ;
        device = device1;
        if (device1 != null) goto _L2; else goto _L1
_L1:
        device1 = null;
_L4:
        deviceId = device1;
        device__resolvedKey = deviceId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        device1 = device1.getId();
        if (true) goto _L4; else goto _L3
_L3:
        device1;
        this;
        JVM INSTR monitorexit ;
        throw device1;
    }

    public void setDeviceId(Long long1)
    {
        deviceId = long1;
    }

    public void setEnabled(Boolean boolean1)
    {
        enabled = boolean1;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setRecurring(Boolean boolean1)
    {
        recurring = boolean1;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setSnoozeCount(Integer integer)
    {
        snoozeCount = integer;
    }

    public void setSnoozeLength(Long long1)
    {
        snoozeLength = long1;
    }

    public void setStayVisible(Boolean boolean1)
    {
        stayVisible = boolean1;
    }

    public void setSyncedToDevice(Boolean boolean1)
    {
        syncedToDevice = boolean1;
    }

    public void setTime(Date date)
    {
        time = date;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeUpdated(Date date)
    {
        timeUpdated = date;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }

    public void setVibePattern(String s)
    {
        vibePattern = s;
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
