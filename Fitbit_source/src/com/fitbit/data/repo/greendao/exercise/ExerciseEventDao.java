// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.exercise:
//            ExerciseEvent, DaoSession

public class ExerciseEventDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Accuracy = new Property(9, java/lang/Float, "accuracy", false, "ACCURACY");
        public static final Property Altitude = new Property(10, java/lang/Double, "altitude", false, "ALTITUDE");
        public static final Property Bearing = new Property(11, java/lang/Float, "bearing", false, "BEARING");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Label = new Property(13, java/lang/String, "label", false, "LABEL");
        public static final Property Latitude = new Property(7, java/lang/Double, "latitude", false, "LATITUDE");
        public static final Property Longitude = new Property(8, java/lang/Double, "longitude", false, "LONGITUDE");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property SessionId = new Property(14, java/lang/String, "sessionId", false, "SESSION_ID");
        public static final Property Speed = new Property(12, java/lang/Float, "speed", false, "SPEED");
        public static final Property Time = new Property(6, java/util/Date, "time", false, "TIME");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "EXERCISE_EVENT";

    public ExerciseEventDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ExerciseEventDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'EXERCISE_EVENT' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'TIME' INTEGER,").append("'LATITUDE' REAL,").append("'LONGITUDE' REAL,").append("'ACCURACY' REAL,").append("'ALTITUDE' REAL,").append("'BEARING' REAL,").append("'SPEED' REAL,").append("'LABEL' TEXT NOT NULL ,").append("'SESSION_ID' TEXT);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_EVENT_UUID ON EXERCISE_EVENT").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_EVENT_ENTITY_STATUS ON EXERCISE_EVENT").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_EVENT_TIME_SESSION_ID ON EXERCISE_EVENT").append(" (TIME,SESSION_ID);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'EXERCISE_EVENT'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ExerciseEvent exerciseevent)
    {
        sqlitestatement.clearBindings();
        Object obj = exerciseevent.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = exerciseevent.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = exerciseevent.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = exerciseevent.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = exerciseevent.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = exerciseevent.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = exerciseevent.getTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Date) (obj)).getTime());
        }
        obj = exerciseevent.getLatitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(8, ((Double) (obj)).doubleValue());
        }
        obj = exerciseevent.getLongitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(9, ((Double) (obj)).doubleValue());
        }
        obj = exerciseevent.getAccuracy();
        if (obj != null)
        {
            sqlitestatement.bindDouble(10, ((Float) (obj)).floatValue());
        }
        obj = exerciseevent.getAltitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(11, ((Double) (obj)).doubleValue());
        }
        obj = exerciseevent.getBearing();
        if (obj != null)
        {
            sqlitestatement.bindDouble(12, ((Float) (obj)).floatValue());
        }
        obj = exerciseevent.getSpeed();
        if (obj != null)
        {
            sqlitestatement.bindDouble(13, ((Float) (obj)).floatValue());
        }
        sqlitestatement.bindString(14, exerciseevent.getLabel());
        exerciseevent = exerciseevent.getSessionId();
        if (exerciseevent != null)
        {
            sqlitestatement.bindString(15, exerciseevent);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ExerciseEvent)obj);
    }

    public Long getKey(ExerciseEvent exerciseevent)
    {
        if (exerciseevent != null)
        {
            return exerciseevent.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ExerciseEvent)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public ExerciseEvent readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Date date2;
        Double double1;
        Double double2;
        Float float1;
        Double double3;
        Float float2;
        Float float3;
        String s1;
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
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 7));
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
            float1 = null;
        } else
        {
            float1 = Float.valueOf(cursor.getFloat(i + 9));
        }
        if (cursor.isNull(i + 10))
        {
            double3 = null;
        } else
        {
            double3 = Double.valueOf(cursor.getDouble(i + 10));
        }
        if (cursor.isNull(i + 11))
        {
            float2 = null;
        } else
        {
            float2 = Float.valueOf(cursor.getFloat(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            float3 = null;
        } else
        {
            float3 = Float.valueOf(cursor.getFloat(i + 12));
        }
        s1 = cursor.getString(i + 13);
        if (cursor.isNull(i + 14))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 14);
        }
        return new ExerciseEvent(long1, long2, s, date, date1, integer, date2, double1, double2, float1, double3, float2, float3, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ExerciseEvent exerciseevent, int i)
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
        exerciseevent.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        exerciseevent.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        exerciseevent.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        exerciseevent.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        exerciseevent.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        exerciseevent.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 6));
        }
        exerciseevent.setTime(((Date) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 7));
        }
        exerciseevent.setLatitude(((Double) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 8));
        }
        exerciseevent.setLongitude(((Double) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 9));
        }
        exerciseevent.setAccuracy(((Float) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 10));
        }
        exerciseevent.setAltitude(((Double) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 11));
        }
        exerciseevent.setBearing(((Float) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = Float.valueOf(cursor.getFloat(i + 12));
        }
        exerciseevent.setSpeed(((Float) (obj)));
        exerciseevent.setLabel(cursor.getString(i + 13));
        if (cursor.isNull(i + 14))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 14);
        }
        exerciseevent.setSessionId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ExerciseEvent)obj, i);
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

    protected Long updateKeyAfterInsert(ExerciseEvent exerciseevent, long l)
    {
        exerciseevent.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((ExerciseEvent)obj, l);
    }
}
