// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AlarmDao

public static class 
{

    public static final Property DaysOfWeek = new Property(15, java/lang/Integer, "daysOfWeek", false, "DAYS_OF_WEEK");
    public static final Property Deleted = new Property(16, java/lang/Boolean, "deleted", false, "DELETED");
    public static final Property DeviceId = new Property(17, java/lang/Long, "deviceId", false, "DEVICE_ID");
    public static final Property Enabled = new Property(6, java/lang/Boolean, "enabled", false, "ENABLED");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property Label = new Property(8, java/lang/String, "label", false, "LABEL");
    public static final Property Recurring = new Property(7, java/lang/Boolean, "recurring", false, "RECURRING");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property SnoozeCount = new Property(9, java/lang/Integer, "snoozeCount", false, "SNOOZE_COUNT");
    public static final Property SnoozeLength = new Property(10, java/lang/Long, "snoozeLength", false, "SNOOZE_LENGTH");
    public static final Property StayVisible = new Property(11, java/lang/Boolean, "stayVisible", false, "STAY_VISIBLE");
    public static final Property SyncedToDevice = new Property(12, java/lang/Boolean, "syncedToDevice", false, "SYNCED_TO_DEVICE");
    public static final Property Time = new Property(13, java/util/Date, "time", false, "TIME");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
    public static final Property VibePattern = new Property(14, java/lang/String, "vibePattern", false, "VIBE_PATTERN");


    public ()
    {
    }
}
