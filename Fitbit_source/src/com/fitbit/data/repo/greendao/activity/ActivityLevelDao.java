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
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            ActivityLevel, DaoSession, ActivityItemDao, ActivityItem

public class ActivityLevelDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property ActivityItemId = new Property(6, java/lang/Long, "activityItemId", false, "ACTIVITY_ITEM_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property MaxSpeedMPH = new Property(2, java/lang/Double, "maxSpeedMPH", false, "MAX_SPEED_MPH");
        public static final Property Mets = new Property(4, java/lang/Double, "mets", false, "METS");
        public static final Property MinSpeedMPH = new Property(3, java/lang/Double, "minSpeedMPH", false, "MIN_SPEED_MPH");
        public static final Property Name = new Property(5, java/lang/String, "name", false, "NAME");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "ACTIVITY_LEVEL";
    private Query activityItem_ActivityLevelListQuery;
    private DaoSession daoSession;
    private String selectDeep;

    public ActivityLevelDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ActivityLevelDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ACTIVITY_LEVEL' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'MAX_SPEED_MPH' REAL,").append("'MIN_SPEED_MPH' REAL,").append("'METS' REAL,").append("'NAME' TEXT,").append("'ACTIVITY_ITEM_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ACTIVITY_LEVEL'").toString());
    }

    public List _queryActivityItem_ActivityLevelList(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (activityItem_ActivityLevelListQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.ActivityItemId.eq(null), new WhereCondition[0]);
            activityItem_ActivityLevelListQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = activityItem_ActivityLevelListQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void attachEntity(ActivityLevel activitylevel)
    {
        super.attachEntity(activitylevel);
        activitylevel.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((ActivityLevel)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ActivityLevel activitylevel)
    {
        sqlitestatement.clearBindings();
        Object obj = activitylevel.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = activitylevel.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = activitylevel.getMaxSpeedMPH();
        if (obj != null)
        {
            sqlitestatement.bindDouble(3, ((Double) (obj)).doubleValue());
        }
        obj = activitylevel.getMinSpeedMPH();
        if (obj != null)
        {
            sqlitestatement.bindDouble(4, ((Double) (obj)).doubleValue());
        }
        obj = activitylevel.getMets();
        if (obj != null)
        {
            sqlitestatement.bindDouble(5, ((Double) (obj)).doubleValue());
        }
        obj = activitylevel.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        activitylevel = activitylevel.getActivityItemId();
        if (activitylevel != null)
        {
            sqlitestatement.bindLong(7, activitylevel.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ActivityLevel)obj);
    }

    public Long getKey(ActivityLevel activitylevel)
    {
        if (activitylevel != null)
        {
            return activitylevel.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ActivityLevel)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getActivityItemDao().getAllColumns());
            stringbuilder.append(" FROM ACTIVITY_LEVEL T");
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

    protected ActivityLevel loadCurrentDeep(Cursor cursor, boolean flag)
    {
        ActivityLevel activitylevel = (ActivityLevel)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        activitylevel.setActivityItem((ActivityItem)loadCurrentOther(daoSession.getActivityItemDao(), cursor, i));
        return activitylevel;
    }

    public ActivityLevel loadDeep(Long long1)
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
        ActivityLevel activitylevel = loadCurrentDeep(long1, true);
        long1.close();
        return activitylevel;
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

    public ActivityLevel readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Long long2;
        Double double1;
        Double double2;
        Double double3;
        String s;
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
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(cursor.getDouble(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            double3 = null;
        } else
        {
            double3 = Double.valueOf(cursor.getDouble(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 6));
        }
        return new ActivityLevel(long1, long2, double1, double2, double3, s, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ActivityLevel activitylevel, int i)
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
        activitylevel.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        activitylevel.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 2));
        }
        activitylevel.setMaxSpeedMPH(((Double) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 3));
        }
        activitylevel.setMinSpeedMPH(((Double) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 4));
        }
        activitylevel.setMets(((Double) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        activitylevel.setName(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 6));
        }
        activitylevel.setActivityItemId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ActivityLevel)obj, i);
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

    protected Long updateKeyAfterInsert(ActivityLevel activitylevel, long l)
    {
        activitylevel.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((ActivityLevel)obj, l);
    }
}
