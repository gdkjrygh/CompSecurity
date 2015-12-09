// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.repo.greendao.activity.ActivityItem;
import com.fitbit.data.repo.greendao.activity.ActivityItemDao;
import com.fitbit.data.repo.greendao.activity.ActivityLevel;
import com.fitbit.data.repo.greendao.activity.ActivityLevelDao;
import com.fitbit.data.repo.greendao.activity.ActivityLogEntry;
import com.fitbit.data.repo.greendao.activity.ActivityLogEntryDao;
import com.fitbit.data.repo.greendao.activity.DaoMaster;
import com.fitbit.data.repo.greendao.activity.MostRecentActivity;
import com.fitbit.data.repo.greendao.activity.MostRecentActivityDao;
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
import com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummary;
import com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummaryDao;
import com.fitbit.data.repo.greendao.heartrate.HeartRateZone;
import com.fitbit.data.repo.greendao.heartrate.HeartRateZoneDao;
import com.fitbit.data.repo.greendao.logging.BodyFatLogEntry;
import com.fitbit.data.repo.greendao.logging.BodyFatLogEntryDao;
import com.fitbit.data.repo.greendao.logging.SleepLogEntry;
import com.fitbit.data.repo.greendao.logging.SleepLogEntryDao;
import com.fitbit.data.repo.greendao.logging.WaterLogEntry;
import com.fitbit.data.repo.greendao.logging.WaterLogEntryDao;
import com.fitbit.data.repo.greendao.logging.WeightLogEntry;
import com.fitbit.data.repo.greendao.logging.WeightLogEntryDao;
import com.fitbit.data.repo.greendao.migration.MigrationHelper;
import com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteData;
import com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteDataDao;
import com.fitbit.data.repo.greendao.social.Badge;
import com.fitbit.data.repo.greendao.social.BadgeDao;
import com.fitbit.data.repo.greendao.social.Friendship;
import com.fitbit.data.repo.greendao.social.FriendshipDao;
import com.fitbit.data.repo.greendao.social.RankedUser;
import com.fitbit.data.repo.greendao.social.RankedUserDao;
import com.fitbit.data.repo.greendao.swap.DaoSession;
import com.fitbit.e.a;
import de.greenrobot.dao.DbUtils;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoSession, DaoMaster

public class DaoFactory
{
    public static class ActivityDBProductionOpenHelper extends com.fitbit.data.repo.greendao.activity.DaoMaster.OpenHelper
    {

