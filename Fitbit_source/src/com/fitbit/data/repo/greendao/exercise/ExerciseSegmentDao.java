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
//            ExerciseSegment, DaoSession

public class ExerciseSegmentDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property EndEventId = new Property(10, java/lang/Long, "endEventId", false, "END_EVENT_ID");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property SessionId = new Property(8, java/lang/String, "sessionId", false, "SESSION_ID");
        public static final Property StartEventId = new Property(9, java/lang/Long, "startEventId", false, "START_EVENT_ID");
        public static final Property StartTime = new Property(6, java/util/Date, "startTime", false, "START_TIME");
        public static final Property StopTime = new Property(7, java/util/Date, "stopTime", false, "STOP_TIME");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "EXERCISE_SEGMENT";

    public ExerciseSegmentDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ExerciseSegmentDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'EXERCISE_SEGMENT' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'START_TIME' INTEGER NOT NULL ,").append("'STOP_TIME' INTEGER,").append("'SESSION_ID' TEXT,").append("'START_EVENT_ID' INTEGER,").append("'END_EVENT_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_SEGMENT_UUID ON EXERCISE_SEGMENT").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_SEGMENT_ENTITY_STATUS ON EXERCISE_SEGMENT").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_EXERCISE_SEGMENT_SESSION_ID_START_EVENT_ID ON EXERCISE_SEGMENT").append(" (SESSION_ID,START_EVENT_ID);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'EXERCISE_SEGMENT'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ExerciseSegment exercisesegment)
    {
        sqlitestatement.clearBindings();
        Object obj = exercisesegment.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = exercisesegment.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = exercisesegment.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = exercisesegment.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = exercisesegment.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = exercisesegment.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        sqlitestatement.bindLong(7, exercisesegment.getStartTime().getTime());
        obj = exercisesegment.getStopTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(8, ((Date) (obj)).getTime());
        }
        obj = exercisesegment.getSessionId();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = exercisesegment.getStartEventId();
        if (obj != null)
        {
            sqlitestatement.bindLong(10, ((Long) (obj)).longValue());
        }
        exercisesegment = exercisesegment.getEndEventId();
        if (exercisesegment != null)
        {
            sqlitestatement.bindLong(11, exercisesegment.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ExerciseSegment)obj);
    }

    public Long getKey(ExerciseSegment exercisesegment)
    {
        if (exercisesegment != null)
        {
            return exercisesegment.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ExerciseSegment)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public ExerciseSegment readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Date date2;
        String s1;
        Long long3;
        Date date3;
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
        date3 = new Date(cursor.getLong(i + 6));
        if (cursor.isNull(i + 7))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 7));
        }
        if (cursor.isNull(i + 8))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 9));
        }
        if (cursor.isNull(i + 10))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 10));
        }
        return new ExerciseSegment(long1, long2, s, date, date1, integer, date3, date2, s1, long3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ExerciseSegment exercisesegment, int i)
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
        exercisesegment.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        exercisesegment.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        exercisesegment.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        exercisesegment.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        exercisesegment.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        exercisesegment.setEntityStatus(((Integer) (obj)));
        exercisesegment.setStartTime(new Date(cursor.getLong(i + 6)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 7));
        }
        exercisesegment.setStopTime(((Date) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        exercisesegment.setSessionId(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 9));
        }
        exercisesegment.setStartEventId(((Long) (obj)));
        if (cursor.isNull(i + 10))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 10));
        }
        exercisesegment.setEndEventId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ExerciseSegment)obj, i);
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

    protected Long updateKeyAfterInsert(ExerciseSegment exercisesegment, long l)
    {
        exercisesegment.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((ExerciseSegment)obj, l);
    }
}
