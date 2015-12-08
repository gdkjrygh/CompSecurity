// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.DaoException;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoSession, ProfileDao, DeviceDao, DietPlanDao, 
//            DietPlan

public class Profile
{

    private Boolean challengesBeta;
    private String city;
    private String country;
    private Boolean customHeartRateZoneEnabled;
    private Integer customHeartRateZoneMax;
    private Integer customHeartRateZoneMin;
    private transient DaoSession daoSession;
    private Date dateOfBirth;
    private List deviceList;
    private DietPlan dietPlan;
    private Long dietPlanId;
    private Long dietPlan__resolvedKey;
    private String distanceUnit;
    private String encodedId;
    private Integer entityStatus;
    private Boolean foodBudgetEnabled;
    private String foodLocale;
    private String fullName;
    private String gender;
    private Double height;
    private String heightUnit;
    private Boolean hideMeFromLeaderboard;
    private Long id;
    private String languageLocale;
    private Date lastTrackerUpdateTime;
    private transient ProfileDao myDao;
    private String nickname;
    private String oauthSecret;
    private String oauthToken;
    private String profilePhotoLink;
    private Long serverId;
    private String state;
    private Double strideLengthRunning;
    private Double strideLengthWalking;
    private Date timeCreated;
    private Date timeUpdated;
    private String timeZone;
    private String timeZoneOffset;
    private Boolean trackerUser;
    private Boolean trainerEnabled;
    private Boolean tychoIsPaired;
    private String uuid;
    private String waterUnit;
    private String weightUnit;

    public Profile()
    {
    }

    public Profile(Long long1)
    {
        id = long1;
    }

    public Profile(Long long1, Long long2, String s, Date date, Date date1, Integer integer, String s1, 
            String s2, Date date2, String s3, String s4, Double double1, String s5, String s6, 
            String s7, String s8, Double double2, Double double3, String s9, Boolean boolean1, Boolean boolean2, 
            Boolean boolean3, Boolean boolean4, Date date3, String s10, String s11, Boolean boolean5, String s12, 
            String s13, String s14, String s15, String s16, String s17, String s18, Boolean boolean6, 
            Boolean boolean7, Integer integer1, Integer integer2, Long long3)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        encodedId = s1;
        fullName = s2;
        dateOfBirth = date2;
        oauthToken = s3;
        oauthSecret = s4;
        height = double1;
        gender = s5;
        nickname = s6;
        timeZoneOffset = s7;
        timeZone = s8;
        strideLengthRunning = double2;
        strideLengthWalking = double3;
        profilePhotoLink = s9;
        foodBudgetEnabled = boolean1;
        tychoIsPaired = boolean2;
        trackerUser = boolean3;
        trainerEnabled = boolean4;
        lastTrackerUpdateTime = date3;
        distanceUnit = s10;
        foodLocale = s11;
        hideMeFromLeaderboard = boolean5;
        country = s12;
        heightUnit = s13;
        weightUnit = s14;
        waterUnit = s15;
        languageLocale = s16;
        state = s17;
        city = s18;
        challengesBeta = boolean6;
        customHeartRateZoneEnabled = boolean7;
        customHeartRateZoneMin = integer1;
        customHeartRateZoneMax = integer2;
        dietPlanId = long3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getProfileDao();
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