        private static final String ACTIVITY_MIGRATION_ERROR = "activity_migration_error";

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            Object obj = DaoFactory.getInstance().helper.getReadableDatabase();
            if (((SQLiteDatabase) (obj)).getVersion() >= 137 && ((SQLiteDatabase) (obj)).getVersion() < 139)
            {
                sqlitedatabase = (new DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
                obj = (new DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
                Object obj1 = ((com.fitbit.data.repo.greendao.activity.DaoSession) (obj)).getActivityItemDao();
                Object obj2 = sqlitedatabase.getActivityItemDao();
                ActivityItem activityitem;
                for (Iterator iterator1 = ((ActivityItemDao) (obj1)).loadAll().iterator(); iterator1.hasNext(); ((ActivityItemDao) (obj2)).insertOrReplace(activityitem))
                {
                    activityitem = (ActivityItem)iterator1.next();
                    ((ActivityItemDao) (obj1)).detach(activityitem);
                }

                obj1 = ((com.fitbit.data.repo.greendao.activity.DaoSession) (obj)).getActivityLevelDao();
                obj2 = sqlitedatabase.getActivityLevelDao();
                ActivityLevel activitylevel;
                for (Iterator iterator2 = ((ActivityLevelDao) (obj1)).loadAll().iterator(); iterator2.hasNext(); ((ActivityLevelDao) (obj2)).insert(activitylevel))
                {
                    activitylevel = (ActivityLevel)iterator2.next();
                    ((ActivityLevelDao) (obj1)).detach(activitylevel);
                }

                obj1 = ((com.fitbit.data.repo.greendao.activity.DaoSession) (obj)).getActivityLogEntryDao();
                obj2 = sqlitedatabase.getActivityLogEntryDao();
                ActivityLogEntry activitylogentry;
                for (Iterator iterator3 = ((ActivityLogEntryDao) (obj1)).loadAll().iterator(); iterator3.hasNext(); ((ActivityLogEntryDao) (obj2)).insert(activitylogentry))
                {
                    activitylogentry = (ActivityLogEntry)iterator3.next();
                    ((ActivityLogEntryDao) (obj1)).detach(activitylogentry);
                }

                obj = ((com.fitbit.data.repo.greendao.activity.DaoSession) (obj)).getMostRecentActivityDao();
                sqlitedatabase = sqlitedatabase.getMostRecentActivityDao();
                MostRecentActivity mostrecentactivity;
                for (Iterator iterator = ((MostRecentActivityDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insert(mostrecentactivity))
                {
                    mostrecentactivity = (MostRecentActivity)iterator.next();
                    ((MostRecentActivityDao) (obj)).detach(mostrecentactivity);
                }

            }
            DaoMaster.dropAllTables(DaoFactory.getInstance().helper.getWritableDatabase(), true);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            a.a("DaoFactory", "Upgrading ActivityDB schema from version [%s] to [%s]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            boolean flag;
            try
            {
                flag = MigrationHelper.migrateActivityDB(sqlitedatabase, i, j);
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
                FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "activity_migration_error", null, 0);
                com.fitbit.savedstate.d.c(true);
            }
        }

        public ActivityDBProductionOpenHelper(Context context)
        {
            super(context, "activity_db", null);
        }
    }

    public static class ExerciseDBOpenHelper extends com.fitbit.data.repo.greendao.exercise.DaoMaster.OpenHelper
    {

        private static final int MIGRATION_VERSION = 1;
        private static final String SOCIAL_MIGRATION_ERROR = "social_migration_error";

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            com.fitbit.data.repo.greendao.heartrate.DaoMaster.dropAllTables(DaoFactory.getInstance().helper.getWritableDatabase(), true);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            a.a("DaoFactory", "Upgrading SocialDB schema from version [%s] to [%s]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            boolean flag;
            try
            {
                flag = MigrationHelper.migrateSocialDB(sqlitedatabase, i, j);
            }
            catch (Throwable throwable)
            {
                a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
                com.fitbit.data.repo.greendao.social.DaoMaster.dropAllTables(sqlitedatabase, true);
                onCreate(sqlitedatabase);
                return;
            }
            if (flag)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "social_migration_error", null, 0);
                com.fitbit.savedstate.d.c(true);
            }
        }

        public ExerciseDBOpenHelper(Context context)
        {
            super(context, "exercise_db", null);
        }
    }

    public static class FoodDBOpenHelper extends com.fitbit.data.repo.greendao.food.DaoMaster.OpenHelper
    {

