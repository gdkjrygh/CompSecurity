// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;


public class TrackerSettings
{

    private String autoLap;
    private String bondedPeerId;
    private String bondedPeerName;
    private String clockFaceDisplayName;
    private String clockFaceImageUrl;
    private String clockFaceName;
    private Boolean displayActiveMinutes;
    private Boolean displayCalories;
    private Boolean displayChatter;
    private Boolean displayClock;
    private Boolean displayDistance;
    private Boolean displayElevation;
    private Boolean displayEmote;
    private Boolean displayGreeting;
    private Boolean displayHeartRate;
    private Boolean displaySteps;
    private Boolean enableAncs;
    private Boolean enableSleepAnnotations;
    private String exercises;
    private String greeting;
    private String handedness;
    private String heartRateTracking;
    private Long id;
    private Boolean onDominantHand;
    private String primaryGoal;
    private String screenOrder;
    private String tapGesture;
    private String watchCheck;

    public TrackerSettings()
    {
    }

    public TrackerSettings(Long long1)
    {
        id = long1;
    }

    public TrackerSettings(Long long1, Boolean boolean1, Boolean boolean2, Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6, 
            Boolean boolean7, Boolean boolean8, Boolean boolean9, String s, String s1, String s2, String s3, 
            String s4, String s5, Boolean boolean10, Boolean boolean11, Boolean boolean12, String s6, String s7, 
            String s8, String s9, String s10, Boolean boolean13, String s11, String s12, String s13)
    {
        id = long1;
        displayActiveMinutes = boolean1;
        displayCalories = boolean2;
        displayChatter = boolean3;
        displayClock = boolean4;
        displayDistance = boolean5;
        displayElevation = boolean6;
        displayEmote = boolean7;
        displayGreeting = boolean8;
        onDominantHand = boolean9;
        greeting = s;
        handedness = s1;
        primaryGoal = s2;
        screenOrder = s3;
        clockFaceImageUrl = s4;
        clockFaceName = s5;
        displaySteps = boolean10;
        enableAncs = boolean11;
        enableSleepAnnotations = boolean12;
        heartRateTracking = s6;
        exercises = s7;
        tapGesture = s8;
        watchCheck = s9;
        clockFaceDisplayName = s10;
        displayHeartRate = boolean13;
        bondedPeerName = s11;
        bondedPeerId = s12;
        autoLap = s13;
    }

    public String getAutoLap()
    {
        return autoLap;
    }

    public String getBondedPeerId()
    {
        return bondedPeerId;
    }

    public String getBondedPeerName()
    {
        return bondedPeerName;
    }

    public String getClockFaceDisplayName()
    {
        return clockFaceDisplayName;
    }

    public String getClockFaceImageUrl()
    {
        return clockFaceImageUrl;
    }

    public String getClockFaceName()
    {
        return clockFaceName;
    }

    public Boolean getDisplayActiveMinutes()
    {
        return displayActiveMinutes;
    }

    public Boolean getDisplayCalories()
    {
        return displayCalories;
    }

    public Boolean getDisplayChatter()
    {
        return displayChatter;
    }

    public Boolean getDisplayClock()
    {
        return displayClock;
    }

    public Boolean getDisplayDistance()
    {
        return displayDistance;
    }

    public Boolean getDisplayElevation()
    {
        return displayElevation;
    }

    public Boolean getDisplayEmote()
    {
        return displayEmote;
    }

    public Boolean getDisplayGreeting()
    {
        return displayGreeting;
    }

    public Boolean getDisplayHeartRate()
    {
        return displayHeartRate;
    }

    public Boolean getDisplaySteps()
    {
        return displaySteps;
    }

    public Boolean getEnableAncs()
    {
        return enableAncs;
    }

    public Boolean getEnableSleepAnnotations()
    {
        return enableSleepAnnotations;
    }

    public String getExercises()
    {
        return exercises;
    }

    public String getGreeting()
    {
        return greeting;
    }

    public String getHandedness()
    {
        return handedness;
    }

    public String getHeartRateTracking()
    {
        return heartRateTracking;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getOnDominantHand()
    {
        return onDominantHand;
    }

    public String getPrimaryGoal()
    {
        return primaryGoal;
    }

    public String getScreenOrder()
    {
        return screenOrder;
    }

    public String getTapGesture()
    {
        return tapGesture;
    }

    public String getWatchCheck()
    {
        return watchCheck;
    }

    public void setAutoLap(String s)
    {
        autoLap = s;
    }

    public void setBondedPeerId(String s)
    {
        bondedPeerId = s;
    }

    public void setBondedPeerName(String s)
    {
        bondedPeerName = s;
    }

    public void setClockFaceDisplayName(String s)
    {
        clockFaceDisplayName = s;
    }

    public void setClockFaceImageUrl(String s)
    {
        clockFaceImageUrl = s;
    }

    public void setClockFaceName(String s)
    {
        clockFaceName = s;
    }

    public void setDisplayActiveMinutes(Boolean boolean1)
    {
        displayActiveMinutes = boolean1;
    }

    public void setDisplayCalories(Boolean boolean1)
    {
        displayCalories = boolean1;
    }

    public void setDisplayChatter(Boolean boolean1)
    {
        displayChatter = boolean1;
    }

    public void setDisplayClock(Boolean boolean1)
    {
        displayClock = boolean1;
    }

    public void setDisplayDistance(Boolean boolean1)
    {
        displayDistance = boolean1;
    }

    public void setDisplayElevation(Boolean boolean1)
    {
        displayElevation = boolean1;
    }

    public void setDisplayEmote(Boolean boolean1)
    {
        displayEmote = boolean1;
    }

    public void setDisplayGreeting(Boolean boolean1)
    {
        displayGreeting = boolean1;
    }

    public void setDisplayHeartRate(Boolean boolean1)
    {
        displayHeartRate = boolean1;
    }

    public void setDisplaySteps(Boolean boolean1)
    {
        displaySteps = boolean1;
    }

    public void setEnableAncs(Boolean boolean1)
    {
        enableAncs = boolean1;
    }

    public void setEnableSleepAnnotations(Boolean boolean1)
    {
        enableSleepAnnotations = boolean1;
    }

    public void setExercises(String s)
    {
        exercises = s;
    }

    public void setGreeting(String s)
    {
        greeting = s;
    }

    public void setHandedness(String s)
    {
        handedness = s;
    }

    public void setHeartRateTracking(String s)
    {
        heartRateTracking = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setOnDominantHand(Boolean boolean1)
    {
        onDominantHand = boolean1;
    }

    public void setPrimaryGoal(String s)
    {
        primaryGoal = s;
    }

    public void setScreenOrder(String s)
    {
        screenOrder = s;
    }

    public void setTapGesture(String s)
    {
        tapGesture = s;
    }

    public void setWatchCheck(String s)
    {
        watchCheck = s;
    }
}
