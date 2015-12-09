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
//            FoodLogEntry, DaoSession, FoodItemDao, FoodItem

public class FoodLogEntryDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Amount = new Property(10, java/lang/Double, "amount", false, "AMOUNT");
        public static final Property Brand = new Property(11, java/lang/String, "brand", false, "BRAND");
        public static final Property Calories = new Property(12, java/lang/Double, "calories", false, "CALORIES");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property FoodId = new Property(17, java/lang/Long, "foodId", false, "FOOD_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property IsQuickCaloriesAdd = new Property(9, java/lang/Boolean, "isQuickCaloriesAdd", false, "IS_QUICK_CALORIES_ADD");
        public static final Property LogDate = new Property(8, java/util/Date, "logDate", false, "LOG_DATE");
        public static final Property MealType = new Property(13, java/lang/Integer, "mealType", false, "MEAL_TYPE");
        public static final Property Name = new Property(14, java/lang/String, "name", false, "NAME");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property TrackerType = new Property(7, java/lang/String, "trackerType", false, "TRACKER_TYPE");
        public static final Property UnitName = new Property(15, java/lang/String, "unitName", false, "UNIT_NAME");
        public static final Property UnitNamePlural = new Property(16, java/lang/String, "unitNamePlural", false, "UNIT_NAME_PLURAL");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
        public static final Property Value = new Property(6, java/lang/Double, "value", false, "VALUE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "FOOD_LOG_ENTRY";
    private DaoSession daoSession;
    private String selectDeep;

    public FoodLogEntryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public FoodLogEntryDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'FOOD_LOG_ENTRY' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'VALUE' REAL,").append("'TRACKER_TYPE' TEXT,").append("'LOG_DATE' INTEGER,").append("'IS_QUICK_CALORIES_ADD' INTEGER,").append("'AMOUNT' REAL,").append("'BRAND' TEXT,").append("'CALORIES' REAL,").append("'MEAL_TYPE' INTEGER,").append("'NAME' TEXT,").append("'UNIT_NAME' TEXT,").append("'UNIT_NAME_PLURAL' TEXT,").append("'FOOD_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_FOOD_LOG_ENTRY_UUID ON FOOD_LOG_ENTRY").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_FOOD_LOG_ENTRY_ENTITY_STATUS ON FOOD_LOG_ENTRY").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_FOOD_LOG_ENTRY_LOG_DATE ON FOOD_LOG_ENTRY").append(" (LOG_DATE);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FOOD_LOG_ENTRY'").toString());
    }

    protected void attachEntity(FoodLogEntry foodlogentry)
    {
        super.attachEntity(foodlogentry);
        foodlogentry.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((FoodLogEntry)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, FoodLogEntry foodlogentry)
    {
        sqlitestatement.clearBindings();
        Object obj = foodlogentry.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = foodlogentry.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = foodlogentry.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = foodlogentry.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = foodlogentry.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = foodlogentry.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = foodlogentry.getValue();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        obj = foodlogentry.getTrackerType();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = foodlogentry.getLogDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(9, ((Date) (obj)).getTime());
        }
        obj = foodlogentry.getIsQuickCaloriesAdd();
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
            sqlitestatement.bindLong(10, l);
        }
        obj = foodlogentry.getAmount();
        if (obj != null)
        {
            sqlitestatement.bindDouble(11, ((Double) (obj)).doubleValue());
        }
        obj = foodlogentry.getBrand();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = foodlogentry.getCalories();
        if (obj != null)
        {
            sqlitestatement.bindDouble(13, ((Double) (obj)).doubleValue());
        }
        obj = foodlogentry.getMealType();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Integer) (obj)).intValue());
        }
        obj = foodlogentry.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = foodlogentry.getUnitName();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = foodlogentry.getUnitNamePlural();
        if (obj != null)
        {
            sqlitestatement.bindString(17, ((String) (obj)));
        }
        foodlogentry = foodlogentry.getFoodId();
        if (foodlogentry != null)
        {
            sqlitestatement.bindLong(18, foodlogentry.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (FoodLogEntry)obj);
    }

    public Long getKey(FoodLogEntry foodlogentry)
    {
        if (foodlogentry != null)
        {
            return foodlogentry.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((FoodLogEntry)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getFoodItemDao().getAllColumns());
            stringbuilder.append(" FROM FOOD_LOG_ENTRY T");
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

    protected FoodLogEntry loadCurrentDeep(Cursor cursor, boolean flag)
    {
        FoodLogEntry foodlogentry = (FoodLogEntry)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        foodlogentry.setFoodItem((FoodItem)loadCurrentOther(daoSession.getFoodItemDao(), cursor, i));
        return foodlogentry;
    }

    public FoodLogEntry loadDeep(Long long1)
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
        FoodLogEntry foodlogentry = loadCurrentDeep(long1, true);
        long1.close();
        return foodlogentry;
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

    public FoodLogEntry readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Double double1;
        String s1;
        Date date2;
        Boolean boolean1;
        Double double2;
        String s2;
        Double double3;
        Integer integer1;
        String s3;
        String s4;
        String s5;
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
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 8));
        }
        if (cursor.isNull(i + 9))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 9) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            double3 = null;
        } else
        {
            double3 = Double.valueOf(cursor.getDouble(i + 12));
        }
        if (cursor.isNull(i + 13))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 16);
        }
        if (cursor.isNull(i + 17))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 17));
        }
        return new FoodLogEntry(long1, long2, s, date, date1, integer, double1, s1, date2, boolean1, double2, s2, double3, integer1, s3, s4, s5, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, FoodLogEntry foodlogentry, int i)
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
        foodlogentry.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        foodlogentry.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        foodlogentry.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        foodlogentry.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        foodlogentry.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        foodlogentry.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        foodlogentry.setValue(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        foodlogentry.setTrackerType(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 8));
        }
        foodlogentry.setLogDate(((Date) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 9) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        foodlogentry.setIsQuickCaloriesAdd(((Boolean) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 10));
        }
        foodlogentry.setAmount(((Double) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        foodlogentry.setBrand(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 12));
        }
        foodlogentry.setCalories(((Double) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 13));
        }
        foodlogentry.setMealType(((Integer) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        foodlogentry.setName(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        foodlogentry.setUnitName(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 16);
        }
        foodlogentry.setUnitNamePlural(((String) (obj)));
        if (cursor.isNull(i + 17))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 17));
        }
        foodlogentry.setFoodId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (FoodLogEntry)obj, i);
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

    protected Long updateKeyAfterInsert(FoodLogEntry foodlogentry, long l)
    {
        foodlogentry.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((FoodLogEntry)obj, l);
    }
}