        private static final String FOOD_MIGRATION_ERROR = "food_migration_error";
        private static final int MIGRATION_VERSION = 147;

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            Object obj = DaoFactory.getInstance().helper.getWritableDatabase();
            if (((SQLiteDatabase) (obj)).getVersion() == 147)
            {
                com.fitbit.data.repo.greendao.food.DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
                obj = (new com.fitbit.data.repo.greendao.food.DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
                sqlitedatabase = (new com.fitbit.data.repo.greendao.food.DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
                Object obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getFavoriteFoodDao();
                Object obj2 = sqlitedatabase.getFavoriteFoodDao();
                FavoriteFood favoritefood;
                for (Iterator iterator1 = ((FavoriteFoodDao) (obj1)).loadAll().iterator(); iterator1.hasNext(); ((FavoriteFoodDao) (obj2)).insertOrReplace(favoritefood))
                {
                    favoritefood = (FavoriteFood)iterator1.next();
                    ((FavoriteFoodDao) (obj1)).detach(favoritefood);
                }

                obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getFoodItemDao();
                obj2 = sqlitedatabase.getFoodItemDao();
                FoodItem fooditem;
                for (Iterator iterator2 = ((FoodItemDao) (obj1)).loadAll().iterator(); iterator2.hasNext(); ((FoodItemDao) (obj2)).insertOrReplace(fooditem))
                {
                    fooditem = (FoodItem)iterator2.next();
                    ((FoodItemDao) (obj1)).detach(fooditem);
                }

                obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getFoodLocaleDao();
                obj2 = sqlitedatabase.getFoodLocaleDao();
                FoodLocale foodlocale;
                for (Iterator iterator3 = ((FoodLocaleDao) (obj1)).loadAll().iterator(); iterator3.hasNext(); ((FoodLocaleDao) (obj2)).insertOrReplace(foodlocale))
                {
                    foodlocale = (FoodLocale)iterator3.next();
                    ((FoodLocaleDao) (obj1)).detach(foodlocale);
                }

                obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getFoodMeasurementUnitDao();
                obj2 = sqlitedatabase.getFoodMeasurementUnitDao();
                FoodMeasurementUnit foodmeasurementunit;
                for (Iterator iterator4 = ((FoodMeasurementUnitDao) (obj1)).loadAll().iterator(); iterator4.hasNext(); ((FoodMeasurementUnitDao) (obj2)).insertOrReplace(foodmeasurementunit))
                {
                    foodmeasurementunit = (FoodMeasurementUnit)iterator4.next();
                    ((FoodMeasurementUnitDao) (obj1)).detach(foodmeasurementunit);
                }

                obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getFoodRelationDao();
                obj2 = sqlitedatabase.getFoodRelationDao();
                FoodRelation foodrelation;
                for (Iterator iterator5 = ((FoodRelationDao) (obj1)).loadAll().iterator(); iterator5.hasNext(); ((FoodRelationDao) (obj2)).insertOrReplace(foodrelation))
                {
                    foodrelation = (FoodRelation)iterator5.next();
                    ((FoodRelationDao) (obj1)).detach(foodrelation);
                }

                obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getLightServingDao();
                obj2 = sqlitedatabase.getLightServingDao();
                LightServing lightserving;
                for (Iterator iterator6 = ((LightServingDao) (obj1)).loadAll().iterator(); iterator6.hasNext(); ((LightServingDao) (obj2)).insertOrReplace(lightserving))
                {
                    lightserving = (LightServing)iterator6.next();
                    ((LightServingDao) (obj1)).detach(lightserving);
                }

                obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getMealDao();
                obj2 = sqlitedatabase.getMealDao();
                Meal meal;
                for (Iterator iterator7 = ((MealDao) (obj1)).loadAll().iterator(); iterator7.hasNext(); ((MealDao) (obj2)).insertOrReplace(meal))
                {
                    meal = (Meal)iterator7.next();
                    ((MealDao) (obj1)).detach(meal);
                }

                obj1 = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getMealItemDao();
                obj2 = sqlitedatabase.getMealItemDao();
                MealItem mealitem;
                for (Iterator iterator8 = ((MealItemDao) (obj1)).loadAll().iterator(); iterator8.hasNext(); ((MealItemDao) (obj2)).insertOrReplace(mealitem))
                {
                    mealitem = (MealItem)iterator8.next();
                    ((MealItemDao) (obj1)).detach(mealitem);
                }

                obj = ((com.fitbit.data.repo.greendao.food.DaoSession) (obj)).getFoodLogEntryDao();
                sqlitedatabase = sqlitedatabase.getFoodLogEntryDao();
                FoodLogEntry foodlogentry;
                for (Iterator iterator = ((FoodLogEntryDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insertOrReplace(foodlogentry))
                {
                    foodlogentry = (FoodLogEntry)iterator.next();
                    ((FoodLogEntryDao) (obj)).detach(foodlogentry);
                }

            }
            com.fitbit.data.repo.greendao.food.DaoMaster.dropAllTables(DaoFactory.getInstance().helper.getWritableDatabase(), true);
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
                com.fitbit.data.repo.greendao.food.DaoMaster.dropAllTables(sqlitedatabase, true);
                onCreate(sqlitedatabase);
                return;
            }
            if (flag)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "food_migration_error", null, 0);
                com.fitbit.savedstate.d.c(true);
            }
        }

        public FoodDBOpenHelper(Context context)
        {
            super(context, "food_db", null);
        }
    }

    public static class HeartRateDBOpenHelper extends com.fitbit.data.repo.greendao.heartrate.DaoMaster.OpenHelper
    {

