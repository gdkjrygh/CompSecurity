// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.repo.greendao.food.DaoMaster;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.FavoriteFood;
import com.fitbit.data.repo.greendao.food.FavoriteFoodDao;
import com.fitbit.data.repo.greendao.food.FoodItem;
import com.fitbit.data.repo.greendao.food.FoodItemDao;
import com.fitbit.data.repo.greendao.food.FoodLocale;
import com.fitbit.data.repo.greendao.food.FoodLocaleDao;
import com.fitbit.data.repo.greendao.food.FoodLogEntry;
import com.fitbit.data.repo.greendao.food.FoodLogEntryDao;
import com.fitbit.data.repo.greendao.food.FoodMeasurementUnit;
import com.fitbit.data.repo.greendao.food.FoodMeasurementUnitDao;
import com.fitbit.data.repo.greendao.food.FoodRelation;
import com.fitbit.data.repo.greendao.food.FoodRelationDao;
import com.fitbit.data.repo.greendao.food.LightServing;
import com.fitbit.data.repo.greendao.food.LightServingDao;
import com.fitbit.data.repo.greendao.food.Meal;
import com.fitbit.data.repo.greendao.food.MealDao;
import com.fitbit.data.repo.greendao.food.MealItem;
import com.fitbit.data.repo.greendao.food.MealItemDao;
import com.fitbit.data.repo.greendao.migration.MigrationHelper;
import com.fitbit.e.a;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory

public static class nit> extends com.fitbit.data.repo.greendao.food.
{

    private static final String FOOD_MIGRATION_ERROR = "food_migration_error";
    private static final int MIGRATION_VERSION = 147;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        super.e(sqlitedatabase);
        Object obj = DaoFactory.access$000(DaoFactory.getInstance()).getWritableDatabase();
        if (((SQLiteDatabase) (obj)).getVersion() == 147)
        {
            DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
            obj = (new DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
            sqlitedatabase = (new DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
            Object obj1 = ((DaoSession) (obj)).getFavoriteFoodDao();
            Object obj2 = sqlitedatabase.getFavoriteFoodDao();
            FavoriteFood favoritefood;
            for (Iterator iterator1 = ((FavoriteFoodDao) (obj1)).loadAll().iterator(); iterator1.hasNext(); ((FavoriteFoodDao) (obj2)).insertOrReplace(favoritefood))
            {
                favoritefood = (FavoriteFood)iterator1.next();
                ((FavoriteFoodDao) (obj1)).detach(favoritefood);
            }

            obj1 = ((DaoSession) (obj)).getFoodItemDao();
            obj2 = sqlitedatabase.getFoodItemDao();
            FoodItem fooditem;
            for (Iterator iterator2 = ((FoodItemDao) (obj1)).loadAll().iterator(); iterator2.hasNext(); ((FoodItemDao) (obj2)).insertOrReplace(fooditem))
            {
                fooditem = (FoodItem)iterator2.next();
                ((FoodItemDao) (obj1)).detach(fooditem);
            }

            obj1 = ((DaoSession) (obj)).getFoodLocaleDao();
            obj2 = sqlitedatabase.getFoodLocaleDao();
            FoodLocale foodlocale;
            for (Iterator iterator3 = ((FoodLocaleDao) (obj1)).loadAll().iterator(); iterator3.hasNext(); ((FoodLocaleDao) (obj2)).insertOrReplace(foodlocale))
            {
                foodlocale = (FoodLocale)iterator3.next();
                ((FoodLocaleDao) (obj1)).detach(foodlocale);
            }

            obj1 = ((DaoSession) (obj)).getFoodMeasurementUnitDao();
            obj2 = sqlitedatabase.getFoodMeasurementUnitDao();
            FoodMeasurementUnit foodmeasurementunit;
            for (Iterator iterator4 = ((FoodMeasurementUnitDao) (obj1)).loadAll().iterator(); iterator4.hasNext(); ((FoodMeasurementUnitDao) (obj2)).insertOrReplace(foodmeasurementunit))
            {
                foodmeasurementunit = (FoodMeasurementUnit)iterator4.next();
                ((FoodMeasurementUnitDao) (obj1)).detach(foodmeasurementunit);
            }

            obj1 = ((DaoSession) (obj)).getFoodRelationDao();
            obj2 = sqlitedatabase.getFoodRelationDao();
            FoodRelation foodrelation;
            for (Iterator iterator5 = ((FoodRelationDao) (obj1)).loadAll().iterator(); iterator5.hasNext(); ((FoodRelationDao) (obj2)).insertOrReplace(foodrelation))
            {
                foodrelation = (FoodRelation)iterator5.next();
                ((FoodRelationDao) (obj1)).detach(foodrelation);
            }

            obj1 = ((DaoSession) (obj)).getLightServingDao();
            obj2 = sqlitedatabase.getLightServingDao();
            LightServing lightserving;
            for (Iterator iterator6 = ((LightServingDao) (obj1)).loadAll().iterator(); iterator6.hasNext(); ((LightServingDao) (obj2)).insertOrReplace(lightserving))
            {
                lightserving = (LightServing)iterator6.next();
                ((LightServingDao) (obj1)).detach(lightserving);
            }

            obj1 = ((DaoSession) (obj)).getMealDao();
            obj2 = sqlitedatabase.getMealDao();
            Meal meal;
            for (Iterator iterator7 = ((MealDao) (obj1)).loadAll().iterator(); iterator7.hasNext(); ((MealDao) (obj2)).insertOrReplace(meal))
            {
                meal = (Meal)iterator7.next();
                ((MealDao) (obj1)).detach(meal);
            }

            obj1 = ((DaoSession) (obj)).getMealItemDao();
            obj2 = sqlitedatabase.getMealItemDao();
            MealItem mealitem;
            for (Iterator iterator8 = ((MealItemDao) (obj1)).loadAll().iterator(); iterator8.hasNext(); ((MealItemDao) (obj2)).insertOrReplace(mealitem))
            {
                mealitem = (MealItem)iterator8.next();
                ((MealItemDao) (obj1)).detach(mealitem);
            }

            obj = ((DaoSession) (obj)).getFoodLogEntryDao();
            sqlitedatabase = sqlitedatabase.getFoodLogEntryDao();
            FoodLogEntry foodlogentry;
            for (Iterator iterator = ((FoodLogEntryDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insertOrReplace(foodlogentry))
            {
                foodlogentry = (FoodLogEntry)iterator.next();
                ((FoodLogEntryDao) (obj)).detach(foodlogentry);
            }

        }
        DaoMaster.dropAllTables(DaoFactory.access$000(DaoFactory.getInstance()).getWritableDatabase(), true);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.a("DaoFactory", "Upgrading FoodDB schema from version [%s] to [%s]", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        boolean flag;
        try
        {
            flag = MigrationHelper.migrateFoodDB(sqlitedatabase, i, j);
        }
        catch (Throwable throwable)
        {
            a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
            return;
        }
        if (flag)
        {
            FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "food_migration_error", null, 0);
            com.fitbit.savedstate.d.c(true);
        }
    }

    public per(Context context)
    {
        super(context, "food_db", null);
    }
}
