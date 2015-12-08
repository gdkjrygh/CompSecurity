// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            SleepLogEntry, DaoSession

public class SleepLogEntryDao extends AbstractDao
{
    public static class Properties
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


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "SLEEP_LOG_ENTRY";

    public SleepLogEntryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public SleepLogEntryDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'SLEEP_LOG_ENTRY' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'VALUE' REAL,").append("'TRACKER_TYPE' TEXT,").append("'LOG_DATE' INTEGER,").append("'IS_MAIN_SLEEP' INTEGER,").append("'EFFICIENCY' REAL,").append("'START_TIME' INTEGER,").append("'DURATION' INTEGER,").append("'MINUTES_TO_FALL_ASLEEP' INTEGER,").append("'MINUTES_ASLEEP' INTEGER,").append("'MINUTES_AWAKE' INTEGER,").append("'MINUTES_AFTER_WAKEUP' INTEGER,").append("'AWAKENINGS_COUNT' INTEGER,").append("'TIME_IN_BED' INTEGER,").append("'AWAKE_COUNT' INTEGER,").append("'RESTLESS_COUNT' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SLEEP_LOG_ENTRY_UUID ON SLEEP_LOG_ENTRY").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SLEEP_LOG_ENTRY_ENTITY_STATUS ON SLEEP_LOG_ENTRY").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SLEEP_LOG_ENTRY_LOG_DATE ON SLEEP_LOG_ENTRY").append(" (LOG_DATE);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SLEEP_LOG_ENTRY'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, SleepLogEntry sleeplogentry)
    {
        sqlitestatement.clearBindings();
        Object obj = sleeplogentry.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = sleeplogentry.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = sleeplogentry.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = sleeplogentry.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = sleeplogentry.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = sleeplogentry.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getValue();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        obj = sleeplogentry.getTrackerType();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = sleeplogentry.getLogDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(9, ((Date) (obj)).getTime());
        }
        obj = sleeplogentry.getIsMainSleep();
        if (obj != null)
        {
            long l;
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(10, l);
        }
        obj = sleeplogentry.getEfficiency();
        if (obj != null)
        {
            sqlitestatement.bindDouble(11, ((Double) (obj)).doubleValue());
        }
        obj = sleeplogentry.getStartTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(12, ((Date) (obj)).getTime());
        }
        obj = sleeplogentry.getDuration();
        if (obj != null)
        {
            sqlitestatement.bindLong(13, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getMinutesToFallAsleep();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getMinutesAsleep();
        if (obj != null)
        {
            sqlitestatement.bindLong(15, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getMinutesAwake();
        if (obj != null)
        {
            sqlitestatement.bindLong(16, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getMinutesAfterWakeup();
        if (obj != null)
        {
            sqlitestatement.bindLong(17, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getAwakeningsCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(18, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getTimeInBed();
        if (obj != null)
        {
            sqlitestatement.bindLong(19, ((Integer) (obj)).intValue());
        }
        obj = sleeplogentry.getAwakeCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(20, ((Integer) (obj)).intValue());
        }
        sleeplogentry = sleeplogentry.getRestlessCount();
        if (sleeplogentry != null)
        {
            sqlitestatement.bindLong(21, sleeplogentry.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (SleepLogEntry)obj);
    }

    public Long getKey(SleepLogEntry sleeplogentry)
    {
        if (sleeplogentry != null)
        {
            return sleeplogentry.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((SleepLogEntry)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public SleepLogEntry readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Double double1;
        String s1;
        Date date2;
        Boolean boolean1;
        Double double2;
        Date date3;
        Integer integer1;
        Integer integer2;
        Integer integer3;
        Integer integer4;
        Integer integer5;
        Integer integer6;
        Integer integer7;
        Integer integer8;
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
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 8));
        }
        if (cursor.isNull(i + 9))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 9) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 10))
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(cursor.getDouble(i + 10));
        }
        if (cursor.isNull(i + 11))
        {
            date3 = null;
        } else
        {
            date3 = new Date(cursor.getLong(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 12));
        }
        if (cursor.isNull(i + 13))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            integer3 = null;
        } else
        {
            integer3 = Integer.valueOf(cursor.getInt(i + 14));
        }
        if (cursor.isNull(i + 15))
        {
            integer4 = null;
        } else
        {
            integer4 = Integer.valueOf(cursor.getInt(i + 15));
        }
        if (cursor.isNull(i + 16))
        {
            integer5 = null;
        } else
        {
            integer5 = Integer.valueOf(cursor.getInt(i + 16));
        }
        if (cursor.isNull(i + 17))
        {
            integer6 = null;
        } else
        {
            integer6 = Integer.valueOf(cursor.getInt(i + 17));
        }
        if (cursor.isNull(i + 18))
        {
            integer7 = null;
        } else
        {
            integer7 = Integer.valueOf(cursor.getInt(i + 18));
        }
        if (cursor.isNull(i + 19))
        {
            integer8 = null;
        } else
        {
            integer8 = Integer.valueOf(cursor.getInt(i + 19));
        }
        if (cursor.isNull(i + 20))
        {
            cursor = null;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 20));
        }
        return new SleepLogEntry(long1, long2, s, date, date1, integer, double1, s1, date2, boolean1, double2, date3, integer1, integer2, integer3, integer4, integer5, integer6, integer7, integer8, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, SleepLogEntry sleeplogentry, int i)
    {
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        sleeplogentry.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        sleeplogentry.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        sleeplogentry.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        sleeplogentry.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        sleeplogentry.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        sleeplogentry.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        sleeplogentry.setValue(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        sleeplogentry.setTrackerType(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 8));
        }
        sleeplogentry.setLogDate(((Date) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 9) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        sleeplogentry.setIsMainSleep(((Boolean) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 10));
        }
        sleeplogentry.setEfficiency(((Double) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 11));
        }
        sleeplogentry.setStartTime(((Date) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 12));
        }
        sleeplogentry.setDuration(((Integer) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 13));
        }
        sleeplogentry.setMinutesToFallAsleep(((Integer) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 14));
        }
        sleeplogentry.setMinutesAsleep(((Integer) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 15));
        }
        sleeplogentry.setMinutesAwake(((Integer) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 16));
        }
        sleeplogentry.setMinutesAfterWakeup(((Integer) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 17));
        }
        sleeplogentry.setAwakeningsCount(((Integer) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 18));
        }
        sleeplogentry.setTimeInBed(((Integer) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 19));
        }
        sleeplogentry.setAwakeCount(((Integer) (obj)));
        if (cursor.isNull(i + 20))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 20));
        }
        sleeplogentry.setRestlessCount(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (SleepLogEntry)obj, i);
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

    protected Long updateKeyAfterInsert(SleepLogEntry sleeplogentry, long l)
    {
        sleeplogentry.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((SleepLogEntry)obj, l);
    }
}
