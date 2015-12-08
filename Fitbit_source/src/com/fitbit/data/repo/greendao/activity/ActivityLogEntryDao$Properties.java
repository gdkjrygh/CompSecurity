// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            ActivityLogEntryDao

public static class 
{

    public static final Property ActivityItemId = new Property(30, java/lang/Long, "activityItemId", false, "ACTIVITY_ITEM_ID");
    public static final Property ActivityItemServerId = new Property(16, java/lang/Long, "activityItemServerId", false, "ACTIVITY_ITEM_SERVER_ID");
    public static final Property AverageHeartRate = new Property(28, java/lang/Integer, "averageHeartRate", false, "AVERAGE_HEART_RATE");
    public static final Property Calories = new Property(9, java/lang/Integer, "calories", false, "CALORIES");
    public static final Property CaloriesLink = new Property(21, java/lang/String, "caloriesLink", false, "CALORIES_LINK");
    public static final Property CaloriesOnServer = new Property(14, java/lang/Integer, "caloriesOnServer", false, "CALORIES_ON_SERVER");
    public static final Property CardioHeartRateZoneMinutes = new Property(23, java/lang/Integer, "cardioHeartRateZoneMinutes", false, "CARDIO_HEART_RATE_ZONE_MINUTES");
    public static final Property DetailsId = new Property(17, java/lang/String, "detailsId", false, "DETAILS_ID");
    public static final Property DetailsType = new Property(18, java/lang/String, "detailsType", false, "DETAILS_TYPE");
    public static final Property Distance = new Property(10, java/lang/Double, "distance", false, "DISTANCE");
    public static final Property Duration = new Property(11, java/lang/Integer, "duration", false, "DURATION");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property FatBurnHeartRateZoneMinutes = new Property(22, java/lang/Integer, "fatBurnHeartRateZoneMinutes", false, "FAT_BURN_HEART_RATE_ZONE_MINUTES");
    public static final Property HasDetails = new Property(19, java/lang/Boolean, "hasDetails", false, "HAS_DETAILS");
    public static final Property HeartRateLink = new Property(20, java/lang/String, "heartRateLink", false, "HEART_RATE_LINK");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property LastModified = new Property(25, java/util/Date, "lastModified", false, "LAST_MODIFIED");
    public static final Property LogDate = new Property(8, java/util/Date, "logDate", false, "LOG_DATE");
    public static final Property ManualCaloriesPopulated = new Property(15, java/lang/Boolean, "manualCaloriesPopulated", false, "MANUAL_CALORIES_POPULATED");
    public static final Property ModeratelyActiveMinutes = new Property(27, java/lang/Integer, "moderatelyActiveMinutes", false, "MODERATELY_ACTIVE_MINUTES");
    public static final Property Name = new Property(29, java/lang/String, "name", false, "NAME");
    public static final Property PeakHeartRateZoneMinutes = new Property(24, java/lang/Integer, "peakHeartRateZoneMinutes", false, "PEAK_HEART_RATE_ZONE_MINUTES");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property StartTime = new Property(12, java/util/Date, "startTime", false, "START_TIME");
    public static final Property Steps = new Property(13, java/lang/Integer, "steps", false, "STEPS");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property TrackerType = new Property(7, java/lang/String, "trackerType", false, "TRACKER_TYPE");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
    public static final Property Value = new Property(6, java/lang/Double, "value", false, "VALUE");
    public static final Property VeryActiveMinutes = new Property(26, java/lang/Integer, "veryActiveMinutes", false, "VERY_ACTIVE_MINUTES");


    public ()
    {
    }
}
