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
//            ExerciseSession, DaoSession

public class ExerciseSessionDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property ActivityType;
        public static final Property CueIndex = new Property(9, java/lang/Integer, "cueIndex", false, "CUE_INDEX");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property StartTime = new Property(7, java/util/Date, "startTime", false, "START_TIME");
        public static final Property Status = new Property(6, java/lang/String, "status", false, "STATUS");
        public static final Property StopTime = new Property(8, java/util/Date, "stopTime", false, "STOP_TIME");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
        public static final Property WireId = new Property(11, java/lang/String, "wireId", false, "WIRE_ID");

        static 
        {
            ActivityType = new Property(10, Long.TYPE, "activityType", false, "ACTIVITY_TYPE");
        }

        public Properties()
        {
        }
    }


    public static final String TABLENAME = "EXERCISE_SESSION";

    public ExerciseSessionDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ExerciseSessionDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'EXERCISE_SESSION' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'STATUS' TEXT NOT NULL ,").append("'START_TIME' INTEGER,").append("'STOP_TIME' INTEGER,").append("'CUE_INDEX' INTEGER,").append("'ACTIVITY_TYPE' INTEGER NOT NULL ,").append("'WIRE_ID' TEXT);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_SESSION_UUID ON EXERCISE_SESSION").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_SESSION_ENTITY_STATUS ON EXERCISE_SESSION").append(" (ENTITY_STATUS);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'EXERCISE_SESSION'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ExerciseSession exercisesession)
    {
        sqlitestatement.clearBindings();
        Object obj = exercisesession.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = exercisesession.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = exercisesession.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = exercisesession.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = exercisesession.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = exercisesession.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        sqlitestatement.bindString(7, exercisesession.getStatus());
        obj = exercisesession.getStartTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(8, ((Date) (obj)).getTime());
        }
        obj = exercisesession.getStopTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(9, ((Date) (obj)).getTime());
        }
        obj = exercisesession.getCueIndex();
        if (obj != null)
        {
            sqlitestatement.bindLong(10, ((Integer) (obj)).intValue());
        }
        sqlitestatement.bindLong(11, exercisesession.getActivityType());
        exercisesession = exercisesession.getWireId();
        if (exercisesession != null)
        {
            sqlitestatement.bindString(12, exercisesession);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ExerciseSession)obj);
    }

    public Long getKey(ExerciseSession exercisesession)
    {
        if (exercisesession != null)
        {
            return exercisesession.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ExerciseSession)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public ExerciseSession readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Date date2;
        Date date3;
        Integer integer1;
        String s1;
        long l;
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
        s1 = cursor.getString(i + 6);
        if (cursor.isNull(i + 7))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 7));
        }
        if (cursor.isNull(i + 8))
        {
            date3 = null;
        } else
        {
            date3 = new Date(cursor.getLong(i + 8));
        }
        if (cursor.isNull(i + 9))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 9));
        }
        l = cursor.getLong(i + 10);
        if (cursor.isNull(i + 11))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 11);
        }
        return new ExerciseSession(long1, long2, s, date, date1, integer, s1, date2, date3, integer1, l, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ExerciseSession exercisesession, int i)
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
        exercisesession.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        exercisesession.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        exercisesession.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        exercisesession.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        exercisesession.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        exercisesession.setEntityStatus(((Integer) (obj)));
        exercisesession.setStatus(cursor.getString(i + 6));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 7));
        }
        exercisesession.setStartTime(((Date) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 8));
        }
        exercisesession.setStopTime(((Date) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 9));
        }
        exercisesession.setCueIndex(((Integer) (obj)));
        exercisesession.setActivityType(cursor.getLong(i + 10));
        if (cursor.isNull(i + 11))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 11);
        }
        exercisesession.setWireId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ExerciseSession)obj, i);
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

    protected Long updateKeyAfterInsert(ExerciseSession exercisesession, long l)
    {
        exercisesession.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((ExerciseSession)obj, l);
    }
}
