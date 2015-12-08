// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DeviceDao

public static class 
{

    public static final Property AutoLapNameOptions = new Property(45, java/lang/String, "autoLapNameOptions", false, "AUTO_LAP_NAME_OPTIONS");
    public static final Property AutoLapTypeOptions = new Property(47, java/lang/String, "autoLapTypeOptions", false, "AUTO_LAP_TYPE_OPTIONS");
    public static final Property AutoLapValueOptions = new Property(46, java/lang/String, "autoLapValueOptions", false, "AUTO_LAP_VALUE_OPTIONS");
    public static final Property BatteryLevel = new Property(13, java/lang/Integer, "batteryLevel", false, "BATTERY_LEVEL");
    public static final Property Brightness = new Property(16, java/lang/Double, "brightness", false, "BRIGHTNESS");
    public static final Property ClockFacesDisplayNameSupported = new Property(33, java/lang/String, "clockFacesDisplayNameSupported", false, "CLOCK_FACES_DISPLAY_NAME_SUPPORTED");
    public static final Property ClockFacesNameSupported = new Property(29, java/lang/String, "clockFacesNameSupported", false, "CLOCK_FACES_NAME_SUPPORTED");
    public static final Property ClockFacesUrlSupported = new Property(28, java/lang/String, "clockFacesUrlSupported", false, "CLOCK_FACES_URL_SUPPORTED");
    public static final Property CurrentFirmwareApp = new Property(18, java/lang/Float, "currentFirmwareApp", false, "CURRENT_FIRMWARE_APP");
    public static final Property CurrentFirmwareAppVersion = new Property(23, java/lang/String, "currentFirmwareAppVersion", false, "CURRENT_FIRMWARE_APP_VERSION");
    public static final Property CurrentFirmwareBsl = new Property(19, java/lang/Float, "currentFirmwareBsl", false, "CURRENT_FIRMWARE_BSL");
    public static final Property CurrentFirmwareBslVersion = new Property(24, java/lang/String, "currentFirmwareBslVersion", false, "CURRENT_FIRMWARE_BSL_VERSION");
    public static final Property DefaultUnit = new Property(15, java/lang/String, "defaultUnit", false, "DEFAULT_UNIT");
    public static final Property EncodedId = new Property(8, java/lang/String, "encodedId", false, "ENCODED_ID");
    public static final Property Encrypted = new Property(22, java/lang/Boolean, "encrypted", false, "ENCRYPTED");
    public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property ExerciseOptionsIdSupported = new Property(31, java/lang/String, "exerciseOptionsIdSupported", false, "EXERCISE_OPTIONS_ID_SUPPORTED");
    public static final Property ExerciseOptionsNameSupported = new Property(32, java/lang/String, "exerciseOptionsNameSupported", false, "EXERCISE_OPTIONS_NAME_SUPPORTED");
    public static final Property FwUpdateIsLang = new Property(39, java/lang/Boolean, "fwUpdateIsLang", false, "FW_UPDATE_IS_LANG");
    public static final Property FwUpdateIsRequired = new Property(37, java/lang/Boolean, "fwUpdateIsRequired", false, "FW_UPDATE_IS_REQUIRED");
    public static final Property FwUpdateIsVersion = new Property(38, java/lang/Boolean, "fwUpdateIsVersion", false, "FW_UPDATE_IS_VERSION");
    public static final Property FwUpdateLang = new Property(40, java/lang/String, "fwUpdateLang", false, "FW_UPDATE_LANG");
    public static final Property FwUpdateStatus = new Property(36, java/lang/String, "fwUpdateStatus", false, "FW_UPDATE_STATUS");
    public static final Property FwUpdateVersion = new Property(41, java/lang/String, "fwUpdateVersion", false, "FW_UPDATE_VERSION");
    public static final Property FwUpdateVersionFull = new Property(42, java/lang/String, "fwUpdateVersionFull", false, "FW_UPDATE_VERSION_FULL");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property ImageUrl = new Property(30, java/lang/String, "imageUrl", false, "IMAGE_URL");
    public static final Property LastMeasurementTime = new Property(7, java/util/Date, "lastMeasurementTime", false, "LAST_MEASUREMENT_TIME");
    public static final Property LastSyncTime = new Property(6, java/util/Date, "lastSyncTime", false, "LAST_SYNC_TIME");
    public static final Property LatestFirmwareApp = new Property(20, java/lang/Float, "latestFirmwareApp", false, "LATEST_FIRMWARE_APP");
    public static final Property LatestFirmwareAppVersion = new Property(25, java/lang/String, "latestFirmwareAppVersion", false, "LATEST_FIRMWARE_APP_VERSION");
    public static final Property LatestFirmwareBsl = new Property(21, java/lang/Float, "latestFirmwareBsl", false, "LATEST_FIRMWARE_BSL");
    public static final Property LatestFirmwareBslVersion = new Property(26, java/lang/String, "latestFirmwareBslVersion", false, "LATEST_FIRMWARE_BSL_VERSION");
    public static final Property Mac = new Property(17, java/lang/String, "mac", false, "MAC");
    public static final Property Name = new Property(12, java/lang/String, "name", false, "NAME");
    public static final Property Network = new Property(11, java/lang/String, "network", false, "NETWORK");
    public static final Property PrimaryGoalsSupported = new Property(27, java/lang/String, "primaryGoalsSupported", false, "PRIMARY_GOALS_SUPPORTED");
    public static final Property ProfileId = new Property(48, java/lang/Long, "profileId", false, "PROFILE_ID");
    public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
    public static final Property TapGestureOptionsDisplayNameSupported = new Property(35, java/lang/String, "tapGestureOptionsDisplayNameSupported", false, "TAP_GESTURE_OPTIONS_DISPLAY_NAME_SUPPORTED");
    public static final Property TapGestureOptionsNameSupported = new Property(34, java/lang/String, "tapGestureOptionsNameSupported", false, "TAP_GESTURE_OPTIONS_NAME_SUPPORTED");
    public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
    public static final Property TrackerSettingsId = new Property(49, java/lang/Long, "trackerSettingsId", false, "TRACKER_SETTINGS_ID");
    public static final Property Type = new Property(14, java/lang/Integer, "type", false, "TYPE");
    public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
    public static final Property Version = new Property(10, java/lang/String, "version", false, "VERSION");
    public static final Property WatchCheckOptionsDisplayNameSupported = new Property(44, java/lang/String, "watchCheckOptionsDisplayNameSupported", false, "WATCH_CHECK_OPTIONS_DISPLAY_NAME_SUPPORTED");
    public static final Property WatchCheckOptionsNameSupported = new Property(43, java/lang/String, "watchCheckOptionsNameSupported", false, "WATCH_CHECK_OPTIONS_NAME_SUPPORTED");
    public static final Property WireId = new Property(9, java/lang/String, "wireId", false, "WIRE_ID");


    public ()
    {
    }
}
