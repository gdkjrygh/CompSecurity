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
//            Split, DaoSession

public class SplitDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Altitude = new Property(10, java/lang/Double, "altitude", false, "ALTITUDE");
        public static final Property Distance = new Property(9, java/lang/Double, "distance", false, "DISTANCE");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Latitude = new Property(7, java/lang/Double, "latitude", false, "LATITUDE");
        public static final Property Longitude = new Property(8, java/lang/Double, "longitude", false, "LONGITUDE");
        public static final Property Mets = new Property(12, java/lang/Double, "mets", false, "METS");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property SessionId = new Property(13, java/lang/String, "sessionId", false, "SESSION_ID");
        public static final Property StartEventId = new Property(14, java/lang/Long, "startEventId", false, "START_EVENT_ID");
        public static final Property Time = new Property(6, java/lang/Long, "time", false, "TIME");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeRange = new Property(11, java/lang/Long, "timeRange", false, "TIME_RANGE");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "SPLIT";

    public SplitDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public SplitDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'SPLIT' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'TIME' INTEGER,").append("'LATITUDE' REAL,").append("'LONGITUDE' REAL,").append("'DISTANCE' REAL,").append("'ALTITUDE' REAL,").append("'TIME_RANGE' INTEGER,").append("'METS' REAL,").append("'SESSION_ID' TEXT,").append("'START_EVENT_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SPLIT_UUID ON SPLIT").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SPLIT_ENTITY_STATUS ON SPLIT").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SPLIT_SESSION_ID_START_EVENT_ID ON SPLIT").append(" (SESSION_ID,START_EVENT_ID);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SPLIT'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Split split)
    {
        sqlitestatement.clearBindings();
        Object obj = split.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = split.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = split.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = split.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = split.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = split.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = split.getTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Long) (obj)).longValue());
        }
        obj = split.getLatitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(8, ((Double) (obj)).doubleValue());
        }
        obj = split.getLongitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(9, ((Double) (obj)).doubleValue());
        }
        obj = split.getDistance();
        if (obj != null)
        {
            sqlitestatement.bindDouble(10, ((Double) (obj)).doubleValue());
        }
        obj = split.getAltitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(11, ((Double) (obj)).doubleValue());
        }
        obj = split.getTimeRange();
        if (obj != null)
        {
            sqlitestatement.bindLong(12, ((Long) (obj)).longValue());
        }
        obj = split.getMets();
        if (obj != null)
        {
            sqlitestatement.bindDouble(13, ((Double) (obj)).doubleValue());
        }
        obj = split.getSessionId();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        split = split.getStartEventId();
        if (split != null)
        {
            sqlitestatement.bindLong(15, split.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Split)obj);
    }

    public Long getKey(Split split)
    {
        if (split != null)
        {
            return split.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Split)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Split readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Long long3;
        Double double1;
        Double double2;
        Double double3;
        Double double4;
        Long long4;
        Double double5;
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
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 6));
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
            double3 = null;
        } else
        {
            double3 = Double.valueOf(cursor.getDouble(i + 9));
        }
        if (cursor.isNull(i + 10))
        {
            double4 = null;
        } else
        {
            double4 = Double.valueOf(cursor.getDouble(i + 10));
        }
        if (cursor.isNull(i + 11))
        {
            long4 = null;
        } else
        {
            long4 = Long.valueOf(cursor.getLong(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            double5 = null;
        } else
        {
            double5 = Double.valueOf(cursor.getDouble(i + 12));
        }
        if (cursor.isNull(i + 13))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 14));
        }
        return new Split(long1, long2, s, date, date1, integer, long3, double1, double2, double3, double4, long4, double5, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Split split, int i)
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
        split.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        split.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        split.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        split.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        split.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        split.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 6));
        }
        split.setTime(((Long) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 7));
        }
        split.setLatitude(((Double) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 8));
        }
        split.setLongitude(((Double) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 9));
        }
        split.setDistance(((Double) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 10));
        }
        split.setAltitude(((Double) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 11));
        }
        split.setTimeRange(((Long) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 12));
        }
        split.setMets(((Double) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        split.setSessionId(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 14));
        }
        split.setStartEventId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Split)obj, i);
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

    protected Long updateKeyAfterInsert(Split split, long l)
    {
        split.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Split)obj, l);
    }
}
