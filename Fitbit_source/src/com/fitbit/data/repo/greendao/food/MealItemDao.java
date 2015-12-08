// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

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
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            MealItem, DaoSession, FoodItemDao, MealDao, 
//            FoodItem, Meal

public class MealItemDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Amount = new Property(6, java/lang/Double, "amount", false, "AMOUNT");
        public static final Property Brand = new Property(7, java/lang/String, "brand", false, "BRAND");
        public static final Property Calories = new Property(8, java/lang/Double, "calories", false, "CALORIES");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property FoodId = new Property(13, java/lang/Long, "foodId", false, "FOOD_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property MealId = new Property(14, java/lang/Long, "mealId", false, "MEAL_ID");
        public static final Property MealType = new Property(9, java/lang/Integer, "mealType", false, "MEAL_TYPE");
        public static final Property Name = new Property(10, java/lang/String, "name", false, "NAME");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property UnitName = new Property(11, java/lang/String, "unitName", false, "UNIT_NAME");
        public static final Property UnitNamePlural = new Property(12, java/lang/String, "unitNamePlural", false, "UNIT_NAME_PLURAL");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "MEAL_ITEM";
    private DaoSession daoSession;
    private Query meal_MealItemListQuery;
    private String selectDeep;

    public MealItemDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public MealItemDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'MEAL_ITEM' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'AMOUNT' REAL,").append("'BRAND' TEXT,").append("'CALORIES' REAL,").append("'MEAL_TYPE' INTEGER,").append("'NAME' TEXT,").append("'UNIT_NAME' TEXT,").append("'UNIT_NAME_PLURAL' TEXT,").append("'FOOD_ID' INTEGER,").append("'MEAL_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_MEAL_ITEM_UUID ON MEAL_ITEM").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_MEAL_ITEM_ENTITY_STATUS ON MEAL_ITEM").append(" (ENTITY_STATUS);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'MEAL_ITEM'").toString());
    }

    public List _queryMeal_MealItemList(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (meal_MealItemListQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.MealId.eq(null), new WhereCondition[0]);
            meal_MealItemListQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = meal_MealItemListQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void attachEntity(MealItem mealitem)
    {
        super.attachEntity(mealitem);
        mealitem.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((MealItem)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, MealItem mealitem)
    {
        sqlitestatement.clearBindings();
        Object obj = mealitem.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = mealitem.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = mealitem.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = mealitem.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = mealitem.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = mealitem.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = mealitem.getAmount();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        obj = mealitem.getBrand();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = mealitem.getCalories();
        if (obj != null)
        {
            sqlitestatement.bindDouble(9, ((Double) (obj)).doubleValue());
        }
        obj = mealitem.getMealType();
        if (obj != null)
        {
            sqlitestatement.bindLong(10, ((Integer) (obj)).intValue());
        }
        obj = mealitem.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = mealitem.getUnitName();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = mealitem.getUnitNamePlural();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = mealitem.getFoodId();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Long) (obj)).longValue());
        }
        mealitem = mealitem.getMealId();
        if (mealitem != null)
        {
            sqlitestatement.bindLong(15, mealitem.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (MealItem)obj);
    }

    public Long getKey(MealItem mealitem)
    {
        if (mealitem != null)
        {
            return mealitem.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((MealItem)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getFoodItemDao().getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T1", daoSession.getMealDao().getAllColumns());
            stringbuilder.append(" FROM MEAL_ITEM T");
            stringbuilder.append(" LEFT JOIN FOOD_ITEM T0 ON T.'FOOD_ID'=T0.'_id'");
            stringbuilder.append(" LEFT JOIN MEAL T1 ON T.'MEAL_ID'=T1.'_id'");
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

    protected MealItem loadCurrentDeep(Cursor cursor, boolean flag)
    {
        MealItem mealitem = (MealItem)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        mealitem.setFoodItem((FoodItem)loadCurrentOther(daoSession.getFoodItemDao(), cursor, i));
        int j = daoSession.getFoodItemDao().getAllColumns().length;
        mealitem.setMeal((Meal)loadCurrentOther(daoSession.getMealDao(), cursor, j + i));
        return mealitem;
    }

    public MealItem loadDeep(Long long1)
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
        MealItem mealitem = loadCurrentDeep(long1, true);
        long1.close();
        return mealitem;
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

    public MealItem readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Double double1;
        String s1;
        Double double2;
        Integer integer1;
        String s2;
        String s3;
        String s4;
        Long long3;
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
            double2 = null;
        } else
        {
            double2 = Double.valueOf(cursor.getDouble(i + 8));
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 14));
        }
        return new MealItem(long1, long2, s, date, date1, integer, double1, s1, double2, integer1, s2, s3, s4, long3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, MealItem mealitem, int i)
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
        mealitem.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        mealitem.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        mealitem.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        mealitem.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        mealitem.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        mealitem.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        mealitem.setAmount(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        mealitem.setBrand(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 8));
        }
        mealitem.setCalories(((Double) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 9));
        }
        mealitem.setMealType(((Integer) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        mealitem.setName(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        mealitem.setUnitName(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        mealitem.setUnitNamePlural(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 13));
        }
        mealitem.setFoodId(((Long) (obj)));
        if (cursor.isNull(i + 14))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 14));
        }
        mealitem.setMealId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (MealItem)obj, i);
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

    protected Long updateKeyAfterInsert(MealItem mealitem, long l)
    {
        mealitem.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((MealItem)obj, l);
    }
}
