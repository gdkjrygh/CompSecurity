// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            SleepLogEntryDao

public static class 
{

    public static final Property AwakeCount = new Property(19, java/lang/Integer, "awakeCount", false, "AWAKE_COUNT");
    public static final Property AwakeningsCount = new Property(17, java/lang/Integer, "awakeningsCount", false, "AWAKENINGS_COUNT");
    public static final Property Duration = new Property(12, java/lang/Integer, "duration", false, "DURATION");
    public static final Property Efficiency = new Property(10, java/lang/Double, "efficiency", false, "EFFICIENCY");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property IsMainSleep = new Property(9, java/lang/Boolean, "isMainSleep", false, "IS_MAIN_SLEEP");
    public static final Property LogDate = new Property(8, java/util/Date, "logDate", false, "LOG_DATE");
    public static final Property MinutesAfterWakeup = new Property(16, java/lang/Integer, "minutesAfterWakeup", false, "MINUTES_AFTER_WAKEUP");
    public static final Property MinutesAsleep = new Property(14, java/lang/Integer, "minutesAsleep", false, "MINUTES_ASLEEP");
    public static final Property MinutesAwake = new Property(15, java/lang/Integer, "minutesAwake", false, "MINUTES_AWAKE");
    public static final Property MinutesToFallAsleep = new Property(13, java/lang/Integer, "minutesToFallAsleep", false, "MINUTES_TO_FALL_ASLEEP");
    public static final Property RestlessCount = new Property(20, java/lang/Integer, "restlessCount", false, "RESTLESS_COUNT");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property StartTime = new Property(11, java/util/Date, "startTime", false, "START_TIME");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeInBed = new Property(18, java/lang/Integer, "timeInBed", false, "TIME_IN_BED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property TrackerType = new Property(7, java/lang/String, "trackerType", false, "TRACKER_TYPE");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
    public static final Property Value = new Property(6, java/lang/Double, "value", false, "VALUE");


    public ()
    {
    }
}
