// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.DaoException;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoSession, DeviceDao, AlarmDao, ProfileDao, 
//            Profile, TrackerSettingsDao, TrackerSettings

public class Device
{

    private List alarmList;
    private String autoLapNameOptions;
    private String autoLapTypeOptions;
    private String autoLapValueOptions;
    private Integer batteryLevel;
    private Double brightness;
    private String clockFacesDisplayNameSupported;
    private String clockFacesNameSupported;
    private String clockFacesUrlSupported;
    private Float currentFirmwareApp;
    private String currentFirmwareAppVersion;
    private Float currentFirmwareBsl;
    private String currentFirmwareBslVersion;
    private transient DaoSession daoSession;
    private String defaultUnit;
    private String encodedId;
    private Boolean encrypted;
    private Integer entityStatus;
    private String exerciseOptionsIdSupported;
    private String exerciseOptionsNameSupported;
    private Boolean fwUpdateIsLang;
    private Boolean fwUpdateIsRequired;
    private Boolean fwUpdateIsVersion;
    private String fwUpdateLang;
    private String fwUpdateStatus;
    private String fwUpdateVersion;
    private String fwUpdateVersionFull;
    private Long id;
    private String imageUrl;
    private Date lastMeasurementTime;
    private Date lastSyncTime;
    private Float latestFirmwareApp;
    private String latestFirmwareAppVersion;
    private Float latestFirmwareBsl;
    private String latestFirmwareBslVersion;
    private String mac;
    private transient DeviceDao myDao;
    private String name;
    private String network;
    private String primaryGoalsSupported;
    private Profile profile;
    private Long profileId;
    private Long profile__resolvedKey;
    private Long serverId;
    private String tapGestureOptionsDisplayNameSupported;
    private String tapGestureOptionsNameSupported;
    private Date timeCreated;
    private Date timeUpdated;
    private TrackerSettings trackerSettings;
    private Long trackerSettingsId;
    private Long trackerSettings__resolvedKey;
    private Integer type;
    private String uuid;
    private String version;
    private String watchCheckOptionsDisplayNameSupported;
    private String watchCheckOptionsNameSupported;
    private String wireId;

    public Device()
    {
    }

    public Device(Long long1)
    {
        id = long1;
    }

    public Device(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Date date2, 
            Date date3, String s1, String s2, String s3, String s4, String s5, Integer integer1, 
            Integer integer2, String s6, Double double1, String s7, Float float1, Float float2, Float float3, 
            Float float4, Boolean boolean1, String s8, String s9, String s10, String s11, String s12, 
            String s13, String s14, String s15, String s16, String s17, String s18, String s19, 
            String s20, String s21, Boolean boolean2, Boolean boolean3, Boolean boolean4, String s22, String s23, 
            String s24, String s25, String s26, String s27, String s28, String s29, Long long3, 
            Long long4)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        lastSyncTime = date2;
        lastMeasurementTime = date3;
        encodedId = s1;
        wireId = s2;
        version = s3;
        network = s4;
        name = s5;
        batteryLevel = integer1;
        type = integer2;
        defaultUnit = s6;
        brightness = double1;
        mac = s7;
        currentFirmwareApp = float1;
        currentFirmwareBsl = float2;
        latestFirmwareApp = float3;
        latestFirmwareBsl = float4;
        encrypted = boolean1;
        currentFirmwareAppVersion = s8;
        currentFirmwareBslVersion = s9;
        latestFirmwareAppVersion = s10;
        latestFirmwareBslVersion = s11;
        primaryGoalsSupported = s12;
        clockFacesUrlSupported = s13;
        clockFacesNameSupported = s14;
        imageUrl = s15;
        exerciseOptionsIdSupported = s16;
        exerciseOptionsNameSupported = s17;
        clockFacesDisplayNameSupported = s18;
        tapGestureOptionsNameSupported = s19;
        tapGestureOptionsDisplayNameSupported = s20;
        fwUpdateStatus = s21;
        fwUpdateIsRequired = boolean2;
        fwUpdateIsVersion = boolean3;
        fwUpdateIsLang = boolean4;
        fwUpdateLang = s22;
        fwUpdateVersion = s23;
        fwUpdateVersionFull = s24;
        watchCheckOptionsNameSupported = s25;
        watchCheckOptionsDisplayNameSupported = s26;
        autoLapNameOptions = s27;
        autoLapValueOptions = s28;
        autoLapTypeOptions = s29;
        profileId = long3;
        trackerSettingsId = long4;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getDeviceDao();
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

