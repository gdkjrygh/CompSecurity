// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            MostRecentActivity, DaoSession

public class MostRecentActivityDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Calories = new Property(6, java/lang/Integer, "calories", false, "CALORIES");
        public static final Property Date = new Property(12, java/util/Date, "date", false, "DATE");
        public static final Property Description = new Property(7, java/lang/String, "description", false, "DESCRIPTION");
        public static final Property Distance = new Property(8, java/lang/Double, "distance", false, "DISTANCE");
        public static final Property Duration = new Property(9, java/lang/Integer, "duration", false, "DURATION");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Group = new Property(11, java/lang/String, "group", false, "GROUP");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Name = new Property(10, java/lang/String, "name", false, "NAME");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "MOST_RECENT_ACTIVITY";

    public MostRecentActivityDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public MostRecentActivityDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'MOST_RECENT_ACTIVITY' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'CALORIES' INTEGER,").append("'DESCRIPTION' TEXT,").append("'DISTANCE' REAL,").append("'DURATION' INTEGER,").append("'NAME' TEXT,").append("'GROUP' TEXT,").append("'DATE' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_MOST_RECENT_ACTIVITY_UUID ON MOST_RECENT_ACTIVITY").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_MOST_RECENT_ACTIVITY_ENTITY_STATUS ON MOST_RECENT_ACTIVITY").append(" (ENTITY_STATUS);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'MOST_RECENT_ACTIVITY'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, MostRecentActivity mostrecentactivity)
    {
        sqlitestatement.clearBindings();
        Object obj = mostrecentactivity.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = mostrecentactivity.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = mostrecentactivity.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = mostrecentactivity.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = mostrecentactivity.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = mostrecentactivity.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = mostrecentactivity.getCalories();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Integer) (obj)).intValue());
        }
        obj = mostrecentactivity.getDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = mostrecentactivity.getDistance();
        if (obj != null)
        {
            sqlitestatement.bindDouble(9, ((Double) (obj)).doubleValue());
        }
        obj = mostrecentactivity.getDuration();
        if (obj != null)
        {
            sqlitestatement.bindLong(10, ((Integer) (obj)).intValue());
        }
        obj = mostrecentactivity.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = mostrecentactivity.getGroup();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        mostrecentactivity = mostrecentactivity.getDate();
        if (mostrecentactivity != null)
        {
            sqlitestatement.bindLong(13, mostrecentactivity.getTime());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (MostRecentActivity)obj);
    }

    public Long getKey(MostRecentActivity mostrecentactivity)
    {
        if (mostrecentactivity != null)
        {
            return mostrecentactivity.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((MostRecentActivity)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public MostRecentActivity readEntity(Cursor cursor, int i)
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
        Integer integer2;
        String s2;
        String s3;
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
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 9));
        }
        if (cursor.isNull(i + 10))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 10);
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
            cursor = null;
        } else
        {
            cursor = new Date(cursor.getLong(i + 12));
        }
        return new MostRecentActivity(long1, long2, s, date, date1, integer, integer1, s1, double1, integer2, s2, s3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, MostRecentActivity mostrecentactivity, int i)
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
        mostrecentactivity.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        mostrecentactivity.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        mostrecentactivity.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        mostrecentactivity.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        mostrecentactivity.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        mostrecentactivity.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 6));
        }
        mostrecentactivity.setCalories(((Integer) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        mostrecentactivity.setDescription(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 8));
        }
        mostrecentactivity.setDistance(((Double) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 9));
        }
        mostrecentactivity.setDuration(((Integer) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        mostrecentactivity.setName(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        mostrecentactivity.setGroup(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            cursor = obj1;
        } else
        {
            cursor = new Date(cursor.getLong(i + 12));
        }
        mostrecentactivity.setDate(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (MostRecentActivity)obj, i);
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

    protected Long updateKeyAfterInsert(MostRecentActivity mostrecentactivity, long l)
    {
        mostrecentactivity.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((MostRecentActivity)obj, l);
    }
}
