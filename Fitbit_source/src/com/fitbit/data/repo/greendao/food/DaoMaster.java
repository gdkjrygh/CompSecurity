// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodMeasurementUnitDao, FoodItemDao, FoodLogEntryDao, LightServingDao, 
//            FoodRelationDao, FavoriteFoodDao, MealItemDao, MealDao, 
//            FoodLocaleDao, DaoSession

public class DaoMaster extends AbstractDaoMaster
{
    public static class DevOpenHelper extends OpenHelper
    {

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            Log.i("greenDAO", (new StringBuilder()).append("Upgrading schema from version ").append(i).append(" to ").append(j).append(" by dropping all tables").toString());
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
        }

        public DevOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory);
        }
    }

    public static abstract class OpenHelper extends SQLiteOpenHelper
    {

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            Log.i("greenDAO", "Creating tables for schema version 2");
            DaoMaster.createAllTables(sqlitedatabase, false);
        }

        public OpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory, 2);
        }
    }


    public static final int SCHEMA_VERSION = 2;

    public DaoMaster(SQLiteDatabase sqlitedatabase)
    {
        super(sqlitedatabase, 2);
        registerDaoClass(com/fitbit/data/repo/greendao/food/FoodMeasurementUnitDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/FoodItemDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/FoodLogEntryDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/LightServingDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/FoodRelationDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/FavoriteFoodDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/MealItemDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/MealDao);
        registerDaoClass(com/fitbit/data/repo/greendao/food/FoodLocaleDao);
    }

    public static void createAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        FoodMeasurementUnitDao.createTable(sqlitedatabase, flag);
        FoodItemDao.createTable(sqlitedatabase, flag);
        FoodLogEntryDao.createTable(sqlitedatabase, flag);
        LightServingDao.createTable(sqlitedatabase, flag);
        FoodRelationDao.createTable(sqlitedatabase, flag);
        FavoriteFoodDao.createTable(sqlitedatabase, flag);
        MealItemDao.createTable(sqlitedatabase, flag);
        MealDao.createTable(sqlitedatabase, flag);
        FoodLocaleDao.createTable(sqlitedatabase, flag);
    }

    public static void dropAllTables(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        FoodMeasurementUnitDao.dropTable(sqlitedatabase, flag);
        FoodItemDao.dropTable(sqlitedatabase, flag);
        FoodLogEntryDao.dropTable(sqlitedatabase, flag);
        LightServingDao.dropTable(sqlitedatabase, flag);
        FoodRelationDao.dropTable(sqlitedatabase, flag);
        FavoriteFoodDao.dropTable(sqlitedatabase, flag);
        MealItemDao.dropTable(sqlitedatabase, flag);
        MealDao.dropTable(sqlitedatabase, flag);
        FoodLocaleDao.dropTable(sqlitedatabase, flag);
    }

    public DaoSession newSession()
    {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType identityscopetype)
    {
        return new DaoSession(db, identityscopetype, daoConfigMap);
    }

    public volatile AbstractDaoSession newSession()
    {
        return newSession();
    }

    public volatile AbstractDaoSession newSession(IdentityScopeType identityscopetype)
    {
        return newSession(identityscopetype);
    }
}