    public List getAlarmList()
    {
        if (alarmList != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getAlarmDao()._queryDevice_AlarmList(id);
        this;
        JVM INSTR monitorenter ;
        if (alarmList == null)
        {
            alarmList = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return alarmList;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getAutoLapNameOptions()
    {
        return autoLapNameOptions;
    }

    public String getAutoLapTypeOptions()
    {
        return autoLapTypeOptions;
    }

    public String getAutoLapValueOptions()
    {
        return autoLapValueOptions;
    }

    public Integer getBatteryLevel()
    {
        return batteryLevel;
    }

    public Double getBrightness()
    {
        return brightness;
    }

    public String getClockFacesDisplayNameSupported()
    {
        return clockFacesDisplayNameSupported;
    }

    public String getClockFacesNameSupported()
    {
        return clockFacesNameSupported;
    }

    public String getClockFacesUrlSupported()
    {
        return clockFacesUrlSupported;
    }

    public Float getCurrentFirmwareApp()
    {
        return currentFirmwareApp;
    }

    public String getCurrentFirmwareAppVersion()
    {
        return currentFirmwareAppVersion;
    }

    public Float getCurrentFirmwareBsl()
    {
        return currentFirmwareBsl;
    }

    public String getCurrentFirmwareBslVersion()
    {
        return currentFirmwareBslVersion;
    }

    public String getDefaultUnit()
    {
        return defaultUnit;
    }

    public String getEncodedId()
    {
        return encodedId;
    }

    public Boolean getEncrypted()
    {
        return encrypted;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public String getExerciseOptionsIdSupported()
    {
        return exerciseOptionsIdSupported;
    }

    public String getExerciseOptionsNameSupported()
    {
        return exerciseOptionsNameSupported;
    }

    public Boolean getFwUpdateIsLang()
    {
        return fwUpdateIsLang;
    }

    public Boolean getFwUpdateIsRequired()
    {
        return fwUpdateIsRequired;
    }

    public Boolean getFwUpdateIsVersion()
    {
        return fwUpdateIsVersion;
    }

    public String getFwUpdateLang()
    {
        return fwUpdateLang;
    }

    public String getFwUpdateStatus()
    {
        return fwUpdateStatus;
    }

    public String getFwUpdateVersion()
    {
        return fwUpdateVersion;
    }

    public String getFwUpdateVersionFull()
    {
        return fwUpdateVersionFull;
    }

    public Long getId()
    {
        return id;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public Date getLastMeasurementTime()
    {
        return lastMeasurementTime;
    }

    public Date getLastSyncTime()
    {
        return lastSyncTime;
    }

    public Float getLatestFirmwareApp()
    {
        return latestFirmwareApp;
    }

    public String getLatestFirmwareAppVersion()
    {
        return latestFirmwareAppVersion;
    }

    public Float getLatestFirmwareBsl()
    {
        return latestFirmwareBsl;
    }

    public String getLatestFirmwareBslVersion()
    {
        return latestFirmwareBslVersion;
    }

    public String getMac()
    {
        return mac;
    }

    public String getName()
    {
        return name;
    }

    public String getNetwork()
    {
        return network;
    }

    public String getPrimaryGoalsSupported()
    {
        return primaryGoalsSupported;
    }

    public Profile getProfile()
    {
        Long long1 = profileId;
        if (profile__resolvedKey != null && profile__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        Profile profile1 = (Profile)daoSession.getProfileDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        profile = profile1;
        profile__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return profile;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getProfileId()
    {
        return profileId;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public String getTapGestureOptionsDisplayNameSupported()
    {
        return tapGestureOptionsDisplayNameSupported;
    }

    public String getTapGestureOptionsNameSupported()
    {
        return tapGestureOptionsNameSupported;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public TrackerSettings getTrackerSettings()
    {
        Long long1 = trackerSettingsId;
        if (trackerSettings__resolvedKey != null && trackerSettings__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        TrackerSettings trackersettings = (TrackerSettings)daoSession.getTrackerSettingsDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        trackerSettings = trackersettings;
        trackerSettings__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return trackerSettings;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getTrackerSettingsId()
    {
        return trackerSettingsId;
    }

    public Integer getType()
    {
        return type;
    }

    public String getUuid()
    {
        return uuid;
    }

    public String getVersion()
    {
        return version;
    }

    public String getWatchCheckOptionsDisplayNameSupported()
    {
        return watchCheckOptionsDisplayNameSupported;
    }

    public String getWatchCheckOptionsNameSupported()
    {
        return watchCheckOptionsNameSupported;
    }

    public String getWireId()
    {
        return wireId;
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

    public void resetAlarmList()
    {
        this;
        JVM INSTR monitorenter ;
        alarmList = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setAutoLapNameOptions(String s)
    {
        autoLapNameOptions = s;
    }

    public void setAutoLapTypeOptions(String s)
    {
        autoLapTypeOptions = s;
    }

    public void setAutoLapValueOptions(String s)
    {
        autoLapValueOptions = s;
    }

    public void setBatteryLevel(Integer integer)
    {
        batteryLevel = integer;
    }

    public void setBrightness(Double double1)
    {
        brightness = double1;
    }

    public void setClockFacesDisplayNameSupported(String s)
    {
        clockFacesDisplayNameSupported = s;
    }

    public void setClockFacesNameSupported(String s)
    {
        clockFacesNameSupported = s;
    }

    public void setClockFacesUrlSupported(String s)
    {
        clockFacesUrlSupported = s;
    }

    public void setCurrentFirmwareApp(Float float1)
    {
        currentFirmwareApp = float1;
    }

    public void setCurrentFirmwareAppVersion(String s)
    {
        currentFirmwareAppVersion = s;
    }

    public void setCurrentFirmwareBsl(Float float1)
    {
        currentFirmwareBsl = float1;
    }

    public void setCurrentFirmwareBslVersion(String s)
    {
        currentFirmwareBslVersion = s;
    }

    public void setDefaultUnit(String s)
    {
        defaultUnit = s;
    }

    public void setEncodedId(String s)
    {
        encodedId = s;
    }

    public void setEncrypted(Boolean boolean1)
    {
        encrypted = boolean1;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setExerciseOptionsIdSupported(String s)
    {
        exerciseOptionsIdSupported = s;
    }

    public void setExerciseOptionsNameSupported(String s)
    {
        exerciseOptionsNameSupported = s;
    }

    public void setFwUpdateIsLang(Boolean boolean1)
    {
        fwUpdateIsLang = boolean1;
    }

    public void setFwUpdateIsRequired(Boolean boolean1)
    {
        fwUpdateIsRequired = boolean1;
    }

    public void setFwUpdateIsVersion(Boolean boolean1)
    {
        fwUpdateIsVersion = boolean1;
    }

    public void setFwUpdateLang(String s)
    {
        fwUpdateLang = s;
    }

    public void setFwUpdateStatus(String s)
    {
        fwUpdateStatus = s;
    }

    public void setFwUpdateVersion(String s)
    {
        fwUpdateVersion = s;
    }

    public void setFwUpdateVersionFull(String s)
    {
        fwUpdateVersionFull = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageUrl(String s)
    {
        imageUrl = s;
    }

    public void setLastMeasurementTime(Date date)
    {
        lastMeasurementTime = date;
    }

    public void setLastSyncTime(Date date)
    {
        lastSyncTime = date;
    }

    public void setLatestFirmwareApp(Float float1)
    {
        latestFirmwareApp = float1;
    }

    public void setLatestFirmwareAppVersion(String s)
    {
        latestFirmwareAppVersion = s;
    }

    public void setLatestFirmwareBsl(Float float1)
    {
        latestFirmwareBsl = float1;
    }

    public void setLatestFirmwareBslVersion(String s)
    {
        latestFirmwareBslVersion = s;
    }

    public void setMac(String s)
    {
        mac = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNetwork(String s)
    {
        network = s;
    }

    public void setPrimaryGoalsSupported(String s)
    {
        primaryGoalsSupported = s;
    }

    public void setProfile(Profile profile1)
    {
        this;
        JVM INSTR monitorenter ;
        profile = profile1;
        if (profile1 != null) goto _L2; else goto _L1
_L1:
        profile1 = null;
_L4:
        profileId = profile1;
        profile__resolvedKey = profileId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        profile1 = profile1.getId();
        if (true) goto _L4; else goto _L3
_L3:
        profile1;
        this;
        JVM INSTR monitorexit ;
        throw profile1;
    }

    public void setProfileId(Long long1)
    {
        profileId = long1;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setTapGestureOptionsDisplayNameSupported(String s)
    {
        tapGestureOptionsDisplayNameSupported = s;
    }

    public void setTapGestureOptionsNameSupported(String s)
    {
        tapGestureOptionsNameSupported = s;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeUpdated(Date date)
    {
        timeUpdated = date;
    }

    public void setTrackerSettings(TrackerSettings trackersettings)
    {
        this;
        JVM INSTR monitorenter ;
        trackerSettings = trackersettings;
        if (trackersettings != null) goto _L2; else goto _L1
_L1:
        trackersettings = null;
_L4:
        trackerSettingsId = trackersettings;
        trackerSettings__resolvedKey = trackerSettingsId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        trackersettings = trackersettings.getId();
        if (true) goto _L4; else goto _L3
_L3:
        trackersettings;
        this;
        JVM INSTR monitorexit ;
        throw trackersettings;
    }

    public void setTrackerSettingsId(Long long1)
    {
        trackerSettingsId = long1;
    }

    public void setType(Integer integer)
    {
        type = integer;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }

    public void setVersion(String s)
    {
        version = s;
    }

    public void setWatchCheckOptionsDisplayNameSupported(String s)
    {
        watchCheckOptionsDisplayNameSupported = s;
    }

    public void setWatchCheckOptionsNameSupported(String s)
    {
        watchCheckOptionsNameSupported = s;
    }

    public void setWireId(String s)
    {
        wireId = s;
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