        private static final int MIGRATION_VERSION = 147;

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            Object obj = DaoFactory.getInstance().helper.getWritableDatabase();
            if (((SQLiteDatabase) (obj)).getVersion() == 147)
            {
                com.fitbit.data.repo.greendao.heartrate.DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
                obj = (new com.fitbit.data.repo.greendao.heartrate.DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
                sqlitedatabase = (new com.fitbit.data.repo.greendao.heartrate.DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
                HeartRateDailySummaryDao heartratedailysummarydao = ((com.fitbit.data.repo.greendao.heartrate.DaoSession) (obj)).getHeartRateDailySummaryDao();
                HeartRateDailySummaryDao heartratedailysummarydao1 = sqlitedatabase.getHeartRateDailySummaryDao();
                HeartRateDailySummary heartratedailysummary;
                for (Iterator iterator1 = heartratedailysummarydao.loadAll().iterator(); iterator1.hasNext(); heartratedailysummarydao1.insertOrReplace(heartratedailysummary))
                {
                    heartratedailysummary = (HeartRateDailySummary)iterator1.next();
                    heartratedailysummarydao.detach(heartratedailysummary);
                }

                obj = ((com.fitbit.data.repo.greendao.heartrate.DaoSession) (obj)).getHeartRateZoneDao();
                sqlitedatabase = sqlitedatabase.getHeartRateZoneDao();
                HeartRateZone heartratezone;
                for (Iterator iterator = ((HeartRateZoneDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insertOrReplace(heartratezone))
                {
                    heartratezone = (HeartRateZone)iterator.next();
                    ((HeartRateZoneDao) (obj)).detach(heartratezone);
                }

            }
            com.fitbit.data.repo.greendao.heartrate.DaoMaster.dropAllTables(DaoFactory.getInstance().helper.getWritableDatabase(), true);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        public HeartRateDBOpenHelper(Context context)
        {
            super(context, "heart_rate_db", null);
        }
    }

    public static class LoggingDbOpenHelper extends com.fitbit.data.repo.greendao.logging.DaoMaster.OpenHelper
    {

        private static final String LOGGING_MIGRATION_ERROR = "logging_migration_error";
        private static final int MIGRATION_VERSION = 147;

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            Object obj = DaoFactory.getInstance().helper.getWritableDatabase();
            if (((SQLiteDatabase) (obj)).getVersion() == 147)
            {
                com.fitbit.data.repo.greendao.logging.DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
                sqlitedatabase = (new com.fitbit.data.repo.greendao.logging.DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
                obj = (new com.fitbit.data.repo.greendao.logging.DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
                Object obj1 = ((com.fitbit.data.repo.greendao.logging.DaoSession) (obj)).getBodyFatLogEntryDao();
                Object obj2 = sqlitedatabase.getBodyFatLogEntryDao();
                BodyFatLogEntry bodyfatlogentry;
                for (Iterator iterator1 = ((BodyFatLogEntryDao) (obj1)).loadAll().iterator(); iterator1.hasNext(); ((BodyFatLogEntryDao) (obj2)).insertOrReplace(bodyfatlogentry))
                {
                    bodyfatlogentry = (BodyFatLogEntry)iterator1.next();
                    ((BodyFatLogEntryDao) (obj1)).detach(bodyfatlogentry);
                }

                obj1 = ((com.fitbit.data.repo.greendao.logging.DaoSession) (obj)).getSleepLogEntryDao();
                obj2 = sqlitedatabase.getSleepLogEntryDao();
                SleepLogEntry sleeplogentry;
                for (Iterator iterator2 = ((SleepLogEntryDao) (obj1)).loadAll().iterator(); iterator2.hasNext(); ((SleepLogEntryDao) (obj2)).insertOrReplace(sleeplogentry))
                {
                    sleeplogentry = (SleepLogEntry)iterator2.next();
                    ((SleepLogEntryDao) (obj1)).detach(sleeplogentry);
                }

                obj1 = ((com.fitbit.data.repo.greendao.logging.DaoSession) (obj)).getWaterLogEntryDao();
                obj2 = sqlitedatabase.getWaterLogEntryDao();
                WaterLogEntry waterlogentry;
                for (Iterator iterator3 = ((WaterLogEntryDao) (obj1)).loadAll().iterator(); iterator3.hasNext(); ((WaterLogEntryDao) (obj2)).insertOrReplace(waterlogentry))
                {
                    waterlogentry = (WaterLogEntry)iterator3.next();
                    ((WaterLogEntryDao) (obj1)).detach(waterlogentry);
                }

                obj = ((com.fitbit.data.repo.greendao.logging.DaoSession) (obj)).getWeightLogEntryDao();
                sqlitedatabase = sqlitedatabase.getWeightLogEntryDao();
                WeightLogEntry weightlogentry;
                for (Iterator iterator = ((WeightLogEntryDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insertOrReplace(weightlogentry))
                {
                    weightlogentry = (WeightLogEntry)iterator.next();
                    ((WeightLogEntryDao) (obj)).detach(weightlogentry);
                }

            }
            com.fitbit.data.repo.greendao.logging.DaoMaster.dropAllTables(DaoFactory.getInstance().helper.getWritableDatabase(), true);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            a.a("DaoFactory", "Upgrading LoggingDB schema from version [%s] to [%s]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            boolean flag;
            try
            {
                flag = MigrationHelper.migrateLoggingDB(sqlitedatabase, i, j);
            }
            catch (Throwable throwable)
            {
                a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
                com.fitbit.data.repo.greendao.logging.DaoMaster.dropAllTables(sqlitedatabase, true);
                onCreate(sqlitedatabase);
                return;
            }
            if (flag)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "logging_migration_error", null, 0);
                com.fitbit.savedstate.d.c(true);
            }
        }

        public LoggingDbOpenHelper(Context context)
        {
            super(context, "logging_db", null);
        }
    }

    public static class MobileTrackDBOpenHelper extends com.fitbit.data.repo.greendao.mobiletrack.DaoMaster.OpenHelper
    {

        private static final int MIGRATION_VERSION = 147;
        private static final String MOBILETRACK_MIGRATION_ERROR = "mobiletrack_migration_error";

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            Object obj = DaoFactory.getInstance().helper.getWritableDatabase();
            if (((SQLiteDatabase) (obj)).getVersion() == 147)
            {
                com.fitbit.data.repo.greendao.mobiletrack.DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
                com.fitbit.data.repo.greendao.mobiletrack.DaoSession daosession = (new com.fitbit.data.repo.greendao.mobiletrack.DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
                sqlitedatabase = (new com.fitbit.data.repo.greendao.mobiletrack.DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session).getPedometerMinuteDataDao();
                obj = daosession.getPedometerMinuteDataDao();
                PedometerMinuteData pedometerminutedata;
                for (Iterator iterator = sqlitedatabase.loadAll().iterator(); iterator.hasNext(); ((PedometerMinuteDataDao) (obj)).insertOrReplace(pedometerminutedata))
                {
                    pedometerminutedata = (PedometerMinuteData)iterator.next();
                    sqlitedatabase.detach(pedometerminutedata);
                }

            }
            com.fitbit.data.repo.greendao.mobiletrack.DaoMaster.dropAllTables(DaoFactory.getInstance().helper.getWritableDatabase(), true);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            a.a("DaoFactory", "Upgrading MobileTrackDB schema from version [%s] to [%s]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            boolean flag;
            try
            {
                flag = MigrationHelper.migrateMobileTrackDB(sqlitedatabase, i, j);
            }
            catch (Throwable throwable)
            {
                a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
                com.fitbit.data.repo.greendao.mobiletrack.DaoMaster.dropAllTables(sqlitedatabase, true);
                onCreate(sqlitedatabase);
                return;
            }
            if (flag)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "mobiletrack_migration_error", null, 0);
                com.fitbit.savedstate.d.c(true);
            }
        }

        public MobileTrackDBOpenHelper(Context context)
        {
            super(context, "mobile_track_db", null);
        }
    }

    public static class ProductionOpenHelper extends DaoMaster.OpenHelper
    {

        private static final int SCHEME_UPDATE_SINCE_VERSION = 95;

        public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            a.a("DaoFactory", "Downgrading schema from version [%s] to [%s]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            a.a("DaoFactory", "Upgrading schema from version [%s] to [%s]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            if (i >= 95) goto _L2; else goto _L1
_L1:
            try
            {
                a.e("DaoFactory", "DB version is too old", new Object[0]);
                throw new Throwable("DB version is too old");
            }
            catch (Throwable throwable)
            {
                a.f("DaoFactory", "Unable to upgrade scheme. Trying to recreate whole db", throwable, new Object[0]);
            }
            DaoMaster.dropAllTables(sqlitedatabase, true);
            onCreate(sqlitedatabase);
_L4:
            return;
_L2:
            boolean flag = MigrationHelper.migrate(sqlitedatabase, i, j);
            if (flag)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "migration_error", null, 0);
                com.fitbit.savedstate.d.c(true);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public ProductionOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory);
        }
    }

    public static class SocialDBOpenHelper extends com.fitbit.data.repo.greendao.social.DaoMaster.OpenHelper
    {

        private static final int MIGRATION_VERSION = 147;
        private static final String SOCIAL_MIGRATION_ERROR = "social_migration_error";

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            Object obj = DaoFactory.getInstance().helper.getWritableDatabase();
            if (((SQLiteDatabase) (obj)).getVersion() == 147)
            {
                com.fitbit.data.repo.greendao.social.DaoMaster.createAllTables(((SQLiteDatabase) (obj)), true);
                obj = (new com.fitbit.data.repo.greendao.social.DaoMaster(((SQLiteDatabase) (obj)))).newSession(IdentityScopeType.Session);
                sqlitedatabase = (new com.fitbit.data.repo.greendao.social.DaoMaster(sqlitedatabase)).newSession(IdentityScopeType.Session);
                Object obj1 = ((com.fitbit.data.repo.greendao.social.DaoSession) (obj)).getFriendshipDao();
                Object obj2 = sqlitedatabase.getFriendshipDao();
                Friendship friendship;
                for (Iterator iterator1 = ((FriendshipDao) (obj1)).loadAll().iterator(); iterator1.hasNext(); ((FriendshipDao) (obj2)).insertOrReplace(friendship))
                {
                    friendship = (Friendship)iterator1.next();
                    ((FriendshipDao) (obj1)).detach(friendship);
                }

                obj1 = ((com.fitbit.data.repo.greendao.social.DaoSession) (obj)).getRankedUserDao();
                obj2 = sqlitedatabase.getRankedUserDao();
                RankedUser rankeduser;
                for (Iterator iterator2 = ((RankedUserDao) (obj1)).loadAll().iterator(); iterator2.hasNext(); ((RankedUserDao) (obj2)).insertOrReplace(rankeduser))
                {
                    rankeduser = (RankedUser)iterator2.next();
                    ((RankedUserDao) (obj1)).detach(rankeduser);
                }

                obj = ((com.fitbit.data.repo.greendao.social.DaoSession) (obj)).getBadgeDao();
                sqlitedatabase = sqlitedatabase.getBadgeDao();
                Badge badge;
                for (Iterator iterator = ((BadgeDao) (obj)).loadAll().iterator(); iterator.hasNext(); sqlitedatabase.insertOrReplace(badge))
                {
                    badge = (Badge)iterator.next();
                    ((BadgeDao) (obj)).detach(badge);
                }

            }
            com.fitbit.data.repo.greendao.social.DaoMaster.dropAllTables(DaoFactory.getInstance().helper.getWritableDatabase(), true);
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            a.a("DaoFactory", "Upgrading SocialDB schema from version [%s] to [%s]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            boolean flag;
            try
            {
                flag = MigrationHelper.migrateSocialDB(sqlitedatabase, i, j);
            }
            catch (Throwable throwable)
            {
                a.f("DaoFactory", "Unable to upgrade schema. Trying to recreate whole db", throwable, new Object[0]);
                com.fitbit.data.repo.greendao.social.DaoMaster.dropAllTables(sqlitedatabase, true);
                onCreate(sqlitedatabase);
                return;
            }
            if (flag)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("user_login_eviction", "social_migration_error", null, 0);
                com.fitbit.savedstate.d.c(true);
            }
        }

        public SocialDBOpenHelper(Context context)
        {
            super(context, "social_db", null);
        }
    }

    public static class SwapProductionOpenHelper extends com.fitbit.data.repo.greendao.swap.DaoMaster.OpenHelper
    {

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        public SwapProductionOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            super(context, s, cursorfactory);
        }
    }


