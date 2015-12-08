// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            Device, DaoSession, ProfileDao, TrackerSettingsDao, 
//            Profile, TrackerSettings

public class DeviceDao extends AbstractDao
{
    public static class Properties
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


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "DEVICE";
    private DaoSession daoSession;
    private Query profile_DeviceListQuery;
    private String selectDeep;

    public DeviceDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public DeviceDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
        daoSession = daosession;
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "IF NOT EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'DEVICE' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'LAST_SYNC_TIME' INTEGER,").append("'LAST_MEASUREMENT_TIME' INTEGER,").append("'ENCODED_ID' TEXT,").append("'WIRE_ID' TEXT,").append("'VERSION' TEXT,").append("'NETWORK' TEXT,").append("'NAME' TEXT,").append("'BATTERY_LEVEL' INTEGER,").append("'TYPE' INTEGER,").append("'DEFAULT_UNIT' TEXT,").append("'BRIGHTNESS' REAL,").append("'MAC' TEXT,").append("'CURRENT_FIRMWARE_APP' REAL,").append("'CURRENT_FIRMWARE_BSL' REAL,").append("'LATEST_FIRMWARE_APP' REAL,").append("'LATEST_FIRMWARE_BSL' REAL,").append("'ENCRYPTED' INTEGER,").append("'CURRENT_FIRMWARE_APP_VERSION' TEXT,").append("'CURRENT_FIRMWARE_BSL_VERSION' TEXT,").append("'LATEST_FIRMWARE_APP_VERSION' TEXT,").append("'LATEST_FIRMWARE_BSL_VERSION' TEXT,").append("'PRIMARY_GOALS_SUPPORTED' TEXT,").append("'CLOCK_FACES_URL_SUPPORTED' TEXT,").append("'CLOCK_FACES_NAME_SUPPORTED' TEXT,").append("'IMAGE_URL' TEXT,").append("'EXERCISE_OPTIONS_ID_SUPPORTED' TEXT,").append("'EXERCISE_OPTIONS_NAME_SUPPORTED' TEXT,").append("'CLOCK_FACES_DISPLAY_NAME_SUPPORTED' TEXT,").append("'TAP_GESTURE_OPTIONS_NAME_SUPPORTED' TEXT,").append("'TAP_GESTURE_OPTIONS_DISPLAY_NAME_SUPPORTED' TEXT,").append("'FW_UPDATE_STATUS' TEXT,").append("'FW_UPDATE_IS_REQUIRED' INTEGER,").append("'FW_UPDATE_IS_VERSION' INTEGER,").append("'FW_UPDATE_IS_LANG' INTEGER,").append("'FW_UPDATE_LANG' TEXT,").append("'FW_UPDATE_VERSION' TEXT,").append("'FW_UPDATE_VERSION_FULL' TEXT,").append("'WATCH_CHECK_OPTIONS_NAME_SUPPORTED' TEXT,").append("'WATCH_CHECK_OPTIONS_DISPLAY_NAME_SUPPORTED' TEXT,").append("'AUTO_LAP_NAME_OPTIONS' TEXT,").append("'AUTO_LAP_VALUE_OPTIONS' TEXT,").append("'AUTO_LAP_TYPE_OPTIONS' TEXT,").append("'PROFILE_ID' INTEGER,").append("'TRACKER_SETTINGS_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_DEVICE_UUID ON DEVICE").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_DEVICE_ENTITY_STATUS ON DEVICE").append(" (ENTITY_STATUS);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'DEVICE'").toString());
    }

    public List _queryProfile_DeviceList(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (profile_DeviceListQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.ProfileId.eq(null), new WhereCondition[0]);
            profile_DeviceListQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = profile_DeviceListQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void attachEntity(Device device)
    {
        super.attachEntity(device);
        device.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((Device)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Device device)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = device.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = device.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = device.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = device.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = device.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = device.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = device.getLastSyncTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Date) (obj)).getTime());
        }
        obj = device.getLastMeasurementTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(8, ((Date) (obj)).getTime());
        }
        obj = device.getEncodedId();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = device.getWireId();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = device.getVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = device.getNetwork();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = device.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = device.getBatteryLevel();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Integer) (obj)).intValue());
        }
        obj = device.getType();
        if (obj != null)
        {
            sqlitestatement.bindLong(15, ((Integer) (obj)).intValue());
        }
        obj = device.getDefaultUnit();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = device.getBrightness();
        if (obj != null)
        {
            sqlitestatement.bindDouble(17, ((Double) (obj)).doubleValue());
        }
        obj = device.getMac();
        if (obj != null)
        {
            sqlitestatement.bindString(18, ((String) (obj)));
        }
        obj = device.getCurrentFirmwareApp();
        if (obj != null)
        {
            sqlitestatement.bindDouble(19, ((Float) (obj)).floatValue());
        }
        obj = device.getCurrentFirmwareBsl();
        if (obj != null)
        {
            sqlitestatement.bindDouble(20, ((Float) (obj)).floatValue());
        }
        obj = device.getLatestFirmwareApp();
        if (obj != null)
        {
            sqlitestatement.bindDouble(21, ((Float) (obj)).floatValue());
        }
        obj = device.getLatestFirmwareBsl();
        if (obj != null)
        {
            sqlitestatement.bindDouble(22, ((Float) (obj)).floatValue());
        }
        obj = device.getEncrypted();
        long l;
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(23, l);
        }
        obj = device.getCurrentFirmwareAppVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(24, ((String) (obj)));
        }
        obj = device.getCurrentFirmwareBslVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(25, ((String) (obj)));
        }
        obj = device.getLatestFirmwareAppVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(26, ((String) (obj)));
        }
        obj = device.getLatestFirmwareBslVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(27, ((String) (obj)));
        }
        obj = device.getPrimaryGoalsSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(28, ((String) (obj)));
        }
        obj = device.getClockFacesUrlSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(29, ((String) (obj)));
        }
        obj = device.getClockFacesNameSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(30, ((String) (obj)));
        }
        obj = device.getImageUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(31, ((String) (obj)));
        }
        obj = device.getExerciseOptionsIdSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(32, ((String) (obj)));
        }
        obj = device.getExerciseOptionsNameSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(33, ((String) (obj)));
        }
        obj = device.getClockFacesDisplayNameSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(34, ((String) (obj)));
        }
        obj = device.getTapGestureOptionsNameSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(35, ((String) (obj)));
        }
        obj = device.getTapGestureOptionsDisplayNameSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(36, ((String) (obj)));
        }
        obj = device.getFwUpdateStatus();
        if (obj != null)
        {
            sqlitestatement.bindString(37, ((String) (obj)));
        }
        obj = device.getFwUpdateIsRequired();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(38, l);
        }
        obj = device.getFwUpdateIsVersion();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(39, l);
        }
        obj = device.getFwUpdateIsLang();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(40, l);
        }
        obj = device.getFwUpdateLang();
        if (obj != null)
        {
            sqlitestatement.bindString(41, ((String) (obj)));
        }
        obj = device.getFwUpdateVersion();
        if (obj != null)
        {
            sqlitestatement.bindString(42, ((String) (obj)));
        }
        obj = device.getFwUpdateVersionFull();
        if (obj != null)
        {
            sqlitestatement.bindString(43, ((String) (obj)));
        }
        obj = device.getWatchCheckOptionsNameSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(44, ((String) (obj)));
        }
        obj = device.getWatchCheckOptionsDisplayNameSupported();
        if (obj != null)
        {
            sqlitestatement.bindString(45, ((String) (obj)));
        }
        obj = device.getAutoLapNameOptions();
        if (obj != null)
        {
            sqlitestatement.bindString(46, ((String) (obj)));
        }
        obj = device.getAutoLapValueOptions();
        if (obj != null)
        {
            sqlitestatement.bindString(47, ((String) (obj)));
        }
        obj = device.getAutoLapTypeOptions();
        if (obj != null)
        {
            sqlitestatement.bindString(48, ((String) (obj)));
        }
        obj = device.getProfileId();
        if (obj != null)
        {
            sqlitestatement.bindLong(49, ((Long) (obj)).longValue());
        }
        device = device.getTrackerSettingsId();
        if (device != null)
        {
            sqlitestatement.bindLong(50, device.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Device)obj);
    }

    public Long getKey(Device device)
    {
        if (device != null)
        {
            return device.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Device)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getProfileDao().getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T1", daoSession.getTrackerSettingsDao().getAllColumns());
            stringbuilder.append(" FROM DEVICE T");
            stringbuilder.append(" LEFT JOIN PROFILE T0 ON T.'PROFILE_ID'=T0.'_id'");
            stringbuilder.append(" LEFT JOIN TRACKER_SETTINGS T1 ON T.'TRACKER_SETTINGS_ID'=T1.'_id'");
            stringbuilder.append(' ');
            selectDeep = stringbuilder.toString();
        }
        return selectDeep;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public List loadAllDeepFromCursor(Cursor cursor)
    {
        ArrayList arraylist;
        int i = cursor.getCount();
        arraylist = new ArrayList(i);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (identityScope != null)
        {
            identityScope.lock();
            identityScope.reserveRoom(i);
        }
        boolean flag;
        do
        {
            arraylist.add(loadCurrentDeep(cursor, false));
            flag = cursor.moveToNext();
        } while (flag);
        if (identityScope != null)
        {
            identityScope.unlock();
        }
        return arraylist;
        cursor;
        if (identityScope != null)
        {
            identityScope.unlock();
        }
        throw cursor;
    }

    protected Device loadCurrentDeep(Cursor cursor, boolean flag)
    {
        Device device = (Device)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        device.setProfile((Profile)loadCurrentOther(daoSession.getProfileDao(), cursor, i));
        int j = daoSession.getProfileDao().getAllColumns().length;
        device.setTrackerSettings((TrackerSettings)loadCurrentOther(daoSession.getTrackerSettingsDao(), cursor, j + i));
        return device;
    }

    public Device loadDeep(Long long1)
    {
        assertSinglePk();
        if (long1 == null)
        {
            return null;
        }
        Object obj = new StringBuilder(getSelectDeep());
        ((StringBuilder) (obj)).append("WHERE ");
        SqlUtils.appendColumnsEqValue(((StringBuilder) (obj)), "T", getPkColumns());
        obj = ((StringBuilder) (obj)).toString();
        long1 = long1.toString();
        long1 = db.rawQuery(((String) (obj)), new String[] {
            long1
        });
        boolean flag = long1.moveToFirst();
        if (!flag)
        {
            long1.close();
            return null;
        }
        if (!long1.isLast())
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected unique result, but count was ").append(long1.getCount()).toString());
        }
        break MISSING_BLOCK_LABEL_139;
        Exception exception;
        exception;
        long1.close();
        throw exception;
        Device device = loadCurrentDeep(long1, true);
        long1.close();
        return device;
    }

    protected List loadDeepAllAndCloseCursor(Cursor cursor)
    {
        List list = loadAllDeepFromCursor(cursor);
        cursor.close();
        return list;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public transient List queryDeep(String s, String as[])
    {
        return loadDeepAllAndCloseCursor(db.rawQuery((new StringBuilder()).append(getSelectDeep()).append(s).toString(), as));
    }

    public Device readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Date date2;
        Date date3;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        Integer integer1;
        Integer integer2;
        String s6;
        Double double1;
        String s7;
        Float float1;
        Float float2;
        Float float3;
        Float float4;
        Boolean boolean1;
        String s8;
        String s9;
        String s10;
        String s11;
        String s12;
        String s13;
        String s14;
        String s15;
        String s16;
        String s17;
        String s18;
        String s19;
        String s20;
        String s21;
        Boolean boolean2;
        Boolean boolean3;
        Boolean boolean4;
        String s22;
        String s23;
        String s24;
        String s25;
        String s26;
        String s27;
        String s28;
        String s29;
        Long long3;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            date1 = null;
        } else
        {
            date1 = new Date(cursor.getLong(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            date3 = null;
        } else
        {
            date3 = new Date(cursor.getLong(i + 7));
        }
        if (cursor.isNull(i + 8))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 14));
        }
        if (cursor.isNull(i + 15))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 16));
        }
        if (cursor.isNull(i + 17))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 17);
        }
        if (cursor.isNull(i + 18))
        {
            float1 = null;
        } else
        {
            float1 = Float.valueOf(cursor.getFloat(i + 18));
        }
        if (cursor.isNull(i + 19))
        {
            float2 = null;
        } else
        {
            float2 = Float.valueOf(cursor.getFloat(i + 19));
        }
        if (cursor.isNull(i + 20))
        {
            float3 = null;
        } else
        {
            float3 = Float.valueOf(cursor.getFloat(i + 20));
        }
        if (cursor.isNull(i + 21))
        {
            float4 = null;
        } else
        {
            float4 = Float.valueOf(cursor.getFloat(i + 21));
        }
        if (cursor.isNull(i + 22))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 22) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 23))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 23);
        }
        if (cursor.isNull(i + 24))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 24);
        }
        if (cursor.isNull(i + 25))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 25);
        }
        if (cursor.isNull(i + 26))
        {
            s11 = null;
        } else
        {
            s11 = cursor.getString(i + 26);
        }
        if (cursor.isNull(i + 27))
        {
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 27);
        }
        if (cursor.isNull(i + 28))
        {
            s13 = null;
        } else
        {
            s13 = cursor.getString(i + 28);
        }
        if (cursor.isNull(i + 29))
        {
            s14 = null;
        } else
        {
            s14 = cursor.getString(i + 29);
        }
        if (cursor.isNull(i + 30))
        {
            s15 = null;
        } else
        {
            s15 = cursor.getString(i + 30);
        }
        if (cursor.isNull(i + 31))
        {
            s16 = null;
        } else
        {
            s16 = cursor.getString(i + 31);
        }
        if (cursor.isNull(i + 32))
        {
            s17 = null;
        } else
        {
            s17 = cursor.getString(i + 32);
        }
        if (cursor.isNull(i + 33))
        {
            s18 = null;
        } else
        {
            s18 = cursor.getString(i + 33);
        }
        if (cursor.isNull(i + 34))
        {
            s19 = null;
        } else
        {
            s19 = cursor.getString(i + 34);
        }
        if (cursor.isNull(i + 35))
        {
            s20 = null;
        } else
        {
            s20 = cursor.getString(i + 35);
        }
        if (cursor.isNull(i + 36))
        {
            s21 = null;
        } else
        {
            s21 = cursor.getString(i + 36);
        }
        if (cursor.isNull(i + 37))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 37) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 38))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 38) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 39))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 39) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 40))
        {
            s22 = null;
        } else
        {
            s22 = cursor.getString(i + 40);
        }
        if (cursor.isNull(i + 41))
        {
            s23 = null;
        } else
        {
            s23 = cursor.getString(i + 41);
        }
        if (cursor.isNull(i + 42))
        {
            s24 = null;
        } else
        {
            s24 = cursor.getString(i + 42);
        }
        if (cursor.isNull(i + 43))
        {
            s25 = null;
        } else
        {
            s25 = cursor.getString(i + 43);
        }
        if (cursor.isNull(i + 44))
        {
            s26 = null;
        } else
        {
            s26 = cursor.getString(i + 44);
        }
        if (cursor.isNull(i + 45))
        {
            s27 = null;
        } else
        {
            s27 = cursor.getString(i + 45);
        }
        if (cursor.isNull(i + 46))
        {
            s28 = null;
        } else
        {
            s28 = cursor.getString(i + 46);
        }
        if (cursor.isNull(i + 47))
        {
            s29 = null;
        } else
        {
            s29 = cursor.getString(i + 47);
        }
        if (cursor.isNull(i + 48))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 48));
        }
        if (cursor.isNull(i + 49))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 49));
        }
        return new Device(long1, long2, s, date, date1, integer, date2, date3, s1, s2, s3, s4, s5, integer1, integer2, s6, double1, s7, float1, float2, float3, float4, boolean1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, boolean2, boolean3, boolean4, s22, s23, s24, s25, s26, s27, s28, s29, long3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Device device, int i)
    {
        boolean flag4 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        device.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        device.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        device.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        device.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        device.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        device.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 6));
        }
        device.setLastSyncTime(((Date) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 7));
        }
        device.setLastMeasurementTime(((Date) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        device.setEncodedId(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        device.setWireId(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        device.setVersion(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        device.setNetwork(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        device.setName(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 13));
        }
        device.setBatteryLevel(((Integer) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 14));
        }
        device.setType(((Integer) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        device.setDefaultUnit(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 16));
        }
        device.setBrightness(((Double) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 17);
        }
        device.setMac(((String) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 18));
        }
        device.setCurrentFirmwareApp(((Float) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 19));
        }
        device.setCurrentFirmwareBsl(((Float) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 20));
        }
        device.setLatestFirmwareApp(((Float) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 21));
        }
        device.setLatestFirmwareBsl(((Float) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 22) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        device.setEncrypted(((Boolean) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 23);
        }
        device.setCurrentFirmwareAppVersion(((String) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 24);
        }
        device.setCurrentFirmwareBslVersion(((String) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 25);
        }
        device.setLatestFirmwareAppVersion(((String) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 26);
        }
        device.setLatestFirmwareBslVersion(((String) (obj)));
        if (cursor.isNull(i + 27))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 27);
        }
        device.setPrimaryGoalsSupported(((String) (obj)));
        if (cursor.isNull(i + 28))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 28);
        }
        device.setClockFacesUrlSupported(((String) (obj)));
        if (cursor.isNull(i + 29))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 29);
        }
        device.setClockFacesNameSupported(((String) (obj)));
        if (cursor.isNull(i + 30))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 30);
        }
        device.setImageUrl(((String) (obj)));
        if (cursor.isNull(i + 31))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 31);
        }
        device.setExerciseOptionsIdSupported(((String) (obj)));
        if (cursor.isNull(i + 32))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 32);
        }
        device.setExerciseOptionsNameSupported(((String) (obj)));
        if (cursor.isNull(i + 33))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 33);
        }
        device.setClockFacesDisplayNameSupported(((String) (obj)));
        if (cursor.isNull(i + 34))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 34);
        }
        device.setTapGestureOptionsNameSupported(((String) (obj)));
        if (cursor.isNull(i + 35))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 35);
        }
        device.setTapGestureOptionsDisplayNameSupported(((String) (obj)));
        if (cursor.isNull(i + 36))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 36);
        }
        device.setFwUpdateStatus(((String) (obj)));
        if (cursor.isNull(i + 37))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 37) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        device.setFwUpdateIsRequired(((Boolean) (obj)));
        if (cursor.isNull(i + 38))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 38) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        device.setFwUpdateIsVersion(((Boolean) (obj)));
        if (cursor.isNull(i + 39))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 39) != 0)
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        device.setFwUpdateIsLang(((Boolean) (obj)));
        if (cursor.isNull(i + 40))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 40);
        }
        device.setFwUpdateLang(((String) (obj)));
        if (cursor.isNull(i + 41))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 41);
        }
        device.setFwUpdateVersion(((String) (obj)));
        if (cursor.isNull(i + 42))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 42);
        }
        device.setFwUpdateVersionFull(((String) (obj)));
        if (cursor.isNull(i + 43))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 43);
        }
        device.setWatchCheckOptionsNameSupported(((String) (obj)));
        if (cursor.isNull(i + 44))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 44);
        }
        device.setWatchCheckOptionsDisplayNameSupported(((String) (obj)));
        if (cursor.isNull(i + 45))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 45);
        }
        device.setAutoLapNameOptions(((String) (obj)));
        if (cursor.isNull(i + 46))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 46);
        }
        device.setAutoLapValueOptions(((String) (obj)));
        if (cursor.isNull(i + 47))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 47);
        }
        device.setAutoLapTypeOptions(((String) (obj)));
        if (cursor.isNull(i + 48))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 48));
        }
        device.setProfileId(((Long) (obj)));
        if (cursor.isNull(i + 49))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 49));
        }
        device.setTrackerSettingsId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Device)obj, i);
    }

    public Long readKey(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            return null;
        } else
        {
            return Long.valueOf(cursor.getLong(i + 0));
        }
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    protected Long updateKeyAfterInsert(Device device, long l)
    {
        device.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Device)obj, l);
    }
}
