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
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            Goal, DaoSession

public class GoalDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property DueDate = new Property(16, java/util/Date, "dueDate", false, "DUE_DATE");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Frequency = new Property(14, java/lang/String, "frequency", false, "FREQUENCY");
        public static final Property GoalJson = new Property(13, java/lang/String, "goalJson", false, "GOAL_JSON");
        public static final Property GoalType = new Property(19, java/lang/String, "goalType", false, "GOAL_TYPE");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property IsActive = new Property(17, java/lang/Boolean, "isActive", false, "IS_ACTIVE");
        public static final Property Result = new Property(10, java/lang/Double, "result", false, "RESULT");
        public static final Property ResultMeasurement = new Property(9, java/lang/String, "resultMeasurement", false, "RESULT_MEASUREMENT");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property Start = new Property(12, java/lang/Double, "start", false, "START");
        public static final Property StartDate = new Property(15, java/util/Date, "startDate", false, "START_DATE");
        public static final Property StartMeasurement = new Property(11, java/lang/String, "startMeasurement", false, "START_MEASUREMENT");
        public static final Property Status = new Property(6, java/lang/Integer, "status", false, "STATUS");
        public static final Property Target = new Property(8, java/lang/Double, "target", false, "TARGET");
        public static final Property TargetMeasurement = new Property(7, java/lang/String, "targetMeasurement", false, "TARGET_MEASUREMENT");
        public static final Property TargetTimeUpdated = new Property(18, java/util/Date, "targetTimeUpdated", false, "TARGET_TIME_UPDATED");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "GOAL";

    public GoalDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public GoalDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'GOAL' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'STATUS' INTEGER,").append("'TARGET_MEASUREMENT' TEXT,").append("'TARGET' REAL,").append("'RESULT_MEASUREMENT' TEXT,").append("'RESULT' REAL,").append("'START_MEASUREMENT' TEXT,").append("'START' REAL,").append("'GOAL_JSON' TEXT,").append("'FREQUENCY' TEXT,").append("'START_DATE' INTEGER,").append("'DUE_DATE' INTEGER,").append("'IS_ACTIVE' INTEGER,").append("'TARGET_TIME_UPDATED' INTEGER,").append("'GOAL_TYPE' TEXT);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_GOAL_UUID ON GOAL").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_GOAL_ENTITY_STATUS ON GOAL").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_GOAL_GOAL_TYPE ON GOAL").append(" (GOAL_TYPE);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_GOAL_START_DATE_DUE_DATE ON GOAL").append(" (START_DATE,DUE_DATE);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'GOAL'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Goal goal)
    {
        sqlitestatement.clearBindings();
        Object obj = goal.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = goal.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = goal.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = goal.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = goal.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = goal.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = goal.getStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Integer) (obj)).intValue());
        }
        obj = goal.getTargetMeasurement();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = goal.getTarget();
        if (obj != null)
        {
            sqlitestatement.bindDouble(9, ((Double) (obj)).doubleValue());
        }
        obj = goal.getResultMeasurement();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = goal.getResult();
        if (obj != null)
        {
            sqlitestatement.bindDouble(11, ((Double) (obj)).doubleValue());
        }
        obj = goal.getStartMeasurement();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = goal.getStart();
        if (obj != null)
        {
            sqlitestatement.bindDouble(13, ((Double) (obj)).doubleValue());
        }
        obj = goal.getGoalJson();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = goal.getFrequency();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = goal.getStartDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(16, ((Date) (obj)).getTime());
        }
        obj = goal.getDueDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(17, ((Date) (obj)).getTime());
        }
        obj = goal.getIsActive();
        if (obj != null)
        {
            long l;
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(18, l);
        }
        obj = goal.getTargetTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(19, ((Date) (obj)).getTime());
        }
        goal = goal.getGoalType();
        if (goal != null)
        {
            sqlitestatement.bindString(20, goal);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Goal)obj);
    }

    public Long getKey(Goal goal)
    {
        if (goal != null)
        {
            return goal.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Goal)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Goal readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Integer integer1;
        String s1;
        Double double1;
        String s2;
        Double double2;
        String s3;
        Double double3;
        String s4;
        String s5;
        Date date2;
        Date date3;
        Boolean boolean1;
        Date date4;
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
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 8));
        }
        if (cursor.isNull(i + 9))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(cursor.getDouble(i + 10));
        }
        if (cursor.isNull(i + 11))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            double3 = null;
        } else
        {
            double3 = Double.valueOf(cursor.getDouble(i + 12));
        }
        if (cursor.isNull(i + 13))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 15));
        }
        if (cursor.isNull(i + 16))
        {
            date3 = null;
        } else
        {
            date3 = new Date(cursor.getLong(i + 16));
        }
        if (cursor.isNull(i + 17))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 17) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 18))
        {
            date4 = null;
        } else
        {
            date4 = new Date(cursor.getLong(i + 18));
        }
        if (cursor.isNull(i + 19))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 19);
        }
        return new Goal(long1, long2, s, date, date1, integer, integer1, s1, double1, s2, double2, s3, double3, s4, s5, date2, date3, boolean1, date4, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Goal goal, int i)
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
        goal.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        goal.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        goal.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        goal.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        goal.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        goal.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 6));
        }
        goal.setStatus(((Integer) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        goal.setTargetMeasurement(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 8));
        }
        goal.setTarget(((Double) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        goal.setResultMeasurement(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 10));
        }
        goal.setResult(((Double) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        goal.setStartMeasurement(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 12));
        }
        goal.setStart(((Double) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        goal.setGoalJson(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        goal.setFrequency(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 15));
        }
        goal.setStartDate(((Date) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 16));
        }
        goal.setDueDate(((Date) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 17) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        goal.setIsActive(((Boolean) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 18));
        }
        goal.setTargetTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 19))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 19);
        }
        goal.setGoalType(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Goal)obj, i);
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

    protected Long updateKeyAfterInsert(Goal goal, long l)
    {
        goal.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Goal)obj, l);
    }
}