    private static final String ACTIVITY_DB = "activity_db";
    private static final String CATEGORY_LOGIN_EVICTION = "user_login_eviction";
    private static final String EXERCISE_DB = "exercise_db";
    private static final String FOOD_DB = "food_db";
    private static final String GENERAL_LOGGING_DB = "logging_db";
    private static final String HEART_RATE_DB = "heart_rate_db";
    private static final String MAIN_DB = "fitbit-db";
    private static final String MIGRATION_ERROR = "migration_error";
    private static final String MOBILE_TRACK_DB = "mobile_track_db";
    private static final String SOCIAL_DB = "social_db";
    private static final String SWAP_DB = "fibit-swap-db";
    private static final String TAG = "DaoFactory";
    private static DaoFactory instance = null;
    private ActivityDBProductionOpenHelper activityHelper;
    private ExerciseDBOpenHelper exerciseDbHelper;
    private FoodDBOpenHelper foodDbHelper;
    private LoggingDbOpenHelper generalDbHelper;
    private HeartRateDBOpenHelper heartRateDbHelper;
    private ProductionOpenHelper helper;
    private MobileTrackDBOpenHelper mobileTrackDbHelper;
    private SocialDBOpenHelper socialDbHelper;
    private SwapProductionOpenHelper swapHelper;

