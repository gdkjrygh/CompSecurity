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
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FavoriteFood, DaoSession, FoodItemDao, FoodItem

public class FavoriteFoodDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property EntityStatus = new Property(2, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property FoodId = new Property(3, java/lang/Long, "foodId", false, "FOOD_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property ServerFoodId = new Property(1, java/lang/Long, "serverFoodId", false, "SERVER_FOOD_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "FAVORITE_FOOD";
    private DaoSession daoSession;
    private String selectDeep;

    public FavoriteFoodDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public FavoriteFoodDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'FAVORITE_FOOD' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_FOOD_ID' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'FOOD_ID' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FAVORITE_FOOD'").toString());
    }

    protected void attachEntity(FavoriteFood favoritefood)
    {
        super.attachEntity(favoritefood);
        favoritefood.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((FavoriteFood)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, FavoriteFood favoritefood)
    {
        sqlitestatement.clearBindings();
        Object obj = favoritefood.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = favoritefood.getServerFoodId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = favoritefood.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        favoritefood = favoritefood.getFoodId();
        if (favoritefood != null)
        {
            sqlitestatement.bindLong(4, favoritefood.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (FavoriteFood)obj);
    }

    public Long getKey(FavoriteFood favoritefood)
    {
        if (favoritefood != null)
        {
            return favoritefood.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((FavoriteFood)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getFoodItemDao().getAllColumns());
            stringbuilder.append(" FROM FAVORITE_FOOD T");
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

    protected FavoriteFood loadCurrentDeep(Cursor cursor, boolean flag)
    {
        FavoriteFood favoritefood = (FavoriteFood)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        favoritefood.setFoodItem((FoodItem)loadCurrentOther(daoSession.getFoodItemDao(), cursor, i));
        return favoritefood;
    }

    public FavoriteFood loadDeep(Long long1)
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
        break MISSING_BLOCK_LABEL_137;
        Exception exception;
        exception;
        long1.close();
        throw exception;
        FavoriteFood favoritefood = loadCurrentDeep(long1, true);
        long1.close();
        return favoritefood;
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

    public FavoriteFood readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Long long2;
        Integer integer;
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
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 3));
        }
        return new FavoriteFood(long1, long2, integer, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, FavoriteFood favoritefood, int i)
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
        favoritefood.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        favoritefood.setServerFoodId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        favoritefood.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 3));
        }
        favoritefood.setFoodId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (FavoriteFood)obj, i);
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

    protected Long updateKeyAfterInsert(FavoriteFood favoritefood, long l)
    {
        favoritefood.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((FavoriteFood)obj, l);
    }
}
