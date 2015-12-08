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
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            PendingPlan, DaoSession, DietPlanDao, DietPlan

public class PendingPlanDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Current = new Property(2, java/lang/Double, "current", false, "CURRENT");
        public static final Property CurrentWeightChanged = new Property(5, java/lang/Boolean, "currentWeightChanged", false, "CURRENT_WEIGHT_CHANGED");
        public static final Property Desired = new Property(3, java/lang/Double, "desired", false, "DESIRED");
        public static final Property DietPlanId = new Property(7, java/lang/Long, "dietPlanId", false, "DIET_PLAN_ID");
        public static final Property GoalChanged = new Property(6, java/lang/Boolean, "goalChanged", false, "GOAL_CHANGED");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property StartingWeight = new Property(4, java/lang/Double, "startingWeight", false, "STARTING_WEIGHT");
        public static final Property Units = new Property(1, java/lang/String, "units", false, "UNITS");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "PENDING_PLAN";
    private DaoSession daoSession;
    private String selectDeep;

    public PendingPlanDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public PendingPlanDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'PENDING_PLAN' (").append("'_id' INTEGER PRIMARY KEY ,").append("'UNITS' TEXT,").append("'CURRENT' REAL,").append("'DESIRED' REAL,").append("'STARTING_WEIGHT' REAL,").append("'CURRENT_WEIGHT_CHANGED' INTEGER,").append("'GOAL_CHANGED' INTEGER,").append("'DIET_PLAN_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'PENDING_PLAN'").toString());
    }

    protected void attachEntity(PendingPlan pendingplan)
    {
        super.attachEntity(pendingplan);
        pendingplan.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((PendingPlan)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, PendingPlan pendingplan)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = pendingplan.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = pendingplan.getUnits();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = pendingplan.getCurrent();
        if (obj != null)
        {
            sqlitestatement.bindDouble(3, ((Double) (obj)).doubleValue());
        }
        obj = pendingplan.getDesired();
        if (obj != null)
        {
            sqlitestatement.bindDouble(4, ((Double) (obj)).doubleValue());
        }
        obj = pendingplan.getStartingWeight();
        if (obj != null)
        {
            sqlitestatement.bindDouble(5, ((Double) (obj)).doubleValue());
        }
        obj = pendingplan.getCurrentWeightChanged();
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
            sqlitestatement.bindLong(6, l);
        }
        obj = pendingplan.getGoalChanged();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(7, l);
        }
        pendingplan = pendingplan.getDietPlanId();
        if (pendingplan != null)
        {
            sqlitestatement.bindLong(8, pendingplan.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (PendingPlan)obj);
    }

    public Long getKey(PendingPlan pendingplan)
    {
        if (pendingplan != null)
        {
            return pendingplan.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((PendingPlan)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getDietPlanDao().getAllColumns());
            stringbuilder.append(" FROM PENDING_PLAN T");
            stringbuilder.append(" LEFT JOIN DIET_PLAN T0 ON T.'DIET_PLAN_ID'=T0.'_id'");
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

    protected PendingPlan loadCurrentDeep(Cursor cursor, boolean flag)
    {
        PendingPlan pendingplan = (PendingPlan)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        pendingplan.setDietPlan((DietPlan)loadCurrentOther(daoSession.getDietPlanDao(), cursor, i));
        return pendingplan;
    }

    public PendingPlan loadDeep(Long long1)
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
        PendingPlan pendingplan = loadCurrentDeep(long1, true);
        long1.close();
        return pendingplan;
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

    public PendingPlan readEntity(Cursor cursor, int i)
    {
        boolean flag2 = true;
        Object obj = null;
        Long long1;
        String s;
        Double double1;
        Double double2;
        Double double3;
        Boolean boolean1;
        Boolean boolean2;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
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
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 5) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 6))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 6) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 7))
        {
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 7));
        }
        return new PendingPlan(long1, s, double1, double2, double3, boolean1, boolean2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, PendingPlan pendingplan, int i)
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
        pendingplan.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        pendingplan.setUnits(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 2));
        }
        pendingplan.setCurrent(((Double) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 3));
        }
        pendingplan.setDesired(((Double) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 4));
        }
        pendingplan.setStartingWeight(((Double) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 5) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        pendingplan.setCurrentWeightChanged(((Boolean) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 6) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        pendingplan.setGoalChanged(((Boolean) (obj)));
        if (cursor.isNull(i + 7))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 7));
        }
        pendingplan.setDietPlanId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (PendingPlan)obj, i);
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

    protected Long updateKeyAfterInsert(PendingPlan pendingplan, long l)
    {
        pendingplan.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((PendingPlan)obj, l);
    }
}
