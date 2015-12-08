// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DietPlan, DaoSession

public class DietPlanDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property CaloriesDeficitPerDay = new Property(4, java/lang/Integer, "caloriesDeficitPerDay", false, "CALORIES_DEFICIT_PER_DAY");
        public static final Property EntityStatus = new Property(7, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property EstimateDate = new Property(3, java/util/Date, "estimateDate", false, "ESTIMATE_DATE");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Personalized = new Property(8, java/lang/Boolean, "personalized", false, "PERSONALIZED");
        public static final Property PlanIntensity = new Property(5, java/lang/String, "planIntensity", false, "PLAN_INTENSITY");
        public static final Property WeightObjective = new Property(6, java/lang/String, "weightObjective", false, "WEIGHT_OBJECTIVE");
        public static final Property WeightPerWeek = new Property(2, java/lang/Double, "weightPerWeek", false, "WEIGHT_PER_WEEK");
        public static final Property WeightPerWeekUnits = new Property(1, java/lang/String, "weightPerWeekUnits", false, "WEIGHT_PER_WEEK_UNITS");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "DIET_PLAN";

    public DietPlanDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public DietPlanDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'DIET_PLAN' (").append("'_id' INTEGER PRIMARY KEY ,").append("'WEIGHT_PER_WEEK_UNITS' TEXT,").append("'WEIGHT_PER_WEEK' REAL,").append("'ESTIMATE_DATE' INTEGER,").append("'CALORIES_DEFICIT_PER_DAY' INTEGER,").append("'PLAN_INTENSITY' TEXT,").append("'WEIGHT_OBJECTIVE' TEXT,").append("'ENTITY_STATUS' INTEGER,").append("'PERSONALIZED' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'DIET_PLAN'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, DietPlan dietplan)
    {
        sqlitestatement.clearBindings();
        Object obj = dietplan.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = dietplan.getWeightPerWeekUnits();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = dietplan.getWeightPerWeek();
        if (obj != null)
        {
            sqlitestatement.bindDouble(3, ((Double) (obj)).doubleValue());
        }
        obj = dietplan.getEstimateDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = dietplan.getCaloriesDeficitPerDay();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Integer) (obj)).intValue());
        }
        obj = dietplan.getPlanIntensity();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = dietplan.getWeightObjective();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = dietplan.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(8, ((Integer) (obj)).intValue());
        }
        dietplan = dietplan.getPersonalized();
        if (dietplan != null)
        {
            long l;
            if (dietplan.booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(9, l);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (DietPlan)obj);
    }

    public Long getKey(DietPlan dietplan)
    {
        if (dietplan != null)
        {
            return dietplan.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((DietPlan)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public DietPlan readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        String s;
        Double double1;
        Date date;
        Integer integer;
        String s1;
        String s2;
        Integer integer1;
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
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 4));
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 7));
        }
        if (cursor.isNull(i + 8))
        {
            cursor = obj;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        return new DietPlan(long1, s, double1, date, integer, s1, s2, integer1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, DietPlan dietplan, int i)
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
        dietplan.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        dietplan.setWeightPerWeekUnits(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 2));
        }
        dietplan.setWeightPerWeek(((Double) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        dietplan.setEstimateDate(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 4));
        }
        dietplan.setCaloriesDeficitPerDay(((Integer) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        dietplan.setPlanIntensity(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        dietplan.setWeightObjective(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 7));
        }
        dietplan.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 8))
        {
            cursor = obj1;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        dietplan.setPersonalized(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (DietPlan)obj, i);
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

    protected Long updateKeyAfterInsert(DietPlan dietplan, long l)
    {
        dietplan.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((DietPlan)obj, l);
    }
}
