// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.internal.SqlUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            ActivityLogEntry, DaoSession, ActivityItemDao, ActivityItem

public class ActivityLogEntryDao extends AbstractDao
{
    public static class Properties
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


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "ACTIVITY_LOG_ENTRY";
    private DaoSession daoSession;
    private String selectDeep;

    public ActivityLogEntryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ActivityLogEntryDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ACTIVITY_LOG_ENTRY' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'VALUE' REAL,").append("'TRACKER_TYPE' TEXT,").append("'LOG_DATE' INTEGER,").append("'CALORIES' INTEGER,").append("'DISTANCE' REAL,").append("'DURATION' INTEGER,").append("'START_TIME' INTEGER,").append("'STEPS' INTEGER,").append("'CALORIES_ON_SERVER' INTEGER,").append("'MANUAL_CALORIES_POPULATED' INTEGER,").append("'ACTIVITY_ITEM_SERVER_ID' INTEGER,").append("'DETAILS_ID' TEXT,").append("'DETAILS_TYPE' TEXT,").append("'HAS_DETAILS' INTEGER,").append("'HEART_RATE_LINK' TEXT,").append("'CALORIES_LINK' TEXT,").append("'FAT_BURN_HEART_RATE_ZONE_MINUTES' INTEGER,").append("'CARDIO_HEART_RATE_ZONE_MINUTES' INTEGER,").append("'PEAK_HEART_RATE_ZONE_MINUTES' INTEGER,").append("'LAST_MODIFIED' INTEGER,").append("'VERY_ACTIVE_MINUTES' INTEGER,").append("'MODERATELY_ACTIVE_MINUTES' INTEGER,").append("'AVERAGE_HEART_RATE' INTEGER,").append("'NAME' TEXT NOT NULL ,").append("'ACTIVITY_ITEM_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_ACTIVITY_LOG_ENTRY_UUID ON ACTIVITY_LOG_ENTRY").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_ACTIVITY_LOG_ENTRY_ENTITY_STATUS ON ACTIVITY_LOG_ENTRY").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_ACTIVITY_LOG_ENTRY_LOG_DATE ON ACTIVITY_LOG_ENTRY").append(" (LOG_DATE);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ACTIVITY_LOG_ENTRY'").toString());
    }

    protected void attachEntity(ActivityLogEntry activitylogentry)
    {
        super.attachEntity(activitylogentry);
        activitylogentry.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((ActivityLogEntry)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ActivityLogEntry activitylogentry)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = activitylogentry.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = activitylogentry.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = activitylogentry.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = activitylogentry.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = activitylogentry.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = activitylogentry.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getValue();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        obj = activitylogentry.getTrackerType();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = activitylogentry.getLogDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(9, ((Date) (obj)).getTime());
        }
        obj = activitylogentry.getCalories();
        if (obj != null)
        {
            sqlitestatement.bindLong(10, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getDistance();
        if (obj != null)
        {
            sqlitestatement.bindDouble(11, ((Double) (obj)).doubleValue());
        }
        obj = activitylogentry.getDuration();
        if (obj != null)
        {
            sqlitestatement.bindLong(12, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getStartTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(13, ((Date) (obj)).getTime());
        }
        obj = activitylogentry.getSteps();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getCaloriesOnServer();
        if (obj != null)
        {
            sqlitestatement.bindLong(15, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getManualCaloriesPopulated();
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
            sqlitestatement.bindLong(16, l);
        }
        obj = activitylogentry.getActivityItemServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(17, ((Long) (obj)).longValue());
        }
        obj = activitylogentry.getDetailsId();
        if (obj != null)
        {
            sqlitestatement.bindString(18, ((String) (obj)));
        }
        obj = activitylogentry.getDetailsType();
        if (obj != null)
        {
            sqlitestatement.bindString(19, ((String) (obj)));
        }
        obj = activitylogentry.getHasDetails();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(20, l);
        }
        obj = activitylogentry.getHeartRateLink();
        if (obj != null)
        {
            sqlitestatement.bindString(21, ((String) (obj)));
        }
        obj = activitylogentry.getCaloriesLink();
        if (obj != null)
        {
            sqlitestatement.bindString(22, ((String) (obj)));
        }
        obj = activitylogentry.getFatBurnHeartRateZoneMinutes();
        if (obj != null)
        {
            sqlitestatement.bindLong(23, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getCardioHeartRateZoneMinutes();
        if (obj != null)
        {
            sqlitestatement.bindLong(24, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getPeakHeartRateZoneMinutes();
        if (obj != null)
        {
            sqlitestatement.bindLong(25, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getLastModified();
        if (obj != null)
        {
            sqlitestatement.bindLong(26, ((Date) (obj)).getTime());
        }
        obj = activitylogentry.getVeryActiveMinutes();
        if (obj != null)
        {
            sqlitestatement.bindLong(27, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getModeratelyActiveMinutes();
        if (obj != null)
        {
            sqlitestatement.bindLong(28, ((Integer) (obj)).intValue());
        }
        obj = activitylogentry.getAverageHeartRate();
        if (obj != null)
        {
            sqlitestatement.bindLong(29, ((Integer) (obj)).intValue());
        }
        sqlitestatement.bindString(30, activitylogentry.getName());
        activitylogentry = activitylogentry.getActivityItemId();
        if (activitylogentry != null)
        {
            sqlitestatement.bindLong(31, activitylogentry.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ActivityLogEntry)obj);
    }

    public Long getKey(ActivityLogEntry activitylogentry)
    {
        if (activitylogentry != null)
        {
            return activitylogentry.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ActivityLogEntry)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getActivityItemDao().getAllColumns());
            stringbuilder.append(" FROM ACTIVITY_LOG_ENTRY T");
            stringbuilder.append(" LEFT JOIN ACTIVITY_ITEM T0 ON T.'ACTIVITY_ITEM_ID'=T0.'_id'");
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

    protected ActivityLogEntry loadCurrentDeep(Cursor cursor, boolean flag)
    {
        ActivityLogEntry activitylogentry = (ActivityLogEntry)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        activitylogentry.setActivityItem((ActivityItem)loadCurrentOther(daoSession.getActivityItemDao(), cursor, i));
        return activitylogentry;
    }

    public ActivityLogEntry loadDeep(Long long1)
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
        ActivityLogEntry activitylogentry = loadCurrentDeep(long1, true);
        long1.close();
        return activitylogentry;
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

    public ActivityLogEntry readEntity(Cursor cursor, int i)
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
        Integer integer1;
        Double double2;
        Integer integer2;
        Date date3;
        Integer integer3;
        Integer integer4;
        Boolean boolean1;
        Long long3;
        String s2;
        String s3;
        Boolean boolean2;
        String s4;
        String s5;
        Integer integer5;
        Integer integer6;
        Integer integer7;
        Date date4;
        Integer integer8;
        Integer integer9;
        Integer integer10;
        String s6;
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
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 9));
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
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            date3 = null;
        } else
        {
            date3 = new Date(cursor.getLong(i + 12));
        }
        if (cursor.isNull(i + 13))
        {
            integer3 = null;
        } else
        {
            integer3 = Integer.valueOf(cursor.getInt(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            integer4 = null;
        } else
        {
            integer4 = Integer.valueOf(cursor.getInt(i + 14));
        }
        if (cursor.isNull(i + 15))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 15) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 16))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 16));
        }
        if (cursor.isNull(i + 17))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 17);
        }
        if (cursor.isNull(i + 18))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 18);
        }
        if (cursor.isNull(i + 19))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 19) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 20))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 20);
        }
        if (cursor.isNull(i + 21))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 21);
        }
        if (cursor.isNull(i + 22))
        {
            integer5 = null;
        } else
        {
            integer5 = Integer.valueOf(cursor.getInt(i + 22));
        }
        if (cursor.isNull(i + 23))
        {
            integer6 = null;
        } else
        {
            integer6 = Integer.valueOf(cursor.getInt(i + 23));
        }
        if (cursor.isNull(i + 24))
        {
            integer7 = null;
        } else
        {
            integer7 = Integer.valueOf(cursor.getInt(i + 24));
        }
        if (cursor.isNull(i + 25))
        {
            date4 = null;
        } else
        {
            date4 = new Date(cursor.getLong(i + 25));
        }
        if (cursor.isNull(i + 26))
        {
            integer8 = null;
        } else
        {
            integer8 = Integer.valueOf(cursor.getInt(i + 26));
        }
        if (cursor.isNull(i + 27))
        {
            integer9 = null;
        } else
        {
            integer9 = Integer.valueOf(cursor.getInt(i + 27));
        }
        if (cursor.isNull(i + 28))
        {
            integer10 = null;
        } else
        {
            integer10 = Integer.valueOf(cursor.getInt(i + 28));
        }
        s6 = cursor.getString(i + 29);
        if (cursor.isNull(i + 30))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 30));
        }
        return new ActivityLogEntry(long1, long2, s, date, date1, integer, double1, s1, date2, integer1, double2, integer2, date3, integer3, integer4, boolean1, long3, s2, s3, boolean2, s4, s5, integer5, integer6, integer7, date4, integer8, integer9, integer10, s6, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ActivityLogEntry activitylogentry, int i)
    {
        boolean flag2 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        activitylogentry.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        activitylogentry.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        activitylogentry.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        activitylogentry.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        activitylogentry.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        activitylogentry.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        activitylogentry.setValue(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        activitylogentry.setTrackerType(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 8));
        }
        activitylogentry.setLogDate(((Date) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 9));
        }
        activitylogentry.setCalories(((Integer) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 10));
        }
        activitylogentry.setDistance(((Double) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 11));
        }
        activitylogentry.setDuration(((Integer) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 12));
        }
        activitylogentry.setStartTime(((Date) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 13));
        }
        activitylogentry.setSteps(((Integer) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 14));
        }
        activitylogentry.setCaloriesOnServer(((Integer) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 15) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        activitylogentry.setManualCaloriesPopulated(((Boolean) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 16));
        }
        activitylogentry.setActivityItemServerId(((Long) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 17);
        }
        activitylogentry.setDetailsId(((String) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 18);
        }
        activitylogentry.setDetailsType(((String) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 19) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        activitylogentry.setHasDetails(((Boolean) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 20);
        }
        activitylogentry.setHeartRateLink(((String) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 21);
        }
        activitylogentry.setCaloriesLink(((String) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 22));
        }
        activitylogentry.setFatBurnHeartRateZoneMinutes(((Integer) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 23));
        }
        activitylogentry.setCardioHeartRateZoneMinutes(((Integer) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 24));
        }
        activitylogentry.setPeakHeartRateZoneMinutes(((Integer) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 25));
        }
        activitylogentry.setLastModified(((Date) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 26));
        }
        activitylogentry.setVeryActiveMinutes(((Integer) (obj)));
        if (cursor.isNull(i + 27))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 27));
        }
        activitylogentry.setModeratelyActiveMinutes(((Integer) (obj)));
        if (cursor.isNull(i + 28))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 28));
        }
        activitylogentry.setAverageHeartRate(((Integer) (obj)));
        activitylogentry.setName(cursor.getString(i + 29));
        if (cursor.isNull(i + 30))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 30));
        }
        activitylogentry.setActivityItemId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ActivityLogEntry)obj, i);
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

    protected Long updateKeyAfterInsert(ActivityLogEntry activitylogentry, long l)
    {
        activitylogentry.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((ActivityLogEntry)obj, l);
    }
}
