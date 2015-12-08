// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

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
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            SwapHeartRateZone, DaoSession, SwapHeartRateExerciseSummaryDao, SwapHeartRateExerciseSummary

public class SwapHeartRateZoneDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property CaloriesOut = new Property(6, java/lang/Double, "caloriesOut", false, "CALORIES_OUT");
        public static final Property HighValue = new Property(1, java/lang/Integer, "highValue", false, "HIGH_VALUE");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property LowValue = new Property(2, java/lang/Integer, "lowValue", false, "LOW_VALUE");
        public static final Property Name = new Property(3, java/lang/String, "name", false, "NAME");
        public static final Property SummaryId = new Property(7, java/lang/Long, "summaryId", false, "SUMMARY_ID");
        public static final Property TimeInZone = new Property(4, java/lang/Integer, "timeInZone", false, "TIME_IN_ZONE");
        public static final Property Type = new Property(5, java/lang/String, "type", false, "TYPE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "SWAP_HEART_RATE_ZONE";
    private DaoSession daoSession;
    private String selectDeep;
    private Query swapHeartRateExerciseSummary_CustomZonesQuery;
    private Query swapHeartRateExerciseSummary_ZonesQuery;

    public SwapHeartRateZoneDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public SwapHeartRateZoneDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'SWAP_HEART_RATE_ZONE' (").append("'_id' INTEGER PRIMARY KEY ,").append("'HIGH_VALUE' INTEGER,").append("'LOW_VALUE' INTEGER,").append("'NAME' TEXT,").append("'TIME_IN_ZONE' INTEGER,").append("'TYPE' TEXT,").append("'CALORIES_OUT' REAL,").append("'SUMMARY_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SWAP_HEART_RATE_ZONE'").toString());
    }

    public List _querySwapHeartRateExerciseSummary_CustomZones(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (swapHeartRateExerciseSummary_CustomZonesQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.SummaryId.eq(null), new WhereCondition[0]);
            swapHeartRateExerciseSummary_CustomZonesQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = swapHeartRateExerciseSummary_CustomZonesQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    public List _querySwapHeartRateExerciseSummary_Zones(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (swapHeartRateExerciseSummary_ZonesQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.SummaryId.eq(null), new WhereCondition[0]);
            swapHeartRateExerciseSummary_ZonesQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = swapHeartRateExerciseSummary_ZonesQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void attachEntity(SwapHeartRateZone swapheartratezone)
    {
        super.attachEntity(swapheartratezone);
        swapheartratezone.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((SwapHeartRateZone)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, SwapHeartRateZone swapheartratezone)
    {
        sqlitestatement.clearBindings();
        Object obj = swapheartratezone.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = swapheartratezone.getHighValue();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Integer) (obj)).intValue());
        }
        obj = swapheartratezone.getLowValue();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        obj = swapheartratezone.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = swapheartratezone.getTimeInZone();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Integer) (obj)).intValue());
        }
        obj = swapheartratezone.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = swapheartratezone.getCaloriesOut();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        swapheartratezone = swapheartratezone.getSummaryId();
        if (swapheartratezone != null)
        {
            sqlitestatement.bindLong(8, swapheartratezone.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (SwapHeartRateZone)obj);
    }

    public Long getKey(SwapHeartRateZone swapheartratezone)
    {
        if (swapheartratezone != null)
        {
            return swapheartratezone.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((SwapHeartRateZone)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getSwapHeartRateExerciseSummaryDao().getAllColumns());
            stringbuilder.append(" FROM SWAP_HEART_RATE_ZONE T");
            stringbuilder.append(" LEFT JOIN SWAP_HEART_RATE_EXERCISE_SUMMARY T0 ON T.'SUMMARY_ID'=T0.'_id'");
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

    protected SwapHeartRateZone loadCurrentDeep(Cursor cursor, boolean flag)
    {
        SwapHeartRateZone swapheartratezone = (SwapHeartRateZone)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        swapheartratezone.setSummary((SwapHeartRateExerciseSummary)loadCurrentOther(daoSession.getSwapHeartRateExerciseSummaryDao(), cursor, i));
        return swapheartratezone;
    }

    public SwapHeartRateZone loadDeep(Long long1)
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
        break MISSING_BLOCK_LABEL_138;
        Exception exception;
        exception;
        long1.close();
        throw exception;
        SwapHeartRateZone swapheartratezone = loadCurrentDeep(long1, true);
        long1.close();
        return swapheartratezone;
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

    public SwapHeartRateZone readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Integer integer;
        Integer integer1;
        String s;
        Integer integer2;
        String s1;
        Double double1;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 5);
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
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 7));
        }
        return new SwapHeartRateZone(long1, integer, integer1, s, integer2, s1, double1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, SwapHeartRateZone swapheartratezone, int i)
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
        swapheartratezone.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 1));
        }
        swapheartratezone.setHighValue(((Integer) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        swapheartratezone.setLowValue(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        swapheartratezone.setName(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 4));
        }
        swapheartratezone.setTimeInZone(((Integer) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        swapheartratezone.setType(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        swapheartratezone.setCaloriesOut(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 7));
        }
        swapheartratezone.setSummaryId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (SwapHeartRateZone)obj, i);
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

    protected Long updateKeyAfterInsert(SwapHeartRateZone swapheartratezone, long l)
    {
        swapheartratezone.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((SwapHeartRateZone)obj, l);
    }
}
