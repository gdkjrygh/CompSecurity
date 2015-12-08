// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            SwapHeartRateExerciseSummary, DaoSession

public class SwapHeartRateExerciseSummaryDao extends AbstractDao
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


    public static final String TABLENAME = "SWAP_HEART_RATE_EXERCISE_SUMMARY";
    private DaoSession daoSession;

    public SwapHeartRateExerciseSummaryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public SwapHeartRateExerciseSummaryDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'SWAP_HEART_RATE_EXERCISE_SUMMARY' (").append("'_id' INTEGER PRIMARY KEY ,").append("'DATE_TIME' INTEGER,").append("'AVERAGE_HEART_RATE' INTEGER,").append("'RESTING_HEART_RATE' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SWAP_HEART_RATE_EXERCISE_SUMMARY'").toString());
    }

    protected void attachEntity(SwapHeartRateExerciseSummary swapheartrateexercisesummary)
    {
        super.attachEntity(swapheartrateexercisesummary);
        swapheartrateexercisesummary.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((SwapHeartRateExerciseSummary)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, SwapHeartRateExerciseSummary swapheartrateexercisesummary)
    {
        sqlitestatement.clearBindings();
        Object obj = swapheartrateexercisesummary.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = swapheartrateexercisesummary.getDateTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = swapheartrateexercisesummary.getAverageHeartRate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        swapheartrateexercisesummary = swapheartrateexercisesummary.getRestingHeartRate();
        if (swapheartrateexercisesummary != null)
        {
            sqlitestatement.bindLong(4, swapheartrateexercisesummary.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (SwapHeartRateExerciseSummary)obj);
    }

    public Long getKey(SwapHeartRateExerciseSummary swapheartrateexercisesummary)
    {
        if (swapheartrateexercisesummary != null)
        {
            return swapheartrateexercisesummary.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((SwapHeartRateExerciseSummary)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public SwapHeartRateExerciseSummary readEntity(Cursor cursor, int i)
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
        return new SwapHeartRateExerciseSummary(long1, date, integer, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, SwapHeartRateExerciseSummary swapheartrateexercisesummary, int i)
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
        swapheartrateexercisesummary.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        swapheartrateexercisesummary.setDateTime(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        swapheartrateexercisesummary.setAverageHeartRate(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 3));
        }
        swapheartrateexercisesummary.setRestingHeartRate(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (SwapHeartRateExerciseSummary)obj, i);
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

    protected Long updateKeyAfterInsert(SwapHeartRateExerciseSummary swapheartrateexercisesummary, long l)
    {
        swapheartrateexercisesummary.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((SwapHeartRateExerciseSummary)obj, l);
    }
}