    private DaoFactory()
    {
    }

    private void addFileToStream(File file, ZipOutputStream zipoutputstream, byte abyte0[])
        throws IOException
    {
        zipoutputstream.putNextEntry(new ZipEntry(file.getName()));
        file = new FileInputStream(file);
        do
        {
            int i = file.read(abyte0);
            if (i != -1)
            {
                zipoutputstream.write(abyte0, 0, i);
            } else
            {
                zipoutputstream.closeEntry();
                file.close();
                return;
            }
        } while (true);
    }

    public static DaoFactory getInstance()
    {
        com/fitbit/data/repo/greendao/DaoFactory;
        JVM INSTR monitorenter ;
        DaoFactory daofactory;
        if (instance == null)
        {
            instance = new DaoFactory();
        }
        daofactory = instance;
        com/fitbit/data/repo/greendao/DaoFactory;
        JVM INSTR monitorexit ;
        return daofactory;
        Exception exception;
        exception;
        throw exception;
    }

    private static String getPathForExport()
    {
        File file = FitBitApplication.a().getExternalFilesDir(null);
        if (file != null)
        {
            return (new StringBuilder()).append(file.getAbsolutePath()).append("/").toString();
        } else
        {
            return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").toString();
        }
    }

    public void cleanUpStore()
    {
        getDaoSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                DaoMaster.dropAllTables(helper.getWritableDatabase(), true);
                DaoMaster.createAllTables(helper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getSwapDaoSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                com.fitbit.data.repo.greendao.swap.DaoMaster.dropAllTables(swapHelper.getWritableDatabase(), true);
                com.fitbit.data.repo.greendao.swap.DaoMaster.createAllTables(swapHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getActivityDBSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                DaoMaster.dropAllTables(activityHelper.getWritableDatabase(), true);
                DaoMaster.createAllTables(activityHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getSocialSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                com.fitbit.data.repo.greendao.social.DaoMaster.dropAllTables(socialDbHelper.getWritableDatabase(), true);
                com.fitbit.data.repo.greendao.social.DaoMaster.createAllTables(socialDbHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getFoodSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                com.fitbit.data.repo.greendao.food.DaoMaster.dropAllTables(foodDbHelper.getWritableDatabase(), true);
                com.fitbit.data.repo.greendao.food.DaoMaster.createAllTables(foodDbHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getLoggingSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                com.fitbit.data.repo.greendao.logging.DaoMaster.dropAllTables(generalDbHelper.getWritableDatabase(), true);
                com.fitbit.data.repo.greendao.logging.DaoMaster.createAllTables(generalDbHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getHeartRateSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                com.fitbit.data.repo.greendao.heartrate.DaoMaster.dropAllTables(heartRateDbHelper.getWritableDatabase(), true);
                com.fitbit.data.repo.greendao.heartrate.DaoMaster.createAllTables(heartRateDbHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getMobileTrackSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                com.fitbit.data.repo.greendao.mobiletrack.DaoMaster.dropAllTables(mobileTrackDbHelper.getWritableDatabase(), true);
                com.fitbit.data.repo.greendao.mobiletrack.DaoMaster.createAllTables(mobileTrackDbHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
        getExerciseSession().runInTx(new Runnable() {

            final DaoFactory this$0;

            public void run()
            {
                com.fitbit.data.repo.greendao.exercise.DaoMaster.dropAllTables(exerciseDbHelper.getWritableDatabase(), true);
                com.fitbit.data.repo.greendao.exercise.DaoMaster.createAllTables(exerciseDbHelper.getWritableDatabase(), true);
            }

            
            {
                this$0 = DaoFactory.this;
                super();
            }
        });
    }

    public File exportDBToFile(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null) goto _L2; else goto _L1
_L1:
        s = new File((new StringBuilder()).append(getPathForExport()).append(s).toString());
        ZipOutputStream zipoutputstream = new ZipOutputStream(new FileOutputStream(s));
        byte abyte0[] = new byte[8192];
        addFileToStream(new File(helper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        addFileToStream(new File(swapHelper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        addFileToStream(new File(activityHelper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        addFileToStream(new File(generalDbHelper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        addFileToStream(new File(mobileTrackDbHelper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        addFileToStream(new File(heartRateDbHelper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        addFileToStream(new File(socialDbHelper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        addFileToStream(new File(foodDbHelper.getWritableDatabase().getPath()), zipoutputstream, abyte0);
        zipoutputstream.finish();
        zipoutputstream.close();
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
        IOException ioexception;
        ioexception;
        s.delete();
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public com.fitbit.data.repo.greendao.activity.DaoSession getActivityDBSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.activity.DaoSession daosession;
        if (activityHelper == null)
        {
            activityHelper = new ActivityDBProductionOpenHelper(FitBitApplication.a());
        }
        daosession = (new DaoMaster(activityHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.greendao.DaoSession getDaoSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.DaoSession daosession;
        if (helper == null)
        {
            helper = new ProductionOpenHelper(FitBitApplication.a(), "fitbit-db", null);
        }
        daosession = (new com.fitbit.data.repo.greendao.DaoMaster(helper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.greendao.exercise.DaoSession getExerciseSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.exercise.DaoSession daosession;
        if (exerciseDbHelper == null)
        {
            exerciseDbHelper = new ExerciseDBOpenHelper(FitBitApplication.a());
        }
        daosession = (new com.fitbit.data.repo.greendao.exercise.DaoMaster(exerciseDbHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.greendao.food.DaoSession getFoodSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.food.DaoSession daosession;
        if (foodDbHelper == null)
        {
            foodDbHelper = new FoodDBOpenHelper(FitBitApplication.a());
        }
        daosession = (new com.fitbit.data.repo.greendao.food.DaoMaster(foodDbHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.greendao.heartrate.DaoSession getHeartRateSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.heartrate.DaoSession daosession;
        if (heartRateDbHelper == null)
        {
            heartRateDbHelper = new HeartRateDBOpenHelper(FitBitApplication.a());
        }
        daosession = (new com.fitbit.data.repo.greendao.heartrate.DaoMaster(heartRateDbHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.greendao.logging.DaoSession getLoggingSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.logging.DaoSession daosession;
        if (generalDbHelper == null)
        {
            generalDbHelper = new LoggingDbOpenHelper(FitBitApplication.a());
        }
        daosession = (new com.fitbit.data.repo.greendao.logging.DaoMaster(generalDbHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.greendao.mobiletrack.DaoSession getMobileTrackSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.mobiletrack.DaoSession daosession;
        if (mobileTrackDbHelper == null)
        {
            mobileTrackDbHelper = new MobileTrackDBOpenHelper(FitBitApplication.a());
        }
        daosession = (new com.fitbit.data.repo.greendao.mobiletrack.DaoMaster(mobileTrackDbHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.greendao.social.DaoSession getSocialSession()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.greendao.social.DaoSession daosession;
        if (socialDbHelper == null)
        {
            socialDbHelper = new SocialDBOpenHelper(FitBitApplication.a());
        }
        daosession = (new com.fitbit.data.repo.greendao.social.DaoMaster(socialDbHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public DaoSession getSwapDaoSession()
    {
        this;
        JVM INSTR monitorenter ;
        DaoSession daosession;
        if (swapHelper == null)
        {
            swapHelper = new SwapProductionOpenHelper(FitBitApplication.a(), "fibit-swap-db", null);
        }
        daosession = (new com.fitbit.data.repo.greendao.swap.DaoMaster(swapHelper.getWritableDatabase())).newSession(IdentityScopeType.Session);
        this;
        JVM INSTR monitorexit ;
        return daosession;
        Exception exception;
        exception;
        throw exception;
    }

    public void makeVacuum()
    {
        if (helper != null)
        {
            SQLiteDatabase sqlitedatabase = helper.getWritableDatabase();
            if (sqlitedatabase != null)
            {
                DbUtils.vacuum(sqlitedatabase);
            }
        }
        if (swapHelper != null)
        {
            SQLiteDatabase sqlitedatabase1 = swapHelper.getWritableDatabase();
            if (sqlitedatabase1 != null)
            {
                DbUtils.vacuum(sqlitedatabase1);
            }
        }
        if (activityHelper != null)
        {
            SQLiteDatabase sqlitedatabase2 = activityHelper.getWritableDatabase();
            if (sqlitedatabase2 != null)
            {
                DbUtils.vacuum(sqlitedatabase2);
            }
        }
        if (generalDbHelper != null)
        {
            SQLiteDatabase sqlitedatabase3 = generalDbHelper.getWritableDatabase();
            if (sqlitedatabase3 != null)
            {
                DbUtils.vacuum(sqlitedatabase3);
            }
        }
        if (mobileTrackDbHelper != null)
        {
            SQLiteDatabase sqlitedatabase4 = mobileTrackDbHelper.getWritableDatabase();
            if (sqlitedatabase4 != null)
            {
                DbUtils.vacuum(sqlitedatabase4);
            }
        }
        if (heartRateDbHelper != null)
        {
            SQLiteDatabase sqlitedatabase5 = heartRateDbHelper.getWritableDatabase();
            if (sqlitedatabase5 != null)
            {
                DbUtils.vacuum(sqlitedatabase5);
            }
        }
        if (socialDbHelper != null)
        {
            SQLiteDatabase sqlitedatabase6 = socialDbHelper.getWritableDatabase();
            if (sqlitedatabase6 != null)
            {
                DbUtils.vacuum(sqlitedatabase6);
            }
        }
        if (foodDbHelper != null)
        {
            SQLiteDatabase sqlitedatabase7 = foodDbHelper.getWritableDatabase();
            if (sqlitedatabase7 != null)
            {
                DbUtils.vacuum(sqlitedatabase7);
            }
        }
    }










}
