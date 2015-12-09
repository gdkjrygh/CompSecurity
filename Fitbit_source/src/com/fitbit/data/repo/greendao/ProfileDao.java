// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

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

// Referenced classes of package com.fitbit.data.repo.greendao:
//            Profile, DaoSession, DietPlanDao, DietPlan

public class ProfileDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property ChallengesBeta = new Property(34, java/lang/Boolean, "challengesBeta", false, "CHALLENGES_BETA");
        public static final Property City = new Property(33, java/lang/String, "city", false, "CITY");
        public static final Property Country = new Property(27, java/lang/String, "country", false, "COUNTRY");
        public static final Property CustomHeartRateZoneEnabled = new Property(35, java/lang/Boolean, "customHeartRateZoneEnabled", false, "CUSTOM_HEART_RATE_ZONE_ENABLED");
        public static final Property CustomHeartRateZoneMax = new Property(37, java/lang/Integer, "customHeartRateZoneMax", false, "CUSTOM_HEART_RATE_ZONE_MAX");
        public static final Property CustomHeartRateZoneMin = new Property(36, java/lang/Integer, "customHeartRateZoneMin", false, "CUSTOM_HEART_RATE_ZONE_MIN");
        public static final Property DateOfBirth = new Property(8, java/util/Date, "dateOfBirth", false, "DATE_OF_BIRTH");
        public static final Property DietPlanId = new Property(38, java/lang/Long, "dietPlanId", false, "DIET_PLAN_ID");
        public static final Property DistanceUnit = new Property(24, java/lang/String, "distanceUnit", false, "DISTANCE_UNIT");
        public static final Property EncodedId = new Property(6, java/lang/String, "encodedId", false, "ENCODED_ID");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property FoodBudgetEnabled = new Property(19, java/lang/Boolean, "foodBudgetEnabled", false, "FOOD_BUDGET_ENABLED");
        public static final Property FoodLocale = new Property(25, java/lang/String, "foodLocale", false, "FOOD_LOCALE");
        public static final Property FullName = new Property(7, java/lang/String, "fullName", false, "FULL_NAME");
        public static final Property Gender = new Property(12, java/lang/String, "gender", false, "GENDER");
        public static final Property Height = new Property(11, java/lang/Double, "height", false, "HEIGHT");
        public static final Property HeightUnit = new Property(28, java/lang/String, "heightUnit", false, "HEIGHT_UNIT");
        public static final Property HideMeFromLeaderboard = new Property(26, java/lang/Boolean, "hideMeFromLeaderboard", false, "HIDE_ME_FROM_LEADERBOARD");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property LanguageLocale = new Property(31, java/lang/String, "languageLocale", false, "LANGUAGE_LOCALE");
        public static final Property LastTrackerUpdateTime = new Property(23, java/util/Date, "lastTrackerUpdateTime", false, "LAST_TRACKER_UPDATE_TIME");
        public static final Property Nickname = new Property(13, java/lang/String, "nickname", false, "NICKNAME");
        public static final Property OauthSecret = new Property(10, java/lang/String, "oauthSecret", false, "OAUTH_SECRET");
        public static final Property OauthToken = new Property(9, java/lang/String, "oauthToken", false, "OAUTH_TOKEN");
        public static final Property ProfilePhotoLink = new Property(18, java/lang/String, "profilePhotoLink", false, "PROFILE_PHOTO_LINK");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property State = new Property(32, java/lang/String, "state", false, "STATE");
        public static final Property StrideLengthRunning = new Property(16, java/lang/Double, "strideLengthRunning", false, "STRIDE_LENGTH_RUNNING");
        public static final Property StrideLengthWalking = new Property(17, java/lang/Double, "strideLengthWalking", false, "STRIDE_LENGTH_WALKING");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property TimeZone = new Property(15, java/lang/String, "timeZone", false, "TIME_ZONE");
        public static final Property TimeZoneOffset = new Property(14, java/lang/String, "timeZoneOffset", false, "TIME_ZONE_OFFSET");
        public static final Property TrackerUser = new Property(21, java/lang/Boolean, "trackerUser", false, "TRACKER_USER");
        public static final Property TrainerEnabled = new Property(22, java/lang/Boolean, "trainerEnabled", false, "TRAINER_ENABLED");
        public static final Property TychoIsPaired = new Property(20, java/lang/Boolean, "tychoIsPaired", false, "TYCHO_IS_PAIRED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
        public static final Property WaterUnit = new Property(30, java/lang/String, "waterUnit", false, "WATER_UNIT");
        public static final Property WeightUnit = new Property(29, java/lang/String, "weightUnit", false, "WEIGHT_UNIT");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "PROFILE";
    private DaoSession daoSession;
    private String selectDeep;

    public ProfileDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ProfileDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'PROFILE' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'ENCODED_ID' TEXT,").append("'FULL_NAME' TEXT,").append("'DATE_OF_BIRTH' INTEGER,").append("'OAUTH_TOKEN' TEXT,").append("'OAUTH_SECRET' TEXT,").append("'HEIGHT' REAL,").append("'GENDER' TEXT,").append("'NICKNAME' TEXT,").append("'TIME_ZONE_OFFSET' TEXT,").append("'TIME_ZONE' TEXT,").append("'STRIDE_LENGTH_RUNNING' REAL,").append("'STRIDE_LENGTH_WALKING' REAL,").append("'PROFILE_PHOTO_LINK' TEXT,").append("'FOOD_BUDGET_ENABLED' INTEGER,").append("'TYCHO_IS_PAIRED' INTEGER,").append("'TRACKER_USER' INTEGER,").append("'TRAINER_ENABLED' INTEGER,").append("'LAST_TRACKER_UPDATE_TIME' INTEGER,").append("'DISTANCE_UNIT' TEXT,").append("'FOOD_LOCALE' TEXT,").append("'HIDE_ME_FROM_LEADERBOARD' INTEGER,").append("'COUNTRY' TEXT,").append("'HEIGHT_UNIT' TEXT,").append("'WEIGHT_UNIT' TEXT,").append("'WATER_UNIT' TEXT,").append("'LANGUAGE_LOCALE' TEXT,").append("'STATE' TEXT,").append("'CITY' TEXT,").append("'CHALLENGES_BETA' INTEGER,").append("'CUSTOM_HEART_RATE_ZONE_ENABLED' INTEGER,").append("'CUSTOM_HEART_RATE_ZONE_MIN' INTEGER,").append("'CUSTOM_HEART_RATE_ZONE_MAX' INTEGER,").append("'DIET_PLAN_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_PROFILE_UUID ON PROFILE").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_PROFILE_ENTITY_STATUS ON PROFILE").append(" (ENTITY_STATUS);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'PROFILE'").toString());
    }

    protected void attachEntity(Profile profile)
    {
        super.attachEntity(profile);
        profile.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((Profile)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Profile profile)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = profile.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = profile.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = profile.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = profile.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = profile.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = profile.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = profile.getEncodedId();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = profile.getFullName();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = profile.getDateOfBirth();
        if (obj != null)
        {
            sqlitestatement.bindLong(9, ((Date) (obj)).getTime());
        }
        obj = profile.getOauthToken();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = profile.getOauthSecret();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = profile.getHeight();
        if (obj != null)
        {
            sqlitestatement.bindDouble(12, ((Double) (obj)).doubleValue());
        }
        obj = profile.getGender();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = profile.getNickname();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = profile.getTimeZoneOffset();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = profile.getTimeZone();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = profile.getStrideLengthRunning();
        if (obj != null)
        {
            sqlitestatement.bindDouble(17, ((Double) (obj)).doubleValue());
        }
        obj = profile.getStrideLengthWalking();
        if (obj != null)
        {
            sqlitestatement.bindDouble(18, ((Double) (obj)).doubleValue());
        }
        obj = profile.getProfilePhotoLink();
        if (obj != null)
        {
            sqlitestatement.bindString(19, ((String) (obj)));
        }
        obj = profile.getFoodBudgetEnabled();
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
            sqlitestatement.bindLong(20, l);
        }
        obj = profile.getTychoIsPaired();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(21, l);
        }
        obj = profile.getTrackerUser();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(22, l);
        }
        obj = profile.getTrainerEnabled();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(23, l);
        }
        obj = profile.getLastTrackerUpdateTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(24, ((Date) (obj)).getTime());
        }
        obj = profile.getDistanceUnit();
        if (obj != null)
        {
            sqlitestatement.bindString(25, ((String) (obj)));
        }
        obj = profile.getFoodLocale();
        if (obj != null)
        {
            sqlitestatement.bindString(26, ((String) (obj)));
        }
        obj = profile.getHideMeFromLeaderboard();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(27, l);
        }
        obj = profile.getCountry();
        if (obj != null)
        {
            sqlitestatement.bindString(28, ((String) (obj)));
        }
        obj = profile.getHeightUnit();
        if (obj != null)
        {
            sqlitestatement.bindString(29, ((String) (obj)));
        }
        obj = profile.getWeightUnit();
        if (obj != null)
        {
            sqlitestatement.bindString(30, ((String) (obj)));
        }
        obj = profile.getWaterUnit();
        if (obj != null)
        {
            sqlitestatement.bindString(31, ((String) (obj)));
        }
        obj = profile.getLanguageLocale();
        if (obj != null)
        {
            sqlitestatement.bindString(32, ((String) (obj)));
        }
        obj = profile.getState();
        if (obj != null)
        {
            sqlitestatement.bindString(33, ((String) (obj)));
        }
        obj = profile.getCity();
        if (obj != null)
        {
            sqlitestatement.bindString(34, ((String) (obj)));
        }
        obj = profile.getChallengesBeta();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(35, l);
        }
        obj = profile.getCustomHeartRateZoneEnabled();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(36, l);
        }
        obj = profile.getCustomHeartRateZoneMin();
        if (obj != null)
        {
            sqlitestatement.bindLong(37, ((Integer) (obj)).intValue());
        }
        obj = profile.getCustomHeartRateZoneMax();
        if (obj != null)
        {
            sqlitestatement.bindLong(38, ((Integer) (obj)).intValue());
        }
        profile = profile.getDietPlanId();
        if (profile != null)
        {
            sqlitestatement.bindLong(39, profile.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Profile)obj);
    }

    public Long getKey(Profile profile)
    {
        if (profile != null)
        {
            return profile.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Profile)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getDietPlanDao().getAllColumns());
            stringbuilder.append(" FROM PROFILE T");
            stringbuilder.append(" LEFT JOIN DIET_PLAN T0 ON T.'DIET_PLAN_ID'=T0.'_id'");
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

    protected Profile loadCurrentDeep(Cursor cursor, boolean flag)
    {
        Profile profile = (Profile)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        profile.setDietPlan((DietPlan)loadCurrentOther(daoSession.getDietPlanDao(), cursor, i));
        return profile;
    }

    public Profile loadDeep(Long long1)
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
        Profile profile = loadCurrentDeep(long1, true);
        long1.close();
        return profile;
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

    public Profile readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        String s1;
        String s2;
        Date date2;
        String s3;
        String s4;
        Double double1;
        String s5;
        String s6;
        String s7;
        String s8;
        Double double2;
        Double double3;
        String s9;
        Boolean boolean1;
        Boolean boolean2;
        Boolean boolean3;
        Boolean boolean4;
        Date date3;
        String s10;
        String s11;
        Boolean boolean5;
        String s12;
        String s13;
        String s14;
        String s15;
        String s16;
        String s17;
        String s18;
        Boolean boolean6;
        Boolean boolean7;
        Integer integer1;
        Integer integer2;
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
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 7);
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
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(cursor.getDouble(i + 16));
        }
        if (cursor.isNull(i + 17))
        {
            double3 = null;
        } else
        {
            double3 = Double.valueOf(cursor.getDouble(i + 17));
        }
        if (cursor.isNull(i + 18))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 18);
        }
        if (cursor.isNull(i + 19))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 19) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 20))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 20) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 21))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 21) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 22))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 22) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 23))
        {
            date3 = null;
        } else
        {
            date3 = new Date(cursor.getLong(i + 23));
        }
        if (cursor.isNull(i + 24))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 24);
        }
        if (cursor.isNull(i + 25))
        {
            s11 = null;
        } else
        {
            s11 = cursor.getString(i + 25);
        }
        if (cursor.isNull(i + 26))
        {
            boolean5 = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 26) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            boolean5 = Boolean.valueOf(flag4);
        }
        if (cursor.isNull(i + 27))
        {
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 27);
        }
        if (cursor.isNull(i + 28))
        {
            s13 = null;
        } else
        {
            s13 = cursor.getString(i + 28);
        }
        if (cursor.isNull(i + 29))
        {
            s14 = null;
        } else
        {
            s14 = cursor.getString(i + 29);
        }
        if (cursor.isNull(i + 30))
        {
            s15 = null;
        } else
        {
            s15 = cursor.getString(i + 30);
        }
        if (cursor.isNull(i + 31))
        {
            s16 = null;
        } else
        {
            s16 = cursor.getString(i + 31);
        }
        if (cursor.isNull(i + 32))
        {
            s17 = null;
        } else
        {
            s17 = cursor.getString(i + 32);
        }
        if (cursor.isNull(i + 33))
        {
            s18 = null;
        } else
        {
            s18 = cursor.getString(i + 33);
        }
        if (cursor.isNull(i + 34))
        {
            boolean6 = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 34) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            boolean6 = Boolean.valueOf(flag5);
        }
        if (cursor.isNull(i + 35))
        {
            boolean7 = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 35) != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            boolean7 = Boolean.valueOf(flag6);
        }
        if (cursor.isNull(i + 36))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 36));
        }
        if (cursor.isNull(i + 37))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 37));
        }
        if (cursor.isNull(i + 38))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 38));
        }
        return new Profile(long1, long2, s, date, date1, integer, s1, s2, date2, s3, s4, double1, s5, s6, s7, s8, double2, double3, s9, boolean1, boolean2, boolean3, boolean4, date3, s10, s11, boolean5, s12, s13, s14, s15, s16, s17, s18, boolean6, boolean7, integer1, integer2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Profile profile, int i)
    {
        boolean flag7 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        profile.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        profile.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        profile.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        profile.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        profile.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        profile.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        profile.setEncodedId(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        profile.setFullName(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 8));
        }
        profile.setDateOfBirth(((Date) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        profile.setOauthToken(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        profile.setOauthSecret(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 11));
        }
        profile.setHeight(((Double) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        profile.setGender(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        profile.setNickname(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        profile.setTimeZoneOffset(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        profile.setTimeZone(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 16));
        }
        profile.setStrideLengthRunning(((Double) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 17));
        }
        profile.setStrideLengthWalking(((Double) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 18);
        }
        profile.setProfilePhotoLink(((String) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 19) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        profile.setFoodBudgetEnabled(((Boolean) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 20) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        profile.setTychoIsPaired(((Boolean) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 21) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        profile.setTrackerUser(((Boolean) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 22) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        profile.setTrainerEnabled(((Boolean) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 23));
        }
        profile.setLastTrackerUpdateTime(((Date) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 24);
        }
        profile.setDistanceUnit(((String) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 25);
        }
        profile.setFoodLocale(((String) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 26) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            obj = Boolean.valueOf(flag4);
        }
        profile.setHideMeFromLeaderboard(((Boolean) (obj)));
        if (cursor.isNull(i + 27))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 27);
        }
        profile.setCountry(((String) (obj)));
        if (cursor.isNull(i + 28))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 28);
        }
        profile.setHeightUnit(((String) (obj)));
        if (cursor.isNull(i + 29))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 29);
        }
        profile.setWeightUnit(((String) (obj)));
        if (cursor.isNull(i + 30))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 30);
        }
        profile.setWaterUnit(((String) (obj)));
        if (cursor.isNull(i + 31))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 31);
        }
        profile.setLanguageLocale(((String) (obj)));
        if (cursor.isNull(i + 32))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 32);
        }
        profile.setState(((String) (obj)));
        if (cursor.isNull(i + 33))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 33);
        }
        profile.setCity(((String) (obj)));
        if (cursor.isNull(i + 34))
        {
            obj = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 34) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            obj = Boolean.valueOf(flag5);
        }
        profile.setChallengesBeta(((Boolean) (obj)));
        if (cursor.isNull(i + 35))
        {
            obj = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 35) != 0)
            {
                flag6 = flag7;
            } else
            {
                flag6 = false;
            }
            obj = Boolean.valueOf(flag6);
        }
        profile.setCustomHeartRateZoneEnabled(((Boolean) (obj)));
        if (cursor.isNull(i + 36))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 36));
        }
        profile.setCustomHeartRateZoneMin(((Integer) (obj)));
        if (cursor.isNull(i + 37))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 37));
        }
        profile.setCustomHeartRateZoneMax(((Integer) (obj)));
        if (cursor.isNull(i + 38))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 38));
        }
        profile.setDietPlanId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Profile)obj, i);
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

    protected Long updateKeyAfterInsert(Profile profile, long l)
    {
        profile.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Profile)obj, l);
    }
}
