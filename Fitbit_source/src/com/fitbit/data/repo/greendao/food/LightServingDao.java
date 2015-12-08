// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            LightServing, DaoSession

public class LightServingDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property FoodId = new Property(5, java/lang/Long, "foodId", false, "FOOD_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property IsDefault = new Property(1, java/lang/Boolean, "isDefault", false, "IS_DEFAULT");
        public static final Property Multiplier = new Property(2, java/lang/Double, "multiplier", false, "MULTIPLIER");
        public static final Property UnitName = new Property(3, java/lang/String, "unitName", false, "UNIT_NAME");
        public static final Property UnitNamePlural = new Property(4, java/lang/String, "unitNamePlural", false, "UNIT_NAME_PLURAL");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "LIGHT_SERVING";
    private Query foodItem_LightServingsQuery;

    public LightServingDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public LightServingDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'LIGHT_SERVING' (").append("'_id' INTEGER PRIMARY KEY ,").append("'IS_DEFAULT' INTEGER,").append("'MULTIPLIER' REAL,").append("'UNIT_NAME' TEXT,").append("'UNIT_NAME_PLURAL' TEXT,").append("'FOOD_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'LIGHT_SERVING'").toString());
    }

    public List _queryFoodItem_LightServings(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (foodItem_LightServingsQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.FoodId.eq(null), new WhereCondition[0]);
            foodItem_LightServingsQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = foodItem_LightServingsQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void bindValues(SQLiteStatement sqlitestatement, LightServing lightserving)
    {
        sqlitestatement.clearBindings();
        Object obj = lightserving.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = lightserving.getIsDefault();
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
            sqlitestatement.bindLong(2, l);
        }
        obj = lightserving.getMultiplier();
        if (obj != null)
        {
            sqlitestatement.bindDouble(3, ((Double) (obj)).doubleValue());
        }
        obj = lightserving.getUnitName();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = lightserving.getUnitNamePlural();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        lightserving = lightserving.getFoodId();
        if (lightserving != null)
        {
            sqlitestatement.bindLong(6, lightserving.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (LightServing)obj);
    }

    public Long getKey(LightServing lightserving)
    {
        if (lightserving != null)
        {
            return lightserving.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((LightServing)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public LightServing readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Boolean boolean1;
        Double double1;
        String s;
        String s1;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
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
            s = null;
        } else
        {
            s = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 5));
        }
        return new LightServing(long1, boolean1, double1, s, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, LightServing lightserving, int i)
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
        lightserving.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        lightserving.setIsDefault(((Boolean) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 2));
        }
        lightserving.setMultiplier(((Double) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        lightserving.setUnitName(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        lightserving.setUnitNamePlural(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 5));
        }
        lightserving.setFoodId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (LightServing)obj, i);
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

    protected Long updateKeyAfterInsert(LightServing lightserving, long l)
    {
        lightserving.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((LightServing)obj, l);
    }
}
