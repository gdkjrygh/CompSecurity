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

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodItem, DaoSession

public class FoodItemDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Brand = new Property(3, java/lang/String, "brand", false, "BRAND");
        public static final Property Calories = new Property(4, java/lang/Double, "calories", false, "CALORIES");
        public static final Property EntityStatus = new Property(14, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property IsCustom = new Property(6, java/lang/Boolean, "isCustom", false, "IS_CUSTOM");
        public static final Property IsGeneric = new Property(8, java/lang/Boolean, "isGeneric", false, "IS_GENERIC");
        public static final Property IsRaw = new Property(7, java/lang/Boolean, "isRaw", false, "IS_RAW");
        public static final Property Locale = new Property(9, java/lang/String, "locale", false, "LOCALE");
        public static final Property MaxGenericCalories = new Property(12, java/lang/Double, "maxGenericCalories", false, "MAX_GENERIC_CALORIES");
        public static final Property MinGenericCalories = new Property(10, java/lang/Double, "minGenericCalories", false, "MIN_GENERIC_CALORIES");
        public static final Property MostGenericCalories = new Property(11, java/lang/Double, "mostGenericCalories", false, "MOST_GENERIC_CALORIES");
        public static final Property Name = new Property(2, java/lang/String, "name", false, "NAME");
        public static final Property NutritionalValues = new Property(5, java/lang/String, "nutritionalValues", false, "NUTRITIONAL_VALUES");
        public static final Property Populated = new Property(13, java/lang/Boolean, "populated", false, "POPULATED");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "FOOD_ITEM";
    private DaoSession daoSession;

    public FoodItemDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public FoodItemDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'FOOD_ITEM' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'NAME' TEXT,").append("'BRAND' TEXT,").append("'CALORIES' REAL,").append("'NUTRITIONAL_VALUES' TEXT,").append("'IS_CUSTOM' INTEGER,").append("'IS_RAW' INTEGER,").append("'IS_GENERIC' INTEGER,").append("'LOCALE' TEXT,").append("'MIN_GENERIC_CALORIES' REAL,").append("'MOST_GENERIC_CALORIES' REAL,").append("'MAX_GENERIC_CALORIES' REAL,").append("'POPULATED' INTEGER,").append("'ENTITY_STATUS' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FOOD_ITEM'").toString());
    }

    protected void attachEntity(FoodItem fooditem)
    {
        super.attachEntity(fooditem);
        fooditem.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((FoodItem)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, FoodItem fooditem)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = fooditem.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = fooditem.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = fooditem.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = fooditem.getBrand();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = fooditem.getCalories();
        if (obj != null)
        {
            sqlitestatement.bindDouble(5, ((Double) (obj)).doubleValue());
        }
        obj = fooditem.getNutritionalValues();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = fooditem.getIsCustom();
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
            sqlitestatement.bindLong(7, l);
        }
        obj = fooditem.getIsRaw();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(8, l);
        }
        obj = fooditem.getIsGeneric();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(9, l);
        }
        obj = fooditem.getLocale();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = fooditem.getMinGenericCalories();
        if (obj != null)
        {
            sqlitestatement.bindDouble(11, ((Double) (obj)).doubleValue());
        }
        obj = fooditem.getMostGenericCalories();
        if (obj != null)
        {
            sqlitestatement.bindDouble(12, ((Double) (obj)).doubleValue());
        }
        obj = fooditem.getMaxGenericCalories();
        if (obj != null)
        {
            sqlitestatement.bindDouble(13, ((Double) (obj)).doubleValue());
        }
        obj = fooditem.getPopulated();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(14, l);
        }
        fooditem = fooditem.getEntityStatus();
        if (fooditem != null)
        {
            sqlitestatement.bindLong(15, fooditem.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (FoodItem)obj);
    }

    public Long getKey(FoodItem fooditem)
    {
        if (fooditem != null)
        {
            return fooditem.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((FoodItem)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public FoodItem readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        String s1;
        Double double1;
        String s2;
        Boolean boolean1;
        Boolean boolean2;
        Boolean boolean3;
        String s3;
        Double double2;
        Double double3;
        Double double4;
        Boolean boolean4;
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
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 6) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 7))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 7) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 8))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 8) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 9))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 9);
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
            double3 = null;
        } else
        {
            double3 = Double.valueOf(cursor.getDouble(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            double4 = null;
        } else
        {
            double4 = Double.valueOf(cursor.getDouble(i + 12));
        }
        if (cursor.isNull(i + 13))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 13) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 14))
        {
            cursor = null;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 14));
        }
        return new FoodItem(long1, long2, s, s1, double1, s2, boolean1, boolean2, boolean3, s3, double2, double3, double4, boolean4, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, FoodItem fooditem, int i)
    {
        boolean flag4 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        fooditem.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        fooditem.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        fooditem.setName(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        fooditem.setBrand(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 4));
        }
        fooditem.setCalories(((Double) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        fooditem.setNutritionalValues(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 6) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        fooditem.setIsCustom(((Boolean) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 7) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        fooditem.setIsRaw(((Boolean) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 8) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        fooditem.setIsGeneric(((Boolean) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        fooditem.setLocale(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 10));
        }
        fooditem.setMinGenericCalories(((Double) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 11));
        }
        fooditem.setMostGenericCalories(((Double) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 12));
        }
        fooditem.setMaxGenericCalories(((Double) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 13) != 0)
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        fooditem.setPopulated(((Boolean) (obj)));
        if (cursor.isNull(i + 14))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 14));
        }
        fooditem.setEntityStatus(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (FoodItem)obj, i);
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

    protected Long updateKeyAfterInsert(FoodItem fooditem, long l)
    {
        fooditem.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((FoodItem)obj, l);
    }
}
