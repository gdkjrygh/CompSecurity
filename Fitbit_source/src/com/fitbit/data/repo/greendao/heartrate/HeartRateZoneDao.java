// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.heartrate;

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

// Referenced classes of package com.fitbit.data.repo.greendao.heartrate:
//            HeartRateZone, DaoSession, HeartRateDailySummaryDao, HeartRateDailySummary

public class HeartRateZoneDao extends AbstractDao
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


    public static final String TABLENAME = "HEART_RATE_ZONE";
    private DaoSession daoSession;
    private Query heartRateDailySummary_CustomZonesQuery;
    private Query heartRateDailySummary_ZonesQuery;
    private String selectDeep;

    public HeartRateZoneDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public HeartRateZoneDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'HEART_RATE_ZONE' (").append("'_id' INTEGER PRIMARY KEY ,").append("'HIGH_VALUE' INTEGER,").append("'LOW_VALUE' INTEGER,").append("'NAME' TEXT,").append("'TIME_IN_ZONE' INTEGER,").append("'TYPE' TEXT,").append("'CALORIES_OUT' REAL,").append("'SUMMARY_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'HEART_RATE_ZONE'").toString());
    }

    public List _queryHeartRateDailySummary_CustomZones(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (heartRateDailySummary_CustomZonesQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.SummaryId.eq(null), new WhereCondition[0]);
            heartRateDailySummary_CustomZonesQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = heartRateDailySummary_CustomZonesQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    public List _queryHeartRateDailySummary_Zones(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (heartRateDailySummary_ZonesQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.SummaryId.eq(null), new WhereCondition[0]);
            heartRateDailySummary_ZonesQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = heartRateDailySummary_ZonesQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void attachEntity(HeartRateZone heartratezone)
    {
        super.attachEntity(heartratezone);
        heartratezone.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((HeartRateZone)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, HeartRateZone heartratezone)
    {
        sqlitestatement.clearBindings();
        Object obj = heartratezone.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = heartratezone.getHighValue();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Integer) (obj)).intValue());
        }
        obj = heartratezone.getLowValue();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        obj = heartratezone.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = heartratezone.getTimeInZone();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Integer) (obj)).intValue());
        }
        obj = heartratezone.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = heartratezone.getCaloriesOut();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        heartratezone = heartratezone.getSummaryId();
        if (heartratezone != null)
        {
            sqlitestatement.bindLong(8, heartratezone.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (HeartRateZone)obj);
    }

    public Long getKey(HeartRateZone heartratezone)
    {
        if (heartratezone != null)
        {
            return heartratezone.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((HeartRateZone)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getHeartRateDailySummaryDao().getAllColumns());
            stringbuilder.append(" FROM HEART_RATE_ZONE T");
            stringbuilder.append(" LEFT JOIN HEART_RATE_DAILY_SUMMARY T0 ON T.'SUMMARY_ID'=T0.'_id'");
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

    protected HeartRateZone loadCurrentDeep(Cursor cursor, boolean flag)
    {
        HeartRateZone heartratezone = (HeartRateZone)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        heartratezone.setSummary((HeartRateDailySummary)loadCurrentOther(daoSession.getHeartRateDailySummaryDao(), cursor, i));
        return heartratezone;
    }

    public HeartRateZone loadDeep(Long long1)
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
        HeartRateZone heartratezone = loadCurrentDeep(long1, true);
        long1.close();
        return heartratezone;
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

    public HeartRateZone readEntity(Cursor cursor, int i)
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
        return new HeartRateZone(long1, integer, integer1, s, integer2, s1, double1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, HeartRateZone heartratezone, int i)
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
        heartratezone.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 1));
        }
        heartratezone.setHighValue(((Integer) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        heartratezone.setLowValue(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        heartratezone.setName(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 4));
        }
        heartratezone.setTimeInZone(((Integer) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        heartratezone.setType(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        heartratezone.setCaloriesOut(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 7));
        }
        heartratezone.setSummaryId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (HeartRateZone)obj, i);
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

    protected Long updateKeyAfterInsert(HeartRateZone heartratezone, long l)
    {
        heartratezone.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((HeartRateZone)obj, l);
    }
}
