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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodRelation, DaoSession, FoodItemDao, FoodItem

public class FoodRelationDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Amount = new Property(4, java/lang/Double, "amount", false, "AMOUNT");
        public static final Property Brand = new Property(5, java/lang/String, "brand", false, "BRAND");
        public static final Property Calories = new Property(6, java/lang/Double, "calories", false, "CALORIES");
        public static final Property DateLastEaten = new Property(1, java/util/Date, "dateLastEaten", false, "DATE_LAST_EATEN");
        public static final Property DisplayIndex = new Property(3, java/lang/Integer, "displayIndex", false, "DISPLAY_INDEX");
        public static final Property FoodId = new Property(11, java/lang/Long, "foodId", false, "FOOD_ID");
        public static final Property Group = new Property(2, java/lang/Integer, "group", false, "GROUP");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property MealType = new Property(7, java/lang/Integer, "mealType", false, "MEAL_TYPE");
        public static final Property Name = new Property(8, java/lang/String, "name", false, "NAME");
        public static final Property UnitName = new Property(9, java/lang/String, "unitName", false, "UNIT_NAME");
        public static final Property UnitNamePlural = new Property(10, java/lang/String, "unitNamePlural", false, "UNIT_NAME_PLURAL");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "FOOD_RELATION";
    private DaoSession daoSession;
    private String selectDeep;

    public FoodRelationDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public FoodRelationDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'FOOD_RELATION' (").append("'_id' INTEGER PRIMARY KEY ,").append("'DATE_LAST_EATEN' INTEGER,").append("'GROUP' INTEGER,").append("'DISPLAY_INDEX' INTEGER,").append("'AMOUNT' REAL,").append("'BRAND' TEXT,").append("'CALORIES' REAL,").append("'MEAL_TYPE' INTEGER,").append("'NAME' TEXT,").append("'UNIT_NAME' TEXT,").append("'UNIT_NAME_PLURAL' TEXT,").append("'FOOD_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FOOD_RELATION'").toString());
    }

    protected void attachEntity(FoodRelation foodrelation)
    {
        super.attachEntity(foodrelation);
        foodrelation.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((FoodRelation)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, FoodRelation foodrelation)
    {
        sqlitestatement.clearBindings();
        Object obj = foodrelation.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = foodrelation.getDateLastEaten();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = foodrelation.getGroup();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        obj = foodrelation.getDisplayIndex();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Integer) (obj)).intValue());
        }
        obj = foodrelation.getAmount();
        if (obj != null)
        {
            sqlitestatement.bindDouble(5, ((Double) (obj)).doubleValue());
        }
        obj = foodrelation.getBrand();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = foodrelation.getCalories();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        obj = foodrelation.getMealType();
        if (obj != null)
        {
            sqlitestatement.bindLong(8, ((Integer) (obj)).intValue());
        }
        obj = foodrelation.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = foodrelation.getUnitName();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = foodrelation.getUnitNamePlural();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        foodrelation = foodrelation.getFoodId();
        if (foodrelation != null)
        {
            sqlitestatement.bindLong(12, foodrelation.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (FoodRelation)obj);
    }

    public Long getKey(FoodRelation foodrelation)
    {
        if (foodrelation != null)
        {
            return foodrelation.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((FoodRelation)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getFoodItemDao().getAllColumns());
            stringbuilder.append(" FROM FOOD_RELATION T");
            stringbuilder.append(" LEFT JOIN FOOD_ITEM T0 ON T.'FOOD_ID'=T0.'_id'");
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

    protected FoodRelation loadCurrentDeep(Cursor cursor, boolean flag)
    {
        FoodRelation foodrelation = (FoodRelation)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        foodrelation.setFoodItem((FoodItem)loadCurrentOther(daoSession.getFoodItemDao(), cursor, i));
        return foodrelation;
    }

    public FoodRelation loadDeep(Long long1)
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
        FoodRelation foodrelation = loadCurrentDeep(long1, true);
        long1.close();
        return foodrelation;
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

    public FoodRelation readEntity(Cursor cursor, int i)
    {
        Long long1;
        Date date;
        Integer integer;
        Integer integer1;
        Double double1;
        String s;
        Double double2;
        Integer integer2;
        String s1;
        String s2;
        String s3;
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
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 3));
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
            s = null;
        } else
        {
            s = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(cursor.getDouble(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 7));
        }
        if (cursor.isNull(i + 8))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 11));
        }
        return new FoodRelation(long1, date, integer, integer1, double1, s, double2, integer2, s1, s2, s3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, FoodRelation foodrelation, int i)
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
        foodrelation.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        foodrelation.setDateLastEaten(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        foodrelation.setGroup(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 3));
        }
        foodrelation.setDisplayIndex(((Integer) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 4));
        }
        foodrelation.setAmount(((Double) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        foodrelation.setBrand(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        foodrelation.setCalories(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 7));
        }
        foodrelation.setMealType(((Integer) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        foodrelation.setName(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        foodrelation.setUnitName(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        foodrelation.setUnitNamePlural(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 11));
        }
        foodrelation.setFoodId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (FoodRelation)obj, i);
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

    protected Long updateKeyAfterInsert(FoodRelation foodrelation, long l)
    {
        foodrelation.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((FoodRelation)obj, l);
    }
}
