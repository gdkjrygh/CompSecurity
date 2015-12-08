// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Map;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodMeasurementUnitDao, FoodItemDao, FoodLogEntryDao, LightServingDao, 
//            FoodRelationDao, FavoriteFoodDao, MealItemDao, MealDao, 
//            FoodLocaleDao, FoodMeasurementUnit, FoodItem, FoodLogEntry, 
//            LightServing, FoodRelation, FavoriteFood, MealItem, 
//            Meal, FoodLocale

public class DaoSession extends AbstractDaoSession
{

    private final FavoriteFoodDao favoriteFoodDao;
    private final DaoConfig favoriteFoodDaoConfig;
    private final FoodItemDao foodItemDao;
    private final DaoConfig foodItemDaoConfig;
    private final FoodLocaleDao foodLocaleDao;
    private final DaoConfig foodLocaleDaoConfig;
    private final FoodLogEntryDao foodLogEntryDao;
    private final DaoConfig foodLogEntryDaoConfig;
    private final FoodMeasurementUnitDao foodMeasurementUnitDao;
    private final DaoConfig foodMeasurementUnitDaoConfig;
    private final FoodRelationDao foodRelationDao;
    private final DaoConfig foodRelationDaoConfig;
    private final LightServingDao lightServingDao;
    private final DaoConfig lightServingDaoConfig;
    private final MealDao mealDao;
    private final DaoConfig mealDaoConfig;
    private final MealItemDao mealItemDao;
    private final DaoConfig mealItemDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        foodMeasurementUnitDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/FoodMeasurementUnitDao)).clone();
        foodMeasurementUnitDaoConfig.initIdentityScope(identityscopetype);
        foodItemDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/FoodItemDao)).clone();
        foodItemDaoConfig.initIdentityScope(identityscopetype);
        foodLogEntryDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/FoodLogEntryDao)).clone();
        foodLogEntryDaoConfig.initIdentityScope(identityscopetype);
        lightServingDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/LightServingDao)).clone();
        lightServingDaoConfig.initIdentityScope(identityscopetype);
        foodRelationDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/FoodRelationDao)).clone();
        foodRelationDaoConfig.initIdentityScope(identityscopetype);
        favoriteFoodDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/FavoriteFoodDao)).clone();
        favoriteFoodDaoConfig.initIdentityScope(identityscopetype);
        mealItemDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/MealItemDao)).clone();
        mealItemDaoConfig.initIdentityScope(identityscopetype);
        mealDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/MealDao)).clone();
        mealDaoConfig.initIdentityScope(identityscopetype);
        foodLocaleDaoConfig = ((DaoConfig)map.get(com/fitbit/data/repo/greendao/food/FoodLocaleDao)).clone();
        foodLocaleDaoConfig.initIdentityScope(identityscopetype);
        foodMeasurementUnitDao = new FoodMeasurementUnitDao(foodMeasurementUnitDaoConfig, this);
        foodItemDao = new FoodItemDao(foodItemDaoConfig, this);
        foodLogEntryDao = new FoodLogEntryDao(foodLogEntryDaoConfig, this);
        lightServingDao = new LightServingDao(lightServingDaoConfig, this);
        foodRelationDao = new FoodRelationDao(foodRelationDaoConfig, this);
        favoriteFoodDao = new FavoriteFoodDao(favoriteFoodDaoConfig, this);
        mealItemDao = new MealItemDao(mealItemDaoConfig, this);
        mealDao = new MealDao(mealDaoConfig, this);
        foodLocaleDao = new FoodLocaleDao(foodLocaleDaoConfig, this);
        registerDao(com/fitbit/data/repo/greendao/food/FoodMeasurementUnit, foodMeasurementUnitDao);
        registerDao(com/fitbit/data/repo/greendao/food/FoodItem, foodItemDao);
        registerDao(com/fitbit/data/repo/greendao/food/FoodLogEntry, foodLogEntryDao);
        registerDao(com/fitbit/data/repo/greendao/food/LightServing, lightServingDao);
        registerDao(com/fitbit/data/repo/greendao/food/FoodRelation, foodRelationDao);
        registerDao(com/fitbit/data/repo/greendao/food/FavoriteFood, favoriteFoodDao);
        registerDao(com/fitbit/data/repo/greendao/food/MealItem, mealItemDao);
        registerDao(com/fitbit/data/repo/greendao/food/Meal, mealDao);
        registerDao(com/fitbit/data/repo/greendao/food/FoodLocale, foodLocaleDao);
    }

    public void clear()
    {
        foodMeasurementUnitDaoConfig.getIdentityScope().clear();
        foodItemDaoConfig.getIdentityScope().clear();
        foodLogEntryDaoConfig.getIdentityScope().clear();
        lightServingDaoConfig.getIdentityScope().clear();
        foodRelationDaoConfig.getIdentityScope().clear();
        favoriteFoodDaoConfig.getIdentityScope().clear();
        mealItemDaoConfig.getIdentityScope().clear();
        mealDaoConfig.getIdentityScope().clear();
        foodLocaleDaoConfig.getIdentityScope().clear();
    }

    public FavoriteFoodDao getFavoriteFoodDao()
    {
        return favoriteFoodDao;
    }

    public FoodItemDao getFoodItemDao()
    {
        return foodItemDao;
    }

    public FoodLocaleDao getFoodLocaleDao()
    {
        return foodLocaleDao;
    }

    public FoodLogEntryDao getFoodLogEntryDao()
    {
        return foodLogEntryDao;
    }

    public FoodMeasurementUnitDao getFoodMeasurementUnitDao()
    {
        return foodMeasurementUnitDao;
    }

    public FoodRelationDao getFoodRelationDao()
    {
        return foodRelationDao;
    }

    public LightServingDao getLightServingDao()
    {
        return lightServingDao;
    }

    public MealDao getMealDao()
    {
        return mealDao;
    }

    public MealItemDao getMealItemDao()
    {
        return mealItemDao;
    }
}
