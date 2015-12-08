// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            TrackerSettings, DaoSession

public class TrackerSettingsDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property AutoLap = new Property(27, java/lang/String, "autoLap", false, "AUTO_LAP");
        public static final Property BondedPeerId = new Property(26, java/lang/String, "bondedPeerId", false, "BONDED_PEER_ID");
        public static final Property BondedPeerName = new Property(25, java/lang/String, "bondedPeerName", false, "BONDED_PEER_NAME");
        public static final Property ClockFaceDisplayName = new Property(23, java/lang/String, "clockFaceDisplayName", false, "CLOCK_FACE_DISPLAY_NAME");
        public static final Property ClockFaceImageUrl = new Property(14, java/lang/String, "clockFaceImageUrl", false, "CLOCK_FACE_IMAGE_URL");
        public static final Property ClockFaceName = new Property(15, java/lang/String, "clockFaceName", false, "CLOCK_FACE_NAME");
        public static final Property DisplayActiveMinutes = new Property(1, java/lang/Boolean, "displayActiveMinutes", false, "DISPLAY_ACTIVE_MINUTES");
        public static final Property DisplayCalories = new Property(2, java/lang/Boolean, "displayCalories", false, "DISPLAY_CALORIES");
        public static final Property DisplayChatter = new Property(3, java/lang/Boolean, "displayChatter", false, "DISPLAY_CHATTER");
        public static final Property DisplayClock = new Property(4, java/lang/Boolean, "displayClock", false, "DISPLAY_CLOCK");
        public static final Property DisplayDistance = new Property(5, java/lang/Boolean, "displayDistance", false, "DISPLAY_DISTANCE");
        public static final Property DisplayElevation = new Property(6, java/lang/Boolean, "displayElevation", false, "DISPLAY_ELEVATION");
        public static final Property DisplayEmote = new Property(7, java/lang/Boolean, "displayEmote", false, "DISPLAY_EMOTE");
        public static final Property DisplayGreeting = new Property(8, java/lang/Boolean, "displayGreeting", false, "DISPLAY_GREETING");
        public static final Property DisplayHeartRate = new Property(24, java/lang/Boolean, "displayHeartRate", false, "DISPLAY_HEART_RATE");
        public static final Property DisplaySteps = new Property(16, java/lang/Boolean, "displaySteps", false, "DISPLAY_STEPS");
        public static final Property EnableAncs = new Property(17, java/lang/Boolean, "enableAncs", false, "ENABLE_ANCS");
        public static final Property EnableSleepAnnotations = new Property(18, java/lang/Boolean, "enableSleepAnnotations", false, "ENABLE_SLEEP_ANNOTATIONS");
        public static final Property Exercises = new Property(20, java/lang/String, "exercises", false, "EXERCISES");
        public static final Property Greeting = new Property(10, java/lang/String, "greeting", false, "GREETING");
        public static final Property Handedness = new Property(11, java/lang/String, "handedness", false, "HANDEDNESS");
        public static final Property HeartRateTracking = new Property(19, java/lang/String, "heartRateTracking", false, "HEART_RATE_TRACKING");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property OnDominantHand = new Property(9, java/lang/Boolean, "onDominantHand", false, "ON_DOMINANT_HAND");
        public static final Property PrimaryGoal = new Property(12, java/lang/String, "primaryGoal", false, "PRIMARY_GOAL");
        public static final Property ScreenOrder = new Property(13, java/lang/String, "screenOrder", false, "SCREEN_ORDER");
        public static final Property TapGesture = new Property(21, java/lang/String, "tapGesture", false, "TAP_GESTURE");
        public static final Property WatchCheck = new Property(22, java/lang/String, "watchCheck", false, "WATCH_CHECK");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "TRACKER_SETTINGS";

    public TrackerSettingsDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public TrackerSettingsDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'TRACKER_SETTINGS' (").append("'_id' INTEGER PRIMARY KEY ,").append("'DISPLAY_ACTIVE_MINUTES' INTEGER,").append("'DISPLAY_CALORIES' INTEGER,").append("'DISPLAY_CHATTER' INTEGER,").append("'DISPLAY_CLOCK' INTEGER,").append("'DISPLAY_DISTANCE' INTEGER,").append("'DISPLAY_ELEVATION' INTEGER,").append("'DISPLAY_EMOTE' INTEGER,").append("'DISPLAY_GREETING' INTEGER,").append("'ON_DOMINANT_HAND' INTEGER,").append("'GREETING' TEXT,").append("'HANDEDNESS' TEXT,").append("'PRIMARY_GOAL' TEXT,").append("'SCREEN_ORDER' TEXT,").append("'CLOCK_FACE_IMAGE_URL' TEXT,").append("'CLOCK_FACE_NAME' TEXT,").append("'DISPLAY_STEPS' INTEGER,").append("'ENABLE_ANCS' INTEGER,").append("'ENABLE_SLEEP_ANNOTATIONS' INTEGER,").append("'HEART_RATE_TRACKING' TEXT,").append("'EXERCISES' TEXT,").append("'TAP_GESTURE' TEXT,").append("'WATCH_CHECK' TEXT,").append("'CLOCK_FACE_DISPLAY_NAME' TEXT,").append("'DISPLAY_HEART_RATE' INTEGER,").append("'BONDED_PEER_NAME' TEXT,").append("'BONDED_PEER_ID' TEXT,").append("'AUTO_LAP' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'TRACKER_SETTINGS'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, TrackerSettings trackersettings)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = trackersettings.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = trackersettings.getDisplayActiveMinutes();
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
            sqlitestatement.bindLong(2, l);
        }
        obj = trackersettings.getDisplayCalories();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(3, l);
        }
        obj = trackersettings.getDisplayChatter();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(4, l);
        }
        obj = trackersettings.getDisplayClock();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(5, l);
        }
        obj = trackersettings.getDisplayDistance();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(6, l);
        }
        obj = trackersettings.getDisplayElevation();
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
        obj = trackersettings.getDisplayEmote();
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
        obj = trackersettings.getDisplayGreeting();
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
        obj = trackersettings.getOnDominantHand();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(10, l);
        }
        obj = trackersettings.getGreeting();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = trackersettings.getHandedness();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = trackersettings.getPrimaryGoal();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = trackersettings.getScreenOrder();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = trackersettings.getClockFaceImageUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = trackersettings.getClockFaceName();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = trackersettings.getDisplaySteps();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(17, l);
        }
        obj = trackersettings.getEnableAncs();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(18, l);
        }
        obj = trackersettings.getEnableSleepAnnotations();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(19, l);
        }
        obj = trackersettings.getHeartRateTracking();
        if (obj != null)
        {
            sqlitestatement.bindString(20, ((String) (obj)));
        }
        obj = trackersettings.getExercises();
        if (obj != null)
        {
            sqlitestatement.bindString(21, ((String) (obj)));
        }
        obj = trackersettings.getTapGesture();
        if (obj != null)
        {
            sqlitestatement.bindString(22, ((String) (obj)));
        }
        obj = trackersettings.getWatchCheck();
        if (obj != null)
        {
            sqlitestatement.bindString(23, ((String) (obj)));
        }
        obj = trackersettings.getClockFaceDisplayName();
        if (obj != null)
        {
            sqlitestatement.bindString(24, ((String) (obj)));
        }
        obj = trackersettings.getDisplayHeartRate();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(25, l);
        }
        obj = trackersettings.getBondedPeerName();
        if (obj != null)
        {
            sqlitestatement.bindString(26, ((String) (obj)));
        }
        obj = trackersettings.getBondedPeerId();
        if (obj != null)
        {
            sqlitestatement.bindString(27, ((String) (obj)));
        }
        trackersettings = trackersettings.getAutoLap();
        if (trackersettings != null)
        {
            sqlitestatement.bindString(28, trackersettings);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (TrackerSettings)obj);
    }

    public Long getKey(TrackerSettings trackersettings)
    {
        if (trackersettings != null)
        {
            return trackersettings.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((TrackerSettings)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public TrackerSettings readEntity(Cursor cursor, int i)
    {
        Long long1;
        Boolean boolean1;
        Boolean boolean2;
        Boolean boolean3;
        Boolean boolean4;
        Boolean boolean5;
        Boolean boolean6;
        Boolean boolean7;
        Boolean boolean8;
        Boolean boolean9;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        Boolean boolean10;
        Boolean boolean11;
        Boolean boolean12;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        Boolean boolean13;
        String s11;
        String s12;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 2))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 3))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 3) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 4))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 4) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 5))
        {
            boolean5 = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 5) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            boolean5 = Boolean.valueOf(flag4);
        }
        if (cursor.isNull(i + 6))
        {
            boolean6 = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 6) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            boolean6 = Boolean.valueOf(flag5);
        }
        if (cursor.isNull(i + 7))
        {
            boolean7 = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 7) != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            boolean7 = Boolean.valueOf(flag6);
        }
        if (cursor.isNull(i + 8))
        {
            boolean8 = null;
        } else
        {
            boolean flag7;
            if (cursor.getShort(i + 8) != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            boolean8 = Boolean.valueOf(flag7);
        }
        if (cursor.isNull(i + 9))
        {
            boolean9 = null;
        } else
        {
            boolean flag8;
            if (cursor.getShort(i + 9) != 0)
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            boolean9 = Boolean.valueOf(flag8);
        }
        if (cursor.isNull(i + 10))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            boolean10 = null;
        } else
        {
            boolean flag9;
            if (cursor.getShort(i + 16) != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            boolean10 = Boolean.valueOf(flag9);
        }
        if (cursor.isNull(i + 17))
        {
            boolean11 = null;
        } else
        {
            boolean flag10;
            if (cursor.getShort(i + 17) != 0)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            boolean11 = Boolean.valueOf(flag10);
        }
        if (cursor.isNull(i + 18))
        {
            boolean12 = null;
        } else
        {
            boolean flag11;
            if (cursor.getShort(i + 18) != 0)
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            boolean12 = Boolean.valueOf(flag11);
        }
        if (cursor.isNull(i + 19))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 19);
        }
        if (cursor.isNull(i + 20))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 20);
        }
        if (cursor.isNull(i + 21))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 21);
        }
        if (cursor.isNull(i + 22))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 22);
        }
        if (cursor.isNull(i + 23))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 23);
        }
        if (cursor.isNull(i + 24))
        {
            boolean13 = null;
        } else
        {
            boolean flag12;
            if (cursor.getShort(i + 24) != 0)
            {
                flag12 = true;
            } else
            {
                flag12 = false;
            }
            boolean13 = Boolean.valueOf(flag12);
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
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 26);
        }
        if (cursor.isNull(i + 27))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 27);
        }
        return new TrackerSettings(long1, boolean1, boolean2, boolean3, boolean4, boolean5, boolean6, boolean7, boolean8, boolean9, s, s1, s2, s3, s4, s5, boolean10, boolean11, boolean12, s6, s7, s8, s9, s10, boolean13, s11, s12, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, TrackerSettings trackersettings, int i)
    {
        boolean flag13 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        trackersettings.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        trackersettings.setDisplayActiveMinutes(((Boolean) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        trackersettings.setDisplayCalories(((Boolean) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 3) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        trackersettings.setDisplayChatter(((Boolean) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 4) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        trackersettings.setDisplayClock(((Boolean) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 5) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            obj = Boolean.valueOf(flag4);
        }
        trackersettings.setDisplayDistance(((Boolean) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 6) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            obj = Boolean.valueOf(flag5);
        }
        trackersettings.setDisplayElevation(((Boolean) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 7) != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            obj = Boolean.valueOf(flag6);
        }
        trackersettings.setDisplayEmote(((Boolean) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            boolean flag7;
            if (cursor.getShort(i + 8) != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            obj = Boolean.valueOf(flag7);
        }
        trackersettings.setDisplayGreeting(((Boolean) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            boolean flag8;
            if (cursor.getShort(i + 9) != 0)
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            obj = Boolean.valueOf(flag8);
        }
        trackersettings.setOnDominantHand(((Boolean) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        trackersettings.setGreeting(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        trackersettings.setHandedness(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        trackersettings.setPrimaryGoal(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        trackersettings.setScreenOrder(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        trackersettings.setClockFaceImageUrl(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        trackersettings.setClockFaceName(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            boolean flag9;
            if (cursor.getShort(i + 16) != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            obj = Boolean.valueOf(flag9);
        }
        trackersettings.setDisplaySteps(((Boolean) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            boolean flag10;
            if (cursor.getShort(i + 17) != 0)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            obj = Boolean.valueOf(flag10);
        }
        trackersettings.setEnableAncs(((Boolean) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            boolean flag11;
            if (cursor.getShort(i + 18) != 0)
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            obj = Boolean.valueOf(flag11);
        }
        trackersettings.setEnableSleepAnnotations(((Boolean) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 19);
        }
        trackersettings.setHeartRateTracking(((String) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 20);
        }
        trackersettings.setExercises(((String) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 21);
        }
        trackersettings.setTapGesture(((String) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 22);
        }
        trackersettings.setWatchCheck(((String) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 23);
        }
        trackersettings.setClockFaceDisplayName(((String) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            boolean flag12;
            if (cursor.getShort(i + 24) != 0)
            {
                flag12 = flag13;
            } else
            {
                flag12 = false;
            }
            obj = Boolean.valueOf(flag12);
        }
        trackersettings.setDisplayHeartRate(((Boolean) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 25);
        }
        trackersettings.setBondedPeerName(((String) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 26);
        }
        trackersettings.setBondedPeerId(((String) (obj)));
        if (cursor.isNull(i + 27))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 27);
        }
        trackersettings.setAutoLap(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (TrackerSettings)obj, i);
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

    protected Long updateKeyAfterInsert(TrackerSettings trackersettings, long l)
    {
        trackersettings.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((TrackerSettings)obj, l);
    }
}
