// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.heartrate;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.heartrate:
//            HeartRateDailySummary, DaoSession

public class HeartRateDailySummaryDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property AverageHeartRate = new Property(2, java/lang/Integer, "averageHeartRate", false, "AVERAGE_HEART_RATE");
        public static final Property DateTime = new Property(1, java/util/Date, "dateTime", false, "DATE_TIME");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property RestingHeartRate = new Property(3, java/lang/Integer, "restingHeartRate", false, "RESTING_HEART_RATE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "HEART_RATE_DAILY_SUMMARY";
    private DaoSession daoSession;

    public HeartRateDailySummaryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public HeartRateDailySummaryDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'HEART_RATE_DAILY_SUMMARY' (").append("'_id' INTEGER PRIMARY KEY ,").append("'DATE_TIME' INTEGER,").append("'AVERAGE_HEART_RATE' INTEGER,").append("'RESTING_HEART_RATE' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'HEART_RATE_DAILY_SUMMARY'").toString());
    }

    protected void attachEntity(HeartRateDailySummary heartratedailysummary)
    {
        super.attachEntity(heartratedailysummary);
        heartratedailysummary.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((HeartRateDailySummary)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, HeartRateDailySummary heartratedailysummary)
    {
        sqlitestatement.clearBindings();
        Object obj = heartratedailysummary.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = heartratedailysummary.getDateTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = heartratedailysummary.getAverageHeartRate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        heartratedailysummary = heartratedailysummary.getRestingHeartRate();
        if (heartratedailysummary != null)
        {
            sqlitestatement.bindLong(4, heartratedailysummary.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (HeartRateDailySummary)obj);
    }

    public Long getKey(HeartRateDailySummary heartratedailysummary)
    {
        if (heartratedailysummary != null)
        {
            return heartratedailysummary.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((HeartRateDailySummary)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public HeartRateDailySummary readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Date date;
        Integer integer;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            cursor = obj;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 3));
        }
        return new HeartRateDailySummary(long1, date, integer, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, HeartRateDailySummary heartratedailysummary, int i)
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
        heartratedailysummary.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        heartratedailysummary.setDateTime(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        heartratedailysummary.setAverageHeartRate(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 3));
        }
        heartratedailysummary.setRestingHeartRate(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (HeartRateDailySummary)obj, i);
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

    protected Long updateKeyAfterInsert(HeartRateDailySummary heartratedailysummary, long l)
    {
        heartratedailysummary.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((HeartRateDailySummary)obj, l);
    }
}