    public Boolean getChallengesBeta()
    {
        return challengesBeta;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public Boolean getCustomHeartRateZoneEnabled()
    {
        return customHeartRateZoneEnabled;
    }

    public Integer getCustomHeartRateZoneMax()
    {
        return customHeartRateZoneMax;
    }

    public Integer getCustomHeartRateZoneMin()
    {
        return customHeartRateZoneMin;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public List getDeviceList()
    {
        if (deviceList != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getDeviceDao()._queryProfile_DeviceList(id);
        this;
        JVM INSTR monitorenter ;
        if (deviceList == null)
        {
            deviceList = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return deviceList;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public DietPlan getDietPlan()
    {
        Long long1 = dietPlanId;
        if (dietPlan__resolvedKey != null && dietPlan__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        DietPlan dietplan = (DietPlan)daoSession.getDietPlanDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        dietPlan = dietplan;
        dietPlan__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return dietPlan;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getDietPlanId()
    {
        return dietPlanId;
    }

    public String getDistanceUnit()
    {
        return distanceUnit;
    }

    public String getEncodedId()
    {
        return encodedId;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Boolean getFoodBudgetEnabled()
    {
        return foodBudgetEnabled;
    }

    public String getFoodLocale()
    {
        return foodLocale;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getGender()
    {
        return gender;
    }

    public Double getHeight()
    {
        return height;
    }

    public String getHeightUnit()
    {
        return heightUnit;
    }

    public Boolean getHideMeFromLeaderboard()
    {
        return hideMeFromLeaderboard;
    }

    public Long getId()
    {
        return id;
    }

    public String getLanguageLocale()
    {
        return languageLocale;
    }

    public Date getLastTrackerUpdateTime()
    {
        return lastTrackerUpdateTime;
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getOauthSecret()
    {
        return oauthSecret;
    }

    public String getOauthToken()
    {
        return oauthToken;
    }

    public String getProfilePhotoLink()
    {
        return profilePhotoLink;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public String getState()
    {
        return state;
    }

    public Double getStrideLengthRunning()
    {
        return strideLengthRunning;
    }

    public Double getStrideLengthWalking()
    {
        return strideLengthWalking;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public String getTimeZone()
    {
        return timeZone;
    }

    public String getTimeZoneOffset()
    {
        return timeZoneOffset;
    }

    public Boolean getTrackerUser()
    {
        return trackerUser;
    }

    public Boolean getTrainerEnabled()
    {
        return trainerEnabled;
    }

    public Boolean getTychoIsPaired()
    {
        return tychoIsPaired;
    }

    public String getUuid()
    {
        return uuid;
    }

    public String getWaterUnit()
    {
        return waterUnit;
    }

    public String getWeightUnit()
    {
        return weightUnit;
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

    public void resetDeviceList()
    {
        this;
        JVM INSTR monitorenter ;
        deviceList = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setChallengesBeta(Boolean boolean1)
    {
        challengesBeta = boolean1;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setCustomHeartRateZoneEnabled(Boolean boolean1)
    {
        customHeartRateZoneEnabled = boolean1;
    }

    public void setCustomHeartRateZoneMax(Integer integer)
    {
        customHeartRateZoneMax = integer;
    }

    public void setCustomHeartRateZoneMin(Integer integer)
    {
        customHeartRateZoneMin = integer;
    }

    public void setDateOfBirth(Date date)
    {
        dateOfBirth = date;
    }

    public void setDietPlan(DietPlan dietplan)
    {
        this;
        JVM INSTR monitorenter ;
        dietPlan = dietplan;
        if (dietplan != null) goto _L2; else goto _L1
_L1:
        dietplan = null;
_L4:
        dietPlanId = dietplan;
        dietPlan__resolvedKey = dietPlanId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        dietplan = dietplan.getId();
        if (true) goto _L4; else goto _L3
_L3:
        dietplan;
        this;
        JVM INSTR monitorexit ;
        throw dietplan;
    }

    public void setDietPlanId(Long long1)
    {
        dietPlanId = long1;
    }

    public void setDistanceUnit(String s)
    {
        distanceUnit = s;
    }

    public void setEncodedId(String s)
    {
        encodedId = s;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setFoodBudgetEnabled(Boolean boolean1)
    {
        foodBudgetEnabled = boolean1;
    }

    public void setFoodLocale(String s)
    {
        foodLocale = s;
    }

    public void setFullName(String s)
    {
        fullName = s;
    }

    public void setGender(String s)
    {
        gender = s;
    }

    public void setHeight(Double double1)
    {
        height = double1;
    }

    public void setHeightUnit(String s)
    {
        heightUnit = s;
    }

    public void setHideMeFromLeaderboard(Boolean boolean1)
    {
        hideMeFromLeaderboard = boolean1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLanguageLocale(String s)
    {
        languageLocale = s;
    }

    public void setLastTrackerUpdateTime(Date date)
    {
        lastTrackerUpdateTime = date;
    }

    public void setNickname(String s)
    {
        nickname = s;
    }

    public void setOauthSecret(String s)
    {
        oauthSecret = s;
    }

    public void setOauthToken(String s)
    {
        oauthToken = s;
    }

    public void setProfilePhotoLink(String s)
    {
        profilePhotoLink = s;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setStrideLengthRunning(Double double1)
    {
        strideLengthRunning = double1;
    }

    public void setStrideLengthWalking(Double double1)
    {
        strideLengthWalking = double1;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeUpdated(Date date)
    {
        timeUpdated = date;
    }

    public void setTimeZone(String s)
    {
        timeZone = s;
    }

    public void setTimeZoneOffset(String s)
    {
        timeZoneOffset = s;
    }

    public void setTrackerUser(Boolean boolean1)
    {
        trackerUser = boolean1;
    }

    public void setTrainerEnabled(Boolean boolean1)
    {
        trainerEnabled = boolean1;
    }

    public void setTychoIsPaired(Boolean boolean1)
    {
        tychoIsPaired = boolean1;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }

    public void setWaterUnit(String s)
    {
        waterUnit = s;
    }

    public void setWeightUnit(String s)
    {
        weightUnit = s;
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
